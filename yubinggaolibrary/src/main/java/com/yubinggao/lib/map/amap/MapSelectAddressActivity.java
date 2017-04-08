package com.yubinggao.lib.map.amap;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationClientOption.AMapLocationMode;
import com.amap.api.location.AMapLocationClientOption.AMapLocationProtocol;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.Projection;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.yubinggao.lib.R;
import com.yubinggao.lib.bean.CityInfo;
import com.yubinggao.lib.interfaces.CityCallback;
import com.yubinggao.lib.map.adapter.CityAddressAdapter;

import java.util.ArrayList;
import java.util.List;

public class MapSelectAddressActivity extends Activity implements AMap.OnMapClickListener,
        AMap.OnMapLongClickListener, AMap.OnCameraChangeListener, CityCallback,
        GeocodeSearch.OnGeocodeSearchListener, AMap.OnMarkerDragListener,
        Inputtips.InputtipsListener, TextWatcher, PoiSearch.OnPoiSearchListener {

    private AMapLocationClient locationClient = null;
    private AMapLocationClientOption locationOption = new AMapLocationClientOption();
    private final static int REFRESH_COMPLETE = 0;

    private MarkerOptions markerOption = null;
    private GeocodeSearch geocoderSearch;
    private AMap aMap;
    private MapView mapView;
    private String addressName;
    private Marker marker = null;
    private LatLng latlng = null;
    private PoiSearch.Query query;// Poi查询条件类
    private PoiSearch poiSearch;// POI搜索
    private AutoCompleteTextView key_tv;
    private PoiResult poiResult; // poi返回的结果
    private RecyclerView city_rv;
    private List<CityInfo> mData;
    private CityAddressAdapter cityAddressAdapter;
    private LatLonPoint llp = null;
    private boolean isGetData = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_select_address_activity);
        mapView = (MapView) findViewById(R.id.map);
        key_tv = (AutoCompleteTextView) findViewById(R.id.key_tv);
        key_tv.addTextChangedListener(this);
        mapView.onCreate(savedInstanceState);// 此方法必须重写
        sendNewRegisterCode();
        init();
    }

    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case REFRESH_COMPLETE:
                    initLocation();
                    break;
                default:
                    break;
            }
        }
    };

    /**
     * 初始化AMap对象
     */
    private void init() {
        TextView search = (TextView) findViewById(R.id.search_tv);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSearchQuery();
            }
        });
        city_rv = (RecyclerView) findViewById(R.id.city_rv);
        mData = new ArrayList<>();
        cityAddressAdapter = new CityAddressAdapter(this, this, mData);
        city_rv.setAdapter(cityAddressAdapter);
        if (aMap == null) {
            aMap = mapView.getMap();
            aMap.getUiSettings().setZoomControlsEnabled(false);
            aMap.getUiSettings().setScaleControlsEnabled(true);
            setUpMap();
        }
        geocoderSearch = new GeocodeSearch(this);
        geocoderSearch.setOnGeocodeSearchListener(this);
        getAddress(23.12639, 113.324775);
    }

    /**
     * amap添加一些事件监听器
     */
    private void setUpMap() {
        aMap.setOnMapClickListener(this);// 对amap添加单击地图事件监听器
//        aMap.setOnMapLongClickListener(this);// 对amap添加长按地图事件监听器
        aMap.setOnCameraChangeListener(this);// 对amap添加移动地图事件监听器
//        aMap.setOnMarkerDragListener(this);// 设置marker可拖拽事件监听器
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
        destroyLocation();
    }


    /**
     * 移除验证码倒计时
     */
    private void removeNewRegisterCode() {
        mHandler.removeMessages(REFRESH_COMPLETE);
    }

    /**
     * 开始验证码倒计时
     */
    private void sendNewRegisterCode() {
        mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 400);
    }


    /**
     * 初始化定位
     *
     * @author hongming.wang
     * @since 2.8.0
     */
    private void initLocation() {
        if (locationClient == null) {
            //初始化client
            locationClient = new AMapLocationClient(this.getApplicationContext());
            //设置定位参数
            locationClient.setLocationOption(getDefaultOption());
            //设置定位监听
            locationClient.setLocationListener(locationListener);
            //设置定位精准度
            locationOption.setLocationMode(AMapLocationMode.Hight_Accuracy);
            //开启缓存
            locationOption.setLocationCacheEnable(true);
            //设置逆地理编码
            locationOption.setNeedAddress(true);
            //设置定位参数
            locationClient.setLocationOption(locationOption);
        }
        // 启动定位
        locationClient.startLocation();
//        stopLocation();//停止定位
    }

    /**
     * 默认的定位参数
     *
     * @author hongming.wang
     * @since 2.8.0
     */
    private AMapLocationClientOption getDefaultOption() {
        AMapLocationClientOption mOption = new AMapLocationClientOption();
        mOption.setLocationMode(AMapLocationMode.Hight_Accuracy);//可选，设置定位模式，可选的模式有高精度、仅设备、仅网络。默认为高精度模式
        mOption.setGpsFirst(false);//可选，设置是否gps优先，只在高精度模式下有效。默认关闭
        mOption.setHttpTimeOut(30000);//可选，设置网络请求超时时间。默认为30秒。在仅设备模式下无效
        mOption.setInterval(2000);//可选，设置定位间隔。默认为2秒
        mOption.setNeedAddress(true);//可选，设置是否返回逆地理地址信息。默认是true
        mOption.setOnceLocation(false);//可选，设置是否单次定位。默认是false
        mOption.setOnceLocationLatest(false);//可选，设置是否等待wifi刷新，默认为false.如果设置为true,会自动变为单次定位，持续定位时不要使用
        AMapLocationClientOption.setLocationProtocol(AMapLocationProtocol.HTTP);//可选， 设置网络请求的协议。可选HTTP或者HTTPS。默认为HTTP
        mOption.setSensorEnable(false);//可选，设置是否使用传感器。默认是false
        return mOption;
    }

    /**
     * 定位监听
     */
    AMapLocationListener locationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation location) {
            if (null != location && location.getErrorCode() == 0) {
                double s1 = location.getLongitude();
                double s2 = location.getLatitude();
                getAddress(s2, s1);
            } else {
//                showMissingPermissionDialog();
            }
            stopLocation();
        }
    };


    /**
     * 停止定位
     *
     * @author hongming.wang
     * @since 2.8.0
     */
    private void stopLocation() {
        // 停止定位
        locationClient.stopLocation();
    }


    /**
     * 销毁定位
     *
     * @author hongming.wang
     * @since 2.8.0
     */
    private void destroyLocation() {
        if (null != locationClient) {
            /**
             * 如果AMapLocationClient是在当前Activity实例化的，
             * 在Activity的onDestroy中一定要执行AMapLocationClient的onDestroy
             */
            locationClient.onDestroy();
            locationClient = null;
            locationOption = null;
        }
    }

    /**
     * 对单击地图事件回调
     */
    @Override
    public void onMapClick(LatLng point) {
        getAddress(point);
    }

    /**
     * 对长按地图事件回调
     */
    @Override
    public void onMapLongClick(LatLng point) {
    }

    /**
     * 对正在移动地图事件回调
     */
    @Override
    public void onCameraChange(CameraPosition cameraPosition) {
        addMarkersToMap(cameraPosition.target.latitude, cameraPosition.target.longitude);
    }

    /**
     * 对移动地图结束事件回调
     */
    @Override
    public void onCameraChangeFinish(CameraPosition cameraPosition) {
        jumpPoint(marker);
        llp = new LatLonPoint(cameraPosition.target.latitude, cameraPosition.target.longitude);
        if (isGetData) {
            getAddress();
        }
        isGetData = true;
    }

    /**
     * 地图上添加东西
     *
     * @param latitude
     * @param longitude
     */
    private void addMarkersToMap(double latitude, double longitude) {
        if (aMap != null) {
            latlng = new LatLng(latitude, longitude);
            aMap.clear();
            markerOption = new MarkerOptions()
                    .anchor(0.5f, 0.5f)
                    .position(latlng)
                    .draggable(true);
            marker = aMap.addMarker(markerOption);
        }
    }

    private void addMarkersToMap(String title) {
        if (latlng != null) {
            aMap.clear();
            markerOption = new MarkerOptions()
                    .anchor(0.5f, 0.5f)
                    .position(latlng)
                    .title(title.split("市")[0] + "市")
                    .snippet(title.split("市")[1])
                    .draggable(true);
            marker = aMap.addMarker(markerOption);
            marker.showInfoWindow();// 设置默认显示一个infowinfow
        }
//        aMap.addMarker(new MarkerOptions().anchor(0.5f, 0.5f)
//                .position(Constants.CHENGDU).title("成都市")
//                .snippet("成都市:30.679879, 104.064855").draggable(true));
    }

    @Override
    public void onMarkerDragStart(Marker marker) {

    }

    @Override
    public void onMarkerDrag(Marker marker) {

    }

    @Override
    public void onMarkerDragEnd(Marker marker) {

    }

    @Override
    public void onRegeocodeSearched(RegeocodeResult result, int rCode) {
        if (rCode == 1000) {
            if (result != null && result.getRegeocodeAddress() != null && result.getRegeocodeAddress().getFormatAddress() != null) {
                RegeocodeAddress address = result.getRegeocodeAddress();
                mData.clear();
                mData.add(new CityInfo(address));
                cityAddressAdapter.notifyDataSetChanged();
                doSearchQuery("");
            } else {
            }
        } else {
        }
    }

    /**
     * 响应地理编码
     */
    public void getLatlon(final String name) {
        GeocodeQuery query = new GeocodeQuery(name, "");// 第一个参数表示地址，第二个参数表示查询城市，中文或者中文全拼，citycode、adcode，
        geocoderSearch.getFromLocationNameAsyn(query);// 设置同步地理编码请求
    }

    @Override
    public void onGeocodeSearched(GeocodeResult result, int rCode) {
        if (rCode == 1000) {
            if (result != null && result.getGeocodeAddressList() != null
                    && result.getGeocodeAddressList().size() > 0) {
                GeocodeAddress address = result.getGeocodeAddressList().get(0);
                getAddress(address.getLatLonPoint().getLatitude(), address.getLatLonPoint().getLongitude());
            } else {
            }
        } else {
        }
    }

    public void getAddress(double latitude, double longitude) {
        aMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), 17));
    }

    public void getAddress(LatLng latLng) {
        aMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 17));
    }

    public void getAddress() {
        if (llp == null) {
            return;
        }
        // 第一个参数表示一个Latlng，第二参数表示范围多少米，第三个参数表示是火系坐标系还是GPS原生坐标系
        RegeocodeQuery query = new RegeocodeQuery(llp, 200, GeocodeSearch.AMAP);
        geocoderSearch.getFromLocationAsyn(query);// 设置同步逆地理编码请求
    }

    public void jumpPoint(final Marker marker) {
        final Handler handler = new Handler();
        final long start = SystemClock.uptimeMillis();
        Projection proj = aMap.getProjection();
        final LatLng markerLatlng = marker.getPosition();
        Point markerPoint = proj.toScreenLocation(markerLatlng);
        markerPoint.offset(0, -100);
        final LatLng startLatLng = proj.fromScreenLocation(markerPoint);
        final long duration = 1500;

        final Interpolator interpolator = new BounceInterpolator();
        handler.post(new Runnable() {
            @Override
            public void run() {
                long elapsed = SystemClock.uptimeMillis() - start;
                float t = interpolator.getInterpolation((float) elapsed
                        / duration);
                double lng = t * markerLatlng.longitude + (1 - t)
                        * startLatLng.longitude;
                double lat = t * markerLatlng.latitude + (1 - t)
                        * startLatLng.latitude;
                marker.setPosition(new LatLng(lat, lng));
                if (t < 1.0) {
                    handler.postDelayed(this, 16);
                }
            }
        });
    }

    /**
     * 开始进行poi搜索
     */
    protected void doSearchQuery() {
        String keyWord = key_tv.getText().toString().trim();
        if (keyWord.isEmpty()) {
//            toast("请输入关键词");
            return;
        }
        isGetData = false;
        mData.clear();
        cityAddressAdapter.notifyDataSetChanged();
        query = new PoiSearch.Query(keyWord, "", "");// 第一个参数表示搜索字符串，第二个参数表示poi搜索类型，第三个参数表示poi搜索区域（空字符串代表全国）
        query.setPageSize(10);// 设置每页最多返回多少条poiitem
        query.setPageNum(0);// 设置查第一页
        query.setCityLimit(true);
        poiSearch = new PoiSearch(this, query);
        poiSearch.setOnPoiSearchListener(this);
        poiSearch.searchPOIAsyn();
    }

    protected void doSearchQuery(String key) {
        query = new PoiSearch.Query("", "", "");// 第一个参数表示搜索字符串，第二个参数表示poi搜索类型，第三个参数表示poi搜索区域（空字符串代表全国）
        query.setPageSize(10);// 设置每页最多返回多少条poiitem
        query.setPageNum(0);// 设置查第一页
        query.setCityLimit(true);
        poiSearch = new PoiSearch(this, query);
        poiSearch.setOnPoiSearchListener(this);
        if (llp != null) {
            poiSearch.setBound(new PoiSearch.SearchBound(llp, 5000, true));//
        }
        poiSearch.searchPOIAsyn();
    }

    @Override
    public void onPoiSearched(PoiResult result, int rCode) {
        if (rCode == 1000) {
            if (result != null && result.getQuery() != null) {// 搜索poi的结果
                if (result.getQuery().equals(query)) {// 是否是同一条
                    poiResult = result;
                    // 取得搜索到的poiitems有多少页
                    List<PoiItem> poiItems = poiResult.getPois();// 取得第一页的poiitem数据，页数从数字0开始
                    List<SuggestionCity> suggestionCities = poiResult
                            .getSearchSuggestionCitys();// 当搜索不到poiitem数据时，会返回含有搜索关键字的城市信息

                    for (PoiItem address : poiItems) {
                        mData.add(new CityInfo(address));
                    }
                    if (!isGetData) {
                        getLatlon(mData.get(0).getCityInfo());
                        mData.get(0).type = 1;
                    }
                    cityAddressAdapter.notifyDataSetChanged();
                }
            } else {

            }
        } else {
        }

    }

    @Override
    public void onPoiItemSearched(PoiItem poiItem, int i) {

    }


    @Override
    public void onCityClick(CityInfo cityInfo) {
        Intent intent = new Intent();//数据是使用Intent返回
        intent.putExtra("prov", cityInfo.getProv());
        intent.putExtra("city", cityInfo.getCity());
        intent.putExtra("area", cityInfo.getArea());
        intent.putExtra("provCode", cityInfo.getProvCode());
        intent.putExtra("cityCode", cityInfo.getCityCodes());
        intent.putExtra("areaCode", cityInfo.getAreaCode());
        intent.putExtra("info", cityInfo.getInfo());
        setResult(6, intent);
        finish();
    }


    @Override
    public void onGetInputtips(List<Tip> tipList, int rCode) {
        if (rCode == 1000) {// 正确返回
            List<String> listString = new ArrayList<String>();
            for (int i = 0; i < tipList.size(); i++) {
                listString.add(tipList.get(i).getName());
            }
            ArrayAdapter<String> aAdapter = new ArrayAdapter<String>(
                    getApplicationContext(),
                    R.layout.map_route_inputs, listString);
            key_tv.setAdapter(aAdapter);
            aAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String newText = s.toString().trim();
        if (!newText.isEmpty()) {
            InputtipsQuery inputquery = new InputtipsQuery(newText, "");
            Inputtips inputTips = new Inputtips(this, inputquery);
            inputTips.setInputtipsListener(this);
            inputTips.requestInputtipsAsyn();
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}

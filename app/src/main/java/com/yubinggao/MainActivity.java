package com.yubinggao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;

import com.yubinggao.lib.bean.CityInfo;
import com.yubinggao.lib.map.amap.MapSelectAddressActivity;
import com.yubinggao.lib.utils.CityUtils;
import com.yubinggao.lib.view.CountdownView;
import com.yubinggao.lib.view.pickerview.OptionsPickerView;
import com.yubinggao.viewpager.ViewPagerActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/7.
 */

public class MainActivity extends Activity implements View.OnClickListener {
    private ArrayList<CityInfo> options1Items = null;                        //城市选择
    private ArrayList<ArrayList<CityInfo>> options2Items = null;             //城市选择
    private ArrayList<ArrayList<ArrayList<CityInfo>>> options3Items = null;  //城市选择
    private OptionsPickerView pvOptions;
    private CountdownView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        cv = byId(R.id.code_cv);
        CountdownView name;
        name = byId(R.id.view_pager_cv);
        name.setText("图片轮播");
        name = byId(R.id.pickerview_cv);
        name.setText("3D滚轮");
        name = byId(R.id.amap_map_cv);
        name.setText("高德地图");
        name = byId(R.id.recyclerview_cv);
        name.setText("加载更多");
        name = byId(R.id.phone_cv);
        name.setText("获取手机信息");

    }

    public void onClick(View v) {
        Class clazz = null;
        switch (v.getId()) {
            case R.id.view_pager_cv:
                clazz = ViewPagerActivity.class;
                break;
            case R.id.code_cv:
                cv.startCountdown(3);
                return;
            case R.id.pickerview_cv:
                showCitySelect();
                return;
            case R.id.amap_map_cv:
                clazz = MapSelectAddressActivity.class;
                break;
            case R.id.recyclerview_cv:
                clazz = RecyclerViewActivity.class;
                break;
            case R.id.phone_cv:
                clazz = PhoneInfoActivity.class;
                break;
        }
        if (clazz != null) startActivity(new Intent(this, clazz));
    }

    private void showCitySelect() {
        if (options1Items == null) {
            options1Items = CityUtils.getInstance().getProvince();
            options2Items = CityUtils.getInstance().getMunicipal();
            options3Items = CityUtils.getInstance().getDistrict();
            pvOptions = new OptionsPickerView(this);
            //三级联动效果
            pvOptions.setPicker(options1Items, options2Items, options3Items, true);
//            pvOptions.setLabels("省", "市", "区");
            pvOptions.setTitle("选择城市");
            pvOptions.setCyclic(false, true, true);
            pvOptions.setSelectOptions(1, 0, 0);
            pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {

                @Override
                public void onOptionsSelect(int options1, int option2, int options3) {
                    //返回的分别是三个级别的选中位置
                    String tx = "";
                    try {
                        String prov = options1Items.get(options1).getCityName();
                        String city = options2Items.get(options1).get(option2).getCityName();
                        String area = options3Items.get(options1).get(option2).get(options3).getCityName();
                        String provCode = options1Items.get(options1).getCityCode();
                        tx = prov + " " + city + " " + area;
                        System.out.println("选择城市 " + tx);
                    } catch (Exception e) {
                        tx = "请选择";
                    }
                }
            });
        }
        pvOptions.show();
    }

    public CountdownView byId(int id) {
        View view = findViewById(id);
        view.setOnClickListener(this);
        return (CountdownView) view;
    }

}

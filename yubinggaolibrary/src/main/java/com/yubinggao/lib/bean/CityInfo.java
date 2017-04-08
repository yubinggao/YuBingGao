package com.yubinggao.lib.bean;


import com.amap.api.services.core.PoiItem;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.yubinggao.lib.view.pickerview.interfaces.IPickerViewData;

/**
 * Created by Administrator on 2016/8/22.
 */
public class CityInfo implements IPickerViewData {
    private String name;
    private String code;
    private String title;
    private String township;
    private String provinceName;//省
    private String cityName;//市
    private String districtName;//区
    private String address;//详细
    private String snippet;//
    public int type = 0;

    public CityInfo() {

    }

    public CityInfo(String content) {
        this.name = content;
        this.code = "10214";
    }

    public CityInfo(String content, String code) {
        this.name = content;
        this.code = code;
    }

    public CityInfo(String provinceName, String cityName, String districtName) {
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.districtName = districtName;
    }

    public CityInfo(RegeocodeAddress addres) {
        this.code = addres.getAdCode();
        this.title = addres.getNeighborhood();
        this.provinceName = addres.getProvince();
        this.cityName = addres.getCity();
        this.districtName = addres.getDistrict();
        this.address = addres.getFormatAddress();
        this.township = addres.getTownship();
        this.type = 1;
    }


    public CityInfo(PoiItem poiItems) {
        this.code = poiItems.getAdCode();
        this.title = poiItems.getTitle();
        this.provinceName = poiItems.getProvinceName();
        this.cityName = poiItems.getCityName();
        this.districtName = poiItems.getAdName();
        this.address = "";
        this.snippet = poiItems.getSnippet();
        this.type = 0;
    }


    @Override
    public String getPickerViewText() {
        String item;
        if (name.length() > 3) {
            item = name.substring(0, 4) + "…";
        } else {
            item = name;
        }
        return item;
    }

    public String getCityName() {
        return name;
    }

    public String getCityCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getTownship() {
        return township;
    }

    /**
     * 完整地址
     *
     * @return
     */
    public String getCityInfo() {
        if (address.isEmpty()) {
            return provinceName + cityName + districtName + snippet;
        }
        return address;
    }

    /**
     * 省
     *
     * @return
     */
    public String getProv() {
        return provinceName;
    }

    /**
     * 市
     *
     * @return
     */
    public String getCity() {
        return cityName;
    }

    /**
     * 区县
     *
     * @return
     */
    public String getArea() {
        return districtName;
    }

    /**
     * 省编码
     *
     * @return
     */
    public String getProvCode() {
        return code.substring(0, 2) + "0000";
    }

    /**
     * 市编码
     *
     * @return
     */
    public String getCityCodes() {
        return code.substring(0, 4) + "00";
    }

    /**
     * 区县编码
     *
     * @return
     */
    public String getAreaCode() {
        return code;
    }

    public String getInfo() {
        if (address.isEmpty()) {
            return snippet;
        }
        String info = address;
        return info.replaceAll(provinceName + cityName + districtName, "");
    }

}

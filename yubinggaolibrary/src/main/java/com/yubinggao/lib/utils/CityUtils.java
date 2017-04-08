package com.yubinggao.lib.utils;



import com.yubinggao.lib.bean.CityInfo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/22.
 */
public class CityUtils {
    public CityUtils() {
    }

    private static CityUtils cityUtilsc = null;

    public static CityUtils getInstance() {
        if (cityUtilsc == null) {
            cityUtilsc = new CityUtils();
        }
        return cityUtilsc;
    }

    private ArrayList<CityInfo> province = new ArrayList<>();
    private ArrayList<ArrayList<CityInfo>> municipal = new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<CityInfo>>> district = new ArrayList<>();

    public ArrayList<CityInfo> getProvince() {
        if (province.size() == 0) {
            initProvince();
        }
        return province;
    }

    public ArrayList<ArrayList<CityInfo>> getMunicipal() {
        if (municipal.size() == 0) {
            initMunicipal();
        }
        return municipal;
    }

    public ArrayList<ArrayList<ArrayList<CityInfo>>> getDistrict() {
        if (district.size() == 0) {
            initDistrict();
            getShangxi();
            getJianSu();
            getFujian();
            getShanDong();
            getHuNan();
            getSiChuan();
            getYunNan();
            getGangSu();
            getHeiLongJian();
            getNeiMengGu();
        }
        return district;
    }

    private void initProvince() {
        //        province.add()
        province.add(new CityInfo("北京市", "110000"));
        province.add(new CityInfo("上海市", "310000"));
        province.add(new CityInfo("天津市", "120000"));
        province.add(new CityInfo("河北省", "130000"));
        province.add(new CityInfo("山西省", "140000"));
        province.add(new CityInfo("辽宁省", "210000"));
        province.add(new CityInfo("吉林省", "220000"));
        province.add(new CityInfo("江苏省", "320000"));
        province.add(new CityInfo("浙江省", "330000"));
        province.add(new CityInfo("安徽省", "340000"));
        province.add(new CityInfo("福建省", "350000"));
        province.add(new CityInfo("江西省", "360000"));
        province.add(new CityInfo("山东省", "370000"));
        province.add(new CityInfo("河南省", "410000"));
        province.add(new CityInfo("湖北省", "420000"));
        province.add(new CityInfo("湖南省", "430000"));
        province.add(new CityInfo("广东省", "440000"));
        province.add(new CityInfo("海南省", "460000"));
        province.add(new CityInfo("重庆市", "500000"));
        province.add(new CityInfo("四川省", "510000"));
        province.add(new CityInfo("贵州省", "520000"));
        province.add(new CityInfo("云南省", "530000"));
        province.add(new CityInfo("陕西省", "610000"));
        province.add(new CityInfo("甘肃省", "620000"));
        province.add(new CityInfo("青海省", "630000"));
        //       province.add(new CityInfo("台湾省", "710000"));
        province.add(new CityInfo("黑龙江省", "230000"));
        province.add(new CityInfo("西藏自治区", "540000"));
        province.add(new CityInfo("内蒙古自治区", "150000"));
        province.add(new CityInfo("宁夏回族自治区", "640000"));
        province.add(new CityInfo("广西壮族自治区", "450000"));
        province.add(new CityInfo("新疆维吾尔自治区", "650000"));
        //      province.add(new CityInfo("香港特别行政区", "810000"));
        //      province.add(new CityInfo("澳门特别行政区", "820000"
    }

    private void initMunicipal() {
        /**
         *北京市
         */
        ArrayList<CityInfo> bjMunicipal = new ArrayList<>();
        bjMunicipal.add(new CityInfo("市辖区", "110100"));
        bjMunicipal.add(new CityInfo("县", "110200"));
        municipal.add(bjMunicipal);
        /**
         *上海市
         */
        ArrayList<CityInfo> shMunicipal = new ArrayList<>();
        shMunicipal.add(new CityInfo("市辖区", "310100"));
        shMunicipal.add(new CityInfo("县", "310200"));
        municipal.add(shMunicipal);
        /**
         *天津市
         */
        ArrayList<CityInfo> tjMunicipal = new ArrayList<>();
        tjMunicipal.add(new CityInfo("市辖区", "120100"));
        tjMunicipal.add(new CityInfo("县", "120200"));
        municipal.add(tjMunicipal);
        /**
         *河北省
         */
        ArrayList<CityInfo> hbMunicipal = new ArrayList<>();
        hbMunicipal.add(new CityInfo("石家庄市", "130100"));
        hbMunicipal.add(new CityInfo("唐山市", "130200"));
        hbMunicipal.add(new CityInfo("秦皇岛市", "130300"));
        hbMunicipal.add(new CityInfo("邯郸市", "130400"));
        hbMunicipal.add(new CityInfo("邢台市", "130500"));
        hbMunicipal.add(new CityInfo("保定市", "130600"));
        hbMunicipal.add(new CityInfo("张家口市", "130700"));
        hbMunicipal.add(new CityInfo("承德市", "130800"));
        hbMunicipal.add(new CityInfo("沧州市", "130900"));
        hbMunicipal.add(new CityInfo("廊坊市", "131000"));
        hbMunicipal.add(new CityInfo("衡水市", "131100"));
        municipal.add(hbMunicipal);
        /**
         *山西省
         */
        ArrayList<CityInfo> sxMunicipal = new ArrayList<>();
        sxMunicipal.add(new CityInfo("太原市", "140100"));
        sxMunicipal.add(new CityInfo("大同市", "140200"));
        sxMunicipal.add(new CityInfo("阳泉市", "140300"));
        sxMunicipal.add(new CityInfo("长治市", "140400"));
        sxMunicipal.add(new CityInfo("晋城市", "140500"));
        sxMunicipal.add(new CityInfo("朔州市", "140600"));
        sxMunicipal.add(new CityInfo("晋中市", "140700"));
        sxMunicipal.add(new CityInfo("运城市", "140800"));
        sxMunicipal.add(new CityInfo("忻州市", "140900"));
        sxMunicipal.add(new CityInfo("临汾市", "141000"));
        sxMunicipal.add(new CityInfo("吕梁市", "141100"));
        municipal.add(sxMunicipal);
        /**
         *辽宁省
         */
        ArrayList<CityInfo> llMunicipal = new ArrayList<>();
        llMunicipal.add(new CityInfo("沈阳市", "210100"));
        llMunicipal.add(new CityInfo("大连市", "210200"));
        llMunicipal.add(new CityInfo("鞍山市", "210300"));
        llMunicipal.add(new CityInfo("抚顺市", "210400"));
        llMunicipal.add(new CityInfo("本溪市", "210500"));
        llMunicipal.add(new CityInfo("丹东市", "210600"));
        llMunicipal.add(new CityInfo("锦州市", "210700"));
        llMunicipal.add(new CityInfo("营口市", "210800"));
        llMunicipal.add(new CityInfo("阜新市", "210900"));
        llMunicipal.add(new CityInfo("辽阳市", "211000"));
        llMunicipal.add(new CityInfo("盘锦市", "211100"));
        llMunicipal.add(new CityInfo("铁岭市", "211200"));
        llMunicipal.add(new CityInfo("朝阳市", "211300"));
        llMunicipal.add(new CityInfo("葫芦岛市", "211400"));
        municipal.add(llMunicipal);
        /**
         *吉林省
         */
        ArrayList<CityInfo> jlMunicipal = new ArrayList<>();
        jlMunicipal.add(new CityInfo("长春市", "220100"));
        jlMunicipal.add(new CityInfo("吉林市", "220200"));
        jlMunicipal.add(new CityInfo("四平市", "220300"));
        jlMunicipal.add(new CityInfo("辽源市", "220400"));
        jlMunicipal.add(new CityInfo("通化市", "220500"));
        jlMunicipal.add(new CityInfo("白山市", "220600"));
        jlMunicipal.add(new CityInfo("松原市", "220700"));
        jlMunicipal.add(new CityInfo("白城市", "220800"));
        jlMunicipal.add(new CityInfo("延边朝鲜族自治州", "222400"));
        municipal.add(jlMunicipal);
        /**
         *江苏省
         */
        ArrayList<CityInfo> jsMunicipal = new ArrayList<>();
        jsMunicipal.add(new CityInfo("南京市", "320100"));
        jsMunicipal.add(new CityInfo("无锡市", "320200"));
        jsMunicipal.add(new CityInfo("徐州市", "320300"));
        jsMunicipal.add(new CityInfo("常州市", "320400"));
        jsMunicipal.add(new CityInfo("苏州市", "320500"));
        jsMunicipal.add(new CityInfo("南通市", "320600"));
        jsMunicipal.add(new CityInfo("连云港市", "320700"));
        jsMunicipal.add(new CityInfo("淮安市", "320800"));
        jsMunicipal.add(new CityInfo("盐城市", "320900"));
        jsMunicipal.add(new CityInfo("扬州市", "321000"));
        jsMunicipal.add(new CityInfo("镇江市", "321100"));
        jsMunicipal.add(new CityInfo("泰州市", "321200"));
        jsMunicipal.add(new CityInfo("宿迁市", "321300"));
        municipal.add(jsMunicipal);
        /**
         *浙江省
         */
        ArrayList<CityInfo> zjMunicipal = new ArrayList<>();
        zjMunicipal.add(new CityInfo("杭州市", "330100"));
        zjMunicipal.add(new CityInfo("宁波市", "330200"));
        zjMunicipal.add(new CityInfo("温州市", "330300"));
        zjMunicipal.add(new CityInfo("嘉兴市", "330400"));
        zjMunicipal.add(new CityInfo("湖州市", "330500"));
        zjMunicipal.add(new CityInfo("绍兴市", "330600"));
        zjMunicipal.add(new CityInfo("金华市", "330700"));
        zjMunicipal.add(new CityInfo("衢州市", "330800"));
        zjMunicipal.add(new CityInfo("舟山市", "330900"));
        zjMunicipal.add(new CityInfo("台州市", "331000"));
        zjMunicipal.add(new CityInfo("丽水市", "331100"));
        municipal.add(zjMunicipal);
        /**
         *安徽省
         */
        ArrayList<CityInfo> ahMunicipal = new ArrayList<>();
        ahMunicipal.add(new CityInfo("合肥市", "340100"));
        ahMunicipal.add(new CityInfo("芜湖市", "340200"));
        ahMunicipal.add(new CityInfo("蚌埠市", "340300"));
        ahMunicipal.add(new CityInfo("淮南市", "340400"));
        ahMunicipal.add(new CityInfo("马鞍山市", "340500"));
        ahMunicipal.add(new CityInfo("淮北市", "340600"));
        ahMunicipal.add(new CityInfo("铜陵市", "340700"));
        ahMunicipal.add(new CityInfo("安庆市", "340800"));
        ahMunicipal.add(new CityInfo("黄山市", "341000"));
        ahMunicipal.add(new CityInfo("滁州市", "341100"));
        ahMunicipal.add(new CityInfo("阜阳市", "341200"));
        ahMunicipal.add(new CityInfo("宿州市", "341300"));
        ahMunicipal.add(new CityInfo("巢湖市", "341400"));
        ahMunicipal.add(new CityInfo("六安市", "341500"));
        ahMunicipal.add(new CityInfo("亳州市", "341600"));
        ahMunicipal.add(new CityInfo("池州市", "341700"));
        ahMunicipal.add(new CityInfo("宣城市", "341800"));
        municipal.add(ahMunicipal);
        /**
         *福建省
         */
        ArrayList<CityInfo> fjMunicipal = new ArrayList<>();
        fjMunicipal.add(new CityInfo("福州市", "350100"));
        fjMunicipal.add(new CityInfo("厦门市", "350200"));
        fjMunicipal.add(new CityInfo("莆田市", "350300"));
        fjMunicipal.add(new CityInfo("三明市", "350400"));
        fjMunicipal.add(new CityInfo("泉州市", "350500"));
        fjMunicipal.add(new CityInfo("漳州市", "350600"));
        fjMunicipal.add(new CityInfo("南平市", "350700"));
        fjMunicipal.add(new CityInfo("龙岩市", "350800"));
        fjMunicipal.add(new CityInfo("宁德市", "350900"));
        municipal.add(fjMunicipal);
        /**
         *江西省
         */
        ArrayList<CityInfo> jxMunicipal = new ArrayList<>();
        jxMunicipal.add(new CityInfo("南昌市", "360100"));
        jxMunicipal.add(new CityInfo("景德镇市", "360200"));
        jxMunicipal.add(new CityInfo("萍乡市", "360300"));
        jxMunicipal.add(new CityInfo("九江市", "360400"));
        jxMunicipal.add(new CityInfo("新余市", "360500"));
        jxMunicipal.add(new CityInfo("鹰潭市", "360600"));
        jxMunicipal.add(new CityInfo("赣州市", "360700"));
        jxMunicipal.add(new CityInfo("吉安市", "360800"));
        jxMunicipal.add(new CityInfo("宜春市", "360900"));
        jxMunicipal.add(new CityInfo("抚州市", "361000"));
        jxMunicipal.add(new CityInfo("上饶市", "361100"));
        municipal.add(jxMunicipal);
        /**
         *山东省
         */
        ArrayList<CityInfo> sdMunicipal = new ArrayList<>();
        sdMunicipal.add(new CityInfo("济南市", "370100"));
        sdMunicipal.add(new CityInfo("青岛市", "370200"));
        sdMunicipal.add(new CityInfo("淄博市", "370300"));
        sdMunicipal.add(new CityInfo("枣庄市", "370400"));
        sdMunicipal.add(new CityInfo("东营市", "370500"));
        sdMunicipal.add(new CityInfo("烟台市", "370600"));
        sdMunicipal.add(new CityInfo("潍坊市", "370700"));
        sdMunicipal.add(new CityInfo("济宁市", "370800"));
        sdMunicipal.add(new CityInfo("泰安市", "370900"));
        sdMunicipal.add(new CityInfo("威海市", "371000"));
        sdMunicipal.add(new CityInfo("日照市", "371100"));
        sdMunicipal.add(new CityInfo("莱芜市", "371200"));
        sdMunicipal.add(new CityInfo("临沂市", "371300"));
        sdMunicipal.add(new CityInfo("德州市", "371400"));
        sdMunicipal.add(new CityInfo("聊城市", "371500"));
        sdMunicipal.add(new CityInfo("滨州市", "371600"));
        sdMunicipal.add(new CityInfo("荷泽市", "371700"));
        municipal.add(sdMunicipal);
        /**
         *河南省
         */
        ArrayList<CityInfo> hnMunicipal = new ArrayList<>();
        hnMunicipal.add(new CityInfo("郑州市", "410100"));
        hnMunicipal.add(new CityInfo("开封市", "410200"));
        hnMunicipal.add(new CityInfo("洛阳市", "410300"));
        hnMunicipal.add(new CityInfo("平顶山市", "410400"));
        hnMunicipal.add(new CityInfo("安阳市", "410500"));
        hnMunicipal.add(new CityInfo("鹤壁市", "410600"));
        hnMunicipal.add(new CityInfo("新乡市", "410700"));
        hnMunicipal.add(new CityInfo("焦作市", "410800"));
        hnMunicipal.add(new CityInfo("濮阳市", "410900"));
        hnMunicipal.add(new CityInfo("许昌市", "411000"));
        hnMunicipal.add(new CityInfo("漯河市", "411100"));
        hnMunicipal.add(new CityInfo("三门峡市", "411200"));
        hnMunicipal.add(new CityInfo("南阳市", "411300"));
        hnMunicipal.add(new CityInfo("商丘市", "411400"));
        hnMunicipal.add(new CityInfo("信阳市", "411500"));
        hnMunicipal.add(new CityInfo("周口市", "411600"));
        hnMunicipal.add(new CityInfo("驻马店市", "411700"));
        municipal.add(hnMunicipal);
        /**
         *湖北省
         */
        ArrayList<CityInfo> hbsMunicipal = new ArrayList<>();
        hbsMunicipal.add(new CityInfo("武汉市", "420100"));
        hbsMunicipal.add(new CityInfo("黄石市", "420200"));
        hbsMunicipal.add(new CityInfo("十堰市", "420300"));
        hbsMunicipal.add(new CityInfo("宜昌市", "420500"));
        hbsMunicipal.add(new CityInfo("襄樊市", "420600"));
        hbsMunicipal.add(new CityInfo("鄂州市", "420700"));
        hbsMunicipal.add(new CityInfo("荆门市", "420800"));
        hbsMunicipal.add(new CityInfo("孝感市", "420900"));
        hbsMunicipal.add(new CityInfo("荆州市", "421000"));
        hbsMunicipal.add(new CityInfo("黄冈市", "421100"));
        hbsMunicipal.add(new CityInfo("咸宁市", "421200"));
        hbsMunicipal.add(new CityInfo("随州市", "421300"));
        hbsMunicipal.add(new CityInfo("恩施土家族苗族自治州", "422800"));
        hbsMunicipal.add(new CityInfo("省直辖行政单位", "429000"));
        municipal.add(hbsMunicipal);
        /**
         *湖南省
         */
        ArrayList<CityInfo> hnsMunicipal = new ArrayList<>();
        hnsMunicipal.add(new CityInfo("长沙市", "430100"));
        hnsMunicipal.add(new CityInfo("株洲市", "430200"));
        hnsMunicipal.add(new CityInfo("湘潭市", "430300"));
        hnsMunicipal.add(new CityInfo("衡阳市", "430400"));
        hnsMunicipal.add(new CityInfo("邵阳市", "430500"));
        hnsMunicipal.add(new CityInfo("岳阳市", "430600"));
        hnsMunicipal.add(new CityInfo("常德市", "430700"));
        hnsMunicipal.add(new CityInfo("张家界市", "430800"));
        hnsMunicipal.add(new CityInfo("益阳市", "430900"));
        hnsMunicipal.add(new CityInfo("郴州市", "431000"));
        hnsMunicipal.add(new CityInfo("永州市", "431100"));
        hnsMunicipal.add(new CityInfo("怀化市", "431200"));
        hnsMunicipal.add(new CityInfo("娄底市", "431300"));
        hnsMunicipal.add(new CityInfo("湘西土家族苗族自治州", "433100"));
        municipal.add(hnsMunicipal);
        /**
         *广东省
         */
        ArrayList<CityInfo> gdMunicipal = new ArrayList<>();
        gdMunicipal.add(new CityInfo("广州市", "440100"));
        gdMunicipal.add(new CityInfo("韶关市", "440200"));
        gdMunicipal.add(new CityInfo("深圳市", "440300"));
        gdMunicipal.add(new CityInfo("珠海市", "440400"));
        gdMunicipal.add(new CityInfo("汕头市", "440500"));
        gdMunicipal.add(new CityInfo("佛山市", "440600"));
        gdMunicipal.add(new CityInfo("江门市", "440700"));
        gdMunicipal.add(new CityInfo("湛江市", "440800"));
        gdMunicipal.add(new CityInfo("茂名市", "440900"));
        gdMunicipal.add(new CityInfo("肇庆市", "441200"));
        gdMunicipal.add(new CityInfo("惠州市", "441300"));
        gdMunicipal.add(new CityInfo("梅州市", "441400"));
        gdMunicipal.add(new CityInfo("汕尾市", "441500"));
        gdMunicipal.add(new CityInfo("河源市", "441600"));
        gdMunicipal.add(new CityInfo("阳江市", "441700"));
        gdMunicipal.add(new CityInfo("清远市", "441800"));
        gdMunicipal.add(new CityInfo("东莞市", "441900"));
        gdMunicipal.add(new CityInfo("中山市", "442000"));
        gdMunicipal.add(new CityInfo("潮州市", "445100"));
        gdMunicipal.add(new CityInfo("揭阳市", "445200"));
        gdMunicipal.add(new CityInfo("云浮市", "445300"));
        municipal.add(gdMunicipal);
        /**
         *海南省
         */
        ArrayList<CityInfo> hainMunicipal = new ArrayList<>();
        hainMunicipal.add(new CityInfo("海口市", "460100"));
        hainMunicipal.add(new CityInfo("三亚市", "460200"));
        hainMunicipal.add(new CityInfo("省直辖县级行政单位", "469000"));
        municipal.add(hainMunicipal);
        /**
         *重庆市
         */
        ArrayList<CityInfo> cqMunicipal = new ArrayList<>();
        cqMunicipal.add(new CityInfo("市辖区", "500100"));
        cqMunicipal.add(new CityInfo("县", "500200"));
        cqMunicipal.add(new CityInfo("市", "500300"));
        municipal.add(cqMunicipal);
        /**
         *四川省
         */
        ArrayList<CityInfo> scMunicipal = new ArrayList<>();
        scMunicipal.add(new CityInfo("成都市", "510100"));
        scMunicipal.add(new CityInfo("自贡市", "510300"));
        scMunicipal.add(new CityInfo("攀枝花市", "510400"));
        scMunicipal.add(new CityInfo("泸州市", "510500"));
        scMunicipal.add(new CityInfo("德阳市", "510600"));
        scMunicipal.add(new CityInfo("绵阳市", "510700"));
        scMunicipal.add(new CityInfo("广元市", "510800"));
        scMunicipal.add(new CityInfo("遂宁市", "510900"));
        scMunicipal.add(new CityInfo("内江市", "511000"));
        scMunicipal.add(new CityInfo("乐山市", "511100"));
        scMunicipal.add(new CityInfo("南充市", "511300"));
        scMunicipal.add(new CityInfo("眉山市", "511400"));
        scMunicipal.add(new CityInfo("宜宾市", "511500"));
        scMunicipal.add(new CityInfo("广安市", "511600"));
        scMunicipal.add(new CityInfo("达州市", "511700"));
        scMunicipal.add(new CityInfo("雅安市", "511800"));
        scMunicipal.add(new CityInfo("巴中市", "511900"));
        scMunicipal.add(new CityInfo("资阳市", "512000"));
        scMunicipal.add(new CityInfo("阿坝藏族羌族自治州", "513200"));
        scMunicipal.add(new CityInfo("甘孜藏族自治州", "513300"));
        scMunicipal.add(new CityInfo("凉山彝族自治州", "513400"));
        municipal.add(scMunicipal);
        /**
         *贵州省
         */
        ArrayList<CityInfo> gzMunicipal = new ArrayList<>();
        gzMunicipal.add(new CityInfo("贵阳市", "520100"));
        gzMunicipal.add(new CityInfo("六盘水市", "520200"));
        gzMunicipal.add(new CityInfo("遵义市", "520300"));
        gzMunicipal.add(new CityInfo("安顺市", "520400"));
        gzMunicipal.add(new CityInfo("铜仁地区", "522200"));
        gzMunicipal.add(new CityInfo("黔西南布依族苗族自治州", "522300"));
        gzMunicipal.add(new CityInfo("毕节地区", "522400"));
        gzMunicipal.add(new CityInfo("黔东南苗族侗族自治州", "522600"));
        gzMunicipal.add(new CityInfo("黔南布依族苗族自治州", "522700"));
        municipal.add(gzMunicipal);
        /**
         *云南省
         */
        ArrayList<CityInfo> ynMunicipal = new ArrayList<>();
        ynMunicipal.add(new CityInfo("昆明市", "530100"));
        ynMunicipal.add(new CityInfo("曲靖市", "530300"));
        ynMunicipal.add(new CityInfo("玉溪市", "530400"));
        ynMunicipal.add(new CityInfo("保山市", "530500"));
        ynMunicipal.add(new CityInfo("昭通市", "530600"));
        ynMunicipal.add(new CityInfo("丽江市", "530700"));
        ynMunicipal.add(new CityInfo("思茅市", "530800"));
        ynMunicipal.add(new CityInfo("临沧市", "530900"));
        ynMunicipal.add(new CityInfo("楚雄彝族自治州", "532300"));
        ynMunicipal.add(new CityInfo("红河哈尼族彝族自治州", "532500"));
        ynMunicipal.add(new CityInfo("文山壮族苗族自治州", "532600"));
        ynMunicipal.add(new CityInfo("西双版纳傣族自治州", "532800"));
        ynMunicipal.add(new CityInfo("大理白族自治州", "532900"));
        ynMunicipal.add(new CityInfo("德宏傣族景颇族自治州", "533100"));
        ynMunicipal.add(new CityInfo("怒江傈僳族自治州", "533300"));
        ynMunicipal.add(new CityInfo("迪庆藏族自治州", "533400"));
        municipal.add(ynMunicipal);
        /**
         *陕西省
         */
        ArrayList<CityInfo> sxsMunicipal = new ArrayList<>();
        sxsMunicipal.add(new CityInfo("西安市", "610100"));
        sxsMunicipal.add(new CityInfo("铜川市", "610200"));
        sxsMunicipal.add(new CityInfo("宝鸡市", "610300"));
        sxsMunicipal.add(new CityInfo("咸阳市", "610400"));
        sxsMunicipal.add(new CityInfo("渭南市", "610500"));
        sxsMunicipal.add(new CityInfo("延安市", "610600"));
        sxsMunicipal.add(new CityInfo("汉中市", "610700"));
        sxsMunicipal.add(new CityInfo("榆林市", "610800"));
        sxsMunicipal.add(new CityInfo("安康市", "610900"));
        sxsMunicipal.add(new CityInfo("商洛市", "611000"));
        municipal.add(sxsMunicipal);
        /**
         *甘肃省
         */
        ArrayList<CityInfo> gsMunicipal = new ArrayList<>();
        gsMunicipal.add(new CityInfo("兰州市", "620100"));
        gsMunicipal.add(new CityInfo("嘉峪关市", "620200"));
        gsMunicipal.add(new CityInfo("金昌市", "620300"));
        gsMunicipal.add(new CityInfo("白银市", "620400"));
        gsMunicipal.add(new CityInfo("天水市", "620500"));
        gsMunicipal.add(new CityInfo("武威市", "620600"));
        gsMunicipal.add(new CityInfo("张掖市", "620700"));
        gsMunicipal.add(new CityInfo("平凉市", "620800"));
        gsMunicipal.add(new CityInfo("酒泉市", "620900"));
        gsMunicipal.add(new CityInfo("庆阳市", "621000"));
        gsMunicipal.add(new CityInfo("定西市", "621100"));
        gsMunicipal.add(new CityInfo("陇南市", "621200"));
        gsMunicipal.add(new CityInfo("临夏回族自治州", "622900"));
        gsMunicipal.add(new CityInfo("甘南藏族自治州", "623000"));
        municipal.add(gsMunicipal);
        /**
         *青海省
         */
        ArrayList<CityInfo> qhMunicipal = new ArrayList<>();
        qhMunicipal.add(new CityInfo("西宁市", "630100"));
        qhMunicipal.add(new CityInfo("海东地区", "632100"));
        qhMunicipal.add(new CityInfo("海北藏族自治州", "632200"));
        qhMunicipal.add(new CityInfo("黄南藏族自治州", "632300"));
        qhMunicipal.add(new CityInfo("海南藏族自治州", "632500"));
        qhMunicipal.add(new CityInfo("果洛藏族自治州", "632600"));
        qhMunicipal.add(new CityInfo("玉树藏族自治州", "632700"));
        qhMunicipal.add(new CityInfo("海西蒙古族藏族自治州", "632800"));
        municipal.add(qhMunicipal);
        /**
         *黑龙江省
         */
        ArrayList<CityInfo> hljMunicipal = new ArrayList<>();
        hljMunicipal.add(new CityInfo("哈尔滨市", "230100"));
        hljMunicipal.add(new CityInfo("齐齐哈尔市", "230200"));
        hljMunicipal.add(new CityInfo("鸡西市", "230300"));
        hljMunicipal.add(new CityInfo("鹤岗市", "230400"));
        hljMunicipal.add(new CityInfo("双鸭山市", "230500"));
        hljMunicipal.add(new CityInfo("大庆市", "230600"));
        hljMunicipal.add(new CityInfo("伊春市", "230700"));
        hljMunicipal.add(new CityInfo("佳木斯市", "230800"));
        hljMunicipal.add(new CityInfo("七台河市", "230900"));
        hljMunicipal.add(new CityInfo("牡丹江市", "231000"));
        hljMunicipal.add(new CityInfo("黑河市", "231100"));
        hljMunicipal.add(new CityInfo("绥化市", "231200"));
        hljMunicipal.add(new CityInfo("大兴安岭地区", "232700"));
        municipal.add(hljMunicipal);
        /**
         *西藏自治区
         */
        ArrayList<CityInfo> xzMunicipal = new ArrayList<>();
        xzMunicipal.add(new CityInfo("拉萨市", "540100"));
        xzMunicipal.add(new CityInfo("昌都地区", "542100"));
        xzMunicipal.add(new CityInfo("山南地区", "542200"));
        xzMunicipal.add(new CityInfo("日喀则地区", "542300"));
        xzMunicipal.add(new CityInfo("那曲地区", "542400"));
        xzMunicipal.add(new CityInfo("阿里地区", "542500"));
        xzMunicipal.add(new CityInfo("林芝地区", "542600"));
        municipal.add(xzMunicipal);
        /**
         *内蒙古自治区
         */
        ArrayList<CityInfo> nmgMunicipal = new ArrayList<>();
        nmgMunicipal.add(new CityInfo("呼和浩特市", "150100"));
        nmgMunicipal.add(new CityInfo("包头市", "150200"));
        nmgMunicipal.add(new CityInfo("乌海市", "150300"));
        nmgMunicipal.add(new CityInfo("赤峰市", "150400"));
        nmgMunicipal.add(new CityInfo("通辽市", "150500"));
        nmgMunicipal.add(new CityInfo("鄂尔多斯市", "150600"));
        nmgMunicipal.add(new CityInfo("呼伦贝尔市", "150700"));
        nmgMunicipal.add(new CityInfo("巴彦淖尔市", "150800"));
        nmgMunicipal.add(new CityInfo("乌兰察布市", "150900"));
        nmgMunicipal.add(new CityInfo("兴安盟", "152200"));
        nmgMunicipal.add(new CityInfo("锡林郭勒盟", "152500"));
        nmgMunicipal.add(new CityInfo("阿拉善盟", "152900"));
        municipal.add(nmgMunicipal);
        /**
         *宁夏回族自治区
         */
        ArrayList<CityInfo> lxMunicipal = new ArrayList<>();
        lxMunicipal.add(new CityInfo("银川市", "640100"));
        lxMunicipal.add(new CityInfo("石嘴山市", "640200"));
        lxMunicipal.add(new CityInfo("吴忠市", "640300"));
        lxMunicipal.add(new CityInfo("固原市", "640400"));
        lxMunicipal.add(new CityInfo("中卫市", "640500"));
        municipal.add(lxMunicipal);
        /**
         *广西壮族自治区
         */
        ArrayList<CityInfo> gxMunicipal = new ArrayList<>();
        gxMunicipal.add(new CityInfo("南宁市", "450100"));
        gxMunicipal.add(new CityInfo("柳州市", "450200"));
        gxMunicipal.add(new CityInfo("桂林市", "450300"));
        gxMunicipal.add(new CityInfo("梧州市", "450400"));
        gxMunicipal.add(new CityInfo("北海市", "450500"));
        gxMunicipal.add(new CityInfo("防城港市", "450600"));
        gxMunicipal.add(new CityInfo("钦州市", "450700"));
        gxMunicipal.add(new CityInfo("贵港市", "450800"));
        gxMunicipal.add(new CityInfo("玉林市", "450900"));
        gxMunicipal.add(new CityInfo("百色市", "451000"));
        gxMunicipal.add(new CityInfo("贺州市", "451100"));
        gxMunicipal.add(new CityInfo("河池市", "451200"));
        gxMunicipal.add(new CityInfo("来宾市", "451300"));
        gxMunicipal.add(new CityInfo("崇左市", "451400"));
        municipal.add(gxMunicipal);
        /**
         *新疆维吾尔自治区
         */
        ArrayList<CityInfo> xjMunicipal = new ArrayList<>();
        xjMunicipal.add(new CityInfo("乌鲁木齐市", "650100"));
        xjMunicipal.add(new CityInfo("克拉玛依市", "650200"));
        xjMunicipal.add(new CityInfo("吐鲁番地区", "652100"));
        xjMunicipal.add(new CityInfo("哈密地区", "652200"));
        xjMunicipal.add(new CityInfo("昌吉回族自治州", "652300"));
        xjMunicipal.add(new CityInfo("博尔塔拉蒙古自治州", "652700"));
        xjMunicipal.add(new CityInfo("巴音郭楞蒙古自治州", "652800"));
        xjMunicipal.add(new CityInfo("阿克苏地区", "652900"));
        xjMunicipal.add(new CityInfo("克孜勒苏柯尔克孜自治州", "653000"));
        xjMunicipal.add(new CityInfo("喀什地区", "653100"));
        xjMunicipal.add(new CityInfo("和田地区", "653200"));
        xjMunicipal.add(new CityInfo("伊犁哈萨克自治州", "654000"));
        xjMunicipal.add(new CityInfo("塔城地区", "654200"));
        xjMunicipal.add(new CityInfo("阿勒泰地区", "654300"));
        xjMunicipal.add(new CityInfo("省直辖行政单位", "659000"));
        municipal.add(xjMunicipal);
    }

    private void initDistrict() {
        /**
         *北京市 - 市辖区
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0301 = new ArrayList<>();
        ArrayList<CityInfo> district_03001 = new ArrayList<>();
        district_03001.add(new CityInfo("东城区", "110101"));
        district_03001.add(new CityInfo("西城区", "110102"));
        district_03001.add(new CityInfo("崇文区", "110103"));
        district_03001.add(new CityInfo("宣武区", "110104"));
        district_03001.add(new CityInfo("朝阳区", "110105"));
        district_03001.add(new CityInfo("丰台区", "110106"));
        district_03001.add(new CityInfo("石景山区", "110107"));
        district_03001.add(new CityInfo("海淀区", "110108"));
        district_03001.add(new CityInfo("门头沟区", "110109"));
        district_03001.add(new CityInfo("房山区", "110111"));
        district_03001.add(new CityInfo("通州区", "110112"));
        district_03001.add(new CityInfo("顺义区", "110113"));
        district_03001.add(new CityInfo("昌平区", "110114"));
        district_03001.add(new CityInfo("大兴区", "110115"));
        district_03001.add(new CityInfo("怀柔区", "110116"));
        district_03001.add(new CityInfo("平谷区", "110117"));
        listDistrict_0301.add(district_03001);
        /**
         *北京市 - 县
         */
        ArrayList<CityInfo> district_03002 = new ArrayList<>();
        district_03002.add(new CityInfo("密云县", "110228"));
        district_03002.add(new CityInfo("延庆县", "110229"));
        listDistrict_0301.add(district_03002);
        district.add(listDistrict_0301);
        /**
         *上海市 - 市辖区
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0302 = new ArrayList<>();
        ArrayList<CityInfo> district_03003 = new ArrayList<>();
        district_03003.add(new CityInfo("黄浦区", "310101"));
        district_03003.add(new CityInfo("卢湾区", "310103"));
        district_03003.add(new CityInfo("徐汇区", "310104"));
        district_03003.add(new CityInfo("长宁区", "310105"));
        district_03003.add(new CityInfo("静安区", "310106"));
        district_03003.add(new CityInfo("普陀区", "310107"));
        district_03003.add(new CityInfo("闸北区", "310108"));
        district_03003.add(new CityInfo("虹口区", "310109"));
        district_03003.add(new CityInfo("杨浦区", "310110"));
        district_03003.add(new CityInfo("闵行区", "310112"));
        district_03003.add(new CityInfo("宝山区", "310113"));
        district_03003.add(new CityInfo("嘉定区", "310114"));
        district_03003.add(new CityInfo("浦东新区", "310115"));
        district_03003.add(new CityInfo("金山区", "310116"));
        district_03003.add(new CityInfo("松江区", "310117"));
        district_03003.add(new CityInfo("青浦区", "310118"));
        district_03003.add(new CityInfo("南汇区", "310119"));
        district_03003.add(new CityInfo("奉贤区", "310120"));
        listDistrict_0302.add(district_03003);
        /**
         *上海市 - 县
         */
        ArrayList<CityInfo> district_03004 = new ArrayList<>();
        district_03004.add(new CityInfo("崇明县", "310230"));
        listDistrict_0302.add(district_03004);
        district.add(listDistrict_0302);
        /**
         *天津市 - 市辖区
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0303 = new ArrayList<>();
        ArrayList<CityInfo> district_03005 = new ArrayList<>();
        district_03005.add(new CityInfo("和平区", "120101"));
        district_03005.add(new CityInfo("河东区", "120102"));
        district_03005.add(new CityInfo("河西区", "120103"));
        district_03005.add(new CityInfo("南开区", "120104"));
        district_03005.add(new CityInfo("河北区", "120105"));
        district_03005.add(new CityInfo("红桥区", "120106"));
        district_03005.add(new CityInfo("塘沽区", "120107"));
        district_03005.add(new CityInfo("汉沽区", "120108"));
        district_03005.add(new CityInfo("大港区", "120109"));
        district_03005.add(new CityInfo("东丽区", "120110"));
        district_03005.add(new CityInfo("西青区", "120111"));
        district_03005.add(new CityInfo("津南区", "120112"));
        district_03005.add(new CityInfo("北辰区", "120113"));
        district_03005.add(new CityInfo("武清区", "120114"));
        district_03005.add(new CityInfo("宝坻区", "120115"));
        listDistrict_0303.add(district_03005);
        /**
         *天津市 - 县
         */
        ArrayList<CityInfo> district_03006 = new ArrayList<>();
        district_03006.add(new CityInfo("宁河县", "120221"));
        district_03006.add(new CityInfo("静海县", "120223"));
        district_03006.add(new CityInfo("蓟　县", "120225"));
        listDistrict_0303.add(district_03006);
        district.add(listDistrict_0303);
        /**
         *河北省 - 石家庄市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0304 = new ArrayList<>();
        ArrayList<CityInfo> district_03007 = new ArrayList<>();
        district_03007.add(new CityInfo("市辖区", "130101"));
        district_03007.add(new CityInfo("长安区", "130102"));
        district_03007.add(new CityInfo("桥东区", "130103"));
        district_03007.add(new CityInfo("桥西区", "130104"));
        district_03007.add(new CityInfo("新华区", "130105"));
        district_03007.add(new CityInfo("井陉矿区", "130107"));
        district_03007.add(new CityInfo("裕华区", "130108"));
        district_03007.add(new CityInfo("井陉县", "130121"));
        district_03007.add(new CityInfo("正定县", "130123"));
        district_03007.add(new CityInfo("栾城县", "130124"));
        district_03007.add(new CityInfo("行唐县", "130125"));
        district_03007.add(new CityInfo("灵寿县", "130126"));
        district_03007.add(new CityInfo("高邑县", "130127"));
        district_03007.add(new CityInfo("深泽县", "130128"));
        district_03007.add(new CityInfo("赞皇县", "130129"));
        district_03007.add(new CityInfo("无极县", "130130"));
        district_03007.add(new CityInfo("平山县", "130131"));
        district_03007.add(new CityInfo("元氏县", "130132"));
        district_03007.add(new CityInfo("赵　县", "130133"));
        district_03007.add(new CityInfo("辛集市", "130181"));
        district_03007.add(new CityInfo("藁城市", "130182"));
        district_03007.add(new CityInfo("晋州市", "130183"));
        district_03007.add(new CityInfo("新乐市", "130184"));
        district_03007.add(new CityInfo("鹿泉市", "130185"));
        listDistrict_0304.add(district_03007);
        /**
         *河北省 - 唐山市
         */
        ArrayList<CityInfo> district_030008 = new ArrayList<>();
        district_030008.add(new CityInfo("市辖区", "130201"));
        district_030008.add(new CityInfo("路南区", "130202"));
        district_030008.add(new CityInfo("路北区", "130203"));
        district_030008.add(new CityInfo("古冶区", "130204"));
        district_030008.add(new CityInfo("开平区", "130205"));
        district_030008.add(new CityInfo("丰南区", "130207"));
        district_030008.add(new CityInfo("丰润区", "130208"));
        district_030008.add(new CityInfo("滦　县", "130223"));
        district_030008.add(new CityInfo("滦南县", "130224"));
        district_030008.add(new CityInfo("乐亭县", "130225"));
        district_030008.add(new CityInfo("迁西县", "130227"));
        district_030008.add(new CityInfo("玉田县", "130229"));
        district_030008.add(new CityInfo("唐海县", "130230"));
        district_030008.add(new CityInfo("遵化市", "130281"));
        district_030008.add(new CityInfo("迁安市", "130283"));
        listDistrict_0304.add(district_030008);
        /**
         *河北省 - 秦皇岛市
         */
        ArrayList<CityInfo> district_030009 = new ArrayList<>();
        district_030009.add(new CityInfo("市辖区", "130301"));
        district_030009.add(new CityInfo("海港区", "130302"));
        district_030009.add(new CityInfo("山海关区", "130303"));
        district_030009.add(new CityInfo("北戴河区", "130304"));
        district_030009.add(new CityInfo("青龙满族自治县", "130321"));
        district_030009.add(new CityInfo("昌黎县", "130322"));
        district_030009.add(new CityInfo("抚宁县", "130323"));
        district_030009.add(new CityInfo("卢龙县", "130324"));
        listDistrict_0304.add(district_030009);
        /**
         *河北省 - 邯郸市
         */
        ArrayList<CityInfo> district_030010 = new ArrayList<>();
        district_030010.add(new CityInfo("市辖区", "130401"));
        district_030010.add(new CityInfo("邯山区", "130402"));
        district_030010.add(new CityInfo("丛台区", "130403"));
        district_030010.add(new CityInfo("复兴区", "130404"));
        district_030010.add(new CityInfo("峰峰矿区", "130406"));
        district_030010.add(new CityInfo("邯郸县", "130421"));
        district_030010.add(new CityInfo("临漳县", "130423"));
        district_030010.add(new CityInfo("成安县", "130424"));
        district_030010.add(new CityInfo("大名县", "130425"));
        district_030010.add(new CityInfo("涉　县", "130426"));
        district_030010.add(new CityInfo("磁　县", "130427"));
        district_030010.add(new CityInfo("肥乡县", "130428"));
        district_030010.add(new CityInfo("永年县", "130429"));
        district_030010.add(new CityInfo("邱　县", "130430"));
        district_030010.add(new CityInfo("鸡泽县", "130431"));
        district_030010.add(new CityInfo("广平县", "130432"));
        district_030010.add(new CityInfo("馆陶县", "130433"));
        district_030010.add(new CityInfo("魏　县", "130434"));
        district_030010.add(new CityInfo("曲周县", "130435"));
        district_030010.add(new CityInfo("武安市", "130481"));
        listDistrict_0304.add(district_030010);
        /**
         *河北省 - 邢台市
         */
        ArrayList<CityInfo> district_030011 = new ArrayList<>();
        district_030011.add(new CityInfo("市辖区", "130501"));
        district_030011.add(new CityInfo("桥东区", "130502"));
        district_030011.add(new CityInfo("桥西区", "130503"));
        district_030011.add(new CityInfo("邢台县", "130521"));
        district_030011.add(new CityInfo("临城县", "130522"));
        district_030011.add(new CityInfo("内丘县", "130523"));
        district_030011.add(new CityInfo("柏乡县", "130524"));
        district_030011.add(new CityInfo("隆尧县", "130525"));
        district_030011.add(new CityInfo("任　县", "130526"));
        district_030011.add(new CityInfo("南和县", "130527"));
        district_030011.add(new CityInfo("宁晋县", "130528"));
        district_030011.add(new CityInfo("巨鹿县", "130529"));
        district_030011.add(new CityInfo("新河县", "130530"));
        district_030011.add(new CityInfo("广宗县", "130531"));
        district_030011.add(new CityInfo("平乡县", "130532"));
        district_030011.add(new CityInfo("威　县", "130533"));
        district_030011.add(new CityInfo("清河县", "130534"));
        district_030011.add(new CityInfo("临西县", "130535"));
        district_030011.add(new CityInfo("南宫市", "130581"));
        district_030011.add(new CityInfo("沙河市", "130582"));
        listDistrict_0304.add(district_030011);
        /**
         *河北省 - 保定市
         */
        ArrayList<CityInfo> district_030012 = new ArrayList<>();
        district_030012.add(new CityInfo("市辖区", "130601"));
        district_030012.add(new CityInfo("新市区", "130602"));
        district_030012.add(new CityInfo("北市区", "130603"));
        district_030012.add(new CityInfo("南市区", "130604"));
        district_030012.add(new CityInfo("满城县", "130621"));
        district_030012.add(new CityInfo("清苑县", "130622"));
        district_030012.add(new CityInfo("涞水县", "130623"));
        district_030012.add(new CityInfo("阜平县", "130624"));
        district_030012.add(new CityInfo("徐水县", "130625"));
        district_030012.add(new CityInfo("定兴县", "130626"));
        district_030012.add(new CityInfo("唐　县", "130627"));
        district_030012.add(new CityInfo("高阳县", "130628"));
        district_030012.add(new CityInfo("容城县", "130629"));
        district_030012.add(new CityInfo("涞源县", "130630"));
        district_030012.add(new CityInfo("望都县", "130631"));
        district_030012.add(new CityInfo("安新县", "130632"));
        district_030012.add(new CityInfo("易　县", "130633"));
        district_030012.add(new CityInfo("曲阳县", "130634"));
        district_030012.add(new CityInfo("蠡　县", "130635"));
        district_030012.add(new CityInfo("顺平县", "130636"));
        district_030012.add(new CityInfo("博野县", "130637"));
        district_030012.add(new CityInfo("雄　县", "130638"));
        district_030012.add(new CityInfo("涿州市", "130681"));
        district_030012.add(new CityInfo("定州市", "130682"));
        district_030012.add(new CityInfo("安国市", "130683"));
        district_030012.add(new CityInfo("高碑店市", "130684"));
        listDistrict_0304.add(district_030012);
        /**
         *河北省 - 张家口市
         */
        ArrayList<CityInfo> district_030013 = new ArrayList<>();
        district_030013.add(new CityInfo("市辖区", "130701"));
        district_030013.add(new CityInfo("桥东区", "130702"));
        district_030013.add(new CityInfo("桥西区", "130703"));
        district_030013.add(new CityInfo("宣化区", "130705"));
        district_030013.add(new CityInfo("下花园区", "130706"));
        district_030013.add(new CityInfo("宣化县", "130721"));
        district_030013.add(new CityInfo("张北县", "130722"));
        district_030013.add(new CityInfo("康保县", "130723"));
        district_030013.add(new CityInfo("沽源县", "130724"));
        district_030013.add(new CityInfo("尚义县", "130725"));
        district_030013.add(new CityInfo("蔚　县", "130726"));
        district_030013.add(new CityInfo("阳原县", "130727"));
        district_030013.add(new CityInfo("怀安县", "130728"));
        district_030013.add(new CityInfo("万全县", "130729"));
        district_030013.add(new CityInfo("怀来县", "130730"));
        district_030013.add(new CityInfo("涿鹿县", "130731"));
        district_030013.add(new CityInfo("赤城县", "130732"));
        district_030013.add(new CityInfo("崇礼县", "130733"));
        listDistrict_0304.add(district_030013);
        /**
         *河北省 - 承德市
         */
        ArrayList<CityInfo> district_030014 = new ArrayList<>();
        district_030014.add(new CityInfo("市辖区", "130801"));
        district_030014.add(new CityInfo("双桥区", "130802"));
        district_030014.add(new CityInfo("双滦区", "130803"));
        district_030014.add(new CityInfo("鹰手营子矿区", "130804"));
        district_030014.add(new CityInfo("承德县", "130821"));
        district_030014.add(new CityInfo("兴隆县", "130822"));
        district_030014.add(new CityInfo("平泉县", "130823"));
        district_030014.add(new CityInfo("滦平县", "130824"));
        district_030014.add(new CityInfo("隆化县", "130825"));
        district_030014.add(new CityInfo("丰宁满族自治县", "130826"));
        district_030014.add(new CityInfo("宽城满族自治县", "130827"));
        district_030014.add(new CityInfo("围场满族蒙古族自治县", "130828"));
        listDistrict_0304.add(district_030014);
        /**
         *河北省 - 沧州市
         */
        ArrayList<CityInfo> district_030015 = new ArrayList<>();
        district_030015.add(new CityInfo("市辖区", "130901"));
        district_030015.add(new CityInfo("新华区", "130902"));
        district_030015.add(new CityInfo("运河区", "130903"));
        district_030015.add(new CityInfo("沧　县", "130921"));
        district_030015.add(new CityInfo("青　县", "130922"));
        district_030015.add(new CityInfo("东光县", "130923"));
        district_030015.add(new CityInfo("海兴县", "130924"));
        district_030015.add(new CityInfo("盐山县", "130925"));
        district_030015.add(new CityInfo("肃宁县", "130926"));
        district_030015.add(new CityInfo("南皮县", "130927"));
        district_030015.add(new CityInfo("吴桥县", "130928"));
        district_030015.add(new CityInfo("献　县", "130929"));
        district_030015.add(new CityInfo("孟村回族自治县", "130930"));
        district_030015.add(new CityInfo("泊头市", "130981"));
        district_030015.add(new CityInfo("任丘市", "130982"));
        district_030015.add(new CityInfo("黄骅市", "130983"));
        district_030015.add(new CityInfo("河间市", "130984"));
        listDistrict_0304.add(district_030015);
        /**
         *河北省 - 廊坊市
         */
        ArrayList<CityInfo> district_030016 = new ArrayList<>();
        district_030016.add(new CityInfo("市辖区", "131001"));
        district_030016.add(new CityInfo("安次区", "131002"));
        district_030016.add(new CityInfo("广阳区", "131003"));
        district_030016.add(new CityInfo("固安县", "131022"));
        district_030016.add(new CityInfo("永清县", "131023"));
        district_030016.add(new CityInfo("香河县", "131024"));
        district_030016.add(new CityInfo("大城县", "131025"));
        district_030016.add(new CityInfo("文安县", "131026"));
        district_030016.add(new CityInfo("大厂回族自治县", "131028"));
        district_030016.add(new CityInfo("霸州市", "131081"));
        district_030016.add(new CityInfo("三河市", "131082"));
        listDistrict_0304.add(district_030016);
        /**
         *河北省 - 衡水市
         */
        ArrayList<CityInfo> district_030017 = new ArrayList<>();
        district_030017.add(new CityInfo("市辖区", "131101"));
        district_030017.add(new CityInfo("桃城区", "131102"));
        district_030017.add(new CityInfo("枣强县", "131121"));
        district_030017.add(new CityInfo("武邑县", "131122"));
        district_030017.add(new CityInfo("武强县", "131123"));
        district_030017.add(new CityInfo("饶阳县", "131124"));
        district_030017.add(new CityInfo("安平县", "131125"));
        district_030017.add(new CityInfo("故城县", "131126"));
        district_030017.add(new CityInfo("景　县", "131127"));
        district_030017.add(new CityInfo("阜城县", "131128"));
        district_030017.add(new CityInfo("冀州市", "131181"));
        district_030017.add(new CityInfo("深州市", "131182"));
        listDistrict_0304.add(district_030017);
        district.add(listDistrict_0304);
    }

    void getShangxi() {
        ArrayList<ArrayList<CityInfo>> listDistrict_0305 = new ArrayList<>();
        /**
         *山西省 - 太原市
         */
        ArrayList<CityInfo> district_030501 = new ArrayList<>();
        district_030501.add(new CityInfo("市辖区", "140101"));
        district_030501.add(new CityInfo("小店区", "140105"));
        district_030501.add(new CityInfo("迎泽区", "140106"));
        district_030501.add(new CityInfo("杏花岭区", "140107"));
        district_030501.add(new CityInfo("尖草坪区", "140108"));
        district_030501.add(new CityInfo("万柏林区", "140109"));
        district_030501.add(new CityInfo("晋源区", "140110"));
        district_030501.add(new CityInfo("清徐县", "140121"));
        district_030501.add(new CityInfo("阳曲县", "140122"));
        district_030501.add(new CityInfo("娄烦县", "140123"));
        district_030501.add(new CityInfo("古交市", "140181"));
        listDistrict_0305.add(district_030501);
        /**
         *山西省 - 大同市
         */

        ArrayList<CityInfo> district_030018 = new ArrayList<>();
        district_030018.add(new CityInfo("市辖区", "140201"));
        district_030018.add(new CityInfo("城　区", "140202"));
        district_030018.add(new CityInfo("矿　区", "140203"));
        district_030018.add(new CityInfo("南郊区", "140211"));
        district_030018.add(new CityInfo("新荣区", "140212"));
        district_030018.add(new CityInfo("阳高县", "140221"));
        district_030018.add(new CityInfo("天镇县", "140222"));
        district_030018.add(new CityInfo("广灵县", "140223"));
        district_030018.add(new CityInfo("灵丘县", "140224"));
        district_030018.add(new CityInfo("浑源县", "140225"));
        district_030018.add(new CityInfo("左云县", "140226"));
        district_030018.add(new CityInfo("大同县", "140227"));
        listDistrict_0305.add(district_030018);
        /**
         *山西省 - 阳泉市
         */
        ArrayList<CityInfo> district_030019 = new ArrayList<>();
        district_030019.add(new CityInfo("市辖区", "140301"));
        district_030019.add(new CityInfo("城　区", "140302"));
        district_030019.add(new CityInfo("矿　区", "140303"));
        district_030019.add(new CityInfo("郊　区", "140311"));
        district_030019.add(new CityInfo("平定县", "140321"));
        district_030019.add(new CityInfo("盂　县", "140322"));
        listDistrict_0305.add(district_030019);
        /**
         *山西省 - 长治市
         */
        ArrayList<CityInfo> district_030020 = new ArrayList<>();
        district_030020.add(new CityInfo("市辖区", "140401"));
        district_030020.add(new CityInfo("城　区", "140402"));
        district_030020.add(new CityInfo("郊　区", "140411"));
        district_030020.add(new CityInfo("长治县", "140421"));
        district_030020.add(new CityInfo("襄垣县", "140423"));
        district_030020.add(new CityInfo("屯留县", "140424"));
        district_030020.add(new CityInfo("平顺县", "140425"));
        district_030020.add(new CityInfo("黎城县", "140426"));
        district_030020.add(new CityInfo("壶关县", "140427"));
        district_030020.add(new CityInfo("长子县", "140428"));
        district_030020.add(new CityInfo("武乡县", "140429"));
        district_030020.add(new CityInfo("沁　县", "140430"));
        district_030020.add(new CityInfo("沁源县", "140431"));
        district_030020.add(new CityInfo("潞城市", "140481"));
        listDistrict_0305.add(district_030020);
        /**
         *山西省 - 晋城市
         */
        ArrayList<CityInfo> district_030021 = new ArrayList<>();
        district_030021.add(new CityInfo("市辖区", "140501"));
        district_030021.add(new CityInfo("城　区", "140502"));
        district_030021.add(new CityInfo("沁水县", "140521"));
        district_030021.add(new CityInfo("阳城县", "140522"));
        district_030021.add(new CityInfo("陵川县", "140524"));
        district_030021.add(new CityInfo("泽州县", "140525"));
        district_030021.add(new CityInfo("高平市", "140581"));
        listDistrict_0305.add(district_030021);
        /**
         *山西省 - 朔州市
         */
        ArrayList<CityInfo> district_030022 = new ArrayList<>();
        district_030022.add(new CityInfo("市辖区", "140601"));
        district_030022.add(new CityInfo("朔城区", "140602"));
        district_030022.add(new CityInfo("平鲁区", "140603"));
        district_030022.add(new CityInfo("山阴县", "140621"));
        district_030022.add(new CityInfo("应　县", "140622"));
        district_030022.add(new CityInfo("右玉县", "140623"));
        district_030022.add(new CityInfo("怀仁县", "140624"));
        listDistrict_0305.add(district_030022);
        /**
         *山西省 - 晋中市
         */
        ArrayList<CityInfo> district_030023 = new ArrayList<>();
        district_030023.add(new CityInfo("市辖区", "140701"));
        district_030023.add(new CityInfo("榆次区", "140702"));
        district_030023.add(new CityInfo("榆社县", "140721"));
        district_030023.add(new CityInfo("左权县", "140722"));
        district_030023.add(new CityInfo("和顺县", "140723"));
        district_030023.add(new CityInfo("昔阳县", "140724"));
        district_030023.add(new CityInfo("寿阳县", "140725"));
        district_030023.add(new CityInfo("太谷县", "140726"));
        district_030023.add(new CityInfo("祁　县", "140727"));
        district_030023.add(new CityInfo("平遥县", "140728"));
        district_030023.add(new CityInfo("灵石县", "140729"));
        district_030023.add(new CityInfo("介休市", "140781"));
        listDistrict_0305.add(district_030023);
        /**
         *山西省 - 运城市
         */
        ArrayList<CityInfo> district_030024 = new ArrayList<>();
        district_030024.add(new CityInfo("市辖区", "140801"));
        district_030024.add(new CityInfo("盐湖区", "140802"));
        district_030024.add(new CityInfo("临猗县", "140821"));
        district_030024.add(new CityInfo("万荣县", "140822"));
        district_030024.add(new CityInfo("闻喜县", "140823"));
        district_030024.add(new CityInfo("稷山县", "140824"));
        district_030024.add(new CityInfo("新绛县", "140825"));
        district_030024.add(new CityInfo("绛　县", "140826"));
        district_030024.add(new CityInfo("垣曲县", "140827"));
        district_030024.add(new CityInfo("夏　县", "140828"));
        district_030024.add(new CityInfo("平陆县", "140829"));
        district_030024.add(new CityInfo("芮城县", "140830"));
        district_030024.add(new CityInfo("永济市", "140881"));
        district_030024.add(new CityInfo("河津市", "140882"));
        listDistrict_0305.add(district_030024);
        /**
         *山西省 - 忻州市
         */
        ArrayList<CityInfo> district_030025 = new ArrayList<>();
        district_030025.add(new CityInfo("市辖区", "140901"));
        district_030025.add(new CityInfo("忻府区", "140902"));
        district_030025.add(new CityInfo("定襄县", "140921"));
        district_030025.add(new CityInfo("五台县", "140922"));
        district_030025.add(new CityInfo("代　县", "140923"));
        district_030025.add(new CityInfo("繁峙县", "140924"));
        district_030025.add(new CityInfo("宁武县", "140925"));
        district_030025.add(new CityInfo("静乐县", "140926"));
        district_030025.add(new CityInfo("神池县", "140927"));
        district_030025.add(new CityInfo("五寨县", "140928"));
        district_030025.add(new CityInfo("岢岚县", "140929"));
        district_030025.add(new CityInfo("河曲县", "140930"));
        district_030025.add(new CityInfo("保德县", "140931"));
        district_030025.add(new CityInfo("偏关县", "140932"));
        district_030025.add(new CityInfo("原平市", "140981"));
        listDistrict_0305.add(district_030025);
        /**
         *山西省 - 临汾市
         */
        ArrayList<CityInfo> district_030026 = new ArrayList<>();
        district_030026.add(new CityInfo("市辖区", "141001"));
        district_030026.add(new CityInfo("尧都区", "141002"));
        district_030026.add(new CityInfo("曲沃县", "141021"));
        district_030026.add(new CityInfo("翼城县", "141022"));
        district_030026.add(new CityInfo("襄汾县", "141023"));
        district_030026.add(new CityInfo("洪洞县", "141024"));
        district_030026.add(new CityInfo("古　县", "141025"));
        district_030026.add(new CityInfo("安泽县", "141026"));
        district_030026.add(new CityInfo("浮山县", "141027"));
        district_030026.add(new CityInfo("吉　县", "141028"));
        district_030026.add(new CityInfo("乡宁县", "141029"));
        district_030026.add(new CityInfo("大宁县", "141030"));
        district_030026.add(new CityInfo("隰　县", "141031"));
        district_030026.add(new CityInfo("永和县", "141032"));
        district_030026.add(new CityInfo("蒲　县", "141033"));
        district_030026.add(new CityInfo("汾西县", "141034"));
        district_030026.add(new CityInfo("侯马市", "141081"));
        district_030026.add(new CityInfo("霍州市", "141082"));
        listDistrict_0305.add(district_030026);
        /**
         *山西省 - 吕梁市
         */
        ArrayList<CityInfo> district_030027 = new ArrayList<>();
        district_030027.add(new CityInfo("市辖区", "141101"));
        district_030027.add(new CityInfo("离石区", "141102"));
        district_030027.add(new CityInfo("文水县", "141121"));
        district_030027.add(new CityInfo("交城县", "141122"));
        district_030027.add(new CityInfo("兴　县", "141123"));
        district_030027.add(new CityInfo("临　县", "141124"));
        district_030027.add(new CityInfo("柳林县", "141125"));
        district_030027.add(new CityInfo("石楼县", "141126"));
        district_030027.add(new CityInfo("岚　县", "141127"));
        district_030027.add(new CityInfo("方山县", "141128"));
        district_030027.add(new CityInfo("中阳县", "141129"));
        district_030027.add(new CityInfo("交口县", "141130"));
        district_030027.add(new CityInfo("孝义市", "141181"));
        district_030027.add(new CityInfo("汾阳市", "141182"));
        listDistrict_0305.add(district_030027);
        district.add(listDistrict_0305);

        /**
         *辽宁省 - 沈阳市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0306 = new ArrayList<>();
        ArrayList<CityInfo> district_030601 = new ArrayList<>();
        district_030601.add(new CityInfo("市辖区", "210101"));
        district_030601.add(new CityInfo("和平区", "210102"));
        district_030601.add(new CityInfo("沈河区", "210103"));
        district_030601.add(new CityInfo("大东区", "210104"));
        district_030601.add(new CityInfo("皇姑区", "210105"));
        district_030601.add(new CityInfo("铁西区", "210106"));
        district_030601.add(new CityInfo("苏家屯区", "210111"));
        district_030601.add(new CityInfo("东陵区", "210112"));
        district_030601.add(new CityInfo("新城子区", "210113"));
        district_030601.add(new CityInfo("于洪区", "210114"));
        district_030601.add(new CityInfo("辽中县", "210122"));
        district_030601.add(new CityInfo("康平县", "210123"));
        district_030601.add(new CityInfo("法库县", "210124"));
        district_030601.add(new CityInfo("新民市", "210181"));
        listDistrict_0306.add(district_030601);

        /**
         *辽宁省 - 大连市
         */
        ArrayList<CityInfo> district_030028 = new ArrayList<>();
        district_030028.add(new CityInfo("市辖区", "210201"));
        district_030028.add(new CityInfo("中山区", "210202"));
        district_030028.add(new CityInfo("西岗区", "210203"));
        district_030028.add(new CityInfo("沙河口区", "210204"));
        district_030028.add(new CityInfo("甘井子区", "210211"));
        district_030028.add(new CityInfo("旅顺口区", "210212"));
        district_030028.add(new CityInfo("金州区", "210213"));
        district_030028.add(new CityInfo("长海县", "210224"));
        district_030028.add(new CityInfo("瓦房店市", "210281"));
        district_030028.add(new CityInfo("普兰店市", "210282"));
        district_030028.add(new CityInfo("庄河市", "210283"));
        listDistrict_0306.add(district_030028);
        /**
         *辽宁省 - 鞍山市
         */
        ArrayList<CityInfo> district_030029 = new ArrayList<>();
        district_030029.add(new CityInfo("市辖区", "210301"));
        district_030029.add(new CityInfo("铁东区", "210302"));
        district_030029.add(new CityInfo("铁西区", "210303"));
        district_030029.add(new CityInfo("立山区", "210304"));
        district_030029.add(new CityInfo("千山区", "210311"));
        district_030029.add(new CityInfo("台安县", "210321"));
        district_030029.add(new CityInfo("岫岩满族自治县", "210323"));
        district_030029.add(new CityInfo("海城市", "210381"));
        listDistrict_0306.add(district_030029);
        /**
         *辽宁省 - 抚顺市
         */
        ArrayList<CityInfo> district_030030 = new ArrayList<>();
        district_030030.add(new CityInfo("市辖区", "210401"));
        district_030030.add(new CityInfo("新抚区", "210402"));
        district_030030.add(new CityInfo("东洲区", "210403"));
        district_030030.add(new CityInfo("望花区", "210404"));
        district_030030.add(new CityInfo("顺城区", "210411"));
        district_030030.add(new CityInfo("抚顺县", "210421"));
        district_030030.add(new CityInfo("新宾满族自治县", "210422"));
        district_030030.add(new CityInfo("清原满族自治县", "210423"));
        listDistrict_0306.add(district_030030);
        /**
         *辽宁省 - 本溪市
         */
        ArrayList<CityInfo> district_030031 = new ArrayList<>();
        district_030031.add(new CityInfo("市辖区", "210501"));
        district_030031.add(new CityInfo("平山区", "210502"));
        district_030031.add(new CityInfo("溪湖区", "210503"));
        district_030031.add(new CityInfo("明山区", "210504"));
        district_030031.add(new CityInfo("南芬区", "210505"));
        district_030031.add(new CityInfo("本溪满族自治县", "210521"));
        district_030031.add(new CityInfo("桓仁满族自治县", "210522"));
        listDistrict_0306.add(district_030031);
        /**
         *辽宁省 - 丹东市
         */
        ArrayList<CityInfo> district_030032 = new ArrayList<>();
        district_030032.add(new CityInfo("市辖区", "210601"));
        district_030032.add(new CityInfo("元宝区", "210602"));
        district_030032.add(new CityInfo("振兴区", "210603"));
        district_030032.add(new CityInfo("振安区", "210604"));
        district_030032.add(new CityInfo("宽甸满族自治县", "210624"));
        district_030032.add(new CityInfo("东港市", "210681"));
        district_030032.add(new CityInfo("凤城市", "210682"));
        listDistrict_0306.add(district_030032);
        /**
         *辽宁省 - 锦州市
         */
        ArrayList<CityInfo> district_030033 = new ArrayList<>();
        district_030033.add(new CityInfo("市辖区", "210701"));
        district_030033.add(new CityInfo("古塔区", "210702"));
        district_030033.add(new CityInfo("凌河区", "210703"));
        district_030033.add(new CityInfo("太和区", "210711"));
        district_030033.add(new CityInfo("黑山县", "210726"));
        district_030033.add(new CityInfo("义　县", "210727"));
        district_030033.add(new CityInfo("凌海市", "210781"));
        district_030033.add(new CityInfo("北宁市", "210782"));
        listDistrict_0306.add(district_030033);
        /**
         *辽宁省 - 营口市
         */
        ArrayList<CityInfo> district_030034 = new ArrayList<>();
        district_030034.add(new CityInfo("市辖区", "210801"));
        district_030034.add(new CityInfo("站前区", "210802"));
        district_030034.add(new CityInfo("西市区", "210803"));
        district_030034.add(new CityInfo("鲅鱼圈区", "210804"));
        district_030034.add(new CityInfo("老边区", "210811"));
        district_030034.add(new CityInfo("盖州市", "210881"));
        district_030034.add(new CityInfo("大石桥市", "210882"));
        listDistrict_0306.add(district_030034);
        /**
         *辽宁省 - 阜新市
         */
        ArrayList<CityInfo> district_030035 = new ArrayList<>();
        district_030035.add(new CityInfo("市辖区", "210901"));
        district_030035.add(new CityInfo("海州区", "210902"));
        district_030035.add(new CityInfo("新邱区", "210903"));
        district_030035.add(new CityInfo("太平区", "210904"));
        district_030035.add(new CityInfo("清河门区", "210905"));
        district_030035.add(new CityInfo("细河区", "210911"));
        district_030035.add(new CityInfo("阜新蒙古族自治县", "210921"));
        district_030035.add(new CityInfo("彰武县", "210922"));
        listDistrict_0306.add(district_030035);
        /**
         *辽宁省 - 辽阳市
         */
        ArrayList<CityInfo> district_030036 = new ArrayList<>();
        district_030036.add(new CityInfo("市辖区", "211001"));
        district_030036.add(new CityInfo("白塔区", "211002"));
        district_030036.add(new CityInfo("文圣区", "211003"));
        district_030036.add(new CityInfo("宏伟区", "211004"));
        district_030036.add(new CityInfo("弓长岭区", "211005"));
        district_030036.add(new CityInfo("太子河区", "211011"));
        district_030036.add(new CityInfo("辽阳县", "211021"));
        district_030036.add(new CityInfo("灯塔市", "211081"));
        listDistrict_0306.add(district_030036);
        /**
         *辽宁省 - 盘锦市
         */
        ArrayList<CityInfo> district_030037 = new ArrayList<>();
        district_030037.add(new CityInfo("市辖区", "211101"));
        district_030037.add(new CityInfo("双台子区", "211102"));
        district_030037.add(new CityInfo("兴隆台区", "211103"));
        district_030037.add(new CityInfo("大洼县", "211121"));
        district_030037.add(new CityInfo("盘山县", "211122"));
        listDistrict_0306.add(district_030037);
        /**
         *辽宁省 - 铁岭市
         */
        ArrayList<CityInfo> district_030038 = new ArrayList<>();
        district_030038.add(new CityInfo("市辖区", "211201"));
        district_030038.add(new CityInfo("银州区", "211202"));
        district_030038.add(new CityInfo("清河区", "211204"));
        district_030038.add(new CityInfo("铁岭县", "211221"));
        district_030038.add(new CityInfo("西丰县", "211223"));
        district_030038.add(new CityInfo("昌图县", "211224"));
        district_030038.add(new CityInfo("调兵山市", "211281"));
        district_030038.add(new CityInfo("开原市", "211282"));
        listDistrict_0306.add(district_030038);
        /**
         *辽宁省 - 朝阳市
         */
        ArrayList<CityInfo> district_030039 = new ArrayList<>();
        district_030039.add(new CityInfo("市辖区", "211301"));
        district_030039.add(new CityInfo("双塔区", "211302"));
        district_030039.add(new CityInfo("龙城区", "211303"));
        district_030039.add(new CityInfo("朝阳县", "211321"));
        district_030039.add(new CityInfo("建平县", "211322"));
        district_030039.add(new CityInfo("喀喇沁左翼蒙古族自治县", "211324"));
        district_030039.add(new CityInfo("北票市", "211381"));
        district_030039.add(new CityInfo("凌源市", "211382"));
        listDistrict_0306.add(district_030039);
        /**
         *辽宁省 - 葫芦岛市
         */
        ArrayList<CityInfo> district_030040 = new ArrayList<>();
        district_030040.add(new CityInfo("市辖区", "211401"));
        district_030040.add(new CityInfo("连山区", "211402"));
        district_030040.add(new CityInfo("龙港区", "211403"));
        district_030040.add(new CityInfo("南票区", "211404"));
        district_030040.add(new CityInfo("绥中县", "211421"));
        district_030040.add(new CityInfo("建昌县", "211422"));
        district_030040.add(new CityInfo("兴城市", "211481"));
        listDistrict_0306.add(district_030040);
        district.add(listDistrict_0306);
        /**
         *吉林省 - 长春市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0307 = new ArrayList<>();
        ArrayList<CityInfo> district_030041 = new ArrayList<>();
        district_030041.add(new CityInfo("市辖区", "220101"));
        district_030041.add(new CityInfo("南关区", "220102"));
        district_030041.add(new CityInfo("宽城区", "220103"));
        district_030041.add(new CityInfo("朝阳区", "220104"));
        district_030041.add(new CityInfo("二道区", "220105"));
        district_030041.add(new CityInfo("绿园区", "220106"));
        district_030041.add(new CityInfo("双阳区", "220112"));
        district_030041.add(new CityInfo("农安县", "220122"));
        district_030041.add(new CityInfo("九台市", "220181"));
        district_030041.add(new CityInfo("榆树市", "220182"));
        district_030041.add(new CityInfo("德惠市", "220183"));
        listDistrict_0307.add(district_030041);
        /**
         *吉林省 - 吉林市
         */
        ArrayList<CityInfo> district_030042 = new ArrayList<>();
        district_030042.add(new CityInfo("市辖区", "220201"));
        district_030042.add(new CityInfo("昌邑区", "220202"));
        district_030042.add(new CityInfo("龙潭区", "220203"));
        district_030042.add(new CityInfo("船营区", "220204"));
        district_030042.add(new CityInfo("丰满区", "220211"));
        district_030042.add(new CityInfo("永吉县", "220221"));
        district_030042.add(new CityInfo("蛟河市", "220281"));
        district_030042.add(new CityInfo("桦甸市", "220282"));
        district_030042.add(new CityInfo("舒兰市", "220283"));
        district_030042.add(new CityInfo("磐石市", "220284"));
        listDistrict_0307.add(district_030042);
        /**
         *吉林省 - 四平市
         */
        ArrayList<CityInfo> district_030043 = new ArrayList<>();
        district_030043.add(new CityInfo("市辖区", "220301"));
        district_030043.add(new CityInfo("铁西区", "220302"));
        district_030043.add(new CityInfo("铁东区", "220303"));
        district_030043.add(new CityInfo("梨树县", "220322"));
        district_030043.add(new CityInfo("伊通满族自治县", "220323"));
        district_030043.add(new CityInfo("公主岭市", "220381"));
        district_030043.add(new CityInfo("双辽市", "220382"));
        listDistrict_0307.add(district_030043);
        /**
         *吉林省 - 辽源市
         */
        ArrayList<CityInfo> district_030044 = new ArrayList<>();
        district_030044.add(new CityInfo("市辖区", "220401"));
        district_030044.add(new CityInfo("龙山区", "220402"));
        district_030044.add(new CityInfo("西安区", "220403"));
        district_030044.add(new CityInfo("东丰县", "220421"));
        district_030044.add(new CityInfo("东辽县", "220422"));
        listDistrict_0307.add(district_030044);
        /**
         *吉林省 - 通化市
         */
        ArrayList<CityInfo> district_030045 = new ArrayList<>();
        district_030045.add(new CityInfo("市辖区", "220501"));
        district_030045.add(new CityInfo("东昌区", "220502"));
        district_030045.add(new CityInfo("二道江区", "220503"));
        district_030045.add(new CityInfo("通化县", "220521"));
        district_030045.add(new CityInfo("辉南县", "220523"));
        district_030045.add(new CityInfo("柳河县", "220524"));
        district_030045.add(new CityInfo("梅河口市", "220581"));
        district_030045.add(new CityInfo("集安市", "220582"));
        listDistrict_0307.add(district_030045);
        /**
         *吉林省 - 白山市
         */
        ArrayList<CityInfo> district_030046 = new ArrayList<>();
        district_030046.add(new CityInfo("市辖区", "220601"));
        district_030046.add(new CityInfo("八道江区", "220602"));
        district_030046.add(new CityInfo("抚松县", "220621"));
        district_030046.add(new CityInfo("靖宇县", "220622"));
        district_030046.add(new CityInfo("长白朝鲜族自治县", "220623"));
        district_030046.add(new CityInfo("江源县", "220625"));
        district_030046.add(new CityInfo("临江市", "220681"));
        listDistrict_0307.add(district_030046);
        /**
         *吉林省 - 松原市
         */
        ArrayList<CityInfo> district_030047 = new ArrayList<>();
        district_030047.add(new CityInfo("市辖区", "220701"));
        district_030047.add(new CityInfo("宁江区", "220702"));
        district_030047.add(new CityInfo("前郭尔罗斯蒙古族自治县", "220721"));
        district_030047.add(new CityInfo("长岭县", "220722"));
        district_030047.add(new CityInfo("乾安县", "220723"));
        district_030047.add(new CityInfo("扶余县", "220724"));
        listDistrict_0307.add(district_030047);
        /**
         *吉林省 - 白城市
         */
        ArrayList<CityInfo> district_030048 = new ArrayList<>();
        district_030048.add(new CityInfo("市辖区", "220801"));
        district_030048.add(new CityInfo("洮北区", "220802"));
        district_030048.add(new CityInfo("镇赉县", "220821"));
        district_030048.add(new CityInfo("通榆县", "220822"));
        district_030048.add(new CityInfo("洮南市", "220881"));
        district_030048.add(new CityInfo("大安市", "220882"));
        listDistrict_0307.add(district_030048);
        /**
         *吉林省 - 延边朝鲜族自治州
         */
        ArrayList<CityInfo> district_030049 = new ArrayList<>();
        district_030049.add(new CityInfo("延吉市", "222401"));
        district_030049.add(new CityInfo("图们市", "222402"));
        district_030049.add(new CityInfo("敦化市", "222403"));
        district_030049.add(new CityInfo("珲春市", "222404"));
        district_030049.add(new CityInfo("龙井市", "222405"));
        district_030049.add(new CityInfo("和龙市", "222406"));
        district_030049.add(new CityInfo("汪清县", "222424"));
        district_030049.add(new CityInfo("安图县", "222426"));
        listDistrict_0307.add(district_030049);
        district.add(listDistrict_0307);

    }

    void getJianSu() {
        /**
         *江苏省 - 南京市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0308 = new ArrayList<>();
        ArrayList<CityInfo> district_030050 = new ArrayList<>();
        district_030050.add(new CityInfo("市辖区", "320101"));
        district_030050.add(new CityInfo("玄武区", "320102"));
        district_030050.add(new CityInfo("白下区", "320103"));
        district_030050.add(new CityInfo("秦淮区", "320104"));
        district_030050.add(new CityInfo("建邺区", "320105"));
        district_030050.add(new CityInfo("鼓楼区", "320106"));
        district_030050.add(new CityInfo("下关区", "320107"));
        district_030050.add(new CityInfo("浦口区", "320111"));
        district_030050.add(new CityInfo("栖霞区", "320113"));
        district_030050.add(new CityInfo("雨花台区", "320114"));
        district_030050.add(new CityInfo("江宁区", "320115"));
        district_030050.add(new CityInfo("六合区", "320116"));
        district_030050.add(new CityInfo("溧水县", "320124"));
        district_030050.add(new CityInfo("高淳县", "320125"));
        listDistrict_0308.add(district_030050);
        /**
         *江苏省 - 无锡市
         */
        ArrayList<CityInfo> district_030051 = new ArrayList<>();
        district_030051.add(new CityInfo("市辖区", "320201"));
        district_030051.add(new CityInfo("崇安区", "320202"));
        district_030051.add(new CityInfo("南长区", "320203"));
        district_030051.add(new CityInfo("北塘区", "320204"));
        district_030051.add(new CityInfo("锡山区", "320205"));
        district_030051.add(new CityInfo("惠山区", "320206"));
        district_030051.add(new CityInfo("滨湖区", "320211"));
        district_030051.add(new CityInfo("江阴市", "320281"));
        district_030051.add(new CityInfo("宜兴市", "320282"));
        listDistrict_0308.add(district_030051);
        /**
         *江苏省 - 徐州市
         */
        ArrayList<CityInfo> district_030052 = new ArrayList<>();
        district_030052.add(new CityInfo("市辖区", "320301"));
        district_030052.add(new CityInfo("鼓楼区", "320302"));
        district_030052.add(new CityInfo("云龙区", "320303"));
        district_030052.add(new CityInfo("九里区", "320304"));
        district_030052.add(new CityInfo("贾汪区", "320305"));
        district_030052.add(new CityInfo("泉山区", "320311"));
        district_030052.add(new CityInfo("丰　县", "320321"));
        district_030052.add(new CityInfo("沛　县", "320322"));
        district_030052.add(new CityInfo("铜山县", "320323"));
        district_030052.add(new CityInfo("睢宁县", "320324"));
        district_030052.add(new CityInfo("新沂市", "320381"));
        district_030052.add(new CityInfo("邳州市", "320382"));
        listDistrict_0308.add(district_030052);
        /**
         *江苏省 - 常州市
         */
        ArrayList<CityInfo> district_030053 = new ArrayList<>();
        district_030053.add(new CityInfo("市辖区", "320401"));
        district_030053.add(new CityInfo("天宁区", "320402"));
        district_030053.add(new CityInfo("钟楼区", "320404"));
        district_030053.add(new CityInfo("戚墅堰区", "320405"));
        district_030053.add(new CityInfo("新北区", "320411"));
        district_030053.add(new CityInfo("武进区", "320412"));
        district_030053.add(new CityInfo("溧阳市", "320481"));
        district_030053.add(new CityInfo("金坛市", "320482"));
        listDistrict_0308.add(district_030053);
        /**
         *江苏省 - 苏州市
         */
        ArrayList<CityInfo> district_030054 = new ArrayList<>();
        district_030054.add(new CityInfo("市辖区", "320501"));
        district_030054.add(new CityInfo("沧浪区", "320502"));
        district_030054.add(new CityInfo("平江区", "320503"));
        district_030054.add(new CityInfo("金阊区", "320504"));
        district_030054.add(new CityInfo("虎丘区", "320505"));
        district_030054.add(new CityInfo("吴中区", "320506"));
        district_030054.add(new CityInfo("相城区", "320507"));
        district_030054.add(new CityInfo("常熟市", "320581"));
        district_030054.add(new CityInfo("张家港市", "320582"));
        district_030054.add(new CityInfo("昆山市", "320583"));
        district_030054.add(new CityInfo("吴江市", "320584"));
        district_030054.add(new CityInfo("太仓市", "320585"));
        listDistrict_0308.add(district_030054);
        /**
         *江苏省 - 南通市
         */
        ArrayList<CityInfo> district_030055 = new ArrayList<>();
        district_030055.add(new CityInfo("市辖区", "320601"));
        district_030055.add(new CityInfo("崇川区", "320602"));
        district_030055.add(new CityInfo("港闸区", "320611"));
        district_030055.add(new CityInfo("海安县", "320621"));
        district_030055.add(new CityInfo("如东县", "320623"));
        district_030055.add(new CityInfo("启东市", "320681"));
        district_030055.add(new CityInfo("如皋市", "320682"));
        district_030055.add(new CityInfo("通州市", "320683"));
        district_030055.add(new CityInfo("海门市", "320684"));
        listDistrict_0308.add(district_030055);
        /**
         *江苏省 - 连云港市
         */
        ArrayList<CityInfo> district_030056 = new ArrayList<>();
        district_030056.add(new CityInfo("市辖区", "320701"));
        district_030056.add(new CityInfo("连云区", "320703"));
        district_030056.add(new CityInfo("新浦区", "320705"));
        district_030056.add(new CityInfo("海州区", "320706"));
        district_030056.add(new CityInfo("赣榆县", "320721"));
        district_030056.add(new CityInfo("东海县", "320722"));
        district_030056.add(new CityInfo("灌云县", "320723"));
        district_030056.add(new CityInfo("灌南县", "320724"));
        listDistrict_0308.add(district_030056);
        /**
         *江苏省 - 淮安市
         */
        ArrayList<CityInfo> district_030057 = new ArrayList<>();
        district_030057.add(new CityInfo("市辖区", "320801"));
        district_030057.add(new CityInfo("清河区", "320802"));
        district_030057.add(new CityInfo("楚州区", "320803"));
        district_030057.add(new CityInfo("淮阴区", "320804"));
        district_030057.add(new CityInfo("清浦区", "320811"));
        district_030057.add(new CityInfo("涟水县", "320826"));
        district_030057.add(new CityInfo("洪泽县", "320829"));
        district_030057.add(new CityInfo("盱眙县", "320830"));
        district_030057.add(new CityInfo("金湖县", "320831"));
        listDistrict_0308.add(district_030057);
        /**
         *江苏省 - 盐城市
         */
        ArrayList<CityInfo> district_030058 = new ArrayList<>();
        district_030058.add(new CityInfo("市辖区", "320901"));
        district_030058.add(new CityInfo("亭湖区", "320902"));
        district_030058.add(new CityInfo("盐都区", "320903"));
        district_030058.add(new CityInfo("响水县", "320921"));
        district_030058.add(new CityInfo("滨海县", "320922"));
        district_030058.add(new CityInfo("阜宁县", "320923"));
        district_030058.add(new CityInfo("射阳县", "320924"));
        district_030058.add(new CityInfo("建湖县", "320925"));
        district_030058.add(new CityInfo("东台市", "320981"));
        district_030058.add(new CityInfo("大丰市", "320982"));
        listDistrict_0308.add(district_030058);
        /**
         *江苏省 - 扬州市
         */
        ArrayList<CityInfo> district_030059 = new ArrayList<>();
        district_030059.add(new CityInfo("市辖区", "321001"));
        district_030059.add(new CityInfo("广陵区", "321002"));
        district_030059.add(new CityInfo("邗江区", "321003"));
        district_030059.add(new CityInfo("郊　区", "321011"));
        district_030059.add(new CityInfo("宝应县", "321023"));
        district_030059.add(new CityInfo("仪征市", "321081"));
        district_030059.add(new CityInfo("高邮市", "321084"));
        district_030059.add(new CityInfo("江都市", "321088"));
        listDistrict_0308.add(district_030059);
        /**
         *江苏省 - 镇江市
         */
        ArrayList<CityInfo> district_030060 = new ArrayList<>();
        district_030060.add(new CityInfo("市辖区", "321101"));
        district_030060.add(new CityInfo("京口区", "321102"));
        district_030060.add(new CityInfo("润州区", "321111"));
        district_030060.add(new CityInfo("丹徒区", "321112"));
        district_030060.add(new CityInfo("丹阳市", "321181"));
        district_030060.add(new CityInfo("扬中市", "321182"));
        district_030060.add(new CityInfo("句容市", "321183"));
        listDistrict_0308.add(district_030060);
        /**
         *江苏省 - 泰州市
         */
        ArrayList<CityInfo> district_030061 = new ArrayList<>();
        district_030061.add(new CityInfo("市辖区", "321201"));
        district_030061.add(new CityInfo("海陵区", "321202"));
        district_030061.add(new CityInfo("高港区", "321203"));
        district_030061.add(new CityInfo("兴化市", "321281"));
        district_030061.add(new CityInfo("靖江市", "321282"));
        district_030061.add(new CityInfo("泰兴市", "321283"));
        district_030061.add(new CityInfo("姜堰市", "321284"));
        listDistrict_0308.add(district_030061);
        /**
         *江苏省 - 宿迁市
         */
        ArrayList<CityInfo> district_030062 = new ArrayList<>();
        district_030062.add(new CityInfo("市辖区", "321301"));
        district_030062.add(new CityInfo("宿城区", "321302"));
        district_030062.add(new CityInfo("宿豫区", "321311"));
        district_030062.add(new CityInfo("沭阳县", "321322"));
        district_030062.add(new CityInfo("泗阳县", "321323"));
        district_030062.add(new CityInfo("泗洪县", "321324"));
        listDistrict_0308.add(district_030062);
        district.add(listDistrict_0308);
        /**
         *浙江省 - 杭州市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0309 = new ArrayList<>();
        ArrayList<CityInfo> district_030901 = new ArrayList<>();
        district_030901.add(new CityInfo("市辖区", "330101"));
        district_030901.add(new CityInfo("上城区", "330102"));
        district_030901.add(new CityInfo("下城区", "330103"));
        district_030901.add(new CityInfo("江干区", "330104"));
        district_030901.add(new CityInfo("拱墅区", "330105"));
        district_030901.add(new CityInfo("西湖区", "330106"));
        district_030901.add(new CityInfo("滨江区", "330108"));
        district_030901.add(new CityInfo("萧山区", "330109"));
        district_030901.add(new CityInfo("余杭区", "330110"));
        district_030901.add(new CityInfo("桐庐县", "330122"));
        district_030901.add(new CityInfo("淳安县", "330127"));
        district_030901.add(new CityInfo("建德市", "330182"));
        district_030901.add(new CityInfo("富阳市", "330183"));
        district_030901.add(new CityInfo("临安市", "330185"));
        listDistrict_0309.add(district_030901);
        /**
         *浙江省 - 宁波市
         */

        ArrayList<CityInfo> district_030063 = new ArrayList<>();
        district_030063.add(new CityInfo("市辖区", "330201"));
        district_030063.add(new CityInfo("海曙区", "330203"));
        district_030063.add(new CityInfo("江东区", "330204"));
        district_030063.add(new CityInfo("江北区", "330205"));
        district_030063.add(new CityInfo("北仑区", "330206"));
        district_030063.add(new CityInfo("镇海区", "330211"));
        district_030063.add(new CityInfo("鄞州区", "330212"));
        district_030063.add(new CityInfo("象山县", "330225"));
        district_030063.add(new CityInfo("宁海县", "330226"));
        district_030063.add(new CityInfo("余姚市", "330281"));
        district_030063.add(new CityInfo("慈溪市", "330282"));
        district_030063.add(new CityInfo("奉化市", "330283"));
        listDistrict_0309.add(district_030063);
        /**
         *浙江省 - 温州市
         */
        ArrayList<CityInfo> district_030064 = new ArrayList<>();
        district_030064.add(new CityInfo("市辖区", "330301"));
        district_030064.add(new CityInfo("鹿城区", "330302"));
        district_030064.add(new CityInfo("龙湾区", "330303"));
        district_030064.add(new CityInfo("瓯海区", "330304"));
        district_030064.add(new CityInfo("洞头县", "330322"));
        district_030064.add(new CityInfo("永嘉县", "330324"));
        district_030064.add(new CityInfo("平阳县", "330326"));
        district_030064.add(new CityInfo("苍南县", "330327"));
        district_030064.add(new CityInfo("文成县", "330328"));
        district_030064.add(new CityInfo("泰顺县", "330329"));
        district_030064.add(new CityInfo("瑞安市", "330381"));
        district_030064.add(new CityInfo("乐清市", "330382"));
        listDistrict_0309.add(district_030064);
        /**
         *浙江省 - 嘉兴市
         */
        ArrayList<CityInfo> district_030065 = new ArrayList<>();
        district_030065.add(new CityInfo("市辖区", "330401"));
        district_030065.add(new CityInfo("秀城区", "330402"));
        district_030065.add(new CityInfo("秀洲区", "330411"));
        district_030065.add(new CityInfo("嘉善县", "330421"));
        district_030065.add(new CityInfo("海盐县", "330424"));
        district_030065.add(new CityInfo("海宁市", "330481"));
        district_030065.add(new CityInfo("平湖市", "330482"));
        district_030065.add(new CityInfo("桐乡市", "330483"));
        listDistrict_0309.add(district_030065);
        /**
         *浙江省 - 湖州市
         */
        ArrayList<CityInfo> district_030066 = new ArrayList<>();
        district_030066.add(new CityInfo("市辖区", "330501"));
        district_030066.add(new CityInfo("吴兴区", "330502"));
        district_030066.add(new CityInfo("南浔区", "330503"));
        district_030066.add(new CityInfo("德清县", "330521"));
        district_030066.add(new CityInfo("长兴县", "330522"));
        district_030066.add(new CityInfo("安吉县", "330523"));
        listDistrict_0309.add(district_030066);
        /**
         *浙江省 - 绍兴市
         */
        ArrayList<CityInfo> district_030067 = new ArrayList<>();
        district_030067.add(new CityInfo("市辖区", "330601"));
        district_030067.add(new CityInfo("越城区", "330602"));
        district_030067.add(new CityInfo("绍兴县", "330621"));
        district_030067.add(new CityInfo("新昌县", "330624"));
        district_030067.add(new CityInfo("诸暨市", "330681"));
        district_030067.add(new CityInfo("上虞市", "330682"));
        district_030067.add(new CityInfo("嵊州市", "330683"));
        listDistrict_0309.add(district_030067);
        /**
         *浙江省 - 金华市
         */
        ArrayList<CityInfo> district_030068 = new ArrayList<>();
        district_030068.add(new CityInfo("市辖区", "330701"));
        district_030068.add(new CityInfo("婺城区", "330702"));
        district_030068.add(new CityInfo("金东区", "330703"));
        district_030068.add(new CityInfo("武义县", "330723"));
        district_030068.add(new CityInfo("浦江县", "330726"));
        district_030068.add(new CityInfo("磐安县", "330727"));
        district_030068.add(new CityInfo("兰溪市", "330781"));
        district_030068.add(new CityInfo("义乌市", "330782"));
        district_030068.add(new CityInfo("东阳市", "330783"));
        district_030068.add(new CityInfo("永康市", "330784"));
        listDistrict_0309.add(district_030068);
        /**
         *浙江省 - 衢州市
         */
        ArrayList<CityInfo> district_030069 = new ArrayList<>();
        district_030069.add(new CityInfo("市辖区", "330801"));
        district_030069.add(new CityInfo("柯城区", "330802"));
        district_030069.add(new CityInfo("衢江区", "330803"));
        district_030069.add(new CityInfo("常山县", "330822"));
        district_030069.add(new CityInfo("开化县", "330824"));
        district_030069.add(new CityInfo("龙游县", "330825"));
        district_030069.add(new CityInfo("江山市", "330881"));
        listDistrict_0309.add(district_030069);
        /**
         *浙江省 - 舟山市
         */
        ArrayList<CityInfo> district_030070 = new ArrayList<>();
        district_030070.add(new CityInfo("市辖区", "330901"));
        district_030070.add(new CityInfo("定海区", "330902"));
        district_030070.add(new CityInfo("普陀区", "330903"));
        district_030070.add(new CityInfo("岱山县", "330921"));
        district_030070.add(new CityInfo("嵊泗县", "330922"));
        listDistrict_0309.add(district_030070);
        /**
         *浙江省 - 台州市
         */
        ArrayList<CityInfo> district_030071 = new ArrayList<>();
        district_030071.add(new CityInfo("市辖区", "331001"));
        district_030071.add(new CityInfo("椒江区", "331002"));
        district_030071.add(new CityInfo("黄岩区", "331003"));
        district_030071.add(new CityInfo("路桥区", "331004"));
        district_030071.add(new CityInfo("玉环县", "331021"));
        district_030071.add(new CityInfo("三门县", "331022"));
        district_030071.add(new CityInfo("天台县", "331023"));
        district_030071.add(new CityInfo("仙居县", "331024"));
        district_030071.add(new CityInfo("温岭市", "331081"));
        district_030071.add(new CityInfo("临海市", "331082"));
        listDistrict_0309.add(district_030071);
        /**
         *浙江省 - 丽水市
         */
        ArrayList<CityInfo> district_030072 = new ArrayList<>();
        district_030072.add(new CityInfo("市辖区", "331101"));
        district_030072.add(new CityInfo("莲都区", "331102"));
        district_030072.add(new CityInfo("青田县", "331121"));
        district_030072.add(new CityInfo("缙云县", "331122"));
        district_030072.add(new CityInfo("遂昌县", "331123"));
        district_030072.add(new CityInfo("松阳县", "331124"));
        district_030072.add(new CityInfo("云和县", "331125"));
        district_030072.add(new CityInfo("庆元县", "331126"));
        district_030072.add(new CityInfo("景宁畲族自治县", "331127"));
        district_030072.add(new CityInfo("龙泉市", "331181"));
        listDistrict_0309.add(district_030072);
        district.add(listDistrict_0309);
        /**
         *安徽省 - 合肥市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0310 = new ArrayList<>();
        ArrayList<CityInfo> district_031001 = new ArrayList<>();
        district_031001.add(new CityInfo("市辖区", "340101"));
        district_031001.add(new CityInfo("瑶海区", "340102"));
        district_031001.add(new CityInfo("庐阳区", "340103"));
        district_031001.add(new CityInfo("蜀山区", "340104"));
        district_031001.add(new CityInfo("包河区", "340111"));
        district_031001.add(new CityInfo("长丰县", "340121"));
        district_031001.add(new CityInfo("肥东县", "340122"));
        district_031001.add(new CityInfo("肥西县", "340123"));
        listDistrict_0310.add(district_031001);
        /**
         *安徽省 - 芜湖市
         */

        ArrayList<CityInfo> district_030073 = new ArrayList<>();
        district_030073.add(new CityInfo("市辖区", "340201"));
        district_030073.add(new CityInfo("镜湖区", "340202"));
        district_030073.add(new CityInfo("马塘区", "340203"));
        district_030073.add(new CityInfo("新芜区", "340204"));
        district_030073.add(new CityInfo("鸠江区", "340207"));
        district_030073.add(new CityInfo("芜湖县", "340221"));
        district_030073.add(new CityInfo("繁昌县", "340222"));
        district_030073.add(new CityInfo("南陵县", "340223"));
        listDistrict_0310.add(district_030073);
        /**
         *安徽省 - 蚌埠市
         */
        ArrayList<CityInfo> district_030074 = new ArrayList<>();
        district_030074.add(new CityInfo("市辖区", "340301"));
        district_030074.add(new CityInfo("龙子湖区", "340302"));
        district_030074.add(new CityInfo("蚌山区", "340303"));
        district_030074.add(new CityInfo("禹会区", "340304"));
        district_030074.add(new CityInfo("淮上区", "340311"));
        district_030074.add(new CityInfo("怀远县", "340321"));
        district_030074.add(new CityInfo("五河县", "340322"));
        district_030074.add(new CityInfo("固镇县", "340323"));
        listDistrict_0310.add(district_030074);
        /**
         *安徽省 - 淮南市
         */
        ArrayList<CityInfo> district_030075 = new ArrayList<>();
        district_030075.add(new CityInfo("市辖区", "340401"));
        district_030075.add(new CityInfo("大通区", "340402"));
        district_030075.add(new CityInfo("田家庵区", "340403"));
        district_030075.add(new CityInfo("谢家集区", "340404"));
        district_030075.add(new CityInfo("八公山区", "340405"));
        district_030075.add(new CityInfo("潘集区", "340406"));
        district_030075.add(new CityInfo("凤台县", "340421"));
        listDistrict_0310.add(district_030075);
        /**
         *安徽省 - 马鞍山市
         */
        ArrayList<CityInfo> district_030076 = new ArrayList<>();
        district_030076.add(new CityInfo("市辖区", "340501"));
        district_030076.add(new CityInfo("金家庄区", "340502"));
        district_030076.add(new CityInfo("花山区", "340503"));
        district_030076.add(new CityInfo("雨山区", "340504"));
        district_030076.add(new CityInfo("当涂县", "340521"));
        listDistrict_0310.add(district_030076);
        /**
         *安徽省 - 淮北市
         */
        ArrayList<CityInfo> district_030077 = new ArrayList<>();
        district_030077.add(new CityInfo("市辖区", "340601"));
        district_030077.add(new CityInfo("杜集区", "340602"));
        district_030077.add(new CityInfo("相山区", "340603"));
        district_030077.add(new CityInfo("烈山区", "340604"));
        district_030077.add(new CityInfo("濉溪县", "340621"));
        listDistrict_0310.add(district_030077);
        /**
         *安徽省 - 铜陵市
         */
        ArrayList<CityInfo> district_030078 = new ArrayList<>();
        district_030078.add(new CityInfo("市辖区", "340701"));
        district_030078.add(new CityInfo("铜官山区", "340702"));
        district_030078.add(new CityInfo("狮子山区", "340703"));
        district_030078.add(new CityInfo("郊　区", "340711"));
        district_030078.add(new CityInfo("铜陵县", "340721"));
        listDistrict_0310.add(district_030078);
        /**
         *安徽省 - 安庆市
         */
        ArrayList<CityInfo> district_030079 = new ArrayList<>();
        district_030079.add(new CityInfo("市辖区", "340801"));
        district_030079.add(new CityInfo("迎江区", "340802"));
        district_030079.add(new CityInfo("大观区", "340803"));
        district_030079.add(new CityInfo("郊　区", "340811"));
        district_030079.add(new CityInfo("怀宁县", "340822"));
        district_030079.add(new CityInfo("枞阳县", "340823"));
        district_030079.add(new CityInfo("潜山县", "340824"));
        district_030079.add(new CityInfo("太湖县", "340825"));
        district_030079.add(new CityInfo("宿松县", "340826"));
        district_030079.add(new CityInfo("望江县", "340827"));
        district_030079.add(new CityInfo("岳西县", "340828"));
        district_030079.add(new CityInfo("桐城市", "340881"));
        listDistrict_0310.add(district_030079);
        /**
         *安徽省 - 黄山市
         */
        ArrayList<CityInfo> district_030080 = new ArrayList<>();
        district_030080.add(new CityInfo("市辖区", "341001"));
        district_030080.add(new CityInfo("屯溪区", "341002"));
        district_030080.add(new CityInfo("黄山区", "341003"));
        district_030080.add(new CityInfo("徽州区", "341004"));
        district_030080.add(new CityInfo("歙　县", "341021"));
        district_030080.add(new CityInfo("休宁县", "341022"));
        district_030080.add(new CityInfo("黟　县", "341023"));
        district_030080.add(new CityInfo("祁门县", "341024"));
        listDistrict_0310.add(district_030080);
        /**
         *安徽省 - 滁州市
         */
        ArrayList<CityInfo> district_030081 = new ArrayList<>();
        district_030081.add(new CityInfo("市辖区", "341101"));
        district_030081.add(new CityInfo("琅琊区", "341102"));
        district_030081.add(new CityInfo("南谯区", "341103"));
        district_030081.add(new CityInfo("来安县", "341122"));
        district_030081.add(new CityInfo("全椒县", "341124"));
        district_030081.add(new CityInfo("定远县", "341125"));
        district_030081.add(new CityInfo("凤阳县", "341126"));
        district_030081.add(new CityInfo("天长市", "341181"));
        district_030081.add(new CityInfo("明光市", "341182"));
        listDistrict_0310.add(district_030081);
        /**
         *安徽省 - 阜阳市
         */
        ArrayList<CityInfo> district_030082 = new ArrayList<>();
        district_030082.add(new CityInfo("市辖区", "341201"));
        district_030082.add(new CityInfo("颍州区", "341202"));
        district_030082.add(new CityInfo("颍东区", "341203"));
        district_030082.add(new CityInfo("颍泉区", "341204"));
        district_030082.add(new CityInfo("临泉县", "341221"));
        district_030082.add(new CityInfo("太和县", "341222"));
        district_030082.add(new CityInfo("阜南县", "341225"));
        district_030082.add(new CityInfo("颍上县", "341226"));
        district_030082.add(new CityInfo("界首市", "341282"));
        listDistrict_0310.add(district_030082);
        /**
         *安徽省 - 宿州市
         */
        ArrayList<CityInfo> district_030083 = new ArrayList<>();
        district_030083.add(new CityInfo("市辖区", "341301"));
        district_030083.add(new CityInfo("墉桥区", "341302"));
        district_030083.add(new CityInfo("砀山县", "341321"));
        district_030083.add(new CityInfo("萧　县", "341322"));
        district_030083.add(new CityInfo("灵璧县", "341323"));
        district_030083.add(new CityInfo("泗　县", "341324"));
        listDistrict_0310.add(district_030083);
        /**
         *安徽省 - 巢湖市
         */
        ArrayList<CityInfo> district_030084 = new ArrayList<>();
        district_030084.add(new CityInfo("市辖区", "341401"));
        district_030084.add(new CityInfo("居巢区", "341402"));
        district_030084.add(new CityInfo("庐江县", "341421"));
        district_030084.add(new CityInfo("无为县", "341422"));
        district_030084.add(new CityInfo("含山县", "341423"));
        district_030084.add(new CityInfo("和　县", "341424"));
        listDistrict_0310.add(district_030084);
        /**
         *安徽省 - 六安市
         */
        ArrayList<CityInfo> district_030085 = new ArrayList<>();
        district_030085.add(new CityInfo("市辖区", "341501"));
        district_030085.add(new CityInfo("金安区", "341502"));
        district_030085.add(new CityInfo("裕安区", "341503"));
        district_030085.add(new CityInfo("寿　县", "341521"));
        district_030085.add(new CityInfo("霍邱县", "341522"));
        district_030085.add(new CityInfo("舒城县", "341523"));
        district_030085.add(new CityInfo("金寨县", "341524"));
        district_030085.add(new CityInfo("霍山县", "341525"));
        listDistrict_0310.add(district_030085);
        /**
         *安徽省 - 亳州市
         */
        ArrayList<CityInfo> district_030086 = new ArrayList<>();
        district_030086.add(new CityInfo("市辖区", "341601"));
        district_030086.add(new CityInfo("谯城区", "341602"));
        district_030086.add(new CityInfo("涡阳县", "341621"));
        district_030086.add(new CityInfo("蒙城县", "341622"));
        district_030086.add(new CityInfo("利辛县", "341623"));
        listDistrict_0310.add(district_030086);
        /**
         *安徽省 - 池州市
         */
        ArrayList<CityInfo> district_030087 = new ArrayList<>();
        district_030087.add(new CityInfo("市辖区", "341701"));
        district_030087.add(new CityInfo("贵池区", "341702"));
        district_030087.add(new CityInfo("东至县", "341721"));
        district_030087.add(new CityInfo("石台县", "341722"));
        district_030087.add(new CityInfo("青阳县", "341723"));
        listDistrict_0310.add(district_030087);
        /**
         *安徽省 - 宣城市
         */
        ArrayList<CityInfo> district_030088 = new ArrayList<>();
        district_030088.add(new CityInfo("市辖区", "341801"));
        district_030088.add(new CityInfo("宣州区", "341802"));
        district_030088.add(new CityInfo("郎溪县", "341821"));
        district_030088.add(new CityInfo("广德县", "341822"));
        district_030088.add(new CityInfo("泾　县", "341823"));
        district_030088.add(new CityInfo("绩溪县", "341824"));
        district_030088.add(new CityInfo("旌德县", "341825"));
        district_030088.add(new CityInfo("宁国市", "341881"));
        listDistrict_0310.add(district_030088);
        district.add(listDistrict_0310);

    }

    void getFujian() {
        /**
         *福建省 - 福州市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0311 = new ArrayList<>();
        ArrayList<CityInfo> district_030089 = new ArrayList<>();
        district_030089.add(new CityInfo("市辖区", "350101"));
        district_030089.add(new CityInfo("鼓楼区", "350102"));
        district_030089.add(new CityInfo("台江区", "350103"));
        district_030089.add(new CityInfo("仓山区", "350104"));
        district_030089.add(new CityInfo("马尾区", "350105"));
        district_030089.add(new CityInfo("晋安区", "350111"));
        district_030089.add(new CityInfo("闽侯县", "350121"));
        district_030089.add(new CityInfo("连江县", "350122"));
        district_030089.add(new CityInfo("罗源县", "350123"));
        district_030089.add(new CityInfo("闽清县", "350124"));
        district_030089.add(new CityInfo("永泰县", "350125"));
        district_030089.add(new CityInfo("平潭县", "350128"));
        district_030089.add(new CityInfo("福清市", "350181"));
        district_030089.add(new CityInfo("长乐市", "350182"));
        listDistrict_0311.add(district_030089);
        /**
         *福建省 - 厦门市
         */
        ArrayList<CityInfo> district_030090 = new ArrayList<>();
        district_030090.add(new CityInfo("市辖区", "350201"));
        district_030090.add(new CityInfo("思明区", "350203"));
        district_030090.add(new CityInfo("海沧区", "350205"));
        district_030090.add(new CityInfo("湖里区", "350206"));
        district_030090.add(new CityInfo("集美区", "350211"));
        district_030090.add(new CityInfo("同安区", "350212"));
        district_030090.add(new CityInfo("翔安区", "350213"));
        listDistrict_0311.add(district_030090);
        /**
         *福建省 - 莆田市
         */
        ArrayList<CityInfo> district_030091 = new ArrayList<>();
        district_030091.add(new CityInfo("市辖区", "350301"));
        district_030091.add(new CityInfo("城厢区", "350302"));
        district_030091.add(new CityInfo("涵江区", "350303"));
        district_030091.add(new CityInfo("荔城区", "350304"));
        district_030091.add(new CityInfo("秀屿区", "350305"));
        district_030091.add(new CityInfo("仙游县", "350322"));
        listDistrict_0311.add(district_030091);
        /**
         *福建省 - 三明市
         */
        ArrayList<CityInfo> district_030092 = new ArrayList<>();
        district_030092.add(new CityInfo("市辖区", "350401"));
        district_030092.add(new CityInfo("梅列区", "350402"));
        district_030092.add(new CityInfo("三元区", "350403"));
        district_030092.add(new CityInfo("明溪县", "350421"));
        district_030092.add(new CityInfo("清流县", "350423"));
        district_030092.add(new CityInfo("宁化县", "350424"));
        district_030092.add(new CityInfo("大田县", "350425"));
        district_030092.add(new CityInfo("尤溪县", "350426"));
        district_030092.add(new CityInfo("沙　县", "350427"));
        district_030092.add(new CityInfo("将乐县", "350428"));
        district_030092.add(new CityInfo("泰宁县", "350429"));
        district_030092.add(new CityInfo("建宁县", "350430"));
        district_030092.add(new CityInfo("永安市", "350481"));
        listDistrict_0311.add(district_030092);
        /**
         *福建省 - 泉州市
         */
        ArrayList<CityInfo> district_030093 = new ArrayList<>();
        district_030093.add(new CityInfo("市辖区", "350501"));
        district_030093.add(new CityInfo("鲤城区", "350502"));
        district_030093.add(new CityInfo("丰泽区", "350503"));
        district_030093.add(new CityInfo("洛江区", "350504"));
        district_030093.add(new CityInfo("泉港区", "350505"));
        district_030093.add(new CityInfo("惠安县", "350521"));
        district_030093.add(new CityInfo("安溪县", "350524"));
        district_030093.add(new CityInfo("永春县", "350525"));
        district_030093.add(new CityInfo("德化县", "350526"));
        district_030093.add(new CityInfo("金门县", "350527"));
        district_030093.add(new CityInfo("石狮市", "350581"));
        district_030093.add(new CityInfo("晋江市", "350582"));
        district_030093.add(new CityInfo("南安市", "350583"));
        listDistrict_0311.add(district_030093);
        /**
         *福建省 - 漳州市
         */
        ArrayList<CityInfo> district_030094 = new ArrayList<>();
        district_030094.add(new CityInfo("市辖区", "350601"));
        district_030094.add(new CityInfo("芗城区", "350602"));
        district_030094.add(new CityInfo("龙文区", "350603"));
        district_030094.add(new CityInfo("云霄县", "350622"));
        district_030094.add(new CityInfo("漳浦县", "350623"));
        district_030094.add(new CityInfo("诏安县", "350624"));
        district_030094.add(new CityInfo("长泰县", "350625"));
        district_030094.add(new CityInfo("东山县", "350626"));
        district_030094.add(new CityInfo("南靖县", "350627"));
        district_030094.add(new CityInfo("平和县", "350628"));
        district_030094.add(new CityInfo("华安县", "350629"));
        district_030094.add(new CityInfo("龙海市", "350681"));
        listDistrict_0311.add(district_030094);
        /**
         *福建省 - 南平市
         */
        ArrayList<CityInfo> district_030095 = new ArrayList<>();
        district_030095.add(new CityInfo("市辖区", "350701"));
        district_030095.add(new CityInfo("延平区", "350702"));
        district_030095.add(new CityInfo("顺昌县", "350721"));
        district_030095.add(new CityInfo("浦城县", "350722"));
        district_030095.add(new CityInfo("光泽县", "350723"));
        district_030095.add(new CityInfo("松溪县", "350724"));
        district_030095.add(new CityInfo("政和县", "350725"));
        district_030095.add(new CityInfo("邵武市", "350781"));
        district_030095.add(new CityInfo("武夷山市", "350782"));
        district_030095.add(new CityInfo("建瓯市", "350783"));
        district_030095.add(new CityInfo("建阳市", "350784"));
        listDistrict_0311.add(district_030095);
        /**
         *福建省 - 龙岩市
         */
        ArrayList<CityInfo> district_030096 = new ArrayList<>();
        district_030096.add(new CityInfo("市辖区", "350801"));
        district_030096.add(new CityInfo("新罗区", "350802"));
        district_030096.add(new CityInfo("长汀县", "350821"));
        district_030096.add(new CityInfo("永定县", "350822"));
        district_030096.add(new CityInfo("上杭县", "350823"));
        district_030096.add(new CityInfo("武平县", "350824"));
        district_030096.add(new CityInfo("连城县", "350825"));
        district_030096.add(new CityInfo("漳平市", "350881"));
        listDistrict_0311.add(district_030096);
        /**
         *福建省 - 宁德市
         */
        ArrayList<CityInfo> district_030097 = new ArrayList<>();
        district_030097.add(new CityInfo("市辖区", "350901"));
        district_030097.add(new CityInfo("蕉城区", "350902"));
        district_030097.add(new CityInfo("霞浦县", "350921"));
        district_030097.add(new CityInfo("古田县", "350922"));
        district_030097.add(new CityInfo("屏南县", "350923"));
        district_030097.add(new CityInfo("寿宁县", "350924"));
        district_030097.add(new CityInfo("周宁县", "350925"));
        district_030097.add(new CityInfo("柘荣县", "350926"));
        district_030097.add(new CityInfo("福安市", "350981"));
        district_030097.add(new CityInfo("福鼎市", "350982"));
        listDistrict_0311.add(district_030097);
        district.add(listDistrict_0311);
        /**
         *江西省 - 南昌市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0312 = new ArrayList<>();
        ArrayList<CityInfo> district_030098 = new ArrayList<>();
        district_030098.add(new CityInfo("市辖区", "360101"));
        district_030098.add(new CityInfo("东湖区", "360102"));
        district_030098.add(new CityInfo("西湖区", "360103"));
        district_030098.add(new CityInfo("青云谱区", "360104"));
        district_030098.add(new CityInfo("湾里区", "360105"));
        district_030098.add(new CityInfo("青山湖区", "360111"));
        district_030098.add(new CityInfo("南昌县", "360121"));
        district_030098.add(new CityInfo("新建县", "360122"));
        district_030098.add(new CityInfo("安义县", "360123"));
        district_030098.add(new CityInfo("进贤县", "360124"));
        listDistrict_0312.add(district_030098);
        /**
         *江西省 - 景德镇市
         */
        ArrayList<CityInfo> district_030099 = new ArrayList<>();
        district_030099.add(new CityInfo("市辖区", "360201"));
        district_030099.add(new CityInfo("昌江区", "360202"));
        district_030099.add(new CityInfo("珠山区", "360203"));
        district_030099.add(new CityInfo("浮梁县", "360222"));
        district_030099.add(new CityInfo("乐平市", "360281"));
        listDistrict_0312.add(district_030099);
        /**
         *江西省 - 萍乡市
         */
        ArrayList<CityInfo> district_030100 = new ArrayList<>();
        district_030100.add(new CityInfo("市辖区", "360301"));
        district_030100.add(new CityInfo("安源区", "360302"));
        district_030100.add(new CityInfo("湘东区", "360313"));
        district_030100.add(new CityInfo("莲花县", "360321"));
        district_030100.add(new CityInfo("上栗县", "360322"));
        district_030100.add(new CityInfo("芦溪县", "360323"));
        listDistrict_0312.add(district_030100);
        /**
         *江西省 - 九江市
         */
        ArrayList<CityInfo> district_030101 = new ArrayList<>();
        district_030101.add(new CityInfo("市辖区", "360401"));
        district_030101.add(new CityInfo("庐山区", "360402"));
        district_030101.add(new CityInfo("浔阳区", "360403"));
        district_030101.add(new CityInfo("九江县", "360421"));
        district_030101.add(new CityInfo("武宁县", "360423"));
        district_030101.add(new CityInfo("修水县", "360424"));
        district_030101.add(new CityInfo("永修县", "360425"));
        district_030101.add(new CityInfo("德安县", "360426"));
        district_030101.add(new CityInfo("星子县", "360427"));
        district_030101.add(new CityInfo("都昌县", "360428"));
        district_030101.add(new CityInfo("湖口县", "360429"));
        district_030101.add(new CityInfo("彭泽县", "360430"));
        district_030101.add(new CityInfo("瑞昌市", "360481"));
        listDistrict_0312.add(district_030101);
        /**
         *江西省 - 新余市
         */
        ArrayList<CityInfo> district_030102 = new ArrayList<>();
        district_030102.add(new CityInfo("市辖区", "360501"));
        district_030102.add(new CityInfo("渝水区", "360502"));
        district_030102.add(new CityInfo("分宜县", "360521"));
        listDistrict_0312.add(district_030102);
        /**
         *江西省 - 鹰潭市
         */
        ArrayList<CityInfo> district_030103 = new ArrayList<>();
        district_030103.add(new CityInfo("市辖区", "360601"));
        district_030103.add(new CityInfo("月湖区", "360602"));
        district_030103.add(new CityInfo("余江县", "360622"));
        district_030103.add(new CityInfo("贵溪市", "360681"));
        listDistrict_0312.add(district_030103);
        /**
         *江西省 - 赣州市
         */
        ArrayList<CityInfo> district_030104 = new ArrayList<>();
        district_030104.add(new CityInfo("市辖区", "360701"));
        district_030104.add(new CityInfo("章贡区", "360702"));
        district_030104.add(new CityInfo("赣　县", "360721"));
        district_030104.add(new CityInfo("信丰县", "360722"));
        district_030104.add(new CityInfo("大余县", "360723"));
        district_030104.add(new CityInfo("上犹县", "360724"));
        district_030104.add(new CityInfo("崇义县", "360725"));
        district_030104.add(new CityInfo("安远县", "360726"));
        district_030104.add(new CityInfo("龙南县", "360727"));
        district_030104.add(new CityInfo("定南县", "360728"));
        district_030104.add(new CityInfo("全南县", "360729"));
        district_030104.add(new CityInfo("宁都县", "360730"));
        district_030104.add(new CityInfo("于都县", "360731"));
        district_030104.add(new CityInfo("兴国县", "360732"));
        district_030104.add(new CityInfo("会昌县", "360733"));
        district_030104.add(new CityInfo("寻乌县", "360734"));
        district_030104.add(new CityInfo("石城县", "360735"));
        district_030104.add(new CityInfo("瑞金市", "360781"));
        district_030104.add(new CityInfo("南康市", "360782"));
        listDistrict_0312.add(district_030104);
        /**
         *江西省 - 吉安市
         */
        ArrayList<CityInfo> district_030105 = new ArrayList<>();
        district_030105.add(new CityInfo("市辖区", "360801"));
        district_030105.add(new CityInfo("吉州区", "360802"));
        district_030105.add(new CityInfo("青原区", "360803"));
        district_030105.add(new CityInfo("吉安县", "360821"));
        district_030105.add(new CityInfo("吉水县", "360822"));
        district_030105.add(new CityInfo("峡江县", "360823"));
        district_030105.add(new CityInfo("新干县", "360824"));
        district_030105.add(new CityInfo("永丰县", "360825"));
        district_030105.add(new CityInfo("泰和县", "360826"));
        district_030105.add(new CityInfo("遂川县", "360827"));
        district_030105.add(new CityInfo("万安县", "360828"));
        district_030105.add(new CityInfo("安福县", "360829"));
        district_030105.add(new CityInfo("永新县", "360830"));
        district_030105.add(new CityInfo("井冈山市", "360881"));
        listDistrict_0312.add(district_030105);
        /**
         *江西省 - 宜春市
         */
        ArrayList<CityInfo> district_030106 = new ArrayList<>();
        district_030106.add(new CityInfo("市辖区", "360901"));
        district_030106.add(new CityInfo("袁州区", "360902"));
        district_030106.add(new CityInfo("奉新县", "360921"));
        district_030106.add(new CityInfo("万载县", "360922"));
        district_030106.add(new CityInfo("上高县", "360923"));
        district_030106.add(new CityInfo("宜丰县", "360924"));
        district_030106.add(new CityInfo("靖安县", "360925"));
        district_030106.add(new CityInfo("铜鼓县", "360926"));
        district_030106.add(new CityInfo("丰城市", "360981"));
        district_030106.add(new CityInfo("樟树市", "360982"));
        district_030106.add(new CityInfo("高安市", "360983"));
        listDistrict_0312.add(district_030106);
        /**
         *江西省 - 抚州市
         */
        ArrayList<CityInfo> district_030107 = new ArrayList<>();
        district_030107.add(new CityInfo("市辖区", "361001"));
        district_030107.add(new CityInfo("临川区", "361002"));
        district_030107.add(new CityInfo("南城县", "361021"));
        district_030107.add(new CityInfo("黎川县", "361022"));
        district_030107.add(new CityInfo("南丰县", "361023"));
        district_030107.add(new CityInfo("崇仁县", "361024"));
        district_030107.add(new CityInfo("乐安县", "361025"));
        district_030107.add(new CityInfo("宜黄县", "361026"));
        district_030107.add(new CityInfo("金溪县", "361027"));
        district_030107.add(new CityInfo("资溪县", "361028"));
        district_030107.add(new CityInfo("东乡县", "361029"));
        district_030107.add(new CityInfo("广昌县", "361030"));
        listDistrict_0312.add(district_030107);
        /**
         *江西省 - 上饶市
         */
        ArrayList<CityInfo> district_030108 = new ArrayList<>();
        district_030108.add(new CityInfo("市辖区", "361101"));
        district_030108.add(new CityInfo("信州区", "361102"));
        district_030108.add(new CityInfo("上饶县", "361121"));
        district_030108.add(new CityInfo("广丰县", "361122"));
        district_030108.add(new CityInfo("玉山县", "361123"));
        district_030108.add(new CityInfo("铅山县", "361124"));
        district_030108.add(new CityInfo("横峰县", "361125"));
        district_030108.add(new CityInfo("弋阳县", "361126"));
        district_030108.add(new CityInfo("余干县", "361127"));
        district_030108.add(new CityInfo("鄱阳县", "361128"));
        district_030108.add(new CityInfo("万年县", "361129"));
        district_030108.add(new CityInfo("婺源县", "361130"));
        district_030108.add(new CityInfo("德兴市", "361181"));
        listDistrict_0312.add(district_030108);
        district.add(listDistrict_0312);
        /**
         *山东省 - 济南市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0313 = new ArrayList<>();
        ArrayList<CityInfo> district_031301 = new ArrayList<>();
        district_031301.add(new CityInfo("市辖区", "370101"));
        district_031301.add(new CityInfo("历下区", "370102"));
        district_031301.add(new CityInfo("市中区", "370103"));
        district_031301.add(new CityInfo("槐荫区", "370104"));
        district_031301.add(new CityInfo("天桥区", "370105"));
        district_031301.add(new CityInfo("历城区", "370112"));
        district_031301.add(new CityInfo("长清区", "370113"));
        district_031301.add(new CityInfo("平阴县", "370124"));
        district_031301.add(new CityInfo("济阳县", "370125"));
        district_031301.add(new CityInfo("商河县", "370126"));
        district_031301.add(new CityInfo("章丘市", "370181"));
        listDistrict_0313.add(district_031301);

        /**
         *山东省 - 青岛市
         */

        ArrayList<CityInfo> district_030109 = new ArrayList<>();
        district_030109.add(new CityInfo("市辖区", "370201"));
        district_030109.add(new CityInfo("市南区", "370202"));
        district_030109.add(new CityInfo("市北区", "370203"));
        district_030109.add(new CityInfo("四方区", "370205"));
        district_030109.add(new CityInfo("黄岛区", "370211"));
        district_030109.add(new CityInfo("崂山区", "370212"));
        district_030109.add(new CityInfo("李沧区", "370213"));
        district_030109.add(new CityInfo("城阳区", "370214"));
        district_030109.add(new CityInfo("胶州市", "370281"));
        district_030109.add(new CityInfo("即墨市", "370282"));
        district_030109.add(new CityInfo("平度市", "370283"));
        district_030109.add(new CityInfo("胶南市", "370284"));
        district_030109.add(new CityInfo("莱西市", "370285"));
        listDistrict_0313.add(district_030109);
        /**
         *山东省 - 淄博市
         */
        ArrayList<CityInfo> district_030110 = new ArrayList<>();
        district_030110.add(new CityInfo("市辖区", "370301"));
        district_030110.add(new CityInfo("淄川区", "370302"));
        district_030110.add(new CityInfo("张店区", "370303"));
        district_030110.add(new CityInfo("博山区", "370304"));
        district_030110.add(new CityInfo("临淄区", "370305"));
        district_030110.add(new CityInfo("周村区", "370306"));
        district_030110.add(new CityInfo("桓台县", "370321"));
        district_030110.add(new CityInfo("高青县", "370322"));
        district_030110.add(new CityInfo("沂源县", "370323"));
        listDistrict_0313.add(district_030110);
        /**
         *山东省 - 枣庄市
         */
        ArrayList<CityInfo> district_030111 = new ArrayList<>();
        district_030111.add(new CityInfo("市辖区", "370401"));
        district_030111.add(new CityInfo("市中区", "370402"));
        district_030111.add(new CityInfo("薛城区", "370403"));
        district_030111.add(new CityInfo("峄城区", "370404"));
        district_030111.add(new CityInfo("台儿庄区", "370405"));
        district_030111.add(new CityInfo("山亭区", "370406"));
        district_030111.add(new CityInfo("滕州市", "370481"));
        listDistrict_0313.add(district_030111);
        /**
         *山东省 - 东营市
         */
        ArrayList<CityInfo> district_030112 = new ArrayList<>();
        district_030112.add(new CityInfo("市辖区", "370501"));
        district_030112.add(new CityInfo("东营区", "370502"));
        district_030112.add(new CityInfo("河口区", "370503"));
        district_030112.add(new CityInfo("垦利县", "370521"));
        district_030112.add(new CityInfo("利津县", "370522"));
        district_030112.add(new CityInfo("广饶县", "370523"));
        listDistrict_0313.add(district_030112);
        /**
         *山东省 - 烟台市
         */
        ArrayList<CityInfo> district_030113 = new ArrayList<>();
        district_030113.add(new CityInfo("市辖区", "370601"));
        district_030113.add(new CityInfo("芝罘区", "370602"));
        district_030113.add(new CityInfo("福山区", "370611"));
        district_030113.add(new CityInfo("牟平区", "370612"));
        district_030113.add(new CityInfo("莱山区", "370613"));
        district_030113.add(new CityInfo("长岛县", "370634"));
        district_030113.add(new CityInfo("龙口市", "370681"));
        district_030113.add(new CityInfo("莱阳市", "370682"));
        district_030113.add(new CityInfo("莱州市", "370683"));
        district_030113.add(new CityInfo("蓬莱市", "370684"));
        district_030113.add(new CityInfo("招远市", "370685"));
        district_030113.add(new CityInfo("栖霞市", "370686"));
        district_030113.add(new CityInfo("海阳市", "370687"));
        listDistrict_0313.add(district_030113);
        /**
         *山东省 - 潍坊市
         */
        ArrayList<CityInfo> district_030114 = new ArrayList<>();
        district_030114.add(new CityInfo("市辖区", "370701"));
        district_030114.add(new CityInfo("潍城区", "370702"));
        district_030114.add(new CityInfo("寒亭区", "370703"));
        district_030114.add(new CityInfo("坊子区", "370704"));
        district_030114.add(new CityInfo("奎文区", "370705"));
        district_030114.add(new CityInfo("临朐县", "370724"));
        district_030114.add(new CityInfo("昌乐县", "370725"));
        district_030114.add(new CityInfo("青州市", "370781"));
        district_030114.add(new CityInfo("诸城市", "370782"));
        district_030114.add(new CityInfo("寿光市", "370783"));
        district_030114.add(new CityInfo("安丘市", "370784"));
        district_030114.add(new CityInfo("高密市", "370785"));
        district_030114.add(new CityInfo("昌邑市", "370786"));
        listDistrict_0313.add(district_030114);
        /**
         *山东省 - 济宁市
         */
        ArrayList<CityInfo> district_030115 = new ArrayList<>();
        district_030115.add(new CityInfo("市辖区", "370801"));
        district_030115.add(new CityInfo("市中区", "370802"));
        district_030115.add(new CityInfo("任城区", "370811"));
        district_030115.add(new CityInfo("微山县", "370826"));
        district_030115.add(new CityInfo("鱼台县", "370827"));
        district_030115.add(new CityInfo("金乡县", "370828"));
        district_030115.add(new CityInfo("嘉祥县", "370829"));
        district_030115.add(new CityInfo("汶上县", "370830"));
        district_030115.add(new CityInfo("泗水县", "370831"));
        district_030115.add(new CityInfo("梁山县", "370832"));
        district_030115.add(new CityInfo("曲阜市", "370881"));
        district_030115.add(new CityInfo("兖州市", "370882"));
        district_030115.add(new CityInfo("邹城市", "370883"));
        listDistrict_0313.add(district_030115);
        /**
         *山东省 - 泰安市
         */
        ArrayList<CityInfo> district_030116 = new ArrayList<>();
        district_030116.add(new CityInfo("市辖区", "370901"));
        district_030116.add(new CityInfo("泰山区", "370902"));
        district_030116.add(new CityInfo("岱岳区", "370903"));
        district_030116.add(new CityInfo("宁阳县", "370921"));
        district_030116.add(new CityInfo("东平县", "370923"));
        district_030116.add(new CityInfo("新泰市", "370982"));
        district_030116.add(new CityInfo("肥城市", "370983"));
        listDistrict_0313.add(district_030116);
        /**
         *山东省 - 威海市
         */
        ArrayList<CityInfo> district_030117 = new ArrayList<>();
        district_030117.add(new CityInfo("市辖区", "371001"));
        district_030117.add(new CityInfo("环翠区", "371002"));
        district_030117.add(new CityInfo("文登市", "371081"));
        district_030117.add(new CityInfo("荣成市", "371082"));
        district_030117.add(new CityInfo("乳山市", "371083"));
        listDistrict_0313.add(district_030117);
        /**
         *山东省 - 日照市
         */
        ArrayList<CityInfo> district_030118 = new ArrayList<>();
        district_030118.add(new CityInfo("市辖区", "371101"));
        district_030118.add(new CityInfo("东港区", "371102"));
        district_030118.add(new CityInfo("岚山区", "371103"));
        district_030118.add(new CityInfo("五莲县", "371121"));
        district_030118.add(new CityInfo("莒　县", "371122"));
        listDistrict_0313.add(district_030118);
        /**
         *山东省 - 莱芜市
         */
        ArrayList<CityInfo> district_030119 = new ArrayList<>();
        district_030119.add(new CityInfo("市辖区", "371201"));
        district_030119.add(new CityInfo("莱城区", "371202"));
        district_030119.add(new CityInfo("钢城区", "371203"));
        listDistrict_0313.add(district_030119);
        /**
         *山东省 - 临沂市
         */
        ArrayList<CityInfo> district_030120 = new ArrayList<>();
        district_030120.add(new CityInfo("市辖区", "371301"));
        district_030120.add(new CityInfo("兰山区", "371302"));
        district_030120.add(new CityInfo("罗庄区", "371311"));
        district_030120.add(new CityInfo("河东区", "371312"));
        district_030120.add(new CityInfo("沂南县", "371321"));
        district_030120.add(new CityInfo("郯城县", "371322"));
        district_030120.add(new CityInfo("沂水县", "371323"));
        district_030120.add(new CityInfo("苍山县", "371324"));
        district_030120.add(new CityInfo("费　县", "371325"));
        district_030120.add(new CityInfo("平邑县", "371326"));
        district_030120.add(new CityInfo("莒南县", "371327"));
        district_030120.add(new CityInfo("蒙阴县", "371328"));
        district_030120.add(new CityInfo("临沭县", "371329"));
        listDistrict_0313.add(district_030120);
        /**
         *山东省 - 德州市
         */
        ArrayList<CityInfo> district_030121 = new ArrayList<>();
        district_030121.add(new CityInfo("市辖区", "371401"));
        district_030121.add(new CityInfo("德城区", "371402"));
        district_030121.add(new CityInfo("陵　县", "371421"));
        district_030121.add(new CityInfo("宁津县", "371422"));
        district_030121.add(new CityInfo("庆云县", "371423"));
        district_030121.add(new CityInfo("临邑县", "371424"));
        district_030121.add(new CityInfo("齐河县", "371425"));
        district_030121.add(new CityInfo("平原县", "371426"));
        district_030121.add(new CityInfo("夏津县", "371427"));
        district_030121.add(new CityInfo("武城县", "371428"));
        district_030121.add(new CityInfo("乐陵市", "371481"));
        district_030121.add(new CityInfo("禹城市", "371482"));
        listDistrict_0313.add(district_030121);
        /**
         *山东省 - 聊城市
         */
        ArrayList<CityInfo> district_030122 = new ArrayList<>();
        district_030122.add(new CityInfo("市辖区", "371501"));
        district_030122.add(new CityInfo("东昌府区", "371502"));
        district_030122.add(new CityInfo("阳谷县", "371521"));
        district_030122.add(new CityInfo("莘　县", "371522"));
        district_030122.add(new CityInfo("茌平县", "371523"));
        district_030122.add(new CityInfo("东阿县", "371524"));
        district_030122.add(new CityInfo("冠　县", "371525"));
        district_030122.add(new CityInfo("高唐县", "371526"));
        district_030122.add(new CityInfo("临清市", "371581"));
        listDistrict_0313.add(district_030122);
        /**
         *山东省 - 滨州市
         */
        ArrayList<CityInfo> district_030123 = new ArrayList<>();
        district_030123.add(new CityInfo("市辖区", "371601"));
        district_030123.add(new CityInfo("滨城区", "371602"));
        district_030123.add(new CityInfo("惠民县", "371621"));
        district_030123.add(new CityInfo("阳信县", "371622"));
        district_030123.add(new CityInfo("无棣县", "371623"));
        district_030123.add(new CityInfo("沾化县", "371624"));
        district_030123.add(new CityInfo("博兴县", "371625"));
        district_030123.add(new CityInfo("邹平县", "371626"));
        listDistrict_0313.add(district_030123);
        /**
         *山东省 - 荷泽市
         */
        ArrayList<CityInfo> district_030124 = new ArrayList<>();
        district_030124.add(new CityInfo("市辖区", "371701"));
        district_030124.add(new CityInfo("牡丹区", "371702"));
        district_030124.add(new CityInfo("曹　县", "371721"));
        district_030124.add(new CityInfo("单　县", "371722"));
        district_030124.add(new CityInfo("成武县", "371723"));
        district_030124.add(new CityInfo("巨野县", "371724"));
        district_030124.add(new CityInfo("郓城县", "371725"));
        district_030124.add(new CityInfo("鄄城县", "371726"));
        district_030124.add(new CityInfo("定陶县", "371727"));
        district_030124.add(new CityInfo("东明县", "371728"));
        listDistrict_0313.add(district_030124);
        district.add(listDistrict_0313);
    }

    void getShanDong() {
        /**
         *河南省 - 郑州市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0314 = new ArrayList<>();
        ArrayList<CityInfo> district_031401 = new ArrayList<>();
        district_031401.add(new CityInfo("市辖区", "410101"));
        district_031401.add(new CityInfo("中原区", "410102"));
        district_031401.add(new CityInfo("二七区", "410103"));
        district_031401.add(new CityInfo("管城回族区", "410104"));
        district_031401.add(new CityInfo("金水区", "410105"));
        district_031401.add(new CityInfo("上街区", "410106"));
        district_031401.add(new CityInfo("邙山区", "410108"));
        district_031401.add(new CityInfo("中牟县", "410122"));
        district_031401.add(new CityInfo("巩义市", "410181"));
        district_031401.add(new CityInfo("荥阳市", "410182"));
        district_031401.add(new CityInfo("新密市", "410183"));
        district_031401.add(new CityInfo("新郑市", "410184"));
        district_031401.add(new CityInfo("登封市", "410185"));
        listDistrict_0314.add(district_031401);

        /**
         *河南省 - 开封市
         */

        ArrayList<CityInfo> district_031402 = new ArrayList<>();
        district_031402.add(new CityInfo("市辖区", "410201"));
        district_031402.add(new CityInfo("龙亭区", "410202"));
        district_031402.add(new CityInfo("顺河回族区", "410203"));
        district_031402.add(new CityInfo("鼓楼区", "410204"));
        district_031402.add(new CityInfo("南关区", "410205"));
        district_031402.add(new CityInfo("郊　区", "410211"));
        district_031402.add(new CityInfo("杞　县", "410221"));
        district_031402.add(new CityInfo("通许县", "410222"));
        district_031402.add(new CityInfo("尉氏县", "410223"));
        district_031402.add(new CityInfo("开封县", "410224"));
        district_031402.add(new CityInfo("兰考县", "410225"));
        listDistrict_0314.add(district_031402);

        /**
         *河南省 - 洛阳市
         */

        ArrayList<CityInfo> district_031403 = new ArrayList<>();
        district_031403.add(new CityInfo("市辖区", "410301"));
        district_031403.add(new CityInfo("老城区", "410302"));
        district_031403.add(new CityInfo("西工区", "410303"));
        district_031403.add(new CityInfo("廛河回族区", "410304"));
        district_031403.add(new CityInfo("涧西区", "410305"));
        district_031403.add(new CityInfo("吉利区", "410306"));
        district_031403.add(new CityInfo("洛龙区", "410307"));
        district_031403.add(new CityInfo("孟津县", "410322"));
        district_031403.add(new CityInfo("新安县", "410323"));
        district_031403.add(new CityInfo("栾川县", "410324"));
        district_031403.add(new CityInfo("嵩　县", "410325"));
        district_031403.add(new CityInfo("汝阳县", "410326"));
        district_031403.add(new CityInfo("宜阳县", "410327"));
        district_031403.add(new CityInfo("洛宁县", "410328"));
        district_031403.add(new CityInfo("伊川县", "410329"));
        district_031403.add(new CityInfo("偃师市", "410381"));
        listDistrict_0314.add(district_031403);

        /**
         *河南省 - 平顶山市
         */

        ArrayList<CityInfo> district_031404 = new ArrayList<>();
        district_031404.add(new CityInfo("市辖区", "410401"));
        district_031404.add(new CityInfo("新华区", "410402"));
        district_031404.add(new CityInfo("卫东区", "410403"));
        district_031404.add(new CityInfo("石龙区", "410404"));
        district_031404.add(new CityInfo("湛河区", "410411"));
        district_031404.add(new CityInfo("宝丰县", "410421"));
        district_031404.add(new CityInfo("叶　县", "410422"));
        district_031404.add(new CityInfo("鲁山县", "410423"));
        district_031404.add(new CityInfo("郏　县", "410425"));
        district_031404.add(new CityInfo("舞钢市", "410481"));
        district_031404.add(new CityInfo("汝州市", "410482"));
        listDistrict_0314.add(district_031404);

        /**
         *河南省 - 安阳市
         */

        ArrayList<CityInfo> district_031405 = new ArrayList<>();
        district_031405.add(new CityInfo("市辖区", "410501"));
        district_031405.add(new CityInfo("文峰区", "410502"));
        district_031405.add(new CityInfo("北关区", "410503"));
        district_031405.add(new CityInfo("殷都区", "410505"));
        district_031405.add(new CityInfo("龙安区", "410506"));
        district_031405.add(new CityInfo("安阳县", "410522"));
        district_031405.add(new CityInfo("汤阴县", "410523"));
        district_031405.add(new CityInfo("滑　县", "410526"));
        district_031405.add(new CityInfo("内黄县", "410527"));
        district_031405.add(new CityInfo("林州市", "410581"));
        listDistrict_0314.add(district_031405);

        /**
         *河南省 - 鹤壁市
         */

        ArrayList<CityInfo> district_031406 = new ArrayList<>();
        district_031406.add(new CityInfo("市辖区", "410601"));
        district_031406.add(new CityInfo("鹤山区", "410602"));
        district_031406.add(new CityInfo("山城区", "410603"));
        district_031406.add(new CityInfo("淇滨区", "410611"));
        district_031406.add(new CityInfo("浚　县", "410621"));
        district_031406.add(new CityInfo("淇　县", "410622"));
        listDistrict_0314.add(district_031406);

        /**
         *河南省 - 新乡市
         */

        ArrayList<CityInfo> district_031407 = new ArrayList<>();
        district_031407.add(new CityInfo("市辖区", "410701"));
        district_031407.add(new CityInfo("红旗区", "410702"));
        district_031407.add(new CityInfo("卫滨区", "410703"));
        district_031407.add(new CityInfo("凤泉区", "410704"));
        district_031407.add(new CityInfo("牧野区", "410711"));
        district_031407.add(new CityInfo("新乡县", "410721"));
        district_031407.add(new CityInfo("获嘉县", "410724"));
        district_031407.add(new CityInfo("原阳县", "410725"));
        district_031407.add(new CityInfo("延津县", "410726"));
        district_031407.add(new CityInfo("封丘县", "410727"));
        district_031407.add(new CityInfo("长垣县", "410728"));
        district_031407.add(new CityInfo("卫辉市", "410781"));
        district_031407.add(new CityInfo("辉县市", "410782"));
        listDistrict_0314.add(district_031407);

        /**
         *河南省 - 焦作市
         */
        ArrayList<CityInfo> district_031408 = new ArrayList<>();
        district_031408.add(new CityInfo("市辖区", "410801"));
        district_031408.add(new CityInfo("解放区", "410802"));
        district_031408.add(new CityInfo("中站区", "410803"));
        district_031408.add(new CityInfo("马村区", "410804"));
        district_031408.add(new CityInfo("山阳区", "410811"));
        district_031408.add(new CityInfo("修武县", "410821"));
        district_031408.add(new CityInfo("博爱县", "410822"));
        district_031408.add(new CityInfo("武陟县", "410823"));
        district_031408.add(new CityInfo("温　县", "410825"));
        district_031408.add(new CityInfo("济源市", "410881"));
        district_031408.add(new CityInfo("沁阳市", "410882"));
        district_031408.add(new CityInfo("孟州市", "410883"));
        listDistrict_0314.add(district_031408);
        /**
         *河南省 - 濮阳市
         */
        ArrayList<CityInfo> district_030126 = new ArrayList<>();
        district_030126.add(new CityInfo("市辖区", "410901"));
        district_030126.add(new CityInfo("华龙区", "410902"));
        district_030126.add(new CityInfo("清丰县", "410922"));
        district_030126.add(new CityInfo("南乐县", "410923"));
        district_030126.add(new CityInfo("范　县", "410926"));
        district_030126.add(new CityInfo("台前县", "410927"));
        district_030126.add(new CityInfo("濮阳县", "410928"));
        listDistrict_0314.add(district_030126);
        /**
         *河南省 - 许昌市
         */
        ArrayList<CityInfo> district_030127 = new ArrayList<>();
        district_030127.add(new CityInfo("市辖区", "411001"));
        district_030127.add(new CityInfo("魏都区", "411002"));
        district_030127.add(new CityInfo("许昌县", "411023"));
        district_030127.add(new CityInfo("鄢陵县", "411024"));
        district_030127.add(new CityInfo("襄城县", "411025"));
        district_030127.add(new CityInfo("禹州市", "411081"));
        district_030127.add(new CityInfo("长葛市", "411082"));
        listDistrict_0314.add(district_030127);
        /**
         *河南省 - 漯河市
         */
        ArrayList<CityInfo> district_030128 = new ArrayList<>();
        district_030128.add(new CityInfo("市辖区", "411101"));
        district_030128.add(new CityInfo("源汇区", "411102"));
        district_030128.add(new CityInfo("郾城区", "411103"));
        district_030128.add(new CityInfo("召陵区", "411104"));
        district_030128.add(new CityInfo("舞阳县", "411121"));
        district_030128.add(new CityInfo("临颍县", "411122"));
        listDistrict_0314.add(district_030128);
        /**
         *河南省 - 三门峡市
         */
        ArrayList<CityInfo> district_030129 = new ArrayList<>();
        district_030129.add(new CityInfo("市辖区", "411201"));
        district_030129.add(new CityInfo("湖滨区", "411202"));
        district_030129.add(new CityInfo("渑池县", "411221"));
        district_030129.add(new CityInfo("陕　县", "411222"));
        district_030129.add(new CityInfo("卢氏县", "411224"));
        district_030129.add(new CityInfo("义马市", "411281"));
        district_030129.add(new CityInfo("灵宝市", "411282"));
        listDistrict_0314.add(district_030129);
        /**
         *河南省 - 南阳市
         */
        ArrayList<CityInfo> district_030130 = new ArrayList<>();
        district_030130.add(new CityInfo("市辖区", "411301"));
        district_030130.add(new CityInfo("宛城区", "411302"));
        district_030130.add(new CityInfo("卧龙区", "411303"));
        district_030130.add(new CityInfo("南召县", "411321"));
        district_030130.add(new CityInfo("方城县", "411322"));
        district_030130.add(new CityInfo("西峡县", "411323"));
        district_030130.add(new CityInfo("镇平县", "411324"));
        district_030130.add(new CityInfo("内乡县", "411325"));
        district_030130.add(new CityInfo("淅川县", "411326"));
        district_030130.add(new CityInfo("社旗县", "411327"));
        district_030130.add(new CityInfo("唐河县", "411328"));
        district_030130.add(new CityInfo("新野县", "411329"));
        district_030130.add(new CityInfo("桐柏县", "411330"));
        district_030130.add(new CityInfo("邓州市", "411381"));
        listDistrict_0314.add(district_030130);
        /**
         *河南省 - 商丘市
         */
        ArrayList<CityInfo> district_030131 = new ArrayList<>();
        district_030131.add(new CityInfo("市辖区", "411401"));
        district_030131.add(new CityInfo("梁园区", "411402"));
        district_030131.add(new CityInfo("睢阳区", "411403"));
        district_030131.add(new CityInfo("民权县", "411421"));
        district_030131.add(new CityInfo("睢　县", "411422"));
        district_030131.add(new CityInfo("宁陵县", "411423"));
        district_030131.add(new CityInfo("柘城县", "411424"));
        district_030131.add(new CityInfo("虞城县", "411425"));
        district_030131.add(new CityInfo("夏邑县", "411426"));
        district_030131.add(new CityInfo("永城市", "411481"));
        listDistrict_0314.add(district_030131);
        /**
         *河南省 - 信阳市
         */
        ArrayList<CityInfo> district_030132 = new ArrayList<>();
        district_030132.add(new CityInfo("市辖区", "411501"));
        district_030132.add(new CityInfo("师河区", "411502"));
        district_030132.add(new CityInfo("平桥区", "411503"));
        district_030132.add(new CityInfo("罗山县", "411521"));
        district_030132.add(new CityInfo("光山县", "411522"));
        district_030132.add(new CityInfo("新　县", "411523"));
        district_030132.add(new CityInfo("商城县", "411524"));
        district_030132.add(new CityInfo("固始县", "411525"));
        district_030132.add(new CityInfo("潢川县", "411526"));
        district_030132.add(new CityInfo("淮滨县", "411527"));
        district_030132.add(new CityInfo("息　县", "411528"));
        listDistrict_0314.add(district_030132);
        /**
         *河南省 - 周口市
         */
        ArrayList<CityInfo> district_030133 = new ArrayList<>();
        district_030133.add(new CityInfo("市辖区", "411601"));
        district_030133.add(new CityInfo("川汇区", "411602"));
        district_030133.add(new CityInfo("扶沟县", "411621"));
        district_030133.add(new CityInfo("西华县", "411622"));
        district_030133.add(new CityInfo("商水县", "411623"));
        district_030133.add(new CityInfo("沈丘县", "411624"));
        district_030133.add(new CityInfo("郸城县", "411625"));
        district_030133.add(new CityInfo("淮阳县", "411626"));
        district_030133.add(new CityInfo("太康县", "411627"));
        district_030133.add(new CityInfo("鹿邑县", "411628"));
        district_030133.add(new CityInfo("项城市", "411681"));
        listDistrict_0314.add(district_030133);
        /**
         *河南省 - 驻马店市
         */
        ArrayList<CityInfo> district_030134 = new ArrayList<>();
        district_030134.add(new CityInfo("市辖区", "411701"));
        district_030134.add(new CityInfo("驿城区", "411702"));
        district_030134.add(new CityInfo("西平县", "411721"));
        district_030134.add(new CityInfo("上蔡县", "411722"));
        district_030134.add(new CityInfo("平舆县", "411723"));
        district_030134.add(new CityInfo("正阳县", "411724"));
        district_030134.add(new CityInfo("确山县", "411725"));
        district_030134.add(new CityInfo("泌阳县", "411726"));
        district_030134.add(new CityInfo("汝南县", "411727"));
        district_030134.add(new CityInfo("遂平县", "411728"));
        district_030134.add(new CityInfo("新蔡县", "411729"));
        listDistrict_0314.add(district_030134);
        district.add(listDistrict_0314);
        /**
         *湖北省 - 武汉市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0315 = new ArrayList<>();
        ArrayList<CityInfo> district_031501 = new ArrayList<>();
        district_031501.add(new CityInfo("市辖区", "420101"));
        district_031501.add(new CityInfo("江岸区", "420102"));
        district_031501.add(new CityInfo("江汉区", "420103"));
        district_031501.add(new CityInfo("乔口区", "420104"));
        district_031501.add(new CityInfo("汉阳区", "420105"));
        district_031501.add(new CityInfo("武昌区", "420106"));
        district_031501.add(new CityInfo("青山区", "420107"));
        district_031501.add(new CityInfo("洪山区", "420111"));
        district_031501.add(new CityInfo("东西湖区", "420112"));
        district_031501.add(new CityInfo("汉南区", "420113"));
        district_031501.add(new CityInfo("蔡甸区", "420114"));
        district_031501.add(new CityInfo("江夏区", "420115"));
        district_031501.add(new CityInfo("黄陂区", "420116"));
        district_031501.add(new CityInfo("新洲区", "420117"));
        listDistrict_0315.add(district_031501);
        /**
         *湖北省 - 黄石市
         */
        ArrayList<CityInfo> district_031502 = new ArrayList<>();
        district_031502.add(new CityInfo("市辖区", "420201"));
        district_031502.add(new CityInfo("黄石港区", "420202"));
        district_031502.add(new CityInfo("西塞山区", "420203"));
        district_031502.add(new CityInfo("下陆区", "420204"));
        district_031502.add(new CityInfo("铁山区", "420205"));
        district_031502.add(new CityInfo("阳新县", "420222"));
        district_031502.add(new CityInfo("大冶市", "420281"));
        listDistrict_0315.add(district_031502);
        /**
         *湖北省 - 十堰市
         */
        ArrayList<CityInfo> district_031503 = new ArrayList<>();
        district_031503.add(new CityInfo("市辖区", "420301"));
        district_031503.add(new CityInfo("茅箭区", "420302"));
        district_031503.add(new CityInfo("张湾区", "420303"));
        district_031503.add(new CityInfo("郧　县", "420321"));
        district_031503.add(new CityInfo("郧西县", "420322"));
        district_031503.add(new CityInfo("竹山县", "420323"));
        district_031503.add(new CityInfo("竹溪县", "420324"));
        district_031503.add(new CityInfo("房　县", "420325"));
        district_031503.add(new CityInfo("丹江口市", "420381"));
        listDistrict_0315.add(district_031503);
        /**
         *湖北省 - 宜昌市
         */
        ArrayList<CityInfo> district_031504 = new ArrayList<>();
        district_031504.add(new CityInfo("市辖区", "420501"));
        district_031504.add(new CityInfo("西陵区", "420502"));
        district_031504.add(new CityInfo("伍家岗区", "420503"));
        district_031504.add(new CityInfo("点军区", "420504"));
        district_031504.add(new CityInfo("猇亭区", "420505"));
        district_031504.add(new CityInfo("夷陵区", "420506"));
        district_031504.add(new CityInfo("远安县", "420525"));
        district_031504.add(new CityInfo("兴山县", "420526"));
        district_031504.add(new CityInfo("秭归县", "420527"));
        district_031504.add(new CityInfo("长阳土家族自治县", "420528"));
        district_031504.add(new CityInfo("五峰土家族自治县", "420529"));
        district_031504.add(new CityInfo("宜都市", "420581"));
        district_031504.add(new CityInfo("当阳市", "420582"));
        district_031504.add(new CityInfo("枝江市", "420583"));
        listDistrict_0315.add(district_031504);
        /**
         *湖北省 - 襄樊市
         */

        ArrayList<CityInfo> district_030135 = new ArrayList<>();
        district_030135.add(new CityInfo("市辖区", "420601"));
        district_030135.add(new CityInfo("襄城区", "420602"));
        district_030135.add(new CityInfo("樊城区", "420606"));
        district_030135.add(new CityInfo("襄阳区", "420607"));
        district_030135.add(new CityInfo("南漳县", "420624"));
        district_030135.add(new CityInfo("谷城县", "420625"));
        district_030135.add(new CityInfo("保康县", "420626"));
        district_030135.add(new CityInfo("老河口市", "420682"));
        district_030135.add(new CityInfo("枣阳市", "420683"));
        district_030135.add(new CityInfo("宜城市", "420684"));
        listDistrict_0315.add(district_030135);
        /**
         *湖北省 - 鄂州市
         */
        ArrayList<CityInfo> district_030136 = new ArrayList<>();
        district_030136.add(new CityInfo("市辖区", "420701"));
        district_030136.add(new CityInfo("梁子湖区", "420702"));
        district_030136.add(new CityInfo("华容区", "420703"));
        district_030136.add(new CityInfo("鄂城区", "420704"));
        listDistrict_0315.add(district_030136);
        /**
         *湖北省 - 荆门市
         */
        ArrayList<CityInfo> district_030137 = new ArrayList<>();
        district_030137.add(new CityInfo("市辖区", "420801"));
        district_030137.add(new CityInfo("东宝区", "420802"));
        district_030137.add(new CityInfo("掇刀区", "420804"));
        district_030137.add(new CityInfo("京山县", "420821"));
        district_030137.add(new CityInfo("沙洋县", "420822"));
        district_030137.add(new CityInfo("钟祥市", "420881"));
        listDistrict_0315.add(district_030137);
        /**
         *湖北省 - 孝感市
         */
        ArrayList<CityInfo> district_030138 = new ArrayList<>();
        district_030138.add(new CityInfo("市辖区", "420901"));
        district_030138.add(new CityInfo("孝南区", "420902"));
        district_030138.add(new CityInfo("孝昌县", "420921"));
        district_030138.add(new CityInfo("大悟县", "420922"));
        district_030138.add(new CityInfo("云梦县", "420923"));
        district_030138.add(new CityInfo("应城市", "420981"));
        district_030138.add(new CityInfo("安陆市", "420982"));
        district_030138.add(new CityInfo("汉川市", "420984"));
        listDistrict_0315.add(district_030138);
        /**
         *湖北省 - 荆州市
         */
        ArrayList<CityInfo> district_030139 = new ArrayList<>();
        district_030139.add(new CityInfo("市辖区", "421001"));
        district_030139.add(new CityInfo("沙市区", "421002"));
        district_030139.add(new CityInfo("荆州区", "421003"));
        district_030139.add(new CityInfo("公安县", "421022"));
        district_030139.add(new CityInfo("监利县", "421023"));
        district_030139.add(new CityInfo("江陵县", "421024"));
        district_030139.add(new CityInfo("石首市", "421081"));
        district_030139.add(new CityInfo("洪湖市", "421083"));
        district_030139.add(new CityInfo("松滋市", "421087"));
        listDistrict_0315.add(district_030139);
        /**
         *湖北省 - 黄冈市
         */
        ArrayList<CityInfo> district_030140 = new ArrayList<>();
        district_030140.add(new CityInfo("市辖区", "421101"));
        district_030140.add(new CityInfo("黄州区", "421102"));
        district_030140.add(new CityInfo("团风县", "421121"));
        district_030140.add(new CityInfo("红安县", "421122"));
        district_030140.add(new CityInfo("罗田县", "421123"));
        district_030140.add(new CityInfo("英山县", "421124"));
        district_030140.add(new CityInfo("浠水县", "421125"));
        district_030140.add(new CityInfo("蕲春县", "421126"));
        district_030140.add(new CityInfo("黄梅县", "421127"));
        district_030140.add(new CityInfo("麻城市", "421181"));
        district_030140.add(new CityInfo("武穴市", "421182"));
        listDistrict_0315.add(district_030140);
        /**
         *湖北省 - 咸宁市
         */
        ArrayList<CityInfo> district_030141 = new ArrayList<>();
        district_030141.add(new CityInfo("市辖区", "421201"));
        district_030141.add(new CityInfo("咸安区", "421202"));
        district_030141.add(new CityInfo("嘉鱼县", "421221"));
        district_030141.add(new CityInfo("通城县", "421222"));
        district_030141.add(new CityInfo("崇阳县", "421223"));
        district_030141.add(new CityInfo("通山县", "421224"));
        district_030141.add(new CityInfo("赤壁市", "421281"));
        listDistrict_0315.add(district_030141);
        /**
         *湖北省 - 随州市
         */
        ArrayList<CityInfo> district_030142 = new ArrayList<>();
        district_030142.add(new CityInfo("市辖区", "421301"));
        district_030142.add(new CityInfo("曾都区", "421302"));
        district_030142.add(new CityInfo("广水市", "421381"));
        listDistrict_0315.add(district_030142);
        /**
         *湖北省 - 恩施土家族苗族自治州
         */
        ArrayList<CityInfo> district_030143 = new ArrayList<>();
        district_030143.add(new CityInfo("恩施市", "422801"));
        district_030143.add(new CityInfo("利川市", "422802"));
        district_030143.add(new CityInfo("建始县", "422822"));
        district_030143.add(new CityInfo("巴东县", "422823"));
        district_030143.add(new CityInfo("宣恩县", "422825"));
        district_030143.add(new CityInfo("咸丰县", "422826"));
        district_030143.add(new CityInfo("来凤县", "422827"));
        district_030143.add(new CityInfo("鹤峰县", "422828"));
        listDistrict_0315.add(district_030143);
        /**
         *湖北省 - 省直辖行政单位
         */
        ArrayList<CityInfo> district_030144 = new ArrayList<>();
        district_030144.add(new CityInfo("仙桃市", "429004"));
        district_030144.add(new CityInfo("潜江市", "429005"));
        district_030144.add(new CityInfo("天门市", "429006"));
        district_030144.add(new CityInfo("神农架林区", "429021"));
        listDistrict_0315.add(district_030144);
        district.add(listDistrict_0315);
        /**
         *湖南省 - 长沙市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0316 = new ArrayList<>();
        ArrayList<CityInfo> district_031601 = new ArrayList<>();
        district_031601.add(new CityInfo("市辖区", "430101"));
        district_031601.add(new CityInfo("芙蓉区", "430102"));
        district_031601.add(new CityInfo("天心区", "430103"));
        district_031601.add(new CityInfo("岳麓区", "430104"));
        district_031601.add(new CityInfo("开福区", "430105"));
        district_031601.add(new CityInfo("雨花区", "430111"));
        district_031601.add(new CityInfo("长沙县", "430121"));
        district_031601.add(new CityInfo("望城县", "430122"));
        district_031601.add(new CityInfo("宁乡县", "430124"));
        district_031601.add(new CityInfo("浏阳市", "430181"));
        listDistrict_0316.add(district_031601);
        /**
         *湖南省 - 株洲市
         */
        ArrayList<CityInfo> district_031602 = new ArrayList<>();
        district_031602.add(new CityInfo("市辖区", "430201"));
        district_031602.add(new CityInfo("荷塘区", "430202"));
        district_031602.add(new CityInfo("芦淞区", "430203"));
        district_031602.add(new CityInfo("石峰区", "430204"));
        district_031602.add(new CityInfo("天元区", "430211"));
        district_031602.add(new CityInfo("株洲县", "430221"));
        district_031602.add(new CityInfo("攸　县", "430223"));
        district_031602.add(new CityInfo("茶陵县", "430224"));
        district_031602.add(new CityInfo("炎陵县", "430225"));
        district_031602.add(new CityInfo("醴陵市", "430281"));
        listDistrict_0316.add(district_031602);
        /**
         *湖南省 - 湘潭市
         */
        ArrayList<CityInfo> district_031603 = new ArrayList<>();
        district_031603.add(new CityInfo("市辖区", "430301"));
        district_031603.add(new CityInfo("雨湖区", "430302"));
        district_031603.add(new CityInfo("岳塘区", "430304"));
        district_031603.add(new CityInfo("湘潭县", "430321"));
        district_031603.add(new CityInfo("湘乡市", "430381"));
        district_031603.add(new CityInfo("韶山市", "430382"));
        listDistrict_0316.add(district_031603);
        /**
         *湖南省 - 衡阳市
         */
        ArrayList<CityInfo> district_031604 = new ArrayList<>();
        district_031604.add(new CityInfo("市辖区", "430401"));
        district_031604.add(new CityInfo("珠晖区", "430405"));
        district_031604.add(new CityInfo("雁峰区", "430406"));
        district_031604.add(new CityInfo("石鼓区", "430407"));
        district_031604.add(new CityInfo("蒸湘区", "430408"));
        district_031604.add(new CityInfo("南岳区", "430412"));
        district_031604.add(new CityInfo("衡阳县", "430421"));
        district_031604.add(new CityInfo("衡南县", "430422"));
        district_031604.add(new CityInfo("衡山县", "430423"));
        district_031604.add(new CityInfo("衡东县", "430424"));
        district_031604.add(new CityInfo("祁东县", "430426"));
        district_031604.add(new CityInfo("耒阳市", "430481"));
        district_031604.add(new CityInfo("常宁市", "430482"));
        listDistrict_0316.add(district_031604);
        /**
         *湖南省 - 邵阳市
         */

        ArrayList<CityInfo> district_030145 = new ArrayList<>();
        district_030145.add(new CityInfo("市辖区", "430501"));
        district_030145.add(new CityInfo("双清区", "430502"));
        district_030145.add(new CityInfo("大祥区", "430503"));
        district_030145.add(new CityInfo("北塔区", "430511"));
        district_030145.add(new CityInfo("邵东县", "430521"));
        district_030145.add(new CityInfo("新邵县", "430522"));
        district_030145.add(new CityInfo("邵阳县", "430523"));
        district_030145.add(new CityInfo("隆回县", "430524"));
        district_030145.add(new CityInfo("洞口县", "430525"));
        district_030145.add(new CityInfo("绥宁县", "430527"));
        district_030145.add(new CityInfo("新宁县", "430528"));
        district_030145.add(new CityInfo("城步苗族自治县", "430529"));
        district_030145.add(new CityInfo("武冈市", "430581"));
        listDistrict_0316.add(district_030145);
        /**
         *湖南省 - 岳阳市
         */
        ArrayList<CityInfo> district_030146 = new ArrayList<>();
        district_030146.add(new CityInfo("市辖区", "430601"));
        district_030146.add(new CityInfo("岳阳楼区", "430602"));
        district_030146.add(new CityInfo("云溪区", "430603"));
        district_030146.add(new CityInfo("君山区", "430611"));
        district_030146.add(new CityInfo("岳阳县", "430621"));
        district_030146.add(new CityInfo("华容县", "430623"));
        district_030146.add(new CityInfo("湘阴县", "430624"));
        district_030146.add(new CityInfo("平江县", "430626"));
        district_030146.add(new CityInfo("汨罗市", "430681"));
        district_030146.add(new CityInfo("临湘市", "430682"));
        listDistrict_0316.add(district_030146);
        /**
         *湖南省 - 常德市
         */
        ArrayList<CityInfo> district_030147 = new ArrayList<>();
        district_030147.add(new CityInfo("市辖区", "430701"));
        district_030147.add(new CityInfo("武陵区", "430702"));
        district_030147.add(new CityInfo("鼎城区", "430703"));
        district_030147.add(new CityInfo("安乡县", "430721"));
        district_030147.add(new CityInfo("汉寿县", "430722"));
        district_030147.add(new CityInfo("澧　县", "430723"));
        district_030147.add(new CityInfo("临澧县", "430724"));
        district_030147.add(new CityInfo("桃源县", "430725"));
        district_030147.add(new CityInfo("石门县", "430726"));
        district_030147.add(new CityInfo("津市市", "430781"));
        listDistrict_0316.add(district_030147);
        /**
         *湖南省 - 张家界市
         */
        ArrayList<CityInfo> district_030148 = new ArrayList<>();
        district_030148.add(new CityInfo("市辖区", "430801"));
        district_030148.add(new CityInfo("永定区", "430802"));
        district_030148.add(new CityInfo("武陵源区", "430811"));
        district_030148.add(new CityInfo("慈利县", "430821"));
        district_030148.add(new CityInfo("桑植县", "430822"));
        listDistrict_0316.add(district_030148);
        /**
         *湖南省 - 益阳市
         */
        ArrayList<CityInfo> district_030149 = new ArrayList<>();
        district_030149.add(new CityInfo("市辖区", "430901"));
        district_030149.add(new CityInfo("资阳区", "430902"));
        district_030149.add(new CityInfo("赫山区", "430903"));
        district_030149.add(new CityInfo("南　县", "430921"));
        district_030149.add(new CityInfo("桃江县", "430922"));
        district_030149.add(new CityInfo("安化县", "430923"));
        district_030149.add(new CityInfo("沅江市", "430981"));
        listDistrict_0316.add(district_030149);
        /**
         *湖南省 - 郴州市
         */
        ArrayList<CityInfo> district_030150 = new ArrayList<>();
        district_030150.add(new CityInfo("市辖区", "431001"));
        district_030150.add(new CityInfo("北湖区", "431002"));
        district_030150.add(new CityInfo("苏仙区", "431003"));
        district_030150.add(new CityInfo("桂阳县", "431021"));
        district_030150.add(new CityInfo("宜章县", "431022"));
        district_030150.add(new CityInfo("永兴县", "431023"));
        district_030150.add(new CityInfo("嘉禾县", "431024"));
        district_030150.add(new CityInfo("临武县", "431025"));
        district_030150.add(new CityInfo("汝城县", "431026"));
        district_030150.add(new CityInfo("桂东县", "431027"));
        district_030150.add(new CityInfo("安仁县", "431028"));
        district_030150.add(new CityInfo("资兴市", "431081"));
        listDistrict_0316.add(district_030150);
        /**
         *湖南省 - 永州市
         */
        ArrayList<CityInfo> district_030151 = new ArrayList<>();
        district_030151.add(new CityInfo("市辖区", "431101"));
        district_030151.add(new CityInfo("芝山区", "431102"));
        district_030151.add(new CityInfo("冷水滩区", "431103"));
        district_030151.add(new CityInfo("祁阳县", "431121"));
        district_030151.add(new CityInfo("东安县", "431122"));
        district_030151.add(new CityInfo("双牌县", "431123"));
        district_030151.add(new CityInfo("道　县", "431124"));
        district_030151.add(new CityInfo("江永县", "431125"));
        district_030151.add(new CityInfo("宁远县", "431126"));
        district_030151.add(new CityInfo("蓝山县", "431127"));
        district_030151.add(new CityInfo("新田县", "431128"));
        district_030151.add(new CityInfo("江华瑶族自治县", "431129"));
        listDistrict_0316.add(district_030151);
        /**
         *湖南省 - 怀化市
         */
        ArrayList<CityInfo> district_030152 = new ArrayList<>();
        district_030152.add(new CityInfo("市辖区", "431201"));
        district_030152.add(new CityInfo("鹤城区", "431202"));
        district_030152.add(new CityInfo("中方县", "431221"));
        district_030152.add(new CityInfo("沅陵县", "431222"));
        district_030152.add(new CityInfo("辰溪县", "431223"));
        district_030152.add(new CityInfo("溆浦县", "431224"));
        district_030152.add(new CityInfo("会同县", "431225"));
        district_030152.add(new CityInfo("麻阳苗族自治县", "431226"));
        district_030152.add(new CityInfo("新晃侗族自治县", "431227"));
        district_030152.add(new CityInfo("芷江侗族自治县", "431228"));
        district_030152.add(new CityInfo("靖州苗族侗族自治县", "431229"));
        district_030152.add(new CityInfo("通道侗族自治县", "431230"));
        district_030152.add(new CityInfo("洪江市", "431281"));
        listDistrict_0316.add(district_030152);
        /**
         *湖南省 - 娄底市
         */
        ArrayList<CityInfo> district_030153 = new ArrayList<>();
        district_030153.add(new CityInfo("市辖区", "431301"));
        district_030153.add(new CityInfo("娄星区", "431302"));
        district_030153.add(new CityInfo("双峰县", "431321"));
        district_030153.add(new CityInfo("新化县", "431322"));
        district_030153.add(new CityInfo("冷水江市", "431381"));
        district_030153.add(new CityInfo("涟源市", "431382"));
        listDistrict_0316.add(district_030153);
        /**
         *湖南省 - 湘西土家族苗族自治州
         */
        ArrayList<CityInfo> district_030154 = new ArrayList<>();
        district_030154.add(new CityInfo("吉首市", "433101"));
        district_030154.add(new CityInfo("泸溪县", "433122"));
        district_030154.add(new CityInfo("凤凰县", "433123"));
        district_030154.add(new CityInfo("花垣县", "433124"));
        district_030154.add(new CityInfo("保靖县", "433125"));
        district_030154.add(new CityInfo("古丈县", "433126"));
        district_030154.add(new CityInfo("永顺县", "433127"));
        district_030154.add(new CityInfo("龙山县", "433130"));
        listDistrict_0316.add(district_030154);
        district.add(listDistrict_0316);
    }

    void getHuNan() {
        /**
         *广东省 - 广州市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0317 = new ArrayList<>();
        ArrayList<CityInfo> district_031701 = new ArrayList<>();
        district_031701.add(new CityInfo("市辖区", "440101"));
        district_031701.add(new CityInfo("东山区", "440102"));
        district_031701.add(new CityInfo("荔湾区", "440103"));
        district_031701.add(new CityInfo("越秀区", "440104"));
        district_031701.add(new CityInfo("海珠区", "440105"));
        district_031701.add(new CityInfo("天河区", "440106"));
        district_031701.add(new CityInfo("芳村区", "440107"));
        district_031701.add(new CityInfo("白云区", "440111"));
        district_031701.add(new CityInfo("黄埔区", "440112"));
        district_031701.add(new CityInfo("番禺区", "440113"));
        district_031701.add(new CityInfo("花都区", "440114"));
        district_031701.add(new CityInfo("增城市", "440183"));
        district_031701.add(new CityInfo("从化市", "440184"));
        listDistrict_0317.add(district_031701);
        /**
         *广东省 - 韶关市
         */
        ArrayList<CityInfo> district_031702 = new ArrayList<>();
        district_031702.add(new CityInfo("市辖区", "440201"));
        district_031702.add(new CityInfo("武江区", "440203"));
        district_031702.add(new CityInfo("浈江区", "440204"));
        district_031702.add(new CityInfo("曲江区", "440205"));
        district_031702.add(new CityInfo("始兴县", "440222"));
        district_031702.add(new CityInfo("仁化县", "440224"));
        district_031702.add(new CityInfo("翁源县", "440229"));
        district_031702.add(new CityInfo("乳源瑶族自治县", "440232"));
        district_031702.add(new CityInfo("新丰县", "440233"));
        district_031702.add(new CityInfo("乐昌市", "440281"));
        district_031702.add(new CityInfo("南雄市", "440282"));
        listDistrict_0317.add(district_031702);
        /**
         *广东省 - 深圳市
         */
        ArrayList<CityInfo> district_031703 = new ArrayList<>();
        district_031703.add(new CityInfo("市辖区", "440301"));
        district_031703.add(new CityInfo("罗湖区", "440303"));
        district_031703.add(new CityInfo("福田区", "440304"));
        district_031703.add(new CityInfo("南山区", "440305"));
        district_031703.add(new CityInfo("宝安区", "440306"));
        district_031703.add(new CityInfo("龙岗区", "440307"));
        district_031703.add(new CityInfo("盐田区", "440308"));
        listDistrict_0317.add(district_031703);
        /**
         *广东省 - 珠海市
         */
        ArrayList<CityInfo> district_031704 = new ArrayList<>();
        district_031704.add(new CityInfo("市辖区", "440401"));
        district_031704.add(new CityInfo("香洲区", "440402"));
        district_031704.add(new CityInfo("斗门区", "440403"));
        district_031704.add(new CityInfo("金湾区", "440404"));
        listDistrict_0317.add(district_031704);
        /**
         *广东省 - 汕头市
         */
        ArrayList<CityInfo> district_030155 = new ArrayList<>();
        district_030155.add(new CityInfo("市辖区", "440501"));
        district_030155.add(new CityInfo("龙湖区", "440507"));
        district_030155.add(new CityInfo("金平区", "440511"));
        district_030155.add(new CityInfo("濠江区", "440512"));
        district_030155.add(new CityInfo("潮阳区", "440513"));
        district_030155.add(new CityInfo("潮南区", "440514"));
        district_030155.add(new CityInfo("澄海区", "440515"));
        district_030155.add(new CityInfo("南澳县", "440523"));
        listDistrict_0317.add(district_030155);
        /**
         *广东省 - 佛山市
         */
        ArrayList<CityInfo> district_030156 = new ArrayList<>();
        district_030156.add(new CityInfo("市辖区", "440601"));
        district_030156.add(new CityInfo("禅城区", "440604"));
        district_030156.add(new CityInfo("南海区", "440605"));
        district_030156.add(new CityInfo("顺德区", "440606"));
        district_030156.add(new CityInfo("三水区", "440607"));
        district_030156.add(new CityInfo("高明区", "440608"));
        listDistrict_0317.add(district_030156);
        /**
         *广东省 - 江门市
         */
        ArrayList<CityInfo> district_030157 = new ArrayList<>();
        district_030157.add(new CityInfo("市辖区", "440701"));
        district_030157.add(new CityInfo("蓬江区", "440703"));
        district_030157.add(new CityInfo("江海区", "440704"));
        district_030157.add(new CityInfo("新会区", "440705"));
        district_030157.add(new CityInfo("台山市", "440781"));
        district_030157.add(new CityInfo("开平市", "440783"));
        district_030157.add(new CityInfo("鹤山市", "440784"));
        district_030157.add(new CityInfo("恩平市", "440785"));
        listDistrict_0317.add(district_030157);
        /**
         *广东省 - 湛江市
         */
        ArrayList<CityInfo> district_030158 = new ArrayList<>();
        district_030158.add(new CityInfo("市辖区", "440801"));
        district_030158.add(new CityInfo("赤坎区", "440802"));
        district_030158.add(new CityInfo("霞山区", "440803"));
        district_030158.add(new CityInfo("坡头区", "440804"));
        district_030158.add(new CityInfo("麻章区", "440811"));
        district_030158.add(new CityInfo("遂溪县", "440823"));
        district_030158.add(new CityInfo("徐闻县", "440825"));
        district_030158.add(new CityInfo("廉江市", "440881"));
        district_030158.add(new CityInfo("雷州市", "440882"));
        district_030158.add(new CityInfo("吴川市", "440883"));
        listDistrict_0317.add(district_030158);
        /**
         *广东省 - 茂名市
         */
        ArrayList<CityInfo> district_030159 = new ArrayList<>();
        district_030159.add(new CityInfo("市辖区", "440901"));
        district_030159.add(new CityInfo("茂南区", "440902"));
        district_030159.add(new CityInfo("茂港区", "440903"));
        district_030159.add(new CityInfo("电白县", "440923"));
        district_030159.add(new CityInfo("高州市", "440981"));
        district_030159.add(new CityInfo("化州市", "440982"));
        district_030159.add(new CityInfo("信宜市", "440983"));
        listDistrict_0317.add(district_030159);
        /**
         *广东省 - 肇庆市
         */
        ArrayList<CityInfo> district_030160 = new ArrayList<>();
        district_030160.add(new CityInfo("市辖区", "441201"));
        district_030160.add(new CityInfo("端州区", "441202"));
        district_030160.add(new CityInfo("鼎湖区", "441203"));
        district_030160.add(new CityInfo("广宁县", "441223"));
        district_030160.add(new CityInfo("怀集县", "441224"));
        district_030160.add(new CityInfo("封开县", "441225"));
        district_030160.add(new CityInfo("德庆县", "441226"));
        district_030160.add(new CityInfo("高要市", "441283"));
        district_030160.add(new CityInfo("四会市", "441284"));
        listDistrict_0317.add(district_030160);
        /**
         *广东省 - 惠州市
         */
        ArrayList<CityInfo> district_030161 = new ArrayList<>();
        district_030161.add(new CityInfo("市辖区", "441301"));
        district_030161.add(new CityInfo("惠城区", "441302"));
        district_030161.add(new CityInfo("惠阳区", "441303"));
        district_030161.add(new CityInfo("博罗县", "441322"));
        district_030161.add(new CityInfo("惠东县", "441323"));
        district_030161.add(new CityInfo("龙门县", "441324"));
        listDistrict_0317.add(district_030161);
        /**
         *广东省 - 梅州市
         */
        ArrayList<CityInfo> district_030162 = new ArrayList<>();
        district_030162.add(new CityInfo("市辖区", "441401"));
        district_030162.add(new CityInfo("梅江区", "441402"));
        district_030162.add(new CityInfo("梅　县", "441421"));
        district_030162.add(new CityInfo("大埔县", "441422"));
        district_030162.add(new CityInfo("丰顺县", "441423"));
        district_030162.add(new CityInfo("五华县", "441424"));
        district_030162.add(new CityInfo("平远县", "441426"));
        district_030162.add(new CityInfo("蕉岭县", "441427"));
        district_030162.add(new CityInfo("兴宁市", "441481"));
        listDistrict_0317.add(district_030162);
        /**
         *广东省 - 汕尾市
         */
        ArrayList<CityInfo> district_030163 = new ArrayList<>();
        district_030163.add(new CityInfo("市辖区", "441501"));
        district_030163.add(new CityInfo("城　区", "441502"));
        district_030163.add(new CityInfo("海丰县", "441521"));
        district_030163.add(new CityInfo("陆河县", "441523"));
        district_030163.add(new CityInfo("陆丰市", "441581"));
        listDistrict_0317.add(district_030163);
        /**
         *广东省 - 河源市
         */
        ArrayList<CityInfo> district_030164 = new ArrayList<>();
        district_030164.add(new CityInfo("市辖区", "441601"));
        district_030164.add(new CityInfo("源城区", "441602"));
        district_030164.add(new CityInfo("紫金县", "441621"));
        district_030164.add(new CityInfo("龙川县", "441622"));
        district_030164.add(new CityInfo("连平县", "441623"));
        district_030164.add(new CityInfo("和平县", "441624"));
        district_030164.add(new CityInfo("东源县", "441625"));
        listDistrict_0317.add(district_030164);
        /**
         *广东省 - 阳江市
         */
        ArrayList<CityInfo> district_030165 = new ArrayList<>();
        district_030165.add(new CityInfo("市辖区", "441701"));
        district_030165.add(new CityInfo("江城区", "441702"));
        district_030165.add(new CityInfo("阳西县", "441721"));
        district_030165.add(new CityInfo("阳东县", "441723"));
        district_030165.add(new CityInfo("阳春市", "441781"));
        listDistrict_0317.add(district_030165);
        /**
         *广东省 - 清远市
         */
        ArrayList<CityInfo> district_030166 = new ArrayList<>();
        district_030166.add(new CityInfo("市辖区", "441801"));
        district_030166.add(new CityInfo("清城区", "441802"));
        district_030166.add(new CityInfo("清新区", "441803"));
        district_030166.add(new CityInfo("佛冈县", "441821"));
        district_030166.add(new CityInfo("阳山县", "441823"));
        district_030166.add(new CityInfo("连山壮族瑶族自治县", "441825"));
        district_030166.add(new CityInfo("连南瑶族自治县", "441826"));
        district_030166.add(new CityInfo("清新县", "441827"));
        district_030166.add(new CityInfo("英德市", "441881"));
        district_030166.add(new CityInfo("连州市", "441882"));
        listDistrict_0317.add(district_030166);
        /**
         *广东省 - 东莞市
         */
        ArrayList<CityInfo> district_030167 = new ArrayList<>();
        district_030167.add(new CityInfo("莞城区", "441901"));
        district_030167.add(new CityInfo("南城区", "441902"));
        district_030167.add(new CityInfo("万江区", "441903"));
        district_030167.add(new CityInfo("东城区", "441904"));
        district_030167.add(new CityInfo("松山湖", "441905"));
        district_030167.add(new CityInfo("石碣镇", "441906"));
        district_030167.add(new CityInfo("石龙镇", "441907"));
        district_030167.add(new CityInfo("茶山镇", "441908"));
        district_030167.add(new CityInfo("石排镇", "441909"));
        district_030167.add(new CityInfo("企石镇", "441910"));
        district_030167.add(new CityInfo("横沥镇", "441911"));
        district_030167.add(new CityInfo("桥头镇", "441912"));
        district_030167.add(new CityInfo("谢岗镇", "441913"));
        district_030167.add(new CityInfo("东坑镇", "441914"));
        district_030167.add(new CityInfo("常平镇", "441915"));
        district_030167.add(new CityInfo("寮步镇", "441916"));
        district_030167.add(new CityInfo("大朗镇", "441917"));
        district_030167.add(new CityInfo("黄江镇", "441918"));
        district_030167.add(new CityInfo("清溪镇", "441919"));
        district_030167.add(new CityInfo("塘厦镇", "441920"));
        district_030167.add(new CityInfo("凤岗镇", "441921"));
        district_030167.add(new CityInfo("长安镇", "441922"));
        district_030167.add(new CityInfo("虎门镇", "441923"));
        district_030167.add(new CityInfo("厚街镇", "441924"));
        district_030167.add(new CityInfo("沙田镇", "441925"));
        district_030167.add(new CityInfo("道滘镇", "441926"));
        district_030167.add(new CityInfo("洪梅镇", "441927"));
        district_030167.add(new CityInfo("麻涌镇", "441928"));
        district_030167.add(new CityInfo("中堂镇", "441929"));
        district_030167.add(new CityInfo("高埗镇", "441930"));
        district_030167.add(new CityInfo("樟木头镇", "441931"));
        district_030167.add(new CityInfo("大岭山镇", "441932"));
        district_030167.add(new CityInfo("望牛墩镇", "441933"));
        listDistrict_0317.add(district_030167);
        /**
         *广东省 - 中山市
         */
        ArrayList<CityInfo> district_030168 = new ArrayList<>();
        district_030168.add(new CityInfo("东区", "442001"));
        district_030168.add(new CityInfo("南区", "442002"));
        district_030168.add(new CityInfo("西区", "442003"));
        district_030168.add(new CityInfo("石岐区", "442004"));
        district_030168.add(new CityInfo("翠亨新区", "442005"));
        district_030168.add(new CityInfo("火炬开发区", "442006"));
        district_030168.add(new CityInfo("南朗镇", "442007"));
        district_030168.add(new CityInfo("坦洲镇", "442008"));
        district_030168.add(new CityInfo("民众镇", "442009"));
        district_030168.add(new CityInfo("五桂山", "442010"));
        district_030168.add(new CityInfo("三乡镇", "442011"));
        district_030168.add(new CityInfo("黄圃镇", "442012"));
        district_030168.add(new CityInfo("板芙镇", "442013"));
        district_030168.add(new CityInfo("东升镇", "442014"));
        district_030168.add(new CityInfo("横栏镇", "442015"));
        district_030168.add(new CityInfo("小榄镇", "442016"));
        district_030168.add(new CityInfo("三角镇", "442017"));
        district_030168.add(new CityInfo("港口镇", "442018"));
        district_030168.add(new CityInfo("神湾镇", "442019"));
        district_030168.add(new CityInfo("东凤镇", "442020"));
        district_030168.add(new CityInfo("沙溪镇", "442021"));
        district_030168.add(new CityInfo("古镇镇", "442022"));
        district_030168.add(new CityInfo("大涌镇", "442023"));
        district_030168.add(new CityInfo("阜沙镇", "442024"));
        district_030168.add(new CityInfo("南头镇", "442025"));
        listDistrict_0317.add(district_030168);
        /**
         *广东省 - 潮州市
         */
        ArrayList<CityInfo> district_030169 = new ArrayList<>();
        district_030169.add(new CityInfo("市辖区", "445101"));
        district_030169.add(new CityInfo("湘桥区", "445102"));
        district_030169.add(new CityInfo("潮安县", "445121"));
        district_030169.add(new CityInfo("饶平县", "445122"));
        listDistrict_0317.add(district_030169);
        /**
         *广东省 - 揭阳市
         */
        ArrayList<CityInfo> district_030170 = new ArrayList<>();
        district_030170.add(new CityInfo("市辖区", "445201"));
        district_030170.add(new CityInfo("榕城区", "445202"));
        district_030170.add(new CityInfo("揭东县", "445221"));
        district_030170.add(new CityInfo("揭西县", "445222"));
        district_030170.add(new CityInfo("惠来县", "445224"));
        district_030170.add(new CityInfo("普宁市", "445281"));
        listDistrict_0317.add(district_030170);
        /**
         *广东省 - 云浮市
         */
        ArrayList<CityInfo> district_030171 = new ArrayList<>();
        district_030171.add(new CityInfo("市辖区", "445301"));
        district_030171.add(new CityInfo("云城区", "445302"));
        district_030171.add(new CityInfo("新兴县", "445321"));
        district_030171.add(new CityInfo("郁南县", "445322"));
        district_030171.add(new CityInfo("云安县", "445323"));
        district_030171.add(new CityInfo("罗定市", "445381"));
        listDistrict_0317.add(district_030171);
        district.add(listDistrict_0317);
        /**
         *海南省 - 海口市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0318 = new ArrayList<>();
        ArrayList<CityInfo> district_030172 = new ArrayList<>();
        district_030172.add(new CityInfo("市辖区", "460101"));
        district_030172.add(new CityInfo("秀英区", "460105"));
        district_030172.add(new CityInfo("龙华区", "460106"));
        district_030172.add(new CityInfo("琼山区", "460107"));
        district_030172.add(new CityInfo("美兰区", "460108"));
        listDistrict_0318.add(district_030172);
        /**
         *海南省 - 三亚市
         */
        ArrayList<CityInfo> district_030173 = new ArrayList<>();
        district_030173.add(new CityInfo("市辖区", "460201"));
        listDistrict_0318.add(district_030173);
        /**
         *海南省 - 省直辖县级行政单位
         */
        ArrayList<CityInfo> district_030174 = new ArrayList<>();
        district_030174.add(new CityInfo("五指山市", "469001"));
        district_030174.add(new CityInfo("琼海市", "469002"));
        district_030174.add(new CityInfo("儋州市", "469003"));
        district_030174.add(new CityInfo("文昌市", "469005"));
        district_030174.add(new CityInfo("万宁市", "469006"));
        district_030174.add(new CityInfo("东方市", "469007"));
        district_030174.add(new CityInfo("定安县", "469025"));
        district_030174.add(new CityInfo("屯昌县", "469026"));
        district_030174.add(new CityInfo("澄迈县", "469027"));
        district_030174.add(new CityInfo("临高县", "469028"));
        district_030174.add(new CityInfo("白沙黎族自治县", "469030"));
        district_030174.add(new CityInfo("昌江黎族自治县", "469031"));
        district_030174.add(new CityInfo("乐东黎族自治县", "469033"));
        district_030174.add(new CityInfo("陵水黎族自治县", "469034"));
        district_030174.add(new CityInfo("保亭黎族苗族自治县", "469035"));
        district_030174.add(new CityInfo("琼中黎族苗族自治县", "469036"));
        district_030174.add(new CityInfo("西沙群岛", "469037"));
        district_030174.add(new CityInfo("南沙群岛", "469038"));
        district_030174.add(new CityInfo("中沙群岛的岛礁及其海域", "469039"));
        listDistrict_0318.add(district_030174);
        district.add(listDistrict_0318);
        /**
         *重庆市 - 市辖区
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0319 = new ArrayList<>();
        ArrayList<CityInfo> district_030175 = new ArrayList<>();
        district_030175.add(new CityInfo("万州区", "500101"));
        district_030175.add(new CityInfo("涪陵区", "500102"));
        district_030175.add(new CityInfo("渝中区", "500103"));
        district_030175.add(new CityInfo("大渡口区", "500104"));
        district_030175.add(new CityInfo("江北区", "500105"));
        district_030175.add(new CityInfo("沙坪坝区", "500106"));
        district_030175.add(new CityInfo("九龙坡区", "500107"));
        district_030175.add(new CityInfo("南岸区", "500108"));
        district_030175.add(new CityInfo("北碚区", "500109"));
        district_030175.add(new CityInfo("万盛区", "500110"));
        district_030175.add(new CityInfo("双桥区", "500111"));
        district_030175.add(new CityInfo("渝北区", "500112"));
        district_030175.add(new CityInfo("巴南区", "500113"));
        district_030175.add(new CityInfo("黔江区", "500114"));
        district_030175.add(new CityInfo("长寿区", "500115"));
        listDistrict_0319.add(district_030175);
        /**
         *重庆市 - 县
         */
        ArrayList<CityInfo> district_030176 = new ArrayList<>();
        district_030176.add(new CityInfo("綦江县", "500222"));
        district_030176.add(new CityInfo("潼南县", "500223"));
        district_030176.add(new CityInfo("铜梁县", "500224"));
        district_030176.add(new CityInfo("大足县", "500225"));
        district_030176.add(new CityInfo("荣昌县", "500226"));
        district_030176.add(new CityInfo("璧山县", "500227"));
        district_030176.add(new CityInfo("梁平县", "500228"));
        district_030176.add(new CityInfo("城口县", "500229"));
        district_030176.add(new CityInfo("丰都县", "500230"));
        district_030176.add(new CityInfo("垫江县", "500231"));
        district_030176.add(new CityInfo("武隆县", "500232"));
        district_030176.add(new CityInfo("忠　县", "500233"));
        district_030176.add(new CityInfo("开　县", "500234"));
        district_030176.add(new CityInfo("云阳县", "500235"));
        district_030176.add(new CityInfo("奉节县", "500236"));
        district_030176.add(new CityInfo("巫山县", "500237"));
        district_030176.add(new CityInfo("巫溪县", "500238"));
        district_030176.add(new CityInfo("石柱土家族自治县", "500240"));
        district_030176.add(new CityInfo("秀山土家族苗族自治县", "500241"));
        district_030176.add(new CityInfo("酉阳土家族苗族自治县", "500242"));
        district_030176.add(new CityInfo("彭水苗族土家族自治县", "500243"));
        listDistrict_0319.add(district_030176);
        /**
         *重庆市 - 市
         */
        ArrayList<CityInfo> district_030177 = new ArrayList<>();
        district_030177.add(new CityInfo("江津市", "500381"));
        district_030177.add(new CityInfo("合川市", "500382"));
        district_030177.add(new CityInfo("永川市", "500383"));
        district_030177.add(new CityInfo("南川市", "500384"));
        listDistrict_0319.add(district_030177);
        district.add(listDistrict_0319);

    }

    void getSiChuan() {
        /**
         *四川省 - 成都市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0320 = new ArrayList<>();
        ArrayList<CityInfo> district_030178 = new ArrayList<>();
        district_030178.add(new CityInfo("市辖区", "510101"));
        district_030178.add(new CityInfo("锦江区", "510104"));
        district_030178.add(new CityInfo("青羊区", "510105"));
        district_030178.add(new CityInfo("金牛区", "510106"));
        district_030178.add(new CityInfo("武侯区", "510107"));
        district_030178.add(new CityInfo("成华区", "510108"));
        district_030178.add(new CityInfo("龙泉驿区", "510112"));
        district_030178.add(new CityInfo("青白江区", "510113"));
        district_030178.add(new CityInfo("新都区", "510114"));
        district_030178.add(new CityInfo("温江区", "510115"));
        district_030178.add(new CityInfo("金堂县", "510121"));
        district_030178.add(new CityInfo("双流县", "510122"));
        district_030178.add(new CityInfo("郫　县", "510124"));
        district_030178.add(new CityInfo("大邑县", "510129"));
        district_030178.add(new CityInfo("蒲江县", "510131"));
        district_030178.add(new CityInfo("新津县", "510132"));
        district_030178.add(new CityInfo("都江堰市", "510181"));
        district_030178.add(new CityInfo("彭州市", "510182"));
        district_030178.add(new CityInfo("邛崃市", "510183"));
        district_030178.add(new CityInfo("崇州市", "510184"));
        listDistrict_0320.add(district_030178);
        /**
         *四川省 - 自贡市
         */
        ArrayList<CityInfo> district_030179 = new ArrayList<>();
        district_030179.add(new CityInfo("市辖区", "510301"));
        district_030179.add(new CityInfo("自流井区", "510302"));
        district_030179.add(new CityInfo("贡井区", "510303"));
        district_030179.add(new CityInfo("大安区", "510304"));
        district_030179.add(new CityInfo("沿滩区", "510311"));
        district_030179.add(new CityInfo("荣　县", "510321"));
        district_030179.add(new CityInfo("富顺县", "510322"));
        listDistrict_0320.add(district_030179);
        /**
         *四川省 - 攀枝花市
         */
        ArrayList<CityInfo> district_030180 = new ArrayList<>();
        district_030180.add(new CityInfo("市辖区", "510401"));
        district_030180.add(new CityInfo("东　区", "510402"));
        district_030180.add(new CityInfo("西　区", "510403"));
        district_030180.add(new CityInfo("仁和区", "510411"));
        district_030180.add(new CityInfo("米易县", "510421"));
        district_030180.add(new CityInfo("盐边县", "510422"));
        listDistrict_0320.add(district_030180);
        /**
         *四川省 - 泸州市
         */
        ArrayList<CityInfo> district_030181 = new ArrayList<>();
        district_030181.add(new CityInfo("市辖区", "510501"));
        district_030181.add(new CityInfo("江阳区", "510502"));
        district_030181.add(new CityInfo("纳溪区", "510503"));
        district_030181.add(new CityInfo("龙马潭区", "510504"));
        district_030181.add(new CityInfo("泸　县", "510521"));
        district_030181.add(new CityInfo("合江县", "510522"));
        district_030181.add(new CityInfo("叙永县", "510524"));
        district_030181.add(new CityInfo("古蔺县", "510525"));
        listDistrict_0320.add(district_030181);
        /**
         *四川省 - 德阳市
         */
        ArrayList<CityInfo> district_030182 = new ArrayList<>();
        district_030182.add(new CityInfo("市辖区", "510601"));
        district_030182.add(new CityInfo("旌阳区", "510603"));
        district_030182.add(new CityInfo("中江县", "510623"));
        district_030182.add(new CityInfo("罗江县", "510626"));
        district_030182.add(new CityInfo("广汉市", "510681"));
        district_030182.add(new CityInfo("什邡市", "510682"));
        district_030182.add(new CityInfo("绵竹市", "510683"));
        listDistrict_0320.add(district_030182);
        /**
         *四川省 - 绵阳市
         */
        ArrayList<CityInfo> district_030183 = new ArrayList<>();
        district_030183.add(new CityInfo("市辖区", "510701"));
        district_030183.add(new CityInfo("涪城区", "510703"));
        district_030183.add(new CityInfo("游仙区", "510704"));
        district_030183.add(new CityInfo("三台县", "510722"));
        district_030183.add(new CityInfo("盐亭县", "510723"));
        district_030183.add(new CityInfo("安　县", "510724"));
        district_030183.add(new CityInfo("梓潼县", "510725"));
        district_030183.add(new CityInfo("北川羌族自治县", "510726"));
        district_030183.add(new CityInfo("平武县", "510727"));
        district_030183.add(new CityInfo("江油市", "510781"));
        listDistrict_0320.add(district_030183);
        /**
         *四川省 - 广元市
         */
        ArrayList<CityInfo> district_030184 = new ArrayList<>();
        district_030184.add(new CityInfo("市辖区", "510801"));
        district_030184.add(new CityInfo("市中区", "510802"));
        district_030184.add(new CityInfo("元坝区", "510811"));
        district_030184.add(new CityInfo("朝天区", "510812"));
        district_030184.add(new CityInfo("旺苍县", "510821"));
        district_030184.add(new CityInfo("青川县", "510822"));
        district_030184.add(new CityInfo("剑阁县", "510823"));
        district_030184.add(new CityInfo("苍溪县", "510824"));
        listDistrict_0320.add(district_030184);
        /**
         *四川省 - 遂宁市
         */
        ArrayList<CityInfo> district_030185 = new ArrayList<>();
        district_030185.add(new CityInfo("市辖区", "510901"));
        district_030185.add(new CityInfo("船山区", "510903"));
        district_030185.add(new CityInfo("安居区", "510904"));
        district_030185.add(new CityInfo("蓬溪县", "510921"));
        district_030185.add(new CityInfo("射洪县", "510922"));
        district_030185.add(new CityInfo("大英县", "510923"));
        listDistrict_0320.add(district_030185);
        /**
         *四川省 - 内江市
         */
        ArrayList<CityInfo> district_030186 = new ArrayList<>();
        district_030186.add(new CityInfo("市辖区", "511001"));
        district_030186.add(new CityInfo("市中区", "511002"));
        district_030186.add(new CityInfo("东兴区", "511011"));
        district_030186.add(new CityInfo("威远县", "511024"));
        district_030186.add(new CityInfo("资中县", "511025"));
        district_030186.add(new CityInfo("隆昌县", "511028"));
        listDistrict_0320.add(district_030186);
        /**
         *四川省 - 乐山市
         */
        ArrayList<CityInfo> district_030187 = new ArrayList<>();
        district_030187.add(new CityInfo("市辖区", "511101"));
        district_030187.add(new CityInfo("市中区", "511102"));
        district_030187.add(new CityInfo("沙湾区", "511111"));
        district_030187.add(new CityInfo("五通桥区", "511112"));
        district_030187.add(new CityInfo("金口河区", "511113"));
        district_030187.add(new CityInfo("犍为县", "511123"));
        district_030187.add(new CityInfo("井研县", "511124"));
        district_030187.add(new CityInfo("夹江县", "511126"));
        district_030187.add(new CityInfo("沐川县", "511129"));
        district_030187.add(new CityInfo("峨边彝族自治县", "511132"));
        district_030187.add(new CityInfo("马边彝族自治县", "511133"));
        district_030187.add(new CityInfo("峨眉山市", "511181"));
        listDistrict_0320.add(district_030187);
        /**
         *四川省 - 南充市
         */
        ArrayList<CityInfo> district_030188 = new ArrayList<>();
        district_030188.add(new CityInfo("市辖区", "511301"));
        district_030188.add(new CityInfo("顺庆区", "511302"));
        district_030188.add(new CityInfo("高坪区", "511303"));
        district_030188.add(new CityInfo("嘉陵区", "511304"));
        district_030188.add(new CityInfo("南部县", "511321"));
        district_030188.add(new CityInfo("营山县", "511322"));
        district_030188.add(new CityInfo("蓬安县", "511323"));
        district_030188.add(new CityInfo("仪陇县", "511324"));
        district_030188.add(new CityInfo("西充县", "511325"));
        district_030188.add(new CityInfo("阆中市", "511381"));
        listDistrict_0320.add(district_030188);
        /**
         *四川省 - 眉山市
         */
        ArrayList<CityInfo> district_030189 = new ArrayList<>();
        district_030189.add(new CityInfo("市辖区", "511401"));
        district_030189.add(new CityInfo("东坡区", "511402"));
        district_030189.add(new CityInfo("仁寿县", "511421"));
        district_030189.add(new CityInfo("彭山县", "511422"));
        district_030189.add(new CityInfo("洪雅县", "511423"));
        district_030189.add(new CityInfo("丹棱县", "511424"));
        district_030189.add(new CityInfo("青神县", "511425"));
        listDistrict_0320.add(district_030189);
        /**
         *四川省 - 宜宾市
         */
        ArrayList<CityInfo> district_030190 = new ArrayList<>();
        district_030190.add(new CityInfo("市辖区", "511501"));
        district_030190.add(new CityInfo("翠屏区", "511502"));
        district_030190.add(new CityInfo("宜宾县", "511521"));
        district_030190.add(new CityInfo("南溪县", "511522"));
        district_030190.add(new CityInfo("江安县", "511523"));
        district_030190.add(new CityInfo("长宁县", "511524"));
        district_030190.add(new CityInfo("高　县", "511525"));
        district_030190.add(new CityInfo("珙　县", "511526"));
        district_030190.add(new CityInfo("筠连县", "511527"));
        district_030190.add(new CityInfo("兴文县", "511528"));
        district_030190.add(new CityInfo("屏山县", "511529"));
        listDistrict_0320.add(district_030190);
        /**
         *四川省 - 广安市
         */
        ArrayList<CityInfo> district_030191 = new ArrayList<>();
        district_030191.add(new CityInfo("市辖区", "511601"));
        district_030191.add(new CityInfo("广安区", "511602"));
        district_030191.add(new CityInfo("岳池县", "511621"));
        district_030191.add(new CityInfo("武胜县", "511622"));
        district_030191.add(new CityInfo("邻水县", "511623"));
        district_030191.add(new CityInfo("华莹市", "511681"));
        listDistrict_0320.add(district_030191);
        /**
         *四川省 - 达州市
         */
        ArrayList<CityInfo> district_030192 = new ArrayList<>();
        district_030192.add(new CityInfo("市辖区", "511701"));
        district_030192.add(new CityInfo("通川区", "511702"));
        district_030192.add(new CityInfo("达　县", "511721"));
        district_030192.add(new CityInfo("宣汉县", "511722"));
        district_030192.add(new CityInfo("开江县", "511723"));
        district_030192.add(new CityInfo("大竹县", "511724"));
        district_030192.add(new CityInfo("渠　县", "511725"));
        district_030192.add(new CityInfo("万源市", "511781"));
        listDistrict_0320.add(district_030192);
        /**
         *四川省 - 雅安市
         */
        ArrayList<CityInfo> district_030193 = new ArrayList<>();
        district_030193.add(new CityInfo("市辖区", "511801"));
        district_030193.add(new CityInfo("雨城区", "511802"));
        district_030193.add(new CityInfo("名山县", "511821"));
        district_030193.add(new CityInfo("荥经县", "511822"));
        district_030193.add(new CityInfo("汉源县", "511823"));
        district_030193.add(new CityInfo("石棉县", "511824"));
        district_030193.add(new CityInfo("天全县", "511825"));
        district_030193.add(new CityInfo("芦山县", "511826"));
        district_030193.add(new CityInfo("宝兴县", "511827"));
        listDistrict_0320.add(district_030193);
        /**
         *四川省 - 巴中市
         */
        ArrayList<CityInfo> district_030194 = new ArrayList<>();
        district_030194.add(new CityInfo("市辖区", "511901"));
        district_030194.add(new CityInfo("巴州区", "511902"));
        district_030194.add(new CityInfo("通江县", "511921"));
        district_030194.add(new CityInfo("南江县", "511922"));
        district_030194.add(new CityInfo("平昌县", "511923"));
        listDistrict_0320.add(district_030194);
        /**
         *四川省 - 资阳市
         */
        ArrayList<CityInfo> district_030195 = new ArrayList<>();
        district_030195.add(new CityInfo("市辖区", "512001"));
        district_030195.add(new CityInfo("雁江区", "512002"));
        district_030195.add(new CityInfo("安岳县", "512021"));
        district_030195.add(new CityInfo("乐至县", "512022"));
        district_030195.add(new CityInfo("简阳市", "512081"));
        listDistrict_0320.add(district_030195);
        /**
         *四川省 - 阿坝藏族羌族自治州
         */
        ArrayList<CityInfo> district_030196 = new ArrayList<>();
        district_030196.add(new CityInfo("汶川县", "513221"));
        district_030196.add(new CityInfo("理　县", "513222"));
        district_030196.add(new CityInfo("茂　县", "513223"));
        district_030196.add(new CityInfo("松潘县", "513224"));
        district_030196.add(new CityInfo("九寨沟县", "513225"));
        district_030196.add(new CityInfo("金川县", "513226"));
        district_030196.add(new CityInfo("小金县", "513227"));
        district_030196.add(new CityInfo("黑水县", "513228"));
        district_030196.add(new CityInfo("马尔康县", "513229"));
        district_030196.add(new CityInfo("壤塘县", "513230"));
        district_030196.add(new CityInfo("阿坝县", "513231"));
        district_030196.add(new CityInfo("若尔盖县", "513232"));
        district_030196.add(new CityInfo("红原县", "513233"));
        listDistrict_0320.add(district_030196);
        /**
         *四川省 - 甘孜藏族自治州
         */
        ArrayList<CityInfo> district_030197 = new ArrayList<>();
        district_030197.add(new CityInfo("康定县", "513321"));
        district_030197.add(new CityInfo("泸定县", "513322"));
        district_030197.add(new CityInfo("丹巴县", "513323"));
        district_030197.add(new CityInfo("九龙县", "513324"));
        district_030197.add(new CityInfo("雅江县", "513325"));
        district_030197.add(new CityInfo("道孚县", "513326"));
        district_030197.add(new CityInfo("炉霍县", "513327"));
        district_030197.add(new CityInfo("甘孜县", "513328"));
        district_030197.add(new CityInfo("新龙县", "513329"));
        district_030197.add(new CityInfo("德格县", "513330"));
        district_030197.add(new CityInfo("白玉县", "513331"));
        district_030197.add(new CityInfo("石渠县", "513332"));
        district_030197.add(new CityInfo("色达县", "513333"));
        district_030197.add(new CityInfo("理塘县", "513334"));
        district_030197.add(new CityInfo("巴塘县", "513335"));
        district_030197.add(new CityInfo("乡城县", "513336"));
        district_030197.add(new CityInfo("稻城县", "513337"));
        district_030197.add(new CityInfo("得荣县", "513338"));
        listDistrict_0320.add(district_030197);
        /**
         *四川省 - 凉山彝族自治州
         */
        ArrayList<CityInfo> district_030198 = new ArrayList<>();
        district_030198.add(new CityInfo("西昌市", "513401"));
        district_030198.add(new CityInfo("木里藏族自治县", "513422"));
        district_030198.add(new CityInfo("盐源县", "513423"));
        district_030198.add(new CityInfo("德昌县", "513424"));
        district_030198.add(new CityInfo("会理县", "513425"));
        district_030198.add(new CityInfo("会东县", "513426"));
        district_030198.add(new CityInfo("宁南县", "513427"));
        district_030198.add(new CityInfo("普格县", "513428"));
        district_030198.add(new CityInfo("布拖县", "513429"));
        district_030198.add(new CityInfo("金阳县", "513430"));
        district_030198.add(new CityInfo("昭觉县", "513431"));
        district_030198.add(new CityInfo("喜德县", "513432"));
        district_030198.add(new CityInfo("冕宁县", "513433"));
        district_030198.add(new CityInfo("越西县", "513434"));
        district_030198.add(new CityInfo("甘洛县", "513435"));
        district_030198.add(new CityInfo("美姑县", "513436"));
        district_030198.add(new CityInfo("雷波县", "513437"));
        listDistrict_0320.add(district_030198);
        district.add(listDistrict_0320);
        /**
         *贵州省 - 贵阳市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0321 = new ArrayList<>();
        ArrayList<CityInfo> district_030199 = new ArrayList<>();
        district_030199.add(new CityInfo("市辖区", "520101"));
        district_030199.add(new CityInfo("南明区", "520102"));
        district_030199.add(new CityInfo("云岩区", "520103"));
        district_030199.add(new CityInfo("花溪区", "520111"));
        district_030199.add(new CityInfo("乌当区", "520112"));
        district_030199.add(new CityInfo("白云区", "520113"));
        district_030199.add(new CityInfo("小河区", "520114"));
        district_030199.add(new CityInfo("开阳县", "520121"));
        district_030199.add(new CityInfo("息烽县", "520122"));
        district_030199.add(new CityInfo("修文县", "520123"));
        district_030199.add(new CityInfo("清镇市", "520181"));
        listDistrict_0321.add(district_030199);
        /**
         *贵州省 - 六盘水市
         */
        ArrayList<CityInfo> district_030200 = new ArrayList<>();
        district_030200.add(new CityInfo("钟山区", "520201"));
        district_030200.add(new CityInfo("六枝特区", "520203"));
        district_030200.add(new CityInfo("水城县", "520221"));
        district_030200.add(new CityInfo("盘　县", "520222"));
        listDistrict_0321.add(district_030200);
        /**
         *贵州省 - 遵义市
         */
        ArrayList<CityInfo> district_030201 = new ArrayList<>();
        district_030201.add(new CityInfo("市辖区", "520301"));
        district_030201.add(new CityInfo("红花岗区", "520302"));
        district_030201.add(new CityInfo("汇川区", "520303"));
        district_030201.add(new CityInfo("遵义县", "520321"));
        district_030201.add(new CityInfo("桐梓县", "520322"));
        district_030201.add(new CityInfo("绥阳县", "520323"));
        district_030201.add(new CityInfo("正安县", "520324"));
        district_030201.add(new CityInfo("道真仡佬族苗族自治县", "520325"));
        district_030201.add(new CityInfo("务川仡佬族苗族自治县", "520326"));
        district_030201.add(new CityInfo("凤冈县", "520327"));
        district_030201.add(new CityInfo("湄潭县", "520328"));
        district_030201.add(new CityInfo("余庆县", "520329"));
        district_030201.add(new CityInfo("习水县", "520330"));
        district_030201.add(new CityInfo("赤水市", "520381"));
        district_030201.add(new CityInfo("仁怀市", "520382"));
        listDistrict_0321.add(district_030201);
        /**
         *贵州省 - 安顺市
         */
        ArrayList<CityInfo> district_030202 = new ArrayList<>();
        district_030202.add(new CityInfo("市辖区", "520401"));
        district_030202.add(new CityInfo("西秀区", "520402"));
        district_030202.add(new CityInfo("平坝县", "520421"));
        district_030202.add(new CityInfo("普定县", "520422"));
        district_030202.add(new CityInfo("镇宁布依族苗族自治县", "520423"));
        district_030202.add(new CityInfo("关岭布依族苗族自治县", "520424"));
        district_030202.add(new CityInfo("紫云苗族布依族自治县", "520425"));
        listDistrict_0321.add(district_030202);
        /**
         *贵州省 - 铜仁地区
         */
        ArrayList<CityInfo> district_030203 = new ArrayList<>();
        district_030203.add(new CityInfo("铜仁市", "522201"));
        district_030203.add(new CityInfo("江口县", "522222"));
        district_030203.add(new CityInfo("玉屏侗族自治县", "522223"));
        district_030203.add(new CityInfo("石阡县", "522224"));
        district_030203.add(new CityInfo("思南县", "522225"));
        district_030203.add(new CityInfo("印江土家族苗族自治县", "522226"));
        district_030203.add(new CityInfo("德江县", "522227"));
        district_030203.add(new CityInfo("沿河土家族自治县", "522228"));
        district_030203.add(new CityInfo("松桃苗族自治县", "522229"));
        district_030203.add(new CityInfo("万山特区", "522230"));
        listDistrict_0321.add(district_030203);
        /**
         *贵州省 - 黔西南布依族苗族自治州
         */
        ArrayList<CityInfo> district_030204 = new ArrayList<>();
        district_030204.add(new CityInfo("兴义市", "522301"));
        district_030204.add(new CityInfo("兴仁县", "522322"));
        district_030204.add(new CityInfo("普安县", "522323"));
        district_030204.add(new CityInfo("晴隆县", "522324"));
        district_030204.add(new CityInfo("贞丰县", "522325"));
        district_030204.add(new CityInfo("望谟县", "522326"));
        district_030204.add(new CityInfo("册亨县", "522327"));
        district_030204.add(new CityInfo("安龙县", "522328"));
        listDistrict_0321.add(district_030204);
        /**
         *贵州省 - 毕节地区
         */
        ArrayList<CityInfo> district_030205 = new ArrayList<>();
        district_030205.add(new CityInfo("毕节市", "522401"));
        district_030205.add(new CityInfo("大方县", "522422"));
        district_030205.add(new CityInfo("黔西县", "522423"));
        district_030205.add(new CityInfo("金沙县", "522424"));
        district_030205.add(new CityInfo("织金县", "522425"));
        district_030205.add(new CityInfo("纳雍县", "522426"));
        district_030205.add(new CityInfo("威宁彝族回族苗族自治县", "522427"));
        district_030205.add(new CityInfo("赫章县", "522428"));
        listDistrict_0321.add(district_030205);
        /**
         *贵州省 - 黔东南苗族侗族自治州
         */
        ArrayList<CityInfo> district_030206 = new ArrayList<>();
        district_030206.add(new CityInfo("凯里市", "522601"));
        district_030206.add(new CityInfo("黄平县", "522622"));
        district_030206.add(new CityInfo("施秉县", "522623"));
        district_030206.add(new CityInfo("三穗县", "522624"));
        district_030206.add(new CityInfo("镇远县", "522625"));
        district_030206.add(new CityInfo("岑巩县", "522626"));
        district_030206.add(new CityInfo("天柱县", "522627"));
        district_030206.add(new CityInfo("锦屏县", "522628"));
        district_030206.add(new CityInfo("剑河县", "522629"));
        district_030206.add(new CityInfo("台江县", "522630"));
        district_030206.add(new CityInfo("黎平县", "522631"));
        district_030206.add(new CityInfo("榕江县", "522632"));
        district_030206.add(new CityInfo("从江县", "522633"));
        district_030206.add(new CityInfo("雷山县", "522634"));
        district_030206.add(new CityInfo("麻江县", "522635"));
        district_030206.add(new CityInfo("丹寨县", "522636"));
        listDistrict_0321.add(district_030206);
        /**
         *贵州省 - 黔南布依族苗族自治州
         */
        ArrayList<CityInfo> district_030207 = new ArrayList<>();
        district_030207.add(new CityInfo("都匀市", "522701"));
        district_030207.add(new CityInfo("福泉市", "522702"));
        district_030207.add(new CityInfo("荔波县", "522722"));
        district_030207.add(new CityInfo("贵定县", "522723"));
        district_030207.add(new CityInfo("瓮安县", "522725"));
        district_030207.add(new CityInfo("独山县", "522726"));
        district_030207.add(new CityInfo("平塘县", "522727"));
        district_030207.add(new CityInfo("罗甸县", "522728"));
        district_030207.add(new CityInfo("长顺县", "522729"));
        district_030207.add(new CityInfo("龙里县", "522730"));
        district_030207.add(new CityInfo("惠水县", "522731"));
        district_030207.add(new CityInfo("三都水族自治县", "522732"));
        listDistrict_0321.add(district_030207);
        district.add(listDistrict_0321);
    }

    void getYunNan() {
        /**
         *云南省 - 昆明市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0322 = new ArrayList<>();
        ArrayList<CityInfo> district_030208 = new ArrayList<>();
        district_030208.add(new CityInfo("市辖区", "530101"));
        district_030208.add(new CityInfo("五华区", "530102"));
        district_030208.add(new CityInfo("盘龙区", "530103"));
        district_030208.add(new CityInfo("官渡区", "530111"));
        district_030208.add(new CityInfo("西山区", "530112"));
        district_030208.add(new CityInfo("东川区", "530113"));
        district_030208.add(new CityInfo("呈贡县", "530121"));
        district_030208.add(new CityInfo("晋宁县", "530122"));
        district_030208.add(new CityInfo("富民县", "530124"));
        district_030208.add(new CityInfo("宜良县", "530125"));
        district_030208.add(new CityInfo("石林彝族自治县", "530126"));
        district_030208.add(new CityInfo("嵩明县", "530127"));
        district_030208.add(new CityInfo("禄劝彝族苗族自治县", "530128"));
        district_030208.add(new CityInfo("寻甸回族彝族自治县", "530129"));
        district_030208.add(new CityInfo("安宁市", "530181"));
        listDistrict_0322.add(district_030208);
        /**
         *云南省 - 曲靖市
         */
        ArrayList<CityInfo> district_030209 = new ArrayList<>();
        district_030209.add(new CityInfo("市辖区", "530301"));
        district_030209.add(new CityInfo("麒麟区", "530302"));
        district_030209.add(new CityInfo("马龙县", "530321"));
        district_030209.add(new CityInfo("陆良县", "530322"));
        district_030209.add(new CityInfo("师宗县", "530323"));
        district_030209.add(new CityInfo("罗平县", "530324"));
        district_030209.add(new CityInfo("富源县", "530325"));
        district_030209.add(new CityInfo("会泽县", "530326"));
        district_030209.add(new CityInfo("沾益县", "530328"));
        district_030209.add(new CityInfo("宣威市", "530381"));
        listDistrict_0322.add(district_030209);
        /**
         *云南省 - 玉溪市
         */
        ArrayList<CityInfo> district_030210 = new ArrayList<>();
        district_030210.add(new CityInfo("市辖区", "530401"));
        district_030210.add(new CityInfo("红塔区", "530402"));
        district_030210.add(new CityInfo("江川县", "530421"));
        district_030210.add(new CityInfo("澄江县", "530422"));
        district_030210.add(new CityInfo("通海县", "530423"));
        district_030210.add(new CityInfo("华宁县", "530424"));
        district_030210.add(new CityInfo("易门县", "530425"));
        district_030210.add(new CityInfo("峨山彝族自治县", "530426"));
        district_030210.add(new CityInfo("新平彝族傣族自治县", "530427"));
        district_030210.add(new CityInfo("元江哈尼族彝族傣族自治县", "530428"));
        listDistrict_0322.add(district_030210);
        /**
         *云南省 - 保山市
         */
        ArrayList<CityInfo> district_030211 = new ArrayList<>();
        district_030211.add(new CityInfo("市辖区", "530501"));
        district_030211.add(new CityInfo("隆阳区", "530502"));
        district_030211.add(new CityInfo("施甸县", "530521"));
        district_030211.add(new CityInfo("腾冲县", "530522"));
        district_030211.add(new CityInfo("龙陵县", "530523"));
        district_030211.add(new CityInfo("昌宁县", "530524"));
        listDistrict_0322.add(district_030211);
        /**
         *云南省 - 昭通市
         */
        ArrayList<CityInfo> district_030212 = new ArrayList<>();
        district_030212.add(new CityInfo("市辖区", "530601"));
        district_030212.add(new CityInfo("昭阳区", "530602"));
        district_030212.add(new CityInfo("鲁甸县", "530621"));
        district_030212.add(new CityInfo("巧家县", "530622"));
        district_030212.add(new CityInfo("盐津县", "530623"));
        district_030212.add(new CityInfo("大关县", "530624"));
        district_030212.add(new CityInfo("永善县", "530625"));
        district_030212.add(new CityInfo("绥江县", "530626"));
        district_030212.add(new CityInfo("镇雄县", "530627"));
        district_030212.add(new CityInfo("彝良县", "530628"));
        district_030212.add(new CityInfo("威信县", "530629"));
        district_030212.add(new CityInfo("水富县", "530630"));
        listDistrict_0322.add(district_030212);
        /**
         *云南省 - 丽江市
         */
        ArrayList<CityInfo> district_030213 = new ArrayList<>();
        district_030213.add(new CityInfo("市辖区", "530701"));
        district_030213.add(new CityInfo("古城区", "530702"));
        district_030213.add(new CityInfo("玉龙纳西族自治县", "530721"));
        district_030213.add(new CityInfo("永胜县", "530722"));
        district_030213.add(new CityInfo("华坪县", "530723"));
        district_030213.add(new CityInfo("宁蒗彝族自治县", "530724"));
        listDistrict_0322.add(district_030213);
        /**
         *云南省 - 思茅市
         */
        ArrayList<CityInfo> district_030214 = new ArrayList<>();
        district_030214.add(new CityInfo("市辖区", "530801"));
        district_030214.add(new CityInfo("翠云区", "530802"));
        district_030214.add(new CityInfo("普洱哈尼族彝族自治县", "530821"));
        district_030214.add(new CityInfo("墨江哈尼族自治县", "530822"));
        district_030214.add(new CityInfo("景东彝族自治县", "530823"));
        district_030214.add(new CityInfo("景谷傣族彝族自治县", "530824"));
        district_030214.add(new CityInfo("镇沅彝族哈尼族拉祜族自治县", "530825"));
        district_030214.add(new CityInfo("江城哈尼族彝族自治县", "530826"));
        district_030214.add(new CityInfo("孟连傣族拉祜族佤族自治县", "530827"));
        district_030214.add(new CityInfo("澜沧拉祜族自治县", "530828"));
        district_030214.add(new CityInfo("西盟佤族自治县", "530829"));
        listDistrict_0322.add(district_030214);
        /**
         *云南省 - 临沧市
         */
        ArrayList<CityInfo> district_030215 = new ArrayList<>();
        district_030215.add(new CityInfo("市辖区", "530901"));
        district_030215.add(new CityInfo("临翔区", "530902"));
        district_030215.add(new CityInfo("凤庆县", "530921"));
        district_030215.add(new CityInfo("云　县", "530922"));
        district_030215.add(new CityInfo("永德县", "530923"));
        district_030215.add(new CityInfo("镇康县", "530924"));
        district_030215.add(new CityInfo("双江拉祜族佤族布朗族傣族自治县", "530925"));
        district_030215.add(new CityInfo("耿马傣族佤族自治县", "530926"));
        district_030215.add(new CityInfo("沧源佤族自治县", "530927"));
        listDistrict_0322.add(district_030215);
        /**
         *云南省 - 楚雄彝族自治州
         */
        ArrayList<CityInfo> district_030216 = new ArrayList<>();
        district_030216.add(new CityInfo("楚雄市", "532301"));
        district_030216.add(new CityInfo("双柏县", "532322"));
        district_030216.add(new CityInfo("牟定县", "532323"));
        district_030216.add(new CityInfo("南华县", "532324"));
        district_030216.add(new CityInfo("姚安县", "532325"));
        district_030216.add(new CityInfo("大姚县", "532326"));
        district_030216.add(new CityInfo("永仁县", "532327"));
        district_030216.add(new CityInfo("元谋县", "532328"));
        district_030216.add(new CityInfo("武定县", "532329"));
        district_030216.add(new CityInfo("禄丰县", "532331"));
        listDistrict_0322.add(district_030216);
        /**
         *云南省 - 红河哈尼族彝族自治州
         */
        ArrayList<CityInfo> district_030217 = new ArrayList<>();
        district_030217.add(new CityInfo("个旧市", "532501"));
        district_030217.add(new CityInfo("开远市", "532502"));
        district_030217.add(new CityInfo("蒙自县", "532522"));
        district_030217.add(new CityInfo("屏边苗族自治县", "532523"));
        district_030217.add(new CityInfo("建水县", "532524"));
        district_030217.add(new CityInfo("石屏县", "532525"));
        district_030217.add(new CityInfo("弥勒县", "532526"));
        district_030217.add(new CityInfo("泸西县", "532527"));
        district_030217.add(new CityInfo("元阳县", "532528"));
        district_030217.add(new CityInfo("红河县", "532529"));
        district_030217.add(new CityInfo("金平苗族瑶族傣族自治县", "532530"));
        district_030217.add(new CityInfo("绿春县", "532531"));
        district_030217.add(new CityInfo("河口瑶族自治县", "532532"));
        listDistrict_0322.add(district_030217);
        /**
         *云南省 - 文山壮族苗族自治州
         */
        ArrayList<CityInfo> district_030218 = new ArrayList<>();
        district_030218.add(new CityInfo("文山县", "532621"));
        district_030218.add(new CityInfo("砚山县", "532622"));
        district_030218.add(new CityInfo("西畴县", "532623"));
        district_030218.add(new CityInfo("麻栗坡县", "532624"));
        district_030218.add(new CityInfo("马关县", "532625"));
        district_030218.add(new CityInfo("丘北县", "532626"));
        district_030218.add(new CityInfo("广南县", "532627"));
        district_030218.add(new CityInfo("富宁县", "532628"));
        listDistrict_0322.add(district_030218);
        /**
         *云南省 - 西双版纳傣族自治州
         */
        ArrayList<CityInfo> district_030219 = new ArrayList<>();
        district_030219.add(new CityInfo("景洪市", "532801"));
        district_030219.add(new CityInfo("勐海县", "532822"));
        district_030219.add(new CityInfo("勐腊县", "532823"));
        listDistrict_0322.add(district_030219);
        /**
         *云南省 - 大理白族自治州
         */
        ArrayList<CityInfo> district_030220 = new ArrayList<>();
        district_030220.add(new CityInfo("大理市", "532901"));
        district_030220.add(new CityInfo("漾濞彝族自治县", "532922"));
        district_030220.add(new CityInfo("祥云县", "532923"));
        district_030220.add(new CityInfo("宾川县", "532924"));
        district_030220.add(new CityInfo("弥渡县", "532925"));
        district_030220.add(new CityInfo("南涧彝族自治县", "532926"));
        district_030220.add(new CityInfo("巍山彝族回族自治县", "532927"));
        district_030220.add(new CityInfo("永平县", "532928"));
        district_030220.add(new CityInfo("云龙县", "532929"));
        district_030220.add(new CityInfo("洱源县", "532930"));
        district_030220.add(new CityInfo("剑川县", "532931"));
        district_030220.add(new CityInfo("鹤庆县", "532932"));
        listDistrict_0322.add(district_030220);
        /**
         *云南省 - 德宏傣族景颇族自治州
         */
        ArrayList<CityInfo> district_030221 = new ArrayList<>();
        district_030221.add(new CityInfo("瑞丽市", "533102"));
        district_030221.add(new CityInfo("潞西市", "533103"));
        district_030221.add(new CityInfo("梁河县", "533122"));
        district_030221.add(new CityInfo("盈江县", "533123"));
        district_030221.add(new CityInfo("陇川县", "533124"));
        listDistrict_0322.add(district_030221);
        /**
         *云南省 - 怒江傈僳族自治州
         */
        ArrayList<CityInfo> district_030222 = new ArrayList<>();
        district_030222.add(new CityInfo("泸水县", "533321"));
        district_030222.add(new CityInfo("福贡县", "533323"));
        district_030222.add(new CityInfo("贡山独龙族怒族自治县", "533324"));
        district_030222.add(new CityInfo("兰坪白族普米族自治县", "533325"));
        listDistrict_0322.add(district_030222);
        /**
         *云南省 - 迪庆藏族自治州
         */
        ArrayList<CityInfo> district_030223 = new ArrayList<>();
        district_030223.add(new CityInfo("香格里拉县", "533421"));
        district_030223.add(new CityInfo("德钦县", "533422"));
        district_030223.add(new CityInfo("维西傈僳族自治县", "533423"));
        listDistrict_0322.add(district_030223);
        district.add(listDistrict_0322);
        /**
         *陕西省 - 西安市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0323 = new ArrayList<>();
        ArrayList<CityInfo> district_030224 = new ArrayList<>();
        district_030224.add(new CityInfo("市辖区", "610101"));
        district_030224.add(new CityInfo("新城区", "610102"));
        district_030224.add(new CityInfo("碑林区", "610103"));
        district_030224.add(new CityInfo("莲湖区", "610104"));
        district_030224.add(new CityInfo("灞桥区", "610111"));
        district_030224.add(new CityInfo("未央区", "610112"));
        district_030224.add(new CityInfo("雁塔区", "610113"));
        district_030224.add(new CityInfo("阎良区", "610114"));
        district_030224.add(new CityInfo("临潼区", "610115"));
        district_030224.add(new CityInfo("长安区", "610116"));
        district_030224.add(new CityInfo("蓝田县", "610122"));
        district_030224.add(new CityInfo("周至县", "610124"));
        district_030224.add(new CityInfo("户　县", "610125"));
        district_030224.add(new CityInfo("高陵县", "610126"));
        listDistrict_0323.add(district_030224);
        /**
         *陕西省 - 铜川市
         */
        ArrayList<CityInfo> district_030225 = new ArrayList<>();
        district_030225.add(new CityInfo("市辖区", "610201"));
        district_030225.add(new CityInfo("王益区", "610202"));
        district_030225.add(new CityInfo("印台区", "610203"));
        district_030225.add(new CityInfo("耀州区", "610204"));
        district_030225.add(new CityInfo("宜君县", "610222"));
        listDistrict_0323.add(district_030225);
        /**
         *陕西省 - 宝鸡市
         */
        ArrayList<CityInfo> district_030226 = new ArrayList<>();
        district_030226.add(new CityInfo("市辖区", "610301"));
        district_030226.add(new CityInfo("渭滨区", "610302"));
        district_030226.add(new CityInfo("金台区", "610303"));
        district_030226.add(new CityInfo("陈仓区", "610304"));
        district_030226.add(new CityInfo("凤翔县", "610322"));
        district_030226.add(new CityInfo("岐山县", "610323"));
        district_030226.add(new CityInfo("扶风县", "610324"));
        district_030226.add(new CityInfo("眉　县", "610326"));
        district_030226.add(new CityInfo("陇　县", "610327"));
        district_030226.add(new CityInfo("千阳县", "610328"));
        district_030226.add(new CityInfo("麟游县", "610329"));
        district_030226.add(new CityInfo("凤　县", "610330"));
        district_030226.add(new CityInfo("太白县", "610331"));
        listDistrict_0323.add(district_030226);
        /**
         *陕西省 - 咸阳市
         */
        ArrayList<CityInfo> district_030227 = new ArrayList<>();
        district_030227.add(new CityInfo("市辖区", "610401"));
        district_030227.add(new CityInfo("秦都区", "610402"));
        district_030227.add(new CityInfo("杨凌区", "610403"));
        district_030227.add(new CityInfo("渭城区", "610404"));
        district_030227.add(new CityInfo("三原县", "610422"));
        district_030227.add(new CityInfo("泾阳县", "610423"));
        district_030227.add(new CityInfo("乾　县", "610424"));
        district_030227.add(new CityInfo("礼泉县", "610425"));
        district_030227.add(new CityInfo("永寿县", "610426"));
        district_030227.add(new CityInfo("彬　县", "610427"));
        district_030227.add(new CityInfo("长武县", "610428"));
        district_030227.add(new CityInfo("旬邑县", "610429"));
        district_030227.add(new CityInfo("淳化县", "610430"));
        district_030227.add(new CityInfo("武功县", "610431"));
        district_030227.add(new CityInfo("兴平市", "610481"));
        listDistrict_0323.add(district_030227);
        /**
         *陕西省 - 渭南市
         */
        ArrayList<CityInfo> district_030228 = new ArrayList<>();
        district_030228.add(new CityInfo("市辖区", "610501"));
        district_030228.add(new CityInfo("临渭区", "610502"));
        district_030228.add(new CityInfo("华　县", "610521"));
        district_030228.add(new CityInfo("潼关县", "610522"));
        district_030228.add(new CityInfo("大荔县", "610523"));
        district_030228.add(new CityInfo("合阳县", "610524"));
        district_030228.add(new CityInfo("澄城县", "610525"));
        district_030228.add(new CityInfo("蒲城县", "610526"));
        district_030228.add(new CityInfo("白水县", "610527"));
        district_030228.add(new CityInfo("富平县", "610528"));
        district_030228.add(new CityInfo("韩城市", "610581"));
        district_030228.add(new CityInfo("华阴市", "610582"));
        listDistrict_0323.add(district_030228);
        /**
         *陕西省 - 延安市
         */
        ArrayList<CityInfo> district_030229 = new ArrayList<>();
        district_030229.add(new CityInfo("市辖区", "610601"));
        district_030229.add(new CityInfo("宝塔区", "610602"));
        district_030229.add(new CityInfo("延长县", "610621"));
        district_030229.add(new CityInfo("延川县", "610622"));
        district_030229.add(new CityInfo("子长县", "610623"));
        district_030229.add(new CityInfo("安塞县", "610624"));
        district_030229.add(new CityInfo("志丹县", "610625"));
        district_030229.add(new CityInfo("吴旗县", "610626"));
        district_030229.add(new CityInfo("甘泉县", "610627"));
        district_030229.add(new CityInfo("富　县", "610628"));
        district_030229.add(new CityInfo("洛川县", "610629"));
        district_030229.add(new CityInfo("宜川县", "610630"));
        district_030229.add(new CityInfo("黄龙县", "610631"));
        district_030229.add(new CityInfo("黄陵县", "610632"));
        listDistrict_0323.add(district_030229);
        /**
         *陕西省 - 汉中市
         */
        ArrayList<CityInfo> district_030230 = new ArrayList<>();
        district_030230.add(new CityInfo("市辖区", "610701"));
        district_030230.add(new CityInfo("汉台区", "610702"));
        district_030230.add(new CityInfo("南郑县", "610721"));
        district_030230.add(new CityInfo("城固县", "610722"));
        district_030230.add(new CityInfo("洋　县", "610723"));
        district_030230.add(new CityInfo("西乡县", "610724"));
        district_030230.add(new CityInfo("勉　县", "610725"));
        district_030230.add(new CityInfo("宁强县", "610726"));
        district_030230.add(new CityInfo("略阳县", "610727"));
        district_030230.add(new CityInfo("镇巴县", "610728"));
        district_030230.add(new CityInfo("留坝县", "610729"));
        district_030230.add(new CityInfo("佛坪县", "610730"));
        listDistrict_0323.add(district_030230);
        /**
         *陕西省 - 榆林市
         */
        ArrayList<CityInfo> district_030231 = new ArrayList<>();
        district_030231.add(new CityInfo("市辖区", "610801"));
        district_030231.add(new CityInfo("榆阳区", "610802"));
        district_030231.add(new CityInfo("神木县", "610821"));
        district_030231.add(new CityInfo("府谷县", "610822"));
        district_030231.add(new CityInfo("横山县", "610823"));
        district_030231.add(new CityInfo("靖边县", "610824"));
        district_030231.add(new CityInfo("定边县", "610825"));
        district_030231.add(new CityInfo("绥德县", "610826"));
        district_030231.add(new CityInfo("米脂县", "610827"));
        district_030231.add(new CityInfo("佳　县", "610828"));
        district_030231.add(new CityInfo("吴堡县", "610829"));
        district_030231.add(new CityInfo("清涧县", "610830"));
        district_030231.add(new CityInfo("子洲县", "610831"));
        listDistrict_0323.add(district_030231);
        /**
         *陕西省 - 安康市
         */
        ArrayList<CityInfo> district_030232 = new ArrayList<>();
        district_030232.add(new CityInfo("市辖区", "610901"));
        district_030232.add(new CityInfo("汉滨区", "610902"));
        district_030232.add(new CityInfo("汉阴县", "610921"));
        district_030232.add(new CityInfo("石泉县", "610922"));
        district_030232.add(new CityInfo("宁陕县", "610923"));
        district_030232.add(new CityInfo("紫阳县", "610924"));
        district_030232.add(new CityInfo("岚皋县", "610925"));
        district_030232.add(new CityInfo("平利县", "610926"));
        district_030232.add(new CityInfo("镇坪县", "610927"));
        district_030232.add(new CityInfo("旬阳县", "610928"));
        district_030232.add(new CityInfo("白河县", "610929"));
        listDistrict_0323.add(district_030232);
        /**
         *陕西省 - 商洛市
         */
        ArrayList<CityInfo> district_030233 = new ArrayList<>();
        district_030233.add(new CityInfo("市辖区", "611001"));
        district_030233.add(new CityInfo("商州区", "611002"));
        district_030233.add(new CityInfo("洛南县", "611021"));
        district_030233.add(new CityInfo("丹凤县", "611022"));
        district_030233.add(new CityInfo("商南县", "611023"));
        district_030233.add(new CityInfo("山阳县", "611024"));
        district_030233.add(new CityInfo("镇安县", "611025"));
        district_030233.add(new CityInfo("柞水县", "611026"));
        listDistrict_0323.add(district_030233);
        district.add(listDistrict_0323);
        /**
         *甘肃省 - 兰州市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0324 = new ArrayList<>();
        ArrayList<CityInfo> district_030234 = new ArrayList<>();
        district_030234.add(new CityInfo("市辖区", "620101"));
        district_030234.add(new CityInfo("城关区", "620102"));
        district_030234.add(new CityInfo("七里河区", "620103"));
        district_030234.add(new CityInfo("西固区", "620104"));
        district_030234.add(new CityInfo("安宁区", "620105"));
        district_030234.add(new CityInfo("红古区", "620111"));
        district_030234.add(new CityInfo("永登县", "620121"));
        district_030234.add(new CityInfo("皋兰县", "620122"));
        district_030234.add(new CityInfo("榆中县", "620123"));
        listDistrict_0324.add(district_030234);
        /**
         *甘肃省 - 嘉峪关市
         */
        ArrayList<CityInfo> district_030235 = new ArrayList<>();
        district_030235.add(new CityInfo("市辖区", "620201"));
        listDistrict_0324.add(district_030235);
        /**
         *甘肃省 - 金昌市
         */
        ArrayList<CityInfo> district_030236 = new ArrayList<>();
        district_030236.add(new CityInfo("市辖区", "620301"));
        district_030236.add(new CityInfo("金川区", "620302"));
        district_030236.add(new CityInfo("永昌县", "620321"));
        listDistrict_0324.add(district_030236);
        /**
         *甘肃省 - 白银市
         */
        ArrayList<CityInfo> district_030237 = new ArrayList<>();
        district_030237.add(new CityInfo("市辖区", "620401"));
        district_030237.add(new CityInfo("白银区", "620402"));
        district_030237.add(new CityInfo("平川区", "620403"));
        district_030237.add(new CityInfo("靖远县", "620421"));
        district_030237.add(new CityInfo("会宁县", "620422"));
        district_030237.add(new CityInfo("景泰县", "620423"));
        listDistrict_0324.add(district_030237);
        /**
         *甘肃省 - 天水市
         */
        ArrayList<CityInfo> district_030238 = new ArrayList<>();
        district_030238.add(new CityInfo("市辖区", "620501"));
        district_030238.add(new CityInfo("秦城区", "620502"));
        district_030238.add(new CityInfo("北道区", "620503"));
        district_030238.add(new CityInfo("清水县", "620521"));
        district_030238.add(new CityInfo("秦安县", "620522"));
        district_030238.add(new CityInfo("甘谷县", "620523"));
        district_030238.add(new CityInfo("武山县", "620524"));
        district_030238.add(new CityInfo("张家川回族自治县", "620525"));
        listDistrict_0324.add(district_030238);
        /**
         *甘肃省 - 武威市
         */
        ArrayList<CityInfo> district_030239 = new ArrayList<>();
        district_030239.add(new CityInfo("市辖区", "620601"));
        district_030239.add(new CityInfo("凉州区", "620602"));
        district_030239.add(new CityInfo("民勤县", "620621"));
        district_030239.add(new CityInfo("古浪县", "620622"));
        district_030239.add(new CityInfo("天祝藏族自治县", "620623"));
        listDistrict_0324.add(district_030239);
        /**
         *甘肃省 - 张掖市
         */
        ArrayList<CityInfo> district_030240 = new ArrayList<>();
        district_030240.add(new CityInfo("市辖区", "620701"));
        district_030240.add(new CityInfo("甘州区", "620702"));
        district_030240.add(new CityInfo("肃南裕固族自治县", "620721"));
        district_030240.add(new CityInfo("民乐县", "620722"));
        district_030240.add(new CityInfo("临泽县", "620723"));
        district_030240.add(new CityInfo("高台县", "620724"));
        district_030240.add(new CityInfo("山丹县", "620725"));
        listDistrict_0324.add(district_030240);
        /**
         *甘肃省 - 平凉市
         */
        ArrayList<CityInfo> district_030241 = new ArrayList<>();
        district_030241.add(new CityInfo("市辖区", "620801"));
        district_030241.add(new CityInfo("崆峒区", "620802"));
        district_030241.add(new CityInfo("泾川县", "620821"));
        district_030241.add(new CityInfo("灵台县", "620822"));
        district_030241.add(new CityInfo("崇信县", "620823"));
        district_030241.add(new CityInfo("华亭县", "620824"));
        district_030241.add(new CityInfo("庄浪县", "620825"));
        district_030241.add(new CityInfo("静宁县", "620826"));
        listDistrict_0324.add(district_030241);
        /**
         *甘肃省 - 酒泉市
         */
        ArrayList<CityInfo> district_030242 = new ArrayList<>();
        district_030242.add(new CityInfo("市辖区", "620901"));
        district_030242.add(new CityInfo("肃州区", "620902"));
        district_030242.add(new CityInfo("金塔县", "620921"));
        district_030242.add(new CityInfo("安西县", "620922"));
        district_030242.add(new CityInfo("肃北蒙古族自治县", "620923"));
        district_030242.add(new CityInfo("阿克塞哈萨克族自治县", "620924"));
        district_030242.add(new CityInfo("玉门市", "620981"));
        district_030242.add(new CityInfo("敦煌市", "620982"));
        listDistrict_0324.add(district_030242);
        /**
         *甘肃省 - 庆阳市
         */
        ArrayList<CityInfo> district_030243 = new ArrayList<>();
        district_030243.add(new CityInfo("市辖区", "621001"));
        district_030243.add(new CityInfo("西峰区", "621002"));
        district_030243.add(new CityInfo("庆城县", "621021"));
        district_030243.add(new CityInfo("环　县", "621022"));
        district_030243.add(new CityInfo("华池县", "621023"));
        district_030243.add(new CityInfo("合水县", "621024"));
        district_030243.add(new CityInfo("正宁县", "621025"));
        district_030243.add(new CityInfo("宁　县", "621026"));
        district_030243.add(new CityInfo("镇原县", "621027"));
        listDistrict_0324.add(district_030243);
        /**
         *甘肃省 - 定西市
         */
        ArrayList<CityInfo> district_030244 = new ArrayList<>();
        district_030244.add(new CityInfo("市辖区", "621101"));
        district_030244.add(new CityInfo("安定区", "621102"));
        district_030244.add(new CityInfo("通渭县", "621121"));
        district_030244.add(new CityInfo("陇西县", "621122"));
        district_030244.add(new CityInfo("渭源县", "621123"));
        district_030244.add(new CityInfo("临洮县", "621124"));
        district_030244.add(new CityInfo("漳　县", "621125"));
        district_030244.add(new CityInfo("岷　县", "621126"));
        listDistrict_0324.add(district_030244);
        /**
         *甘肃省 - 陇南市
         */
        ArrayList<CityInfo> district_030245 = new ArrayList<>();
        district_030245.add(new CityInfo("市辖区", "621201"));
        district_030245.add(new CityInfo("武都区", "621202"));
        district_030245.add(new CityInfo("成　县", "621221"));
        district_030245.add(new CityInfo("文　县", "621222"));
        district_030245.add(new CityInfo("宕昌县", "621223"));
        district_030245.add(new CityInfo("康　县", "621224"));
        district_030245.add(new CityInfo("西和县", "621225"));
        district_030245.add(new CityInfo("礼　县", "621226"));
        district_030245.add(new CityInfo("徽　县", "621227"));
        district_030245.add(new CityInfo("两当县", "621228"));
        listDistrict_0324.add(district_030245);
        /**
         *甘肃省 - 临夏回族自治州
         */
        ArrayList<CityInfo> district_030246 = new ArrayList<>();
        district_030246.add(new CityInfo("临夏市", "622901"));
        district_030246.add(new CityInfo("临夏县", "622921"));
        district_030246.add(new CityInfo("康乐县", "622922"));
        district_030246.add(new CityInfo("永靖县", "622923"));
        district_030246.add(new CityInfo("广河县", "622924"));
        district_030246.add(new CityInfo("和政县", "622925"));
        district_030246.add(new CityInfo("东乡族自治县", "622926"));
        district_030246.add(new CityInfo("积石山保安族东乡族撒拉族自治县", "622927"));
        listDistrict_0324.add(district_030246);
        /**
         *甘肃省 - 甘南藏族自治州
         */
        ArrayList<CityInfo> district_030247 = new ArrayList<>();
        district_030247.add(new CityInfo("合作市", "623001"));
        district_030247.add(new CityInfo("临潭县", "623021"));
        district_030247.add(new CityInfo("卓尼县", "623022"));
        district_030247.add(new CityInfo("舟曲县", "623023"));
        district_030247.add(new CityInfo("迭部县", "623024"));
        district_030247.add(new CityInfo("玛曲县", "623025"));
        district_030247.add(new CityInfo("碌曲县", "623026"));
        district_030247.add(new CityInfo("夏河县", "623027"));
        listDistrict_0324.add(district_030247);
        district.add(listDistrict_0324);
    }

    void getGangSu() {
        /**
         *青海省 - 西宁市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0325 = new ArrayList<>();
        ArrayList<CityInfo> district_030248 = new ArrayList<>();
        district_030248.add(new CityInfo("市辖区", "630101"));
        district_030248.add(new CityInfo("城东区", "630102"));
        district_030248.add(new CityInfo("城中区", "630103"));
        district_030248.add(new CityInfo("城西区", "630104"));
        district_030248.add(new CityInfo("城北区", "630105"));
        district_030248.add(new CityInfo("大通回族土族自治县", "630121"));
        district_030248.add(new CityInfo("湟中县", "630122"));
        district_030248.add(new CityInfo("湟源县", "630123"));
        listDistrict_0325.add(district_030248);
        /**
         *青海省 - 海东地区
         */
        ArrayList<CityInfo> district_030249 = new ArrayList<>();
        district_030249.add(new CityInfo("平安县", "632121"));
        district_030249.add(new CityInfo("民和回族土族自治县", "632122"));
        district_030249.add(new CityInfo("乐都县", "632123"));
        district_030249.add(new CityInfo("互助土族自治县", "632126"));
        district_030249.add(new CityInfo("化隆回族自治县", "632127"));
        district_030249.add(new CityInfo("循化撒拉族自治县", "632128"));
        listDistrict_0325.add(district_030249);
        /**
         *青海省 - 海北藏族自治州
         */
        ArrayList<CityInfo> district_030250 = new ArrayList<>();
        district_030250.add(new CityInfo("门源回族自治县", "632221"));
        district_030250.add(new CityInfo("祁连县", "632222"));
        district_030250.add(new CityInfo("海晏县", "632223"));
        district_030250.add(new CityInfo("刚察县", "632224"));
        listDistrict_0325.add(district_030250);
        /**
         *青海省 - 黄南藏族自治州
         */
        ArrayList<CityInfo> district_030251 = new ArrayList<>();
        district_030251.add(new CityInfo("同仁县", "632321"));
        district_030251.add(new CityInfo("尖扎县", "632322"));
        district_030251.add(new CityInfo("泽库县", "632323"));
        district_030251.add(new CityInfo("河南蒙古族自治县", "632324"));
        listDistrict_0325.add(district_030251);
        /**
         *青海省 - 海南藏族自治州
         */
        ArrayList<CityInfo> district_030252 = new ArrayList<>();
        district_030252.add(new CityInfo("共和县", "632521"));
        district_030252.add(new CityInfo("同德县", "632522"));
        district_030252.add(new CityInfo("贵德县", "632523"));
        district_030252.add(new CityInfo("兴海县", "632524"));
        district_030252.add(new CityInfo("贵南县", "632525"));
        listDistrict_0325.add(district_030252);
        /**
         *青海省 - 果洛藏族自治州
         */
        ArrayList<CityInfo> district_030253 = new ArrayList<>();
        district_030253.add(new CityInfo("玛沁县", "632621"));
        district_030253.add(new CityInfo("班玛县", "632622"));
        district_030253.add(new CityInfo("甘德县", "632623"));
        district_030253.add(new CityInfo("达日县", "632624"));
        district_030253.add(new CityInfo("久治县", "632625"));
        district_030253.add(new CityInfo("玛多县", "632626"));
        listDistrict_0325.add(district_030253);
        /**
         *青海省 - 玉树藏族自治州
         */
        ArrayList<CityInfo> district_030254 = new ArrayList<>();
        district_030254.add(new CityInfo("玉树县", "632721"));
        district_030254.add(new CityInfo("杂多县", "632722"));
        district_030254.add(new CityInfo("称多县", "632723"));
        district_030254.add(new CityInfo("治多县", "632724"));
        district_030254.add(new CityInfo("囊谦县", "632725"));
        district_030254.add(new CityInfo("曲麻莱县", "632726"));
        listDistrict_0325.add(district_030254);
        /**
         *青海省 - 海西蒙古族藏族自治州
         */
        ArrayList<CityInfo> district_030255 = new ArrayList<>();
        district_030255.add(new CityInfo("格尔木市", "632801"));
        district_030255.add(new CityInfo("德令哈市", "632802"));
        district_030255.add(new CityInfo("乌兰县", "632821"));
        district_030255.add(new CityInfo("都兰县", "632822"));
        district_030255.add(new CityInfo("天峻县", "632823"));
        listDistrict_0325.add(district_030255);
        district.add(listDistrict_0325);
        /**
         *黑龙江省 - 哈尔滨市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0326 = new ArrayList<>();
        ArrayList<CityInfo> district_030256 = new ArrayList<>();
        district_030256.add(new CityInfo("市辖区", "230101"));
        district_030256.add(new CityInfo("道里区", "230102"));
        district_030256.add(new CityInfo("南岗区", "230103"));
        district_030256.add(new CityInfo("道外区", "230104"));
        district_030256.add(new CityInfo("香坊区", "230106"));
        district_030256.add(new CityInfo("动力区", "230107"));
        district_030256.add(new CityInfo("平房区", "230108"));
        district_030256.add(new CityInfo("松北区", "230109"));
        district_030256.add(new CityInfo("呼兰区", "230111"));
        district_030256.add(new CityInfo("依兰县", "230123"));
        district_030256.add(new CityInfo("方正县", "230124"));
        district_030256.add(new CityInfo("宾　县", "230125"));
        district_030256.add(new CityInfo("巴彦县", "230126"));
        district_030256.add(new CityInfo("木兰县", "230127"));
        district_030256.add(new CityInfo("通河县", "230128"));
        district_030256.add(new CityInfo("延寿县", "230129"));
        district_030256.add(new CityInfo("阿城市", "230181"));
        district_030256.add(new CityInfo("双城市", "230182"));
        district_030256.add(new CityInfo("尚志市", "230183"));
        district_030256.add(new CityInfo("五常市", "230184"));
        listDistrict_0326.add(district_030256);
        /**
         *黑龙江省 - 齐齐哈尔市
         */
        ArrayList<CityInfo> district_030257 = new ArrayList<>();
        district_030257.add(new CityInfo("市辖区", "230201"));
        district_030257.add(new CityInfo("龙沙区", "230202"));
        district_030257.add(new CityInfo("建华区", "230203"));
        district_030257.add(new CityInfo("铁锋区", "230204"));
        district_030257.add(new CityInfo("昂昂溪区", "230205"));
        district_030257.add(new CityInfo("富拉尔基区", "230206"));
        district_030257.add(new CityInfo("碾子山区", "230207"));
        district_030257.add(new CityInfo("梅里斯达斡尔族区", "230208"));
        district_030257.add(new CityInfo("龙江县", "230221"));
        district_030257.add(new CityInfo("依安县", "230223"));
        district_030257.add(new CityInfo("泰来县", "230224"));
        district_030257.add(new CityInfo("甘南县", "230225"));
        district_030257.add(new CityInfo("富裕县", "230227"));
        district_030257.add(new CityInfo("克山县", "230229"));
        district_030257.add(new CityInfo("克东县", "230230"));
        district_030257.add(new CityInfo("拜泉县", "230231"));
        district_030257.add(new CityInfo("讷河市", "230281"));
        listDistrict_0326.add(district_030257);
        /**
         *黑龙江省 - 鸡西市
         */
        ArrayList<CityInfo> district_030258 = new ArrayList<>();
        district_030258.add(new CityInfo("市辖区", "230301"));
        district_030258.add(new CityInfo("鸡冠区", "230302"));
        district_030258.add(new CityInfo("恒山区", "230303"));
        district_030258.add(new CityInfo("滴道区", "230304"));
        district_030258.add(new CityInfo("梨树区", "230305"));
        district_030258.add(new CityInfo("城子河区", "230306"));
        district_030258.add(new CityInfo("麻山区", "230307"));
        district_030258.add(new CityInfo("鸡东县", "230321"));
        district_030258.add(new CityInfo("虎林市", "230381"));
        district_030258.add(new CityInfo("密山市", "230382"));
        listDistrict_0326.add(district_030258);
        /**
         *黑龙江省 - 鹤岗市
         */
        ArrayList<CityInfo> district_030259 = new ArrayList<>();
        district_030259.add(new CityInfo("市辖区", "230401"));
        district_030259.add(new CityInfo("向阳区", "230402"));
        district_030259.add(new CityInfo("工农区", "230403"));
        district_030259.add(new CityInfo("南山区", "230404"));
        district_030259.add(new CityInfo("兴安区", "230405"));
        district_030259.add(new CityInfo("东山区", "230406"));
        district_030259.add(new CityInfo("兴山区", "230407"));
        district_030259.add(new CityInfo("萝北县", "230421"));
        district_030259.add(new CityInfo("绥滨县", "230422"));
        listDistrict_0326.add(district_030259);
        /**
         *黑龙江省 - 双鸭山市
         */
        ArrayList<CityInfo> district_030260 = new ArrayList<>();
        district_030260.add(new CityInfo("市辖区", "230501"));
        district_030260.add(new CityInfo("尖山区", "230502"));
        district_030260.add(new CityInfo("岭东区", "230503"));
        district_030260.add(new CityInfo("四方台区", "230505"));
        district_030260.add(new CityInfo("宝山区", "230506"));
        district_030260.add(new CityInfo("集贤县", "230521"));
        district_030260.add(new CityInfo("友谊县", "230522"));
        district_030260.add(new CityInfo("宝清县", "230523"));
        district_030260.add(new CityInfo("饶河县", "230524"));
        listDistrict_0326.add(district_030260);
        /**
         *黑龙江省 - 大庆市
         */
        ArrayList<CityInfo> district_030261 = new ArrayList<>();
        district_030261.add(new CityInfo("市辖区", "230601"));
        district_030261.add(new CityInfo("萨尔图区", "230602"));
        district_030261.add(new CityInfo("龙凤区", "230603"));
        district_030261.add(new CityInfo("让胡路区", "230604"));
        district_030261.add(new CityInfo("红岗区", "230605"));
        district_030261.add(new CityInfo("大同区", "230606"));
        district_030261.add(new CityInfo("肇州县", "230621"));
        district_030261.add(new CityInfo("肇源县", "230622"));
        district_030261.add(new CityInfo("林甸县", "230623"));
        district_030261.add(new CityInfo("杜尔伯特蒙古族自治县", "230624"));
        listDistrict_0326.add(district_030261);
        /**
         *黑龙江省 - 伊春市
         */
        ArrayList<CityInfo> district_030262 = new ArrayList<>();
        district_030262.add(new CityInfo("市辖区", "230701"));
        district_030262.add(new CityInfo("伊春区", "230702"));
        district_030262.add(new CityInfo("南岔区", "230703"));
        district_030262.add(new CityInfo("友好区", "230704"));
        district_030262.add(new CityInfo("西林区", "230705"));
        district_030262.add(new CityInfo("翠峦区", "230706"));
        district_030262.add(new CityInfo("新青区", "230707"));
        district_030262.add(new CityInfo("美溪区", "230708"));
        district_030262.add(new CityInfo("金山屯区", "230709"));
        district_030262.add(new CityInfo("五营区", "230710"));
        district_030262.add(new CityInfo("乌马河区", "230711"));
        district_030262.add(new CityInfo("汤旺河区", "230712"));
        district_030262.add(new CityInfo("带岭区", "230713"));
        district_030262.add(new CityInfo("乌伊岭区", "230714"));
        district_030262.add(new CityInfo("红星区", "230715"));
        district_030262.add(new CityInfo("上甘岭区", "230716"));
        district_030262.add(new CityInfo("嘉荫县", "230722"));
        district_030262.add(new CityInfo("铁力市", "230781"));
        listDistrict_0326.add(district_030262);
        /**
         *黑龙江省 - 佳木斯市
         */
        ArrayList<CityInfo> district_030263 = new ArrayList<>();
        district_030263.add(new CityInfo("市辖区", "230801"));
        district_030263.add(new CityInfo("永红区", "230802"));
        district_030263.add(new CityInfo("向阳区", "230803"));
        district_030263.add(new CityInfo("前进区", "230804"));
        district_030263.add(new CityInfo("东风区", "230805"));
        district_030263.add(new CityInfo("郊　区", "230811"));
        district_030263.add(new CityInfo("桦南县", "230822"));
        district_030263.add(new CityInfo("桦川县", "230826"));
        district_030263.add(new CityInfo("汤原县", "230828"));
        district_030263.add(new CityInfo("抚远县", "230833"));
        district_030263.add(new CityInfo("同江市", "230881"));
        district_030263.add(new CityInfo("富锦市", "230882"));
        listDistrict_0326.add(district_030263);
        /**
         *黑龙江省 - 七台河市
         */
        ArrayList<CityInfo> district_030264 = new ArrayList<>();
        district_030264.add(new CityInfo("市辖区", "230901"));
        district_030264.add(new CityInfo("新兴区", "230902"));
        district_030264.add(new CityInfo("桃山区", "230903"));
        district_030264.add(new CityInfo("茄子河区", "230904"));
        district_030264.add(new CityInfo("勃利县", "230921"));
        listDistrict_0326.add(district_030264);
        /**
         *黑龙江省 - 牡丹江市
         */
        ArrayList<CityInfo> district_030265 = new ArrayList<>();
        district_030265.add(new CityInfo("市辖区", "231001"));
        district_030265.add(new CityInfo("东安区", "231002"));
        district_030265.add(new CityInfo("阳明区", "231003"));
        district_030265.add(new CityInfo("爱民区", "231004"));
        district_030265.add(new CityInfo("西安区", "231005"));
        district_030265.add(new CityInfo("东宁县", "231024"));
        district_030265.add(new CityInfo("林口县", "231025"));
        district_030265.add(new CityInfo("绥芬河市", "231081"));
        district_030265.add(new CityInfo("海林市", "231083"));
        district_030265.add(new CityInfo("宁安市", "231084"));
        district_030265.add(new CityInfo("穆棱市", "231085"));
        listDistrict_0326.add(district_030265);
        /**
         *黑龙江省 - 黑河市
         */
        ArrayList<CityInfo> district_030266 = new ArrayList<>();
        district_030266.add(new CityInfo("市辖区", "231101"));
        district_030266.add(new CityInfo("爱辉区", "231102"));
        district_030266.add(new CityInfo("嫩江县", "231121"));
        district_030266.add(new CityInfo("逊克县", "231123"));
        district_030266.add(new CityInfo("孙吴县", "231124"));
        district_030266.add(new CityInfo("北安市", "231181"));
        district_030266.add(new CityInfo("五大连池市", "231182"));
        listDistrict_0326.add(district_030266);
        /**
         *黑龙江省 - 绥化市
         */
        ArrayList<CityInfo> district_030267 = new ArrayList<>();
        district_030267.add(new CityInfo("市辖区", "231201"));
        district_030267.add(new CityInfo("北林区", "231202"));
        district_030267.add(new CityInfo("望奎县", "231221"));
        district_030267.add(new CityInfo("兰西县", "231222"));
        district_030267.add(new CityInfo("青冈县", "231223"));
        district_030267.add(new CityInfo("庆安县", "231224"));
        district_030267.add(new CityInfo("明水县", "231225"));
        district_030267.add(new CityInfo("绥棱县", "231226"));
        district_030267.add(new CityInfo("安达市", "231281"));
        district_030267.add(new CityInfo("肇东市", "231282"));
        district_030267.add(new CityInfo("海伦市", "231283"));
        listDistrict_0326.add(district_030267);
        /**
         *黑龙江省 - 大兴安岭地区
         */
        ArrayList<CityInfo> district_030268 = new ArrayList<>();
        district_030268.add(new CityInfo("呼玛县", "232721"));
        district_030268.add(new CityInfo("塔河县", "232722"));
        district_030268.add(new CityInfo("漠河县", "232723"));
        listDistrict_0326.add(district_030268);
        district.add(listDistrict_0326);
    }

    void getHeiLongJian() {
        /**
         *西藏自治区 - 拉萨市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0327 = new ArrayList<>();
        ArrayList<CityInfo> district_030269 = new ArrayList<>();
        district_030269.add(new CityInfo("市辖区", "540101"));
        district_030269.add(new CityInfo("城关区", "540102"));
        district_030269.add(new CityInfo("林周县", "540121"));
        district_030269.add(new CityInfo("当雄县", "540122"));
        district_030269.add(new CityInfo("尼木县", "540123"));
        district_030269.add(new CityInfo("曲水县", "540124"));
        district_030269.add(new CityInfo("堆龙德庆县", "540125"));
        district_030269.add(new CityInfo("达孜县", "540126"));
        district_030269.add(new CityInfo("墨竹工卡县", "540127"));
        listDistrict_0327.add(district_030269);
        /**
         *西藏自治区 - 昌都地区
         */
        ArrayList<CityInfo> district_030270 = new ArrayList<>();
        district_030270.add(new CityInfo("昌都县", "542121"));
        district_030270.add(new CityInfo("江达县", "542122"));
        district_030270.add(new CityInfo("贡觉县", "542123"));
        district_030270.add(new CityInfo("类乌齐县", "542124"));
        district_030270.add(new CityInfo("丁青县", "542125"));
        district_030270.add(new CityInfo("察雅县", "542126"));
        district_030270.add(new CityInfo("八宿县", "542127"));
        district_030270.add(new CityInfo("左贡县", "542128"));
        district_030270.add(new CityInfo("芒康县", "542129"));
        district_030270.add(new CityInfo("洛隆县", "542132"));
        district_030270.add(new CityInfo("边坝县", "542133"));
        listDistrict_0327.add(district_030270);
        /**
         *西藏自治区 - 山南地区
         */
        ArrayList<CityInfo> district_030271 = new ArrayList<>();
        district_030271.add(new CityInfo("乃东县", "542221"));
        district_030271.add(new CityInfo("扎囊县", "542222"));
        district_030271.add(new CityInfo("贡嘎县", "542223"));
        district_030271.add(new CityInfo("桑日县", "542224"));
        district_030271.add(new CityInfo("琼结县", "542225"));
        district_030271.add(new CityInfo("曲松县", "542226"));
        district_030271.add(new CityInfo("措美县", "542227"));
        district_030271.add(new CityInfo("洛扎县", "542228"));
        district_030271.add(new CityInfo("加查县", "542229"));
        district_030271.add(new CityInfo("隆子县", "542231"));
        district_030271.add(new CityInfo("错那县", "542232"));
        district_030271.add(new CityInfo("浪卡子县", "542233"));
        listDistrict_0327.add(district_030271);
        /**
         *西藏自治区 - 日喀则地区
         */
        ArrayList<CityInfo> district_030272 = new ArrayList<>();
        district_030272.add(new CityInfo("日喀则市", "542301"));
        district_030272.add(new CityInfo("南木林县", "542322"));
        district_030272.add(new CityInfo("江孜县", "542323"));
        district_030272.add(new CityInfo("定日县", "542324"));
        district_030272.add(new CityInfo("萨迦县", "542325"));
        district_030272.add(new CityInfo("拉孜县", "542326"));
        district_030272.add(new CityInfo("昂仁县", "542327"));
        district_030272.add(new CityInfo("谢通门县", "542328"));
        district_030272.add(new CityInfo("白朗县", "542329"));
        district_030272.add(new CityInfo("仁布县", "542330"));
        district_030272.add(new CityInfo("康马县", "542331"));
        district_030272.add(new CityInfo("定结县", "542332"));
        district_030272.add(new CityInfo("仲巴县", "542333"));
        district_030272.add(new CityInfo("亚东县", "542334"));
        district_030272.add(new CityInfo("吉隆县", "542335"));
        district_030272.add(new CityInfo("聂拉木县", "542336"));
        district_030272.add(new CityInfo("萨嘎县", "542337"));
        district_030272.add(new CityInfo("岗巴县", "542338"));
        listDistrict_0327.add(district_030272);
        /**
         *西藏自治区 - 那曲地区
         */
        ArrayList<CityInfo> district_030273 = new ArrayList<>();
        district_030273.add(new CityInfo("那曲县", "542421"));
        district_030273.add(new CityInfo("嘉黎县", "542422"));
        district_030273.add(new CityInfo("比如县", "542423"));
        district_030273.add(new CityInfo("聂荣县", "542424"));
        district_030273.add(new CityInfo("安多县", "542425"));
        district_030273.add(new CityInfo("申扎县", "542426"));
        district_030273.add(new CityInfo("索　县", "542427"));
        district_030273.add(new CityInfo("班戈县", "542428"));
        district_030273.add(new CityInfo("巴青县", "542429"));
        district_030273.add(new CityInfo("尼玛县", "542430"));
        listDistrict_0327.add(district_030273);
        /**
         *西藏自治区 - 阿里地区
         */
        ArrayList<CityInfo> district_030274 = new ArrayList<>();
        district_030274.add(new CityInfo("普兰县", "542521"));
        district_030274.add(new CityInfo("札达县", "542522"));
        district_030274.add(new CityInfo("噶尔县", "542523"));
        district_030274.add(new CityInfo("日土县", "542524"));
        district_030274.add(new CityInfo("革吉县", "542525"));
        district_030274.add(new CityInfo("改则县", "542526"));
        district_030274.add(new CityInfo("措勤县", "542527"));
        listDistrict_0327.add(district_030274);
        /**
         *西藏自治区 - 林芝地区
         */
        ArrayList<CityInfo> district_030275 = new ArrayList<>();
        district_030275.add(new CityInfo("林芝县", "542621"));
        district_030275.add(new CityInfo("工布江达县", "542622"));
        district_030275.add(new CityInfo("米林县", "542623"));
        district_030275.add(new CityInfo("墨脱县", "542624"));
        district_030275.add(new CityInfo("波密县", "542625"));
        district_030275.add(new CityInfo("察隅县", "542626"));
        district_030275.add(new CityInfo("朗　县", "542627"));
        listDistrict_0327.add(district_030275);
        /**
         *内蒙古自治区 - 呼和浩特市
         */
        ArrayList<CityInfo> district_030276 = new ArrayList<>();
        district_030276.add(new CityInfo("市辖区", "150101"));
        district_030276.add(new CityInfo("新城区", "150102"));
        district_030276.add(new CityInfo("回民区", "150103"));
        district_030276.add(new CityInfo("玉泉区", "150104"));
        district_030276.add(new CityInfo("赛罕区", "150105"));
        district_030276.add(new CityInfo("土默特左旗", "150121"));
        district_030276.add(new CityInfo("托克托县", "150122"));
        district_030276.add(new CityInfo("和林格尔县", "150123"));
        district_030276.add(new CityInfo("清水河县", "150124"));
        district_030276.add(new CityInfo("武川县", "150125"));
        listDistrict_0327.add(district_030276);
        /**
         *内蒙古自治区 - 包头市
         */
        ArrayList<CityInfo> district_030277 = new ArrayList<>();
        district_030277.add(new CityInfo("市辖区", "150201"));
        district_030277.add(new CityInfo("东河区", "150202"));
        district_030277.add(new CityInfo("昆都仑区", "150203"));
        district_030277.add(new CityInfo("青山区", "150204"));
        district_030277.add(new CityInfo("石拐区", "150205"));
        district_030277.add(new CityInfo("白云矿区", "150206"));
        district_030277.add(new CityInfo("九原区", "150207"));
        district_030277.add(new CityInfo("土默特右旗", "150221"));
        district_030277.add(new CityInfo("固阳县", "150222"));
        district_030277.add(new CityInfo("达尔罕茂明安联合旗", "150223"));
        listDistrict_0327.add(district_030277);
        /**
         *内蒙古自治区 - 乌海市
         */
        ArrayList<CityInfo> district_030278 = new ArrayList<>();
        district_030278.add(new CityInfo("市辖区", "150301"));
        district_030278.add(new CityInfo("海勃湾区", "150302"));
        district_030278.add(new CityInfo("海南区", "150303"));
        district_030278.add(new CityInfo("乌达区", "150304"));
        listDistrict_0327.add(district_030278);
        /**
         *内蒙古自治区 - 赤峰市
         */
        ArrayList<CityInfo> district_030279 = new ArrayList<>();
        district_030279.add(new CityInfo("市辖区", "150401"));
        district_030279.add(new CityInfo("红山区", "150402"));
        district_030279.add(new CityInfo("元宝山区", "150403"));
        district_030279.add(new CityInfo("松山区", "150404"));
        district_030279.add(new CityInfo("阿鲁科尔沁旗", "150421"));
        district_030279.add(new CityInfo("巴林左旗", "150422"));
        district_030279.add(new CityInfo("巴林右旗", "150423"));
        district_030279.add(new CityInfo("林西县", "150424"));
        district_030279.add(new CityInfo("克什克腾旗", "150425"));
        district_030279.add(new CityInfo("翁牛特旗", "150426"));
        district_030279.add(new CityInfo("喀喇沁旗", "150428"));
        district_030279.add(new CityInfo("宁城县", "150429"));
        district_030279.add(new CityInfo("敖汉旗", "150430"));
        listDistrict_0327.add(district_030279);
        /**
         *内蒙古自治区 - 通辽市
         */
        ArrayList<CityInfo> district_030280 = new ArrayList<>();
        district_030280.add(new CityInfo("市辖区", "150501"));
        district_030280.add(new CityInfo("科尔沁区", "150502"));
        district_030280.add(new CityInfo("科尔沁左翼中旗", "150521"));
        district_030280.add(new CityInfo("科尔沁左翼后旗", "150522"));
        district_030280.add(new CityInfo("开鲁县", "150523"));
        district_030280.add(new CityInfo("库伦旗", "150524"));
        district_030280.add(new CityInfo("奈曼旗", "150525"));
        district_030280.add(new CityInfo("扎鲁特旗", "150526"));
        district_030280.add(new CityInfo("霍林郭勒市", "150581"));
        listDistrict_0327.add(district_030280);
        /**
         *内蒙古自治区 - 鄂尔多斯市
         */
        ArrayList<CityInfo> district_030281 = new ArrayList<>();
        district_030281.add(new CityInfo("东胜区", "150602"));
        district_030281.add(new CityInfo("达拉特旗", "150621"));
        district_030281.add(new CityInfo("准格尔旗", "150622"));
        district_030281.add(new CityInfo("鄂托克前旗", "150623"));
        district_030281.add(new CityInfo("鄂托克旗", "150624"));
        district_030281.add(new CityInfo("杭锦旗", "150625"));
        district_030281.add(new CityInfo("乌审旗", "150626"));
        district_030281.add(new CityInfo("伊金霍洛旗", "150627"));
        listDistrict_0327.add(district_030281);
        /**
         *内蒙古自治区 - 呼伦贝尔市
         */
        ArrayList<CityInfo> district_030282 = new ArrayList<>();
        district_030282.add(new CityInfo("市辖区", "150701"));
        district_030282.add(new CityInfo("海拉尔区", "150702"));
        district_030282.add(new CityInfo("阿荣旗", "150721"));
        district_030282.add(new CityInfo("莫力达瓦达斡尔族自治旗", "150722"));
        district_030282.add(new CityInfo("鄂伦春自治旗", "150723"));
        district_030282.add(new CityInfo("鄂温克族自治旗", "150724"));
        district_030282.add(new CityInfo("陈巴尔虎旗", "150725"));
        district_030282.add(new CityInfo("新巴尔虎左旗", "150726"));
        district_030282.add(new CityInfo("新巴尔虎右旗", "150727"));
        district_030282.add(new CityInfo("满洲里市", "150781"));
        district_030282.add(new CityInfo("牙克石市", "150782"));
        district_030282.add(new CityInfo("扎兰屯市", "150783"));
        district_030282.add(new CityInfo("额尔古纳市", "150784"));
        district_030282.add(new CityInfo("根河市", "150785"));
        listDistrict_0327.add(district_030282);
        /**
         *内蒙古自治区 - 巴彦淖尔市
         */
        ArrayList<CityInfo> district_030283 = new ArrayList<>();
        district_030283.add(new CityInfo("市辖区", "150801"));
        district_030283.add(new CityInfo("临河区", "150802"));
        district_030283.add(new CityInfo("五原县", "150821"));
        district_030283.add(new CityInfo("磴口县", "150822"));
        district_030283.add(new CityInfo("乌拉特前旗", "150823"));
        district_030283.add(new CityInfo("乌拉特中旗", "150824"));
        district_030283.add(new CityInfo("乌拉特后旗", "150825"));
        district_030283.add(new CityInfo("杭锦后旗", "150826"));
        listDistrict_0327.add(district_030283);
        district.add(listDistrict_0327);
        /**
         *内蒙古自治区 - 乌兰察布市
         */
        ArrayList<CityInfo> district_030284 = new ArrayList<>();
        district_030284.add(new CityInfo("市辖区", "150901"));
        district_030284.add(new CityInfo("集宁区", "150902"));
        district_030284.add(new CityInfo("卓资县", "150921"));
        district_030284.add(new CityInfo("化德县", "150922"));
        district_030284.add(new CityInfo("商都县", "150923"));
        district_030284.add(new CityInfo("兴和县", "150924"));
        district_030284.add(new CityInfo("凉城县", "150925"));
        district_030284.add(new CityInfo("察哈尔右翼前旗", "150926"));
        district_030284.add(new CityInfo("察哈尔右翼中旗", "150927"));
        district_030284.add(new CityInfo("察哈尔右翼后旗", "150928"));
        district_030284.add(new CityInfo("四子王旗", "150929"));
        district_030284.add(new CityInfo("丰镇市", "150981"));
        listDistrict_0327.add(district_030284);
        /**
         *内蒙古自治区 - 兴安盟
         */
        ArrayList<CityInfo> district_030285 = new ArrayList<>();
        district_030285.add(new CityInfo("乌兰浩特市", "152201"));
        district_030285.add(new CityInfo("阿尔山市", "152202"));
        district_030285.add(new CityInfo("科尔沁右翼前旗", "152221"));
        district_030285.add(new CityInfo("科尔沁右翼中旗", "152222"));
        district_030285.add(new CityInfo("扎赉特旗", "152223"));
        district_030285.add(new CityInfo("突泉县", "152224"));
        listDistrict_0327.add(district_030285);
        /**
         *内蒙古自治区 - 锡林郭勒盟
         */
        ArrayList<CityInfo> district_030286 = new ArrayList<>();
        district_030286.add(new CityInfo("二连浩特市", "152501"));
        district_030286.add(new CityInfo("锡林浩特市", "152502"));
        district_030286.add(new CityInfo("阿巴嘎旗", "152522"));
        district_030286.add(new CityInfo("苏尼特左旗", "152523"));
        district_030286.add(new CityInfo("苏尼特右旗", "152524"));
        district_030286.add(new CityInfo("东乌珠穆沁旗", "152525"));
        district_030286.add(new CityInfo("西乌珠穆沁旗", "152526"));
        district_030286.add(new CityInfo("太仆寺旗", "152527"));
        district_030286.add(new CityInfo("镶黄旗", "152528"));
        district_030286.add(new CityInfo("正镶白旗", "152529"));
        district_030286.add(new CityInfo("正蓝旗", "152530"));
        district_030286.add(new CityInfo("多伦县", "152531"));
        listDistrict_0327.add(district_030286);
        /**
         *内蒙古自治区 - 阿拉善盟
         */
        ArrayList<CityInfo> district_030287 = new ArrayList<>();
        district_030287.add(new CityInfo("阿拉善左旗", "152921"));
        district_030287.add(new CityInfo("阿拉善右旗", "152922"));
        district_030287.add(new CityInfo("额济纳旗", "152923"));
        listDistrict_0327.add(district_030287);
        district.add(listDistrict_0327);


    }

    void getNeiMengGu() {

        /**
         *宁夏回族自治区 - 银川市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0328 = new ArrayList<>();
        ArrayList<CityInfo> district_030288 = new ArrayList<>();
        district_030288.add(new CityInfo("市辖区", "640101"));
        district_030288.add(new CityInfo("兴庆区", "640104"));
        district_030288.add(new CityInfo("西夏区", "640105"));
        district_030288.add(new CityInfo("金凤区", "640106"));
        district_030288.add(new CityInfo("永宁县", "640121"));
        district_030288.add(new CityInfo("贺兰县", "640122"));
        district_030288.add(new CityInfo("灵武市", "640181"));
        listDistrict_0328.add(district_030288);
        /**
         *宁夏回族自治区 - 石嘴山市
         */
        ArrayList<CityInfo> district_030289 = new ArrayList<>();
        district_030289.add(new CityInfo("市辖区", "640201"));
        district_030289.add(new CityInfo("大武口区", "640202"));
        district_030289.add(new CityInfo("惠农区", "640205"));
        district_030289.add(new CityInfo("平罗县", "640221"));
        listDistrict_0328.add(district_030289);
        /**
         *宁夏回族自治区 - 吴忠市
         */
        ArrayList<CityInfo> district_030290 = new ArrayList<>();
        district_030290.add(new CityInfo("市辖区", "640301"));
        district_030290.add(new CityInfo("利通区", "640302"));
        district_030290.add(new CityInfo("盐池县", "640323"));
        district_030290.add(new CityInfo("同心县", "640324"));
        district_030290.add(new CityInfo("青铜峡市", "640381"));
        listDistrict_0328.add(district_030290);
        /**
         *宁夏回族自治区 - 固原市
         */
        ArrayList<CityInfo> district_030291 = new ArrayList<>();
        district_030291.add(new CityInfo("市辖区", "640401"));
        district_030291.add(new CityInfo("原州区", "640402"));
        district_030291.add(new CityInfo("西吉县", "640422"));
        district_030291.add(new CityInfo("隆德县", "640423"));
        district_030291.add(new CityInfo("泾源县", "640424"));
        district_030291.add(new CityInfo("彭阳县", "640425"));
        listDistrict_0328.add(district_030291);
        /**
         *宁夏回族自治区 - 中卫市
         */
        ArrayList<CityInfo> district_030292 = new ArrayList<>();
        district_030292.add(new CityInfo("市辖区", "640501"));
        district_030292.add(new CityInfo("沙坡头区", "640502"));
        district_030292.add(new CityInfo("中宁县", "640521"));
        district_030292.add(new CityInfo("海原县", "640522"));
        listDistrict_0328.add(district_030292);
        district.add(listDistrict_0328);
        /**
         *广西壮族自治区 - 南宁市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0329 = new ArrayList<>();
        ArrayList<CityInfo> district_030293 = new ArrayList<>();
        district_030293.add(new CityInfo("市辖区", "450101"));
        district_030293.add(new CityInfo("兴宁区", "450102"));
        district_030293.add(new CityInfo("青秀区", "450103"));
        district_030293.add(new CityInfo("江南区", "450105"));
        district_030293.add(new CityInfo("西乡塘区", "450107"));
        district_030293.add(new CityInfo("良庆区", "450108"));
        district_030293.add(new CityInfo("邕宁区", "450109"));
        district_030293.add(new CityInfo("武鸣县", "450122"));
        district_030293.add(new CityInfo("隆安县", "450123"));
        district_030293.add(new CityInfo("马山县", "450124"));
        district_030293.add(new CityInfo("上林县", "450125"));
        district_030293.add(new CityInfo("宾阳县", "450126"));
        district_030293.add(new CityInfo("横　县", "450127"));
        listDistrict_0329.add(district_030293);
        /**
         *广西壮族自治区 - 柳州市
         */
        ArrayList<CityInfo> district_030294 = new ArrayList<>();
        district_030294.add(new CityInfo("市辖区", "450201"));
        district_030294.add(new CityInfo("城中区", "450202"));
        district_030294.add(new CityInfo("鱼峰区", "450203"));
        district_030294.add(new CityInfo("柳南区", "450204"));
        district_030294.add(new CityInfo("柳北区", "450205"));
        district_030294.add(new CityInfo("柳江县", "450221"));
        district_030294.add(new CityInfo("柳城县", "450222"));
        district_030294.add(new CityInfo("鹿寨县", "450223"));
        district_030294.add(new CityInfo("融安县", "450224"));
        district_030294.add(new CityInfo("融水苗族自治县", "450225"));
        district_030294.add(new CityInfo("三江侗族自治县", "450226"));
        listDistrict_0329.add(district_030294);
        /**
         *广西壮族自治区 - 桂林市
         */
        ArrayList<CityInfo> district_030295 = new ArrayList<>();
        district_030295.add(new CityInfo("市辖区", "450301"));
        district_030295.add(new CityInfo("秀峰区", "450302"));
        district_030295.add(new CityInfo("叠彩区", "450303"));
        district_030295.add(new CityInfo("象山区", "450304"));
        district_030295.add(new CityInfo("七星区", "450305"));
        district_030295.add(new CityInfo("雁山区", "450311"));
        district_030295.add(new CityInfo("阳朔县", "450321"));
        district_030295.add(new CityInfo("临桂县", "450322"));
        district_030295.add(new CityInfo("灵川县", "450323"));
        district_030295.add(new CityInfo("全州县", "450324"));
        district_030295.add(new CityInfo("兴安县", "450325"));
        district_030295.add(new CityInfo("永福县", "450326"));
        district_030295.add(new CityInfo("灌阳县", "450327"));
        district_030295.add(new CityInfo("龙胜各族自治县", "450328"));
        district_030295.add(new CityInfo("资源县", "450329"));
        district_030295.add(new CityInfo("平乐县", "450330"));
        district_030295.add(new CityInfo("荔蒲县", "450331"));
        district_030295.add(new CityInfo("恭城瑶族自治县", "450332"));
        listDistrict_0329.add(district_030295);
        /**
         *广西壮族自治区 - 梧州市
         */
        ArrayList<CityInfo> district_030296 = new ArrayList<>();
        district_030296.add(new CityInfo("市辖区", "450401"));
        district_030296.add(new CityInfo("万秀区", "450403"));
        district_030296.add(new CityInfo("蝶山区", "450404"));
        district_030296.add(new CityInfo("长洲区", "450405"));
        district_030296.add(new CityInfo("苍梧县", "450421"));
        district_030296.add(new CityInfo("藤　县", "450422"));
        district_030296.add(new CityInfo("蒙山县", "450423"));
        district_030296.add(new CityInfo("岑溪市", "450481"));
        listDistrict_0329.add(district_030296);
        /**
         *广西壮族自治区 - 北海市
         */
        ArrayList<CityInfo> district_030297 = new ArrayList<>();
        district_030297.add(new CityInfo("市辖区", "450501"));
        district_030297.add(new CityInfo("海城区", "450502"));
        district_030297.add(new CityInfo("银海区", "450503"));
        district_030297.add(new CityInfo("铁山港区", "450512"));
        district_030297.add(new CityInfo("合浦县", "450521"));
        listDistrict_0329.add(district_030297);
        /**
         *广西壮族自治区 - 防城港市
         */
        ArrayList<CityInfo> district_030298 = new ArrayList<>();
        district_030298.add(new CityInfo("市辖区", "450601"));
        district_030298.add(new CityInfo("港口区", "450602"));
        district_030298.add(new CityInfo("防城区", "450603"));
        district_030298.add(new CityInfo("上思县", "450621"));
        district_030298.add(new CityInfo("东兴市", "450681"));
        listDistrict_0329.add(district_030298);
        /**
         *广西壮族自治区 - 钦州市
         */
        ArrayList<CityInfo> district_030299 = new ArrayList<>();
        district_030299.add(new CityInfo("市辖区", "450701"));
        district_030299.add(new CityInfo("钦南区", "450702"));
        district_030299.add(new CityInfo("钦北区", "450703"));
        district_030299.add(new CityInfo("灵山县", "450721"));
        district_030299.add(new CityInfo("浦北县", "450722"));
        listDistrict_0329.add(district_030299);
        /**
         *广西壮族自治区 - 贵港市
         */
        ArrayList<CityInfo> district_030300 = new ArrayList<>();
        district_030300.add(new CityInfo("市辖区", "450801"));
        district_030300.add(new CityInfo("港北区", "450802"));
        district_030300.add(new CityInfo("港南区", "450803"));
        district_030300.add(new CityInfo("覃塘区", "450804"));
        district_030300.add(new CityInfo("平南县", "450821"));
        district_030300.add(new CityInfo("桂平市", "450881"));
        listDistrict_0329.add(district_030300);
        /**
         *广西壮族自治区 - 玉林市
         */
        ArrayList<CityInfo> district_030301 = new ArrayList<>();
        district_030301.add(new CityInfo("市辖区", "450901"));
        district_030301.add(new CityInfo("玉州区", "450902"));
        district_030301.add(new CityInfo("容　县", "450921"));
        district_030301.add(new CityInfo("陆川县", "450922"));
        district_030301.add(new CityInfo("博白县", "450923"));
        district_030301.add(new CityInfo("兴业县", "450924"));
        district_030301.add(new CityInfo("北流市", "450981"));
        listDistrict_0329.add(district_030301);
        /**
         *广西壮族自治区 - 百色市
         */
        ArrayList<CityInfo> district_030302 = new ArrayList<>();
        district_030302.add(new CityInfo("市辖区", "451001"));
        district_030302.add(new CityInfo("右江区", "451002"));
        district_030302.add(new CityInfo("田阳县", "451021"));
        district_030302.add(new CityInfo("田东县", "451022"));
        district_030302.add(new CityInfo("平果县", "451023"));
        district_030302.add(new CityInfo("德保县", "451024"));
        district_030302.add(new CityInfo("靖西县", "451025"));
        district_030302.add(new CityInfo("那坡县", "451026"));
        district_030302.add(new CityInfo("凌云县", "451027"));
        district_030302.add(new CityInfo("乐业县", "451028"));
        district_030302.add(new CityInfo("田林县", "451029"));
        district_030302.add(new CityInfo("西林县", "451030"));
        district_030302.add(new CityInfo("隆林各族自治县", "451031"));
        listDistrict_0329.add(district_030302);
        /**
         *广西壮族自治区 - 贺州市
         */
        ArrayList<CityInfo> district_030303 = new ArrayList<>();
        district_030303.add(new CityInfo("市辖区", "451101"));
        district_030303.add(new CityInfo("八步区", "451102"));
        district_030303.add(new CityInfo("昭平县", "451121"));
        district_030303.add(new CityInfo("钟山县", "451122"));
        district_030303.add(new CityInfo("富川瑶族自治县", "451123"));
        listDistrict_0329.add(district_030303);
        /**
         *广西壮族自治区 - 河池市
         */
        ArrayList<CityInfo> district_030304 = new ArrayList<>();
        district_030304.add(new CityInfo("市辖区", "451201"));
        district_030304.add(new CityInfo("金城江区", "451202"));
        district_030304.add(new CityInfo("南丹县", "451221"));
        district_030304.add(new CityInfo("天峨县", "451222"));
        district_030304.add(new CityInfo("凤山县", "451223"));
        district_030304.add(new CityInfo("东兰县", "451224"));
        district_030304.add(new CityInfo("罗城仫佬族自治县", "451225"));
        district_030304.add(new CityInfo("环江毛南族自治县", "451226"));
        district_030304.add(new CityInfo("巴马瑶族自治县", "451227"));
        district_030304.add(new CityInfo("都安瑶族自治县", "451228"));
        district_030304.add(new CityInfo("大化瑶族自治县", "451229"));
        district_030304.add(new CityInfo("宜州市", "451281"));
        listDistrict_0329.add(district_030304);
        /**
         *广西壮族自治区 - 来宾市
         */
        ArrayList<CityInfo> district_030305 = new ArrayList<>();
        district_030305.add(new CityInfo("市辖区", "451301"));
        district_030305.add(new CityInfo("兴宾区", "451302"));
        district_030305.add(new CityInfo("忻城县", "451321"));
        district_030305.add(new CityInfo("象州县", "451322"));
        district_030305.add(new CityInfo("武宣县", "451323"));
        district_030305.add(new CityInfo("金秀瑶族自治县", "451324"));
        district_030305.add(new CityInfo("合山市", "451381"));
        listDistrict_0329.add(district_030305);
        /**
         *广西壮族自治区 - 崇左市
         */
        ArrayList<CityInfo> district_030306 = new ArrayList<>();
        district_030306.add(new CityInfo("市辖区", "451401"));
        district_030306.add(new CityInfo("江洲区", "451402"));
        district_030306.add(new CityInfo("扶绥县", "451421"));
        district_030306.add(new CityInfo("宁明县", "451422"));
        district_030306.add(new CityInfo("龙州县", "451423"));
        district_030306.add(new CityInfo("大新县", "451424"));
        district_030306.add(new CityInfo("天等县", "451425"));
        district_030306.add(new CityInfo("凭祥市", "451481"));
        listDistrict_0329.add(district_030306);
        district.add(listDistrict_0329);

        /**
         *新疆维吾尔自治区 - 乌鲁木齐市
         */
        ArrayList<ArrayList<CityInfo>> listDistrict_0330 = new ArrayList<>();
        ArrayList<CityInfo> district_033001 = new ArrayList<>();
        district_033001.add(new CityInfo("市辖区", "650101"));
        district_033001.add(new CityInfo("天山区", "650102"));
        district_033001.add(new CityInfo("沙依巴克区", "650103"));
        district_033001.add(new CityInfo("新市区", "650104"));
        district_033001.add(new CityInfo("水磨沟区", "650105"));
        district_033001.add(new CityInfo("头屯河区", "650106"));
        district_033001.add(new CityInfo("达坂城区", "650107"));
        district_033001.add(new CityInfo("东山区", "650108"));
        district_033001.add(new CityInfo("乌鲁木齐县", "650121"));
        listDistrict_0330.add(district_033001);
        /**
         *新疆维吾尔自治区 - 克拉玛依市
         */
        ArrayList<CityInfo> district_033002 = new ArrayList<>();
        district_033002.add(new CityInfo("市辖区", "650201"));
        district_033002.add(new CityInfo("独山子区", "650202"));
        district_033002.add(new CityInfo("克拉玛依区", "650203"));
        district_033002.add(new CityInfo("白碱滩区", "650204"));
        district_033002.add(new CityInfo("乌尔禾区", "650205"));
        listDistrict_0330.add(district_033002);
        /**
         *新疆维吾尔自治区 - 吐鲁番地区
         */
        ArrayList<CityInfo> district_033003 = new ArrayList<>();
        district_033003.add(new CityInfo("吐鲁番市", "652101"));
        district_033003.add(new CityInfo("鄯善县", "652122"));
        district_033003.add(new CityInfo("托克逊县", "652123"));
        listDistrict_0330.add(district_033003);
        /**
         *新疆维吾尔自治区 - 哈密地区
         */
        ArrayList<CityInfo> district_033004 = new ArrayList<>();
        district_033004.add(new CityInfo("哈密市", "652201"));
        district_033004.add(new CityInfo("巴里坤哈萨克自治县", "652222"));
        district_033004.add(new CityInfo("伊吾县", "652223"));
        listDistrict_0330.add(district_033004);
        /**
         *新疆维吾尔自治区 - 昌吉回族自治州
         */
        ArrayList<CityInfo> district_033005 = new ArrayList<>();
        district_033005.add(new CityInfo("昌吉市", "652301"));
        district_033005.add(new CityInfo("阜康市", "652302"));
        district_033005.add(new CityInfo("米泉市", "652303"));
        district_033005.add(new CityInfo("呼图壁县", "652323"));
        district_033005.add(new CityInfo("玛纳斯县", "652324"));
        district_033005.add(new CityInfo("奇台县", "652325"));
        district_033005.add(new CityInfo("吉木萨尔县", "652327"));
        district_033005.add(new CityInfo("木垒哈萨克自治县", "652328"));
        listDistrict_0330.add(district_033005);
        /**
         *新疆维吾尔自治区 - 博尔塔拉蒙古自治州
         */
        ArrayList<CityInfo> district_033006 = new ArrayList<>();
        district_033006.add(new CityInfo("博乐市", "652701"));
        district_033006.add(new CityInfo("精河县", "652722"));
        district_033006.add(new CityInfo("温泉县", "652723"));
        listDistrict_0330.add(district_033006);
        /**
         *新疆维吾尔自治区 - 巴音郭楞蒙古自治州
         */
        ArrayList<CityInfo> district_033007 = new ArrayList<>();
        district_033007.add(new CityInfo("库尔勒市", "652801"));
        district_033007.add(new CityInfo("轮台县", "652822"));
        district_033007.add(new CityInfo("尉犁县", "652823"));
        district_033007.add(new CityInfo("若羌县", "652824"));
        district_033007.add(new CityInfo("且末县", "652825"));
        district_033007.add(new CityInfo("焉耆回族自治县", "652826"));
        district_033007.add(new CityInfo("和静县", "652827"));
        district_033007.add(new CityInfo("和硕县", "652828"));
        district_033007.add(new CityInfo("博湖县", "652829"));
        listDistrict_0330.add(district_033007);
        /**
         *新疆维吾尔自治区 - 阿克苏地区
         */
        ArrayList<CityInfo> district_033008 = new ArrayList<>();
        district_033008.add(new CityInfo("阿克苏市", "652901"));
        district_033008.add(new CityInfo("温宿县", "652922"));
        district_033008.add(new CityInfo("库车县", "652923"));
        district_033008.add(new CityInfo("沙雅县", "652924"));
        district_033008.add(new CityInfo("新和县", "652925"));
        district_033008.add(new CityInfo("拜城县", "652926"));
        district_033008.add(new CityInfo("乌什县", "652927"));
        district_033008.add(new CityInfo("阿瓦提县", "652928"));
        district_033008.add(new CityInfo("柯坪县", "652929"));
        listDistrict_0330.add(district_033008);
        /**
         *新疆维吾尔自治区 - 克孜勒苏柯尔克孜自治州
         */
        ArrayList<CityInfo> district_033009 = new ArrayList<>();
        district_033009.add(new CityInfo("阿图什市", "653001"));
        district_033009.add(new CityInfo("阿克陶县", "653022"));
        district_033009.add(new CityInfo("阿合奇县", "653023"));
        district_033009.add(new CityInfo("乌恰县", "653024"));
        listDistrict_0330.add(district_033009);
        /**
         *新疆维吾尔自治区 - 喀什地区
         */
        ArrayList<CityInfo> district_033010 = new ArrayList<>();
        district_033010.add(new CityInfo("喀什市", "653101"));
        district_033010.add(new CityInfo("疏附县", "653121"));
        district_033010.add(new CityInfo("疏勒县", "653122"));
        district_033010.add(new CityInfo("英吉沙县", "653123"));
        district_033010.add(new CityInfo("泽普县", "653124"));
        district_033010.add(new CityInfo("莎车县", "653125"));
        district_033010.add(new CityInfo("叶城县", "653126"));
        district_033010.add(new CityInfo("麦盖提县", "653127"));
        district_033010.add(new CityInfo("岳普湖县", "653128"));
        district_033010.add(new CityInfo("伽师县", "653129"));
        district_033010.add(new CityInfo("巴楚县", "653130"));
        district_033010.add(new CityInfo("塔什库尔干塔吉克自治县", "653131"));
        listDistrict_0330.add(district_033010);
        /**
         *新疆维吾尔自治区 - 和田地区
         */
        ArrayList<CityInfo> district_033011 = new ArrayList<>();
        district_033011.add(new CityInfo("和田市", "653201"));
        district_033011.add(new CityInfo("和田县", "653221"));
        district_033011.add(new CityInfo("墨玉县", "653222"));
        district_033011.add(new CityInfo("皮山县", "653223"));
        district_033011.add(new CityInfo("洛浦县", "653224"));
        district_033011.add(new CityInfo("策勒县", "653225"));
        district_033011.add(new CityInfo("于田县", "653226"));
        district_033011.add(new CityInfo("民丰县", "653227"));
        listDistrict_0330.add(district_033011);
        /**
         *新疆维吾尔自治区 - 伊犁哈萨克自治州
         */
        ArrayList<CityInfo> district_033012 = new ArrayList<>();
        district_033012.add(new CityInfo("伊宁市", "654002"));
        district_033012.add(new CityInfo("奎屯市", "654003"));
        district_033012.add(new CityInfo("伊宁县", "654021"));
        district_033012.add(new CityInfo("察布查尔锡伯自治县", "654022"));
        district_033012.add(new CityInfo("霍城县", "654023"));
        district_033012.add(new CityInfo("巩留县", "654024"));
        district_033012.add(new CityInfo("新源县", "654025"));
        district_033012.add(new CityInfo("昭苏县", "654026"));
        district_033012.add(new CityInfo("特克斯县", "654027"));
        district_033012.add(new CityInfo("尼勒克县", "654028"));
        listDistrict_0330.add(district_033012);
        /**
         *新疆维吾尔自治区 - 塔城地区
         */
        ArrayList<CityInfo> district_033013 = new ArrayList<>();
        district_033013.add(new CityInfo("塔城市", "654201"));
        district_033013.add(new CityInfo("乌苏市", "654202"));
        district_033013.add(new CityInfo("额敏县", "654221"));
        district_033013.add(new CityInfo("沙湾县", "654223"));
        district_033013.add(new CityInfo("托里县", "654224"));
        district_033013.add(new CityInfo("裕民县", "654225"));
        district_033013.add(new CityInfo("和布克赛尔蒙古自治县", "654226"));
        listDistrict_0330.add(district_033013);
        /**
         *新疆维吾尔自治区 - 阿勒泰地区
         */
        ArrayList<CityInfo> district_033014 = new ArrayList<>();
        district_033014.add(new CityInfo("阿勒泰市", "654301"));
        district_033014.add(new CityInfo("布尔津县", "654321"));
        district_033014.add(new CityInfo("富蕴县", "654322"));
        district_033014.add(new CityInfo("福海县", "654323"));
        district_033014.add(new CityInfo("哈巴河县", "654324"));
        district_033014.add(new CityInfo("青河县", "654325"));
        district_033014.add(new CityInfo("吉木乃县", "654326"));
        listDistrict_0330.add(district_033014);
        /**
         *新疆维吾尔自治区 - 省直辖行政单位
         */
        ArrayList<CityInfo> district_033015 = new ArrayList<>();
        district_033015.add(new CityInfo("石河子市", "659001"));
        district_033015.add(new CityInfo("阿拉尔市", "659002"));
        district_033015.add(new CityInfo("图木舒克市", "659003"));
        district_033015.add(new CityInfo("五家渠市", "659004"));
        listDistrict_0330.add(district_033015);
        district.add(listDistrict_0330);
    }


}

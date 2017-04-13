package com.yubinggao;

import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;

import com.yubinggao.lib.view.CountdownView;

/**
 * Created by Administrator on 2017/4/12.
 */
public class PhoneInfoActivity extends BaseActivity{
    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.phone_info_activity);
        getPhoneInfo();
    }

    @Override
    public void onClick(View v) {

    }

    public void getPhoneInfo() {
        try {
            StringBuilder sb = new StringBuilder();
            TelephonyManager tm = (TelephonyManager) this.getSystemService(TELEPHONY_SERVICE);
        /*
          * 电话状态：
          * 1.tm.CALL_STATE_IDLE=0          无活动
          * 2.tm.CALL_STATE_RINGING=1  响铃
          * 3.tm.CALL_STATE_OFFHOOK=2  摘机
          */
            sb.append("start\n电话状态:0无活动,1响铃,2摘机,当前状态:");
            sb.append(tm.getCallState() + "\n");//int

         /*
          * 电话方位：
          *
          */
//        sb.append("电话方位:");
//        sb.append(tm.getCellLocation() + "\n");//CellLocation

         /*
          * 唯一的设备ID：
          * GSM手机的 IMEI 和 CDMA手机的 MEID.
          * Return null if device ID is not available.
          */
            sb.append("唯一的设备ID IMEI:");
            sb.append(tm.getDeviceId() + "\n");//String

         /*
          * 设备的软件版本号：
          * 例如：the IMEI/SV(software version) for GSM phones.
          * Return null if the software version is not available.
          */
            sb.append("设备的软件版本号:");
            sb.append(tm.getDeviceSoftwareVersion() + "\n");//String

         /*
          * 手机号：
          * GSM手机的 MSISDN.
          * Return null if it is unavailable.
          */
            sb.append("手机号:");
            sb.append(tm.getLine1Number() + "\n");//String

         /*
          * 附近的电话的信息:
          * 类型：List<NeighboringCellInfo>
          * 需要权限：android.Manifest.permission#ACCESS_COARSE_UPDATES
               tm.getNeighboringCellInfo();//List<NeighboringCellInfo>
          */

         /*
          * 获取ISO标准的国家码，即国际长途区号。
          * 注意：仅当用户已在网络注册后有效。
          *       在CDMA网络中结果也许不可靠。
          */
            sb.append("获取ISO标准的国家码:");
            sb.append(tm.getNetworkCountryIso() + "\n");//String

         /*
          * MCC+MNC(mobile country code + mobile network code)
          * 注意：仅当用户已在网络注册时有效。
          *    在CDMA网络中结果也许不可靠。
          */
            sb.append("CDMA网络:");
            sb.append(tm.getNetworkOperator() + "\n");//String

         /*
          * 按照字母次序的current registered operator(当前已注册的用户)的名字
          * 注意：仅当用户已在网络注册时有效。
          *    在CDMA网络中结果也许不可靠。
          */
            sb.append("当前已注册的用户:");
            sb.append(tm.getNetworkOperatorName() + "\n");//String

         /*
          * 当前使用的网络类型：
          * 例如： NETWORK_TYPE_UNKNOWN  网络类型未知  0
            NETWORK_TYPE_GPRS     GPRS网络  1
            NETWORK_TYPE_EDGE     EDGE网络  2
            NETWORK_TYPE_UMTS     UMTS网络  3
            NETWORK_TYPE_HSDPA    HSDPA网络  8
            NETWORK_TYPE_HSUPA    HSUPA网络  9
            NETWORK_TYPE_HSPA     HSPA网络  10
            NETWORK_TYPE_CDMA     CDMA网络,IS95A 或 IS95B.  4
            NETWORK_TYPE_EVDO_0   EVDO网络, revision 0.  5
            NETWORK_TYPE_EVDO_A   EVDO网络, revision A.  6
            NETWORK_TYPE_1xRTT    1xRTT网络  7
          */
            sb.append("当前使用的网络类型:");
            sb.append(tm.getNetworkType() + "\n");//int

         /*
          * 手机类型：
          * 例如： PHONE_TYPE_NONE  无信号
            PHONE_TYPE_GSM   GSM信号
            PHONE_TYPE_CDMA  CDMA信号
          */
            sb.append("手机类型:");
            sb.append(tm.getPhoneType() + "\n");//int

         /*
          * Returns the ISO country code equivalent for the SIM provider's country code.
          * 获取ISO国家码，相当于提供SIM卡的国家码。
          *
          */
            sb.append("获取ISO国家码:");
            sb.append(tm.getSimCountryIso() + "\n");//String

         /*
          * Returns the MCC+MNC (mobile country code + mobile network code) of the provider of the SIM. 5 or 6 decimal digits.
          * 获取SIM卡提供的移动国家码和移动网络码.5或6位的十进制数字.
          * SIM卡的状态必须是 SIM_STATE_READY(使用getSimState()判断).
          */
            sb.append("移动网络码:");
            sb.append(tm.getSimOperator() + "\n");//String

         /*
          * 服务商名称：
          * 例如：中国移动、联通
          * SIM卡的状态必须是 SIM_STATE_READY(使用getSimState()判断).
          */
            sb.append("服务商名称:");
            sb.append(tm.getSimOperatorName() + "\n");//String

         /*
          * SIM卡的序列号：
          * 需要权限：READ_PHONE_STATE
          */
            sb.append("SIM卡的序列号:");
            sb.append(tm.getSimSerialNumber() + "\n");//String

         /*
          * SIM的状态信息：
          *  SIM_STATE_UNKNOWN          未知状态 0
          SIM_STATE_ABSENT           没插卡 1
          SIM_STATE_PIN_REQUIRED     锁定状态，需要用户的PIN码解锁 2
          SIM_STATE_PUK_REQUIRED     锁定状态，需要用户的PUK码解锁 3
          SIM_STATE_NETWORK_LOCKED   锁定状态，需要网络的PIN码解锁 4
          SIM_STATE_READY            就绪状态 5
          */
            sb.append("SIM的状态信息:");
            sb.append(tm.getSimState() + "\n");//int

         /*
          * 唯一的用户ID：
          * 例如：IMSI(国际移动用户识别码) for a GSM phone.
          * 需要权限：READ_PHONE_STATE
          */
            sb.append("唯一的用户ID:");
            sb.append(tm.getSubscriberId() + "\n");//String

         /*
          * 取得和语音邮件相关的标签，即为识别符
          * 需要权限：READ_PHONE_STATE
          */
            sb.append("取得和语音邮件相关的标签:");
            sb.append(tm.getVoiceMailAlphaTag() + "\n");//String

         /*
          * 获取语音邮件号码：
          * 需要权限：READ_PHONE_STATE
          */
            sb.append("获取语音邮件号码:");
            sb.append(tm.getVoiceMailNumber() + "\n");//String

         /*
          * ICC卡是否存在
          */
            sb.append("ICC卡是否存在:");
            sb.append(tm.hasIccCard() + "\n");//boolean

           /*
            * 是否漫游:
            * (在GSM用途下)
            */
            sb.append("是否漫游:");
            sb.append(tm.isNetworkRoaming());//
            sb.append("\nend");//
            System.out.println(sb.toString());
            CountdownView t = (CountdownView) findViewById(R.id.phone_cv);
            t.setText(sb.toString());
        } catch (Exception e) {
            System.out.println("出错");
        }
    }
}

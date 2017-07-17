package com.yubinggao.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ViewUtils {

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context 上下文
     * @param dpValue dp值
     * @return
     */
    public static int dipPx(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     *
     * @param context 上下文
     * @param pxValue px值
     * @return
     */
    public static int pxDip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 读取 res drawable的资源
     *
     * @param context 上下文
     * @param name    图片名称
     * @return
     */
    public static int getDrawableId(Context context, String name) {
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }

    /**
     * 读取 res mipmap的资源
     *
     * @param context 上下文
     * @param name    图片名称
     * @return
     */
    public static int getMipmapId(Context context, String name) {
        return context.getResources().getIdentifier(name, "mipmap", context.getPackageName());
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static TextView createEmpty(Context context) {
        TextView empty = new TextView(context);
        empty.setText("X");
        empty.setTextColor(Color.WHITE);
        empty.setTextSize(12);
        empty.setGravity(Gravity.CENTER);
        empty.setVisibility(View.GONE);
        empty.setBackground(ShapeUtils.getShape(context, 20, 14, 0, Color.RED));
        empty.setId(0);
        return empty;
    }
}

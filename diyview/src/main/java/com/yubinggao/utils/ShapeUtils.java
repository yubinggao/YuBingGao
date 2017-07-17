package com.yubinggao.utils;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;

/**
 * Created by Administrator on 2017/7/10.
 */
public class ShapeUtils {
    public static GradientDrawable getShape(Context context, int radius, int width, int strokeColor,int color) {
        GradientDrawable gradientDrawable1 = new GradientDrawable();// 形状-圆角矩形
        gradientDrawable1.setShape(GradientDrawable.RECTANGLE);// 圆角
        gradientDrawable1.setCornerRadius(ViewUtils.dipPx(context, radius));
        gradientDrawable1.setStroke(ViewUtils.dipPx(context, width), strokeColor);
        gradientDrawable1.setColor(color);
        return gradientDrawable1;
    }
}

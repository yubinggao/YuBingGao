package com.yubinggao.lib.view.recyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by Linhh on 15/11/15.
 */
public class NoMoreView extends BaseLoadMoreView {
    private Paint paint;
    private int mProgress = 30;//圆圈比例

    public NoMoreView(Context context, RecyclerView recyclerView) {
        super(context, recyclerView);
        paint = new Paint();
    }

    @Override
    public void onDrawLoadMore(Canvas c, RecyclerView parent) {
        try {
            super.onDrawLoadMore(c, parent);
            mProgress = mProgress + 5;
            if (mProgress == 100) {
                mProgress = 0;
            }
            final int left = parent.getPaddingLeft();
            final int right = parent.getMeasuredWidth() - parent.getPaddingRight();
            final int childSize = parent.getChildCount();
            final View child = parent.getChildAt(childSize - 1);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) child.getLayoutParams();
            final int top = child.getBottom() + layoutParams.bottomMargin;
            final int bottom = top + getLoadMorePadding() / 2;
            paint.setAntiAlias(true);// 抗锯齿
            paint.setFlags(Paint.ANTI_ALIAS_FLAG);// 增强消除锯齿
            paint.reset();// 将画笔重置
            paint.setAntiAlias(true);// 抗锯齿
            paint.setFlags(Paint.ANTI_ALIAS_FLAG);// 增强消除锯齿
            paint.setStrokeWidth(3);// 再次设置画笔的宽度
            paint.setTextSize(40);// 设置文字的大小
            paint.setColor(Color.GRAY);// 设置画笔颜色
            c.drawText("没有更多了", (right - left) / 2 - 100, bottom + 10, paint);
        } catch (Exception e) {

        }
    }

}

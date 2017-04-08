package com.yubinggao.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by baoyunlong on 16/6/8.
 */
public class UniqueScrollView extends ScrollView {

    private ScrollListener mScrollListener;
    private AlphaChange alphaChange = null;

    public UniqueScrollView(Context context) {
        super(context);
    }

    public UniqueScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UniqueScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setScrollListener(ScrollListener scrollListener) {
        this.mScrollListener = scrollListener;
    }

    public void setAlphaChange(AlphaChange alphaChange) {
        this.alphaChange = alphaChange;
    }



    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_MOVE:

                if (mScrollListener != null) {
                    int contentHeight = getChildAt(0).getHeight();
                    int scrollHeight = getHeight();

                    int scrollY = getScrollY();
                    mScrollListener.onScroll(scrollY);

                    if (scrollY + scrollHeight >= contentHeight || contentHeight <= scrollHeight) {
                        mScrollListener.onScrollToBottom();
                    } else {
                        mScrollListener.notBottom();
                    }

                    if (scrollY == 0) {
                        mScrollListener.onScrollToTop();
                    }

                }

                break;
        }
        boolean result = super.onTouchEvent(ev);
        requestDisallowInterceptTouchEvent(false);

        return result;
    }

    public interface ScrollListener {
        void onScrollToBottom();

        void onScrollToTop();

        void onScroll(int scrollY);

        void notBottom();
    }

    public interface AlphaChange {
        void onAlpha(float alpha);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (alphaChange != null) {
            if (t < 20) {
                alphaChange.onAlpha(0.0f);
            } else {
                float alpha = t / 150f;
                alphaChange.onAlpha(alpha > 1 ? 1.0f : alpha);

            }
        }
    }
}

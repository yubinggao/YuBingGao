package com.yubinggao.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;

/**
 * Created by baoyunlong on 16/6/8.
 */
public class UniqueTopBottomViewGroup extends ViewGroup {

    private UniqueScrollView topScrollView, bottomScrollView;
    private VelocityTracker velocityTracker = VelocityTracker.obtain();
    private Scroller scroller = new Scroller(getContext());
    private VisibilityTopBottomListener listener = null;
    int currPosition = 0;
    int position1Y;
    int lastY;
    public int scaledTouchSlop;//最小滑动距离
    int speed = 168;
    boolean isIntercept;

    public boolean bottomScrollVIewIsInTop = false;
    public boolean topScrollViewIsBottom = false;

    public UniqueTopBottomViewGroup(Context context) {
        super(context);
        init();
    }

    public UniqueTopBottomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public UniqueTopBottomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void setVisibilityListener(VisibilityTopBottomListener listener) {
        this.listener = listener;
    }

    private void init() {
        post(new Runnable() {
            @Override
            public void run() {
                topScrollView = (UniqueScrollView) getChildAt(0);
                bottomScrollView = (UniqueScrollView) getChildAt(1);
                topScrollView.setScrollListener(new UniqueScrollView.ScrollListener() {
                    @Override
                    public void onScrollToBottom() {
                        topScrollViewIsBottom = true;
                    }

                    @Override
                    public void onScrollToTop() {

                    }

                    @Override
                    public void onScroll(int scrollY) {
//                        System.out.println("scrollY" + scrollY );
                    }

                    @Override
                    public void notBottom() {
                        topScrollViewIsBottom = false;
                    }

                });

                bottomScrollView.setScrollListener(new UniqueScrollView.ScrollListener() {
                    @Override
                    public void onScrollToBottom() {

                    }

                    @Override
                    public void onScrollToTop() {

                    }

                    @Override
                    public void onScroll(int scrollY) {
                        if (scrollY == 0) {
                            bottomScrollVIewIsInTop = true;
                        } else {
                            bottomScrollVIewIsInTop = false;
                        }
//                        if (listener != null) {
//                            listener.isShow();
//                            listener.onHide();
//                        }
                    }

                    @Override
                    public void notBottom() {

                    }
                });
                position1Y = topScrollView.getBottom();
                scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        //防止子View禁止父view拦截事件
        this.requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int y = (int) ev.getY();
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                //判断是否已经滚动到了底部
                if (topScrollViewIsBottom) {
                    int dy = lastY - y;
                    //判断是否是向上滑动和是否在第一屏
                    if (dy > 0 && currPosition == 0) {
                        if (dy >= scaledTouchSlop) {
                            isIntercept = true;//拦截事件
                            lastY = y;
                        }
                    }
                }
                if (bottomScrollVIewIsInTop) {
                    int dy = lastY - y;
                    //判断是否是向下滑动和是否在第二屏
                    if (dy < 0 && currPosition == 1) {
                        if (Math.abs(dy) >= scaledTouchSlop) {
                            isIntercept = true;
                        }
                    }
                }

                break;
        }
        return isIntercept;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int y = (int) event.getY();
        velocityTracker.addMovement(event);

        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                int dy = lastY - y;
                if (getScrollY() + dy < 0) {
                    dy = getScrollY() + dy + Math.abs(getScrollY() + dy);
                }
                if (getScrollY() + dy + getHeight() > bottomScrollView.getBottom()) {
                    dy = dy - (getScrollY() + dy - (bottomScrollView.getBottom() - getHeight()));
                }
                scrollBy(0, dy);
                break;
            case MotionEvent.ACTION_UP:
                isIntercept = false;
                velocityTracker.computeCurrentVelocity(1000);
                float yVelocity = velocityTracker.getYVelocity();

                if (currPosition == 0) {
                    if (yVelocity < 0 && yVelocity < -speed) {
                        smoothScroll(position1Y);
                        currPosition = 1;
                        if (listener != null) {
                            listener.isVisibility(VISIBLE, GONE);
                        }
                    } else {
                        smoothScroll(0);
                        if (listener != null) {
                            listener.isVisibility(GONE, VISIBLE);
                        }
                    }
                } else {
                    if (yVelocity > 0 && yVelocity > speed) {
                        smoothScroll(0);
                        currPosition = 0;
                        if (listener != null) {
                            listener.isVisibility(GONE, VISIBLE);
                        }
                    } else {
                        smoothScroll(position1Y);
                        if (listener != null) {
                            listener.isVisibility(VISIBLE, GONE);
                        }
                    }
                }

                break;
        }
        lastY = y;
        return true;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount = getChildCount();
        int childTop = t;
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            child.layout(l, childTop, r, childTop + child.getMeasuredHeight());
            childTop += child.getMeasuredHeight();
        }
    }

    //通过Scroller实现弹性滑动
    private void smoothScroll(int tartY) {
        int dy = tartY - getScrollY();
        scroller.startScroll(getScrollX(), getScrollY(), 0, dy);
        invalidate();
    }

    public void top() {
        currPosition = 0;
        smoothScroll(0);
    }

    public void bottom() {
        currPosition = 1;
        smoothScroll(topScrollView.getBottom());
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    public interface VisibilityTopBottomListener {
        void isVisibility(int top, int bottom);
    }

}

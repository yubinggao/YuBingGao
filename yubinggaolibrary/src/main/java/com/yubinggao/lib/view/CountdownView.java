package com.yubinggao.lib.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.TextView;

import com.yubinggao.lib.R;

/**
 * 获取验证码倒计时控件
 * Created by Administrator on 2016/4/7.
 */
public class CountdownView extends TextView {
    /**
     * 标识
     */
    private static final int COUNTDOWNWATH = 0xa;

    /**
     * 倒计时
     */
    private int timeCountdown;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case COUNTDOWNWATH:
                    calculateCountdown();
                    break;
            }
        }
    };

    public CountdownView(Context context) {
        super(context);
    }

    public CountdownView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CountdownView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 初始化
     */
    private void initView() {
        setText("获取验证码");
        setTextColor(Color.WHITE);
        setBackgroundResource(R.drawable.selector_countdown_view_bg);
    }

    /**
     * 开始倒计时
     */
    private void startWathCountdown() {
        handler.sendEmptyMessageDelayed(COUNTDOWNWATH, 1000);
    }

    /**
     * 删除倒计时
     */
    private void removeWathCountdown() {
        handler.removeMessages(COUNTDOWNWATH);
    }

    /**
     * 计算倒计时
     */
    private void calculateCountdown() {
        if (timeCountdown < 2) {
            setTextColor(Color.WHITE);
            setText("获取验证码");
            setEnabled(true);
        } else {
            setText("重新获取(" + --timeCountdown + ")");
            startWathCountdown();
        }
    }

    /**
     * 开始倒计时
     *
     * @param time 小于2秒的不倒计时了
     */
    public void startCountdown(int time) {
        if (time > 2) {
            timeCountdown = time;
            setTextColor(Color.RED);
            setText("重新获取(" + --timeCountdown + ")");
            setEnabled(false);
            removeWathCountdown();
            startWathCountdown();
        }
    }
}

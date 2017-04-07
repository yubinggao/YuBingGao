package com.yubinggao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.yubinggao.lib.view.CountdownView;

/**
 * Created by Administrator on 2017/4/7.
 */
public class MainActivity extends Activity {
    CountdownView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        cv = (CountdownView) findViewById(R.id.code_cv);

    }

    public void onClick(View v) {
        cv.startCountdown(18);
    }
}

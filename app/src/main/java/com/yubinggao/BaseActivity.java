package com.yubinggao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2017/4/7.
 */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(savedInstanceState);
    }

    protected abstract void initView(Bundle savedInstanceState);

    protected View byId(int id) {
        return findViewById(id);
    }

    protected View initClick(int id) {
        View view = findViewById(id);
        view.setOnClickListener(this);
        return view;
    }


}

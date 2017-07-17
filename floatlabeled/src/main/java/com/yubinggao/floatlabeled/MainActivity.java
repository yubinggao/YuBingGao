package com.yubinggao.floatlabeled;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout layout = new FrameLayout(this);//创建帧布局对象layout
        FrameLayout.LayoutParams frameLayout = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);//设置帧布局的高宽属性
        FrameLayout.LayoutParams viewPream = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);//设置布局控件的属性
        viewPream.gravity = Gravity.CENTER | Gravity.RIGHT;
        TextView txt = new TextView(this);//创建TextView控件
        txt.setText("我是房泽龙");//设置文字
        ImageView img = new ImageView(this);//创建图片控件
//        img.setImageResource(R.mipmap);//设置图片文件
        Button button = new Button(this);//创建按钮控件
        button.setText("按我");//设置按钮文字
        layout.addView(img, viewPream);//将控件添加到布局中去
        layout.addView(txt, viewPream);//三者的添加有顺序，后添加的默认覆盖先添加的控件
        layout.addView(button, viewPream);
        super.addContentView(layout, frameLayout);//显示布局管理器
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FloatLabeledEditText phone = (FloatLabeledEditText) findViewById(R.id.phone);


        findViewById(R.id.getphone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p = phone.getEditText().getText().toString();

                System.out.println(" p " + p);

                phone.getEditText().setText("");
            }
        });
    }

    @Override
    public void onClick(View view) {

    }

/**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = new TextView(this);
        GradientDrawable gradientDrawable1 = new GradientDrawable();// 形状-圆角矩形
        gradientDrawable1.setShape(GradientDrawable.RECTANGLE);// 圆角
        gradientDrawable1.setCornerRadius(12);
        gradientDrawable1.setStroke(2, Color.GRAY);
        gradientDrawable1.setColor(Color.WHITE);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(GradientDrawable.RECTANGLE);
        gradientDrawable2.setCornerRadius(8);
        gradientDrawable2.setColor(Color.GRAY);
        // 状态选择器
        StateListDrawable stateListDrawable = new StateListDrawable();
        // 按下状态的背景
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        // 常规状态的背景
        stateListDrawable.addState(new int[]{}, gradientDrawable1);// 应用到控件 -- API level 16
        view.setBackgroundDrawable(stateListDrawable);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        setContentView(view);
    }*/
}

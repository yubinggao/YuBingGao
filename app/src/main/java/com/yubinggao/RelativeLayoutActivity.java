package com.yubinggao;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/5/18.
 */
public class RelativeLayoutActivity extends Activity {
    private static final int INPUT_TYPE = InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
    private EditText name, pwd, code;

    private RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout layout = new RelativeLayout(this);
        RelativeLayout.LayoutParams rl = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        RelativeLayout.LayoutParams rlr = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, 365);
        rlr.addRule(RelativeLayout.CENTER_VERTICAL);
        rlr.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        paywarpLayout.addView();
        r = new RelativeLayout(this);
        initEditText();
        r.setBackgroundResource(R.drawable.shape_hollow_gray);
        r.setPadding(20, 36, 20, 20);
        r.setLayoutParams(rlr);
        rlr.leftMargin = 10;
        rlr.rightMargin = 10;
        layout.addView(r);
        addContentView(layout, rl);
    }

    private void initEditText() {
        RelativeLayout.LayoutParams nameLP = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, 66);
        name = new EditText(this);
        name.setBackgroundColor(Color.WHITE);
        name.setSingleLine();
        name.setId(1);
        name.setLayoutParams(nameLP);
        r.addView(name);
        RelativeLayout.LayoutParams pwdLP = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, 66);
        pwd = new EditText(this);
        pwd.setBackgroundColor(Color.WHITE);
        pwd.setSingleLine();
        pwd.setId(2);
        pwdLP.addRule(RelativeLayout.BELOW, 1);
        pwdLP.topMargin = 10;
        pwd.setLayoutParams(pwdLP);
        r.addView(pwd);

        TextView login = new TextView(this);
        login.setText("登\t\t录");
        login.setGravity(Gravity.CENTER);
        login.setTextColor(Color.WHITE);
        login.setBackgroundResource(R.drawable.selector_countdown_view_bg);
        RelativeLayout.LayoutParams loginLP = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, 66);
        loginLP.addRule(RelativeLayout.BELOW, 2);
        loginLP.topMargin = 20;
        login.setId(3);
        login.setLayoutParams(loginLP);
        r.addView(login);
    }

    private void initTextView() {
        TextView name = new TextView(this);
        name.setText("余炳高");
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);//与父容器的左侧对齐
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);//与父容器的上侧对齐
        lp.leftMargin = 30;
        lp.topMargin = 30;
        name.setId(1);//设置这个View 的id
        name.setLayoutParams(lp);//设置布局参数
        r.addView(name);//RelativeLayout添加子View

        TextView phone = new TextView(this);
        phone.setText("188-8888-8888");
        RelativeLayout.LayoutParams lpphone = new RelativeLayout.LayoutParams(600, 50);
//        lpphone.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        lpphone.addRule(RelativeLayout.ALIGN_TOP, 1);
        lpphone.addRule(RelativeLayout.RIGHT_OF, 1);//设置item3在     //chlidView1的下面
        phone.setId(3);
        phone.setLayoutParams(lpphone);
        r.addView(phone);
    }

}

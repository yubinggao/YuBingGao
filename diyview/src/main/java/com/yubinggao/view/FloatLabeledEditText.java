package com.yubinggao.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yubinggao.utils.ViewUtils;

/**
 * Created by Administrator on 2017/7/14.
 */
@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class FloatLabeledEditText extends FrameLayout implements View.OnClickListener {
    private Context mContext;
    private AutoCompleteTextView appCompatTextView;
    private TextView empty;

    public FloatLabeledEditText(Context context) {
        super(context);
        initView(context);
    }

    public FloatLabeledEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public FloatLabeledEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        mContext = context;
        initEmpty();
    }

    private void initEmpty() {
        FrameLayout.LayoutParams emptyPream = new FrameLayout.LayoutParams(ViewUtils.dipPx(mContext, 34), ViewUtils.dipPx(mContext, 34));//设置布局控件的属性
        emptyPream.gravity = Gravity.CENTER_VERTICAL | Gravity.RIGHT;
        empty = ViewUtils.createEmpty(mContext);
        empty.setOnClickListener(this);
        addView(empty, emptyPream);
    }

    @Override
    public void onClick(View view) {
//﹀
        switch (view.getId()) {
            case 0:
                appCompatTextView.setText("");
                break;
        }
    }
}

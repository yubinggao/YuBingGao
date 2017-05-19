package com.yubinggao;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import com.yubinggao.lib.utils.UIDIPPXUtils;

/**
 * Created by Administrator on 2017/5/18.
 */
public class LinearLayoutActivity extends Activity {
    private static final int INPUT_TYPE = InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
    private EditText name, pwd, code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        addContentView();
        int vpadding = UIDIPPXUtils.dipPx(this, 10);
        int size_48 = UIDIPPXUtils.dipPx(this, 48);
        int size_144 = UIDIPPXUtils.dipPx(this, 144);
        int size_300 = UIDIPPXUtils.dipPx(this, 300);

        name = createEdtx(LinearLayoutActivity.this, "名字", INPUT_TYPE, "");
        code = createEdtx(LinearLayoutActivity.this, "验证码", INPUT_TYPE, "");
        code.setBackgroundColor(Color.rgb(255, 255, 255));
        pwd = createEdtx(LinearLayoutActivity.this, "密码", INPUT_TYPE, "");

        LinearLayout paywarpLayout = new LinearLayout(this);
        paywarpLayout.setOrientation(LinearLayout.VERTICAL);
        paywarpLayout.setBackgroundColor(Color.rgb(255, 0, 0));
        LinearLayout.LayoutParams lpWarpLayoutParams = new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT, size_300);
        paywarpLayout.addView(name);
        paywarpLayout.addView(code);
        paywarpLayout.addView(pwd);
        lpWarpLayoutParams.setMargins(0, vpadding, 0, vpadding);
//        LinearLayout.LayoutParams lpWarpLayoutParams = new LinearLayout.LayoutParams(size_300, size_144);
        paywarpLayout.setLayoutParams(lpWarpLayoutParams);
        addContentView(paywarpLayout, lpWarpLayoutParams);
        paywarpLayout.setVisibility(View.GONE);
    }

    public EditText createEdtx(Activity activity, String hint,
                               final int inputType, String leftIcon) {
        int vpadding = UIDIPPXUtils.dipPx(activity, 300);
        int hpadding = UIDIPPXUtils.dipPx(activity, 48);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 0, 1.0F);

        EditText edtx = new EditText(activity);
        edtx.setLayoutParams(params);
//        edtx.setPadding(hpadding, vpadding, hpadding, vpadding);
        edtx.setHint(hint);
        edtx.setHintTextColor(Color.rgb(204, 204, 204));
        edtx.setTextColor(Color.rgb(51, 51, 51));
        edtx.setBackgroundDrawable(null);
        edtx.setTextSize(TypedValue.COMPLEX_UNIT_SP, UIDIPPXUtils.dipPx(activity, 16));
        edtx.setSelection(edtx.getText().length());
        edtx.setInputType(inputType);

        // 配置输入框不切换edtx.setImeOptions(EditorInfo.IME_FLAG_NO_EXTRACT_UI);
        if (!TextUtils.isEmpty(leftIcon)) {
//            edtx.setCompoundDrawablesWithIntrinsicBounds(
//                    asset.decodeDensityDpiDrawable(activity, leftIcon), null,
//                    null, null);
//            edtx.setCompoundDrawablePadding((int) (Constants.DEVICE_INFO.windowWidthPx * 0.02));
        }
        return edtx;
    }
}

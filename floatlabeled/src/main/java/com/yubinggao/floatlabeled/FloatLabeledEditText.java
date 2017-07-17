package com.yubinggao.floatlabeled;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.animation.AnimatorProxy;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class FloatLabeledEditText extends FrameLayout implements View.OnClickListener {

    /**
     * 提示
     */
    private TextView mHintTextView;
    private TextView empty;
    /**
     * 输入框
     */
    private EditText mEditText;
    /**
     * 上下文
     */
    private Context mContext;

    public FloatLabeledEditText(Context context) {
        super(context);
        mContext = context;
    }

    public FloatLabeledEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public FloatLabeledEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
        initView();
    }

    /**
     * 初始化
     */
    private void initView() {
        setBackground(Color.GRAY);
        initHintView();

    }

    /**
     * 设置背景
     */
    public void setBackground(int color) {
        GradientDrawable bg = ShapeUtils.getShape(mContext, 4, 1, color, 0);
        setBackground(bg);
    }

    /**
     * 初始化提示
     */
    private void initHintView() {
        mHintTextView = new TextView(mContext);
        setHintPadding(4, 0, 0, 0);
        mHintTextView.setVisibility(INVISIBLE);
        AnimatorProxy.wrap(mHintTextView).setAlpha(0);
        addView(mHintTextView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    }

    private void initEmpty() {
        if (empty == null) {
            empty = new TextView(mContext);
            LayoutParams emptyPream = new LayoutParams(ViewUtils.dipPx(mContext, 34), ViewUtils.dipPx(mContext, 34));//设置布局控件的属性
            emptyPream.gravity = Gravity.CENTER_VERTICAL | Gravity.RIGHT;
            empty.setText("X");
            empty.setTextColor(Color.WHITE);
            empty.setTextSize(12);
            empty.setGravity(Gravity.CENTER);
            empty.setBackground(ShapeUtils.getShape(mContext, 20, 14, 0, Color.RED));
            empty.setOnClickListener(this);
            addView(empty, emptyPream);
        }
    }

    /**
     * 设置提示背景
     *
     * @param background 背景
     */
    @SuppressLint("NewApi")
    public void setHintBackground(Drawable background) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            mHintTextView.setBackground(background);
        } else {
            mHintTextView.setBackgroundDrawable(background);
        }
    }

    /**
     * 设置提示边距
     *
     * @param leftDp   左边距
     * @param topDp    上边距
     * @param rightDp  右边距
     * @param bottomDp 下边距
     */
    public void setHintPadding(float leftDp, float topDp, float rightDp, float bottomDp) {
        mHintTextView.setPadding(dpPx(leftDp), dpPx(topDp), dpPx(rightDp), dpPx(bottomDp));
    }

    @Override
    public final void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof EditText) {
            if (mEditText != null) {
                throw new IllegalArgumentException("Can only have one Edittext subview");
            }

            final LayoutParams lp = new LayoutParams(params);
            lp.gravity = Gravity.BOTTOM;
            lp.topMargin = (int) (mHintTextView.getTextSize() + mHintTextView.getPaddingBottom() + mHintTextView.getPaddingTop());
            params = lp;
            setEditText((EditText) child);
        }

        super.addView(child, index, params);
    }

    private void setEditText(EditText editText) {
        mEditText = editText;

        mEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                setShowHint(!TextUtils.isEmpty(s));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

        });

        mEditText.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean gotFocus) {
                onFocusChanged(gotFocus);
            }
        });

        mHintTextView.setText(mEditText.getHint());

        if (!TextUtils.isEmpty(mEditText.getText())) {
            mHintTextView.setVisibility(VISIBLE);
        }
    }

    private void onFocusChanged(boolean gotFocus) {
        if (gotFocus && mHintTextView.getVisibility() == VISIBLE) {
            ObjectAnimator.ofFloat(mHintTextView, "alpha", 0.33f, 1f).start();
        } else if (mHintTextView.getVisibility() == VISIBLE) {
            AnimatorProxy.wrap(mHintTextView).setAlpha(1f);  //Need this for compat reasons
            ObjectAnimator.ofFloat(mHintTextView, "alpha", 1f, 0.33f).start();
        }
    }

    private void setShowHint(final boolean show) {
        initEmpty();
        AnimatorSet animation = null;
        if ((mHintTextView.getVisibility() == VISIBLE) && !show) {
            empty.setVisibility(GONE);
            animation = new AnimatorSet();
            ObjectAnimator move = ObjectAnimator.ofFloat(mHintTextView, "translationY", 0, mHintTextView.getHeight() / 8);
            ObjectAnimator fade = ObjectAnimator.ofFloat(mHintTextView, "alpha", 1, 0);
            animation.playTogether(move, fade);
        } else if ((mHintTextView.getVisibility() != VISIBLE) && show) {
            empty.setVisibility(VISIBLE);
            animation = new AnimatorSet();
            ObjectAnimator move = ObjectAnimator.ofFloat(mHintTextView, "translationY", mHintTextView.getHeight() / 8, 0);
            ObjectAnimator fade;
            if (mEditText.isFocused()) {
                fade = ObjectAnimator.ofFloat(mHintTextView, "alpha", 0, 1);
            } else {
                fade = ObjectAnimator.ofFloat(mHintTextView, "alpha", 0, 0.33f);
            }
            animation.playTogether(move, fade);
        }

        if (animation != null) {
            animation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animation) {
                    super.onAnimationStart(animation);
                    mHintTextView.setVisibility(VISIBLE);
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    mHintTextView.setVisibility(show ? VISIBLE : INVISIBLE);
                    AnimatorProxy.wrap(mHintTextView).setAlpha(show ? 1 : 0);
                }
            });
            animation.start();
        }
    }

    public EditText getEditText() {
        return mEditText;
    }

    public void setHint(String hint) {
        mEditText.setHint(hint);
        mHintTextView.setText(hint);
    }

    public CharSequence getHint() {
        return mHintTextView.getHint();
    }

    public int dpPx(float dpValue) {
        final float scale = mContext.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


    @Override
    public void onClick(View view) {
        getEditText().setText("");
    }
}

package com.example.testjar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.yubinggao.animator.ExplosionField;


public class ExplosionAnimatorActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_az);

        final ExplosionField explosionField = new ExplosionField(this);
        findViewById(R.id.qq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(view);
            }
        });
        findViewById(R.id.qqz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(view);
            }
        });
        findViewById(R.id.vx).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(view);
            }
        });
    }
}

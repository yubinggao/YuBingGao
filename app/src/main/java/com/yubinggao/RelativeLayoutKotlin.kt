package com.yubinggao

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.Gravity
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView

class RelativeLayoutKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      /*  val layout = RelativeLayout(this);
        val rl = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        val rlr = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 365)
        rlr.addRule(RelativeLayout.CENTER_VERTICAL)
        rlr.addRule(RelativeLayout.CENTER_HORIZONTAL)
        val r = RelativeLayout(this)
        initEditText(r)
        r.setBackgroundResource(R.drawable.shape_hollow_gray)
        r.setPadding(20, 36, 20, 20)
        r.setLayoutParams(rlr)
        rlr.leftMargin = 10
        rlr.rightMargin = 10
        layout.addView(r)
        addContentView(layout, rl)*/
    }

    private fun initEditText(r: RelativeLayout) {
        val nameLP = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 66)
        var name = EditText(this)
        name.setText("RelativeLayoutKotlin")
        name.setBackgroundColor(Color.WHITE)
        name.setSingleLine()
        name.setId(1)
        name.setLayoutParams(nameLP)
        r.addView(name)
        val pwdLP = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 66)
        var pwd = EditText(this)
        pwd.setBackgroundColor(Color.WHITE)
        pwd.setSingleLine()
        pwd.setId(2)
        pwdLP.addRule(RelativeLayout.BELOW, 1)
        pwdLP.topMargin = 10
        pwd.setLayoutParams(pwdLP)
        r.addView(pwd)

        val login = TextView(this)
        login.text = "登\t\t录"
        login.gravity = Gravity.CENTER
        login.setTextColor(Color.WHITE)
        login.setBackgroundResource(R.drawable.selector_countdown_view_bg)
        val loginLP = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 66)
        loginLP.addRule(RelativeLayout.BELOW, 2)
        loginLP.topMargin = 20
        login.id = 3
        login.layoutParams = loginLP
        r.addView(login)
    }
}

package com.yubinggao

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import com.yubinggao.lib.utils.UIDIPPXUtils
import kotlinx.android.synthetic.main.kotlin.*

class HelloKotlin : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin)
        // 窗口横屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
//		// 窗口竖屏
//		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        nameTextView.text = "HelloKotlin,跳转mian"
        nameTextView.textSize = 20f
        nameTextView.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val d340 = UIDIPPXUtils.dipPx(this, 340f)
        val d236 = UIDIPPXUtils.dipPx(this, 236f)
        val d20 = UIDIPPXUtils.dipPx(this, 20f)
        val d13 = UIDIPPXUtils.dipPx(this, 13f)

        val loginLayout = RelativeLayout(this)
        val rl = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        val loginRL = RelativeLayout.LayoutParams(d340, d236)
        loginRL.addRule(RelativeLayout.CENTER_VERTICAL)
        loginRL.addRule(RelativeLayout.CENTER_HORIZONTAL)
        loginRL.leftMargin = 10
        loginRL.rightMargin = 10
        var login = RelativeLayout(this)
        initEditText(login)
        login.setBackgroundResource(R.drawable.shape_hollow_gray)
        login.setPadding(d13, d20, d13, d13)
        login.layoutParams = loginRL
        loginLayout.addView(login)
        addContentView(loginLayout, rl)
    }

    private fun initEditText(r: RelativeLayout) {
        val d45 = UIDIPPXUtils.dipPx(this, 45f)
        val nameLP = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, d45)
        var name = EditText(this)
        name.setBackgroundColor(Color.WHITE)
        name.setSingleLine()
        name.id = 1
        name.layoutParams = nameLP
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

    private fun onClick() {
    }
}

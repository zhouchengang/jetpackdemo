package com.zhouchengang.jetpackdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 入口 Activity
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tv_demo_one.setOnClickListener {
            startActivity(Intent(this, DemoOneActivity::class.java))
        }

        tv_demo_two.setOnClickListener {
            startActivity(Intent(this, DemoTwoActivity::class.java))
        }

    }
}
package com.zhouchengang.jetpackdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 入口 Activity
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        tv_demo_one.setOnClickListener {
            startActivity(Intent(this,DemoOneActivity::class.java))
        }


    }
}
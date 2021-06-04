package com.zhouchengang.jetpackdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_demo_three.*

class DemoThreeActivity : AppCompatActivity() {
    lateinit var demoThreeViewModel: DemoThreeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_three)
        demoThreeViewModel = ViewModelProvider(this).get(DemoThreeViewModel::class.java)

        tv_content.setOnClickListener {
            demoThreeViewModel.tvContent?.value = (demoThreeViewModel.tvContent?.value ?: 0) + 1
        }

        demoThreeViewModel.tvContent?.observe(this) {
            tv_content.text = it.toString()
        }

    }
}
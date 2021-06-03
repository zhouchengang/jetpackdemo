package com.zhouchengang.jetpackdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_demo_one.*


class DemoOneActivity : AppCompatActivity() {

    private lateinit var demoOneViewModel: DemoOneViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_demo_one)

        demoOneViewModel = DemoOneViewModel()

        demoOneViewModel.text.observe(this) {
            tv.text = it.toString()
        }

        tv.setOnClickListener {
            demoOneViewModel.text.value = 1 + (demoOneViewModel.text.value ?: 0)
        }

        lifecycle.addObserver(object : LifecycleEventObserver {
            override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                when (event) {
                    Lifecycle.Event.ON_CREATE,
                    Lifecycle.Event.ON_START,
                    Lifecycle.Event.ON_PAUSE,
                    Lifecycle.Event.ON_STOP,
                    Lifecycle.Event.ON_DESTROY,
                    Lifecycle.Event.ON_ANY -> {
                    }
                    Lifecycle.Event.ON_RESUME -> {
                        Log.e("TAG", "ON_RESUME LifecycleEventObserver")
                    }
                }
            }
        })

        lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun addLocationListener() {
                Log.e("TAG", "ON_RESUME LifecycleObserver")
            }
        })


    }


    override fun onResume() {
        super.onResume()
        Log.e("TAG", "ON_RESUME override")
    }


}
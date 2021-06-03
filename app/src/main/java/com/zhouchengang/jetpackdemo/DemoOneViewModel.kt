package com.zhouchengang.jetpackdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel

class DemoOneViewModel : ViewModel() {
    var text : MutableLiveData<Int> =MutableLiveData(1)


}
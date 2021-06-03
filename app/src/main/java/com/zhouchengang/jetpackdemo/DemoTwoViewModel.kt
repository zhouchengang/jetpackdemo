package com.zhouchengang.jetpackdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DemoTwoViewModel : ViewModel() {
    var tvContent : MutableLiveData<Int> =MutableLiveData(1)


}
package com.zhouchengang.jetpackdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel


class DemoThreeViewModel(var mState: SavedStateHandle?) : ViewModel() {
    private val CONTENT_KEY = "tvContent"

    var tvContent: MutableLiveData<Int>?
        get() {
            if (true != mState?.contains(CONTENT_KEY)) {
                mState?.set(CONTENT_KEY, 0)
            }
            return mState?.getLiveData(CONTENT_KEY)
        }
        set(value) {
            mState?.set(CONTENT_KEY, value)
        }

}
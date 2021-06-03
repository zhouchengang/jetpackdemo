package com.zhouchengang.jetpackdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_demo_two.*


class DemoTwoFragment : Fragment(R.layout.fragment_demo_two) {

    lateinit var demoTwoViewModel: DemoTwoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        demoTwoViewModel = ViewModelProvider(requireActivity()).get(DemoTwoViewModel::class.java)
//        demoTwoViewModel = ViewModelProvider(this).get(DemoTwoViewModel::class.java) //这种不行
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_content.setOnClickListener {
            demoTwoViewModel.tvContent.value?.let {
                demoTwoViewModel.tvContent.value = it + 1
            }
        }

        demoTwoViewModel.tvContent.observe(viewLifecycleOwner) {
            tv_content.text = it.toString()
        }

    }
}
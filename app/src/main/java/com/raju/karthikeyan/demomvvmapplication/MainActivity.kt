package com.raju.karthikeyan.demomvvmapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.raju.karthikeyan.demomvvmapplication.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DemoApplication).getAppComponent().inject(this)

        observeBaseEvent(viewModel)
        observeViewModalData()
        viewModel.startTimer()
        setUpButtons()
    }

    private fun observeViewModalData() {
        viewModel.getCountData().observe(this, Observer {
            tvTime.text ="Count $it"
        })
    }

    private fun setUpButtons(){
        buttonShowLoading.setOnClickListener {
            viewModel.showLoading()
        }

        buttonHideLoading.setOnClickListener {
            viewModel.hideLoading()
        }

        buttonShowAlert.setOnClickListener {
            viewModel.showAlert()
        }

        buttonShowToast.setOnClickListener {
            viewModel.showToast()
        }
    }
}
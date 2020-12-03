package com.raju.karthikeyan.demomvvmapplication

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.raju.karthikeyan.demomvvmapplication.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DemoApplication).getAppComponent().inject(this)

        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

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
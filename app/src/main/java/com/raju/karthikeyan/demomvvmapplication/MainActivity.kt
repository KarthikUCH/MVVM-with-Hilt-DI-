package com.raju.karthikeyan.demomvvmapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this ).get(MainViewModel::class.java)

        observeViewModalData()
        viewModel.startTimer()
    }

    private fun observeViewModalData() {
        viewModel.getCountData().observe(this, Observer {
            tvTime.text ="Count $it"
        })
    }
}
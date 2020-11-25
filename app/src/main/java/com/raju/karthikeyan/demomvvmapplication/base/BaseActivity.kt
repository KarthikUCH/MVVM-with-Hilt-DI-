package com.raju.karthikeyan.demomvvmapplication.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

open class BaseActivity: AppCompatActivity() {

    fun observeBaseEvent(viewModel: BaseViewModel){
        viewModel.getBaseEventData().observe(this, Observer {
            when(it){
                BaseEvent.SHOW_LOADING -> {toast("Show progress bar loading")}
                BaseEvent.HIDE_LOADING -> {toast("Hide progress bar loading")}
                BaseEvent.SHOW_ALERT -> {toast("Show alert message")}
                BaseEvent.SHOW_TOAST -> {toast("Show toast message")}
            }
        })
    }

    private fun toast(msg: String){
        Toast.makeText(applicationContext, msg, Toast.LENGTH_LONG).show()
    }
}
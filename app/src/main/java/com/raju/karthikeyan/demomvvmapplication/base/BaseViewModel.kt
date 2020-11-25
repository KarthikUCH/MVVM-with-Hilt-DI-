package com.raju.karthikeyan.demomvvmapplication.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    private val baseEvent = MutableLiveData<BaseEvent>()

    fun getBaseEventData(): LiveData<BaseEvent>{
        return baseEvent
    }

    fun showLoading(){
        baseEvent.value = BaseEvent.SHOW_LOADING
    }

    fun hideLoading(){
        baseEvent.value = BaseEvent.HIDE_LOADING
    }

    fun showAlert(){
        baseEvent.value = BaseEvent.SHOW_ALERT
    }

    fun showToast(){
        baseEvent.value = BaseEvent.SHOW_TOAST
    }
}

enum class BaseEvent {
    SHOW_LOADING, HIDE_LOADING, SHOW_ALERT, SHOW_TOAST
}
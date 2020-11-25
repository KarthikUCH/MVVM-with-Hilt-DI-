package com.raju.karthikeyan.demomvvmapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {
    private val ONE_SECOND = 1000L
    private val count = MutableLiveData<Int>()
    var timer: Timer = Timer()
    var timerValue = 0

    fun getCountData(): LiveData<Int> {
        return count
    }

    fun startTimer() {
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                timerValue++
                count.postValue(timerValue)
            }
        }, ONE_SECOND, ONE_SECOND)
    }
}
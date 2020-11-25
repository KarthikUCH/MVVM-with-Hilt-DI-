package com.raju.karthikeyan.demomvvmapplication

import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raju.karthikeyan.demomvvmapplication.base.BaseViewModel
import com.raju.karthikeyan.demomvvmapplication.usecase.UseCaseOne
import com.raju.karthikeyan.demomvvmapplication.usecase.UseCaseTwo
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import java.util.*

@ActivityScoped
class MainViewModel @ViewModelInject constructor (@ApplicationContext context: Context, private val useCaseOne: UseCaseOne, private val useCaseTwo: UseCaseTwo) : BaseViewModel() {
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

    override fun onCleared() {
        super.onCleared()
        println(useCaseOne.print())
        println(useCaseTwo.print())
    }
}
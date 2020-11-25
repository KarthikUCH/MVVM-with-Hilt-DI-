package com.raju.karthikeyan.demomvvmapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.raju.karthikeyan.demomvvmapplication.usecase.UseCaseOne
import com.raju.karthikeyan.demomvvmapplication.usecase.UseCaseTwo

class MainViewModelFactory(private val useCaseOne: UseCaseOne, private val useCaseTwo: UseCaseTwo): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(useCaseOne, useCaseTwo) as T
    }
}
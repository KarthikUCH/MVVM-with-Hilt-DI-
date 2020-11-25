package com.raju.karthikeyan.demomvvmapplication.usecase

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UseCaseOne @Inject constructor(@ApplicationContext context: Context) {

    fun print(){
        println("Use Case 1")
    }
}
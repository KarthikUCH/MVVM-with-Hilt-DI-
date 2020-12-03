package com.raju.karthikeyan.demomvvmapplication.usecase

import android.content.Context
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UseCaseOne @Inject constructor(context: Context, private val retrofit: Retrofit) {

    fun print(){
        println("Use Case 1")
    }
}
package com.raju.karthikeyan.demomvvmapplication.usecase

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UseCaseOne @Inject constructor(@ApplicationContext context: Context, private val retrofit: Retrofit) {

    fun print(){
        println("Use Case 1")
    }
}
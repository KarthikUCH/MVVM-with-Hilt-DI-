package com.raju.karthikeyan.demomvvmapplication.usecase

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UseCaseTwo @Inject constructor( context: Context) {

    fun print(){
        println("Use Case 1")
    }
}
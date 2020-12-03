package com.raju.karthikeyan.demomvvmapplication

import android.app.Application
import com.raju.karthikeyan.demomvvmapplication.di.AppComponent
import com.raju.karthikeyan.demomvvmapplication.di.AppModule
import com.raju.karthikeyan.demomvvmapplication.di.DaggerAppComponent

class DemoApplication: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppCOmponent()
    }

    private fun initAppCOmponent() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    fun getAppComponent(): AppComponent{
        return appComponent
    }
}
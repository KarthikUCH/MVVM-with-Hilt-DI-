package com.raju.karthikeyan.demomvvmapplication.di

import com.raju.karthikeyan.demomvvmapplication.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}
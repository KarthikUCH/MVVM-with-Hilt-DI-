package com.raju.karthikeyan.demomvvmapplication.di

import com.raju.karthikeyan.demomvvmapplication.MainActivity
import com.raju.karthikeyan.demomvvmapplication.di.viewmodel.ViewModelFactoryModule
import com.raju.karthikeyan.demomvvmapplication.di.viewmodel.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, ViewModelFactoryModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}
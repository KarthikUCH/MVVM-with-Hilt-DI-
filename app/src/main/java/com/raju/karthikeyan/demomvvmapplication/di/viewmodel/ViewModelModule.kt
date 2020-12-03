package com.raju.karthikeyan.demomvvmapplication.di.viewmodel

import androidx.lifecycle.ViewModel
import com.raju.karthikeyan.demomvvmapplication.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}
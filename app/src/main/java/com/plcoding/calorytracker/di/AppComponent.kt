package com.plcoding.calorytracker.di

import android.content.Context
import com.plcoding.calorytracker.di.module.SharedPreferencesModule
import com.plcoding.calorytracker.di.module.StorageModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        StorageModule::class,
        SharedPreferencesModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}
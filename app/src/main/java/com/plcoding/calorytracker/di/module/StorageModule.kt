package com.plcoding.calorytracker.di.module

import com.example.core.data.preferences.DefaultPreferences
import com.example.core.domain.preferences.Preferences
import dagger.Module

@Module
abstract class StorageModule {

    abstract fun providePreference(defaultPreferences: DefaultPreferences): Preferences
}
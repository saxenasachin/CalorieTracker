package com.plcoding.calorytracker

import android.app.Application
import com.plcoding.calorytracker.di.DaggerAppComponent

class CalorieTrackerApp : Application() {

    // Instance of the AppComponent that will be used by all the Activities in the project
    val appComponent by lazy {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        DaggerAppComponent.factory().create(applicationContext)
    }


}
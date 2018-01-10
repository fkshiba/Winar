package com.felipeshiba.lab.myapplication.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by felipeshiba on 10/01/18.
 */

@Module
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return application
    }
}
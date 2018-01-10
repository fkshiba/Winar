package com.felipeshiba.lab.myapplication.di

import android.app.Application
import com.felipeshiba.lab.myapplication.App
import com.felipeshiba.lab.myapplication.feature.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by felipeshiba on 10/01/18.
 */

@Singleton
@Component(modules = [(AppModule::class), (NetModule::class)])
interface NetComponent {
    fun inject(app: App)
}
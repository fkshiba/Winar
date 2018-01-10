package com.felipeshiba.lab.myapplication

import android.app.Application
import com.felipeshiba.lab.myapplication.di.AppModule
import com.felipeshiba.lab.myapplication.di.DaggerNetComponent
import com.felipeshiba.lab.myapplication.di.NetComponent
import com.felipeshiba.lab.myapplication.di.NetModule

/**
 * Created by felipeshiba on 10/01/18.
 */

class App: Application() {

    val netComponent: NetComponent by lazy {
        DaggerNetComponent.builder()
                .appModule(AppModule(this))
                .netModule(NetModule("https://api.github.com"))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        netComponent.inject(this)
    }
}
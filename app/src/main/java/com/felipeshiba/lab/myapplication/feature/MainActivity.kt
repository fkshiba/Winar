package com.felipeshiba.lab.myapplication.feature

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.felipeshiba.lab.myapplication.App
import com.felipeshiba.lab.myapplication.R
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val Activity.app : App
        get() = application as App

    @Inject lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }
}

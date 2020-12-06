package com.appsamurai.storyly.mobiler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobilerDevSDK = MobilerDevSDK()
        Log.d("[MobilerDev]", mobilerDevSDK.testMethod())
    }
}
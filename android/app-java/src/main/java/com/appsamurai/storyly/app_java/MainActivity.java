package com.appsamurai.storyly.app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.appsamurai.storyly.mobiler.MobilerDevSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobilerDevSDK mobilerDevSDK = new MobilerDevSDK();
        Log.d("[MobilerDev]", mobilerDevSDK.testMethod());
    }
}
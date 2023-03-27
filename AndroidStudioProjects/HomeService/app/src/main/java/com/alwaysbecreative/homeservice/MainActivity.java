package com.alwaysbecreative.homeservice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Util.blackIconStatusBar(MainActivity.this, R.color.white);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1 = new Intent(MainActivity.this, Login.class);
                startActivity(intent1);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
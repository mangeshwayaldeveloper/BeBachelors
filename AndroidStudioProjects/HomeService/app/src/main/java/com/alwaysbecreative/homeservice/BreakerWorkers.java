package com.alwaysbecreative.homeservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BreakerWorkers extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaker_workers);
        Util.blackIconStatusBar(BreakerWorkers.this, R.color.white);
        button = findViewById(R.id.breakerworker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                String num;
                String text;
                num = "+9188565832195";
                text = "Hello Sir I Need Breaker Workers At My Place";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                i = intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + num + "&text=" + text));
                startActivity(i);
            }
        });
    }
}
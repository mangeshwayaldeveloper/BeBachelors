package com.alwaysbecreative.homeservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommonWorkers extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_workers);
        Util.blackIconStatusBar(CommonWorkers.this,R.color.white);
        button=findViewById(R.id.commonWorker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                String num;
                String text;
                num="+918856832195";
                text="Hello Sir I Need Common Workers";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                i=intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+num+ "&text="+text));
                startActivity(i);
            }
        });
    }
}
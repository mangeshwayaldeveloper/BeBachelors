package com.alwaysbecreative.homeservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Content extends AppCompatActivity implements View.OnClickListener {
    public CardView Plumbing, Electrician, Cleaner, Painter, Welders, Carpenter,
            CommonWorkers, ServiceMan, Helper, Gardner, Driver, Mechanical, StyleWorkers,
            BreakerWorkers, Builder, OtherServices,userProfile,feedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Util.blackIconStatusBar(Content.this, R.color.statusbar);
        Plumbing = (CardView) findViewById(R.id.cardview1);
        Electrician = (CardView) findViewById(R.id.cardview2);
        Cleaner = (CardView) findViewById(R.id.cardview3);
        Painter = findViewById(R.id.cardview4);
        Welders = findViewById(R.id.cardview5);
        Carpenter = findViewById(R.id.cardview6);
        CommonWorkers = findViewById(R.id.cardview7);
        ServiceMan = findViewById(R.id.cardview8);
        Helper = findViewById(R.id.cardview9);
        Gardner = findViewById(R.id.cardview10);
        Driver = findViewById(R.id.cardview11);
        Mechanical = findViewById(R.id.cardview12);
        StyleWorkers = findViewById(R.id.cardview13);
        BreakerWorkers = findViewById(R.id.cardview14);
        Builder = findViewById(R.id.cardview15);
        OtherServices = findViewById(R.id.cardview16);
        userProfile=findViewById(R.id.cardview17);
        feedback=findViewById(R.id.cardview18);

        Plumbing.setOnClickListener(this);
        Electrician.setOnClickListener(this);
        Cleaner.setOnClickListener(this);
        Painter.setOnClickListener(this);
        Welders.setOnClickListener(this);
        Carpenter.setOnClickListener(this);
        CommonWorkers.setOnClickListener(this);
        ServiceMan.setOnClickListener(this);
        Helper.setOnClickListener(this);
        Gardner.setOnClickListener(this);
        Driver.setOnClickListener(this);
        Mechanical.setOnClickListener(this);
        StyleWorkers.setOnClickListener(this);
        BreakerWorkers.setOnClickListener(this);
        Builder.setOnClickListener(this);
        OtherServices.setOnClickListener(this);
        userProfile.setOnClickListener(this);
        feedback.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardview1:
                Intent intent1 = new Intent(Content.this, com.alwaysbecreative.homeservice.Plumbing.class);
                startActivity(intent1);
                break;
            case R.id.cardview2:
                Intent intent2 = new Intent(Content.this, com.alwaysbecreative.homeservice.Electriciant.class);
                startActivity(intent2);
                break;
            case R.id.cardview3:
                Intent intent3 = new Intent(Content.this, com.alwaysbecreative.homeservice.Cleaner.class);
                startActivity(intent3);
                break;
            case R.id.cardview4:
                Intent intent4 = new Intent(Content.this, com.alwaysbecreative.homeservice.Painter.class);
                startActivity(intent4);
                break;
            case R.id.cardview5:
                Intent intent5 = new Intent(Content.this, com.alwaysbecreative.homeservice.Welders.class);
                startActivity(intent5);
                break;
            case R.id.cardview6:
                Intent intent6 = new Intent(Content.this, com.alwaysbecreative.homeservice.Carpenter.class);
                startActivity(intent6);
                break;
            case R.id.cardview7:
                Intent intent7 = new Intent(Content.this, com.alwaysbecreative.homeservice.CommonWorkers.class);
                startActivity(intent7);
                break;
            case R.id.cardview8:
                Intent intent8 = new Intent(Content.this, com.alwaysbecreative.homeservice.ServiceMan.class);
                startActivity(intent8);
                break;
            case R.id.cardview9:
                Intent intent9 = new Intent(Content.this, com.alwaysbecreative.homeservice.Helper.class);
                startActivity(intent9);
                break;
            case R.id.cardview10:
                Intent intent10 = new Intent(Content.this, com.alwaysbecreative.homeservice.Gardner.class);
                startActivity(intent10);
                break;
            case R.id.cardview11:
                Intent intent11 = new Intent(Content.this, com.alwaysbecreative.homeservice.Driver.class);
                startActivity(intent11);
                break;
            case R.id.cardview12:
                Intent intent12 = new Intent(Content.this, com.alwaysbecreative.homeservice.Mechanical.class);
                startActivity(intent12);
                break;
            case R.id.cardview13:
                Intent intent13 = new Intent(Content.this, com.alwaysbecreative.homeservice.StyleWorkers.class);
                startActivity(intent13);
                break;
            case R.id.cardview14:
                Intent intent14 = new Intent(Content.this, com.alwaysbecreative.homeservice.BreakerWorkers.class);
                startActivity(intent14);
                break;
            case R.id.cardview15:
                Intent intent15 = new Intent(Content.this, com.alwaysbecreative.homeservice.Builders.class);
                startActivity(intent15);
                break;
            case R.id.cardview16:
                Intent intent16 = new Intent(Content.this, com.alwaysbecreative.homeservice.OtherServices.class);
                startActivity(intent16);
                break;
            case R.id.cardview17:
                Intent intent17=new Intent(Content.this,com.alwaysbecreative.homeservice.Profile.class);
                startActivity(intent17);
                break;
            case R.id.cardview18:
                Intent intent18=new Intent(Content.this, com.alwaysbecreative.homeservice.feedback.class);
                startActivity(intent18);
                break;
        }

    }
}
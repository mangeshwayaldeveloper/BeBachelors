package com.alwaysbecreative.homeservice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.razorpay.Checkout;
import com.razorpay.PaymentData;

import org.json.JSONObject;
import org.w3c.dom.Text;

public class OtherServices extends AppCompatActivity {
Button PayBtn;
TextView PayStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_services);
        Util.blackIconStatusBar(OtherServices.this,R.color.white);
        Checkout.preload(getApplicationContext());
//implementing payment gateway
        PayBtn=findViewById(R.id.paybtn);
        PayStatus=findViewById(R.id.paymentstatus);
        PayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PaymentNow("100");
            }
        });
    }

    private void PaymentNow(String ammount) {
        final Activity activity=this;
        Checkout checkout=new Checkout();
        checkout.setKeyID("rzp_test_AFjvxlu5nFqiPG");
        checkout.setImage(R.drawable.home);

        double finalAmount=Float.parseFloat(ammount)*100;
        try{
            JSONObject options=new JSONObject();
            options.put("name","HomeService");
            options.put("Description","Reference No. #123456");
            options.put("image","res/drawable/razorpay.png");
            options.put("theme.color","#3399c");
            options.put("currency","INR");
            options.put("amount",finalAmount+"");
            options.put("prefill.email","bebachelors@gmail.com");
            options.put("prefill.contact","8856832195");

            checkout.open(activity,options);

        }catch (Exception e){
            Log.e("TAG","Error In Starting Razorpay",e);
        }


    }
}
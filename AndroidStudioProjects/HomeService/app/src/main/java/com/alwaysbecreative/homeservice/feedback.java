package com.alwaysbecreative.homeservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class feedback extends AppCompatActivity {
    EditText mail,writeFeedback;
    Button feedback_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Util.blackIconStatusBar(feedback.this,R.color.white);
        mail=findViewById(R.id.feedback_email);
        writeFeedback=findViewById(R.id.feedback_give);
        feedback_btn=findViewById(R.id.send);

        feedback_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"bbachelorsservice@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                email.putExtra(Intent.EXTRA_TEXT,writeFeedback.getText().toString());
                email.setType("message/rfc822");
                if (email.resolveActivity(getPackageManager())!=null){
                    startActivity(email);
                }

            }
        });
    }
}
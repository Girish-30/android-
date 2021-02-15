package com.example.girish.exerzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.Calendar;

public class Techniques extends AppCompatActivity {
    Button warm,tech,calender;
    ImageButton  defence ,distance ,timing ,feinting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techniques);




        calender=(Button) findViewById(R.id.btn_cal);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Techniques.this, Calendar.class);
                startActivity(i);
            }
        });

        tech=(Button) findViewById(R.id.btn_tech);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Techniques.this,Techniques.class);
                startActivity(ii);
            }
        });
        warm=(Button) findViewById(R.id.btn_warmup);
        warm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aa = new Intent(Techniques.this , MainActivity.class);
                startActivity(aa);
            }
        });


        defence=(ImageButton) findViewById(R.id.imgdefence);
        defence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ee = new Intent(Techniques.this , Defence.class);
                startActivity(ee);
            }
        });


        distance=(ImageButton) findViewById(R.id.imgdistance);
        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ees = new Intent(Techniques.this , Distance.class);
                startActivity(ees);
            }
        });

        timing=(ImageButton) findViewById(R.id.imgtiming);
        timing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eews = new Intent(Techniques.this , timing.class);
                startActivity(eews);
            }
        });


        feinting=(ImageButton) findViewById(R.id.imgFeinting);
        feinting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eewsq = new Intent(Techniques.this , Feinting.class);
                startActivity(eewsq);
            }
        });

    }





}

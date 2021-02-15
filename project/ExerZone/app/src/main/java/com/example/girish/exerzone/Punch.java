package com.example.girish.exerzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Punch extends AppCompatActivity {
    ImageButton imgbtn,imgbtn2,imgbtn3,imgbtn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punch);

        imgbtn=(ImageButton) findViewById(R.id.imageButton);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Punch.this,jabpunch.class);
                startActivity(i);

            }
        });

        imgbtn2=(ImageButton) findViewById(R.id.imageButton2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(Punch.this,hookpunch.class);
                startActivity(is);

            }
        });
        imgbtn3=(ImageButton) findViewById(R.id.imageButton3);
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent if = new Intent(Punch.this,uppercut.class);
                startActivity(if);

            }
        });
        imgbtn4=(ImageButton) findViewById(R.id.imageButton4);
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(Punch.this,Cross.class);
                startActivity(id);

            }
        });
    }
}

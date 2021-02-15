package com.example.girish.exerzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kick extends AppCompatActivity {
    ImageButton imageButton ,imageButton2 ,imageButton3 ,imageButton4 ,imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kick);


        imageButton=(ImageButton) findViewById(R.id.img);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(Kick.this,frontsnap.class);
                startActivity(is);

            }
        });

        imageButton2 = (ImageButton) findViewById(R.id.img2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r= new Intent(Kick.this,sidekick.class);
                startActivity(r);

            }
        });
        imageButton3=(ImageButton) findViewById(R.id.img3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ggg = new Intent(Kick.this, Crescent.class);
                startActivity(ggg);

            }
        });
        imageButton4=(ImageButton) findViewById(R.id.img4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hg = new Intent(Kick.this, reversecrescent.class);
                startActivity(hg);

            }
        });
        imageButton5=(ImageButton) findViewById(R.id.img5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ll = new Intent(Kick.this,roundhouse.class);
                startActivity(ll);

            }
        });
    }
}

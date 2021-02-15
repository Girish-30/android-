package com.example.girish.exerzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    Button warm;
    Button tech;
    Button calender;
    Button imgbtn5,imgbtn6;
     /*...................TAB LINK ............................................................................. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calender=(Button) findViewById(R.id.btn_cal);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Calender.class);
                startActivity(i);
            }
        });

        tech=(Button) findViewById(R.id.btn_tech);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this,Techniques.class);
                startActivity(ii);
            }
        });
        warm=(Button) findViewById(R.id.btn_warmup);
        warm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aa = new Intent(MainActivity.this , MainActivity.class);
                startActivity(aa);
            }
        });




        imgbtn5=(Button) findViewById(R.id.punch);
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(MainActivity.this ,Punch.class);
                startActivity(ic);

            }
        });


        imgbtn6=(Button) findViewById(R.id.kicks);
        imgbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ix = new Intent(MainActivity.this , Kick.class);
                startActivity(ix);

            }
        });


    }
       /*................................................OPTION MENU......................................................... */

    private boolean onCreateOptionMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        return  true;
    }

    /*..............................option menu onclick values have been given .................................*/

    private boolean onOptionItemSelected(MenuItem item){

        int id=item.getItemId();
        if(id==R.id.id_videos){

            Intent intentvideo  = new Intent(MainActivity.this ,Videos.class)
            startActivities(new Intent[]{intentvideo});
            return  true;
        }
        if(id==R.id.id_shoping){
            Intent intentshoping  = new Intent(MainActivity.this,shopingwebsite.class);
            startActivities(new Intent[]{intentshoping});

            return  true;

        }

        if(id==R.id.id_about){
            Intent  intentabout = new Intent(MainActivity.this,aboutus.class);
            startActivities(new Intent[]{intentabout});

            return  true;

        }

        if(id==R.id.id_rateus){
            Intent  intentrate = new Intent(MainActivity.this,Rateus.class);
            startActivities(new Intent[]{intentrate});

            return  true;

        }

        if(id==R.id.id_feedback){
            Intent intentfeedback  = new Intent(MainActivity.this,Feedback.class);
            startActivities(new Intent[]{intentfeedback});

            return  true;

        }
        return true;

    }
}

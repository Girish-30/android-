package com.example.girish.exerzone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Calender extends AppCompatActivity {

    CalendarView calendarView;
    TextView dateDisplay;
    Button warm;
    Button tech;
    Button calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);





        calender=(Button) findViewById(R.id.btn_cal);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Calender .this, Calendar.class);
                startActivity(i);
            }
        });
        tech=(Button) findViewById(R.id.btn_tech);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Calender .this,Techniques.class);
                startActivity(ii);
            }
        });
        warm=(Button) findViewById(R.id.btn_warmup);
        warm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aa = new Intent(Calender .this , MainActivity.class);
                startActivity(aa);
            }
        });










        calendarView = (CalendarView) findViewById(R.id.btn_cal);
        dateDisplay = (TextView) findViewById(R.id.date_display);
        dateDisplay.setText("Date: ");

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Date: " + i2 + " / " + i1 + " / " + i);

                Toast.makeText(getApplicationContext(), "Selected Date:\n" + "Day = " + i2 + "\n" + "Month = " + i1 + "\n" + "Year = " + i, Toast.LENGTH_LONG).show();
            }
        });



    }
}
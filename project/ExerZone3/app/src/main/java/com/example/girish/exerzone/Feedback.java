package com.example.girish.exerzone;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {

    EditText name ,email ,feedback;
    Button save;

    DatabaseReference databaseReference;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        save=(Button) findViewById (R.id.save);
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);

        databaseReference = FirebaseDatabase. getInstance().getReference().child("User");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddDate();

            }
        });


    }
    public void btnClick(View v){

        Toast.makeText(this,"THANKS FOR UR FEEDBACK",Toast.LENGTH_SHORT).show();
    }
    public void AddDate(){
        String Name =name.getText().toString().trim();
        String Email = email.getText().toString().trim();
        String Feedback =feedback.getText().toString().trim();


        saveData saveData = new saveData(Name , Email ,Feedback);
        databaseReference.push().setValue(saveData);

        /*saveData saveData=new saveData(Name , Email , Feedback);
        databaseReference.push().setValue(saveData);*/

    }
}

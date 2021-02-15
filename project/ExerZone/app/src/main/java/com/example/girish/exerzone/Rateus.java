package com.example.girish.exerzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Rateus extends AppCompatActivity {
    Button btn;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rateus);
        btn =(Button) findViewById(R.id.button);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);

    }


    public void onBtnClick(View view) {

        float ratingvalue=ratingBar.getRating();
        /*  ................ getActivity() is not working is get Application method is used..........*/

        Toast.makeText(getApplication() ,"Rating is ::" +ratingvalue, LENGTH_SHORT ).show();
    }
}

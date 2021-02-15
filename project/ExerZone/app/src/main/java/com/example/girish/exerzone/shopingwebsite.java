package com.example.girish.exerzone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class shopingwebsite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopingwebsite);
    }

    public void browser1(View view) {

        Intent google = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.google.co.in/search?q=online+shopping&oq=online+shopping&aqs=chrome..69i57j0l5.14125j0j7&sourceid=chrome&ie=UTF-8"));
        startActivity(google);
    }

    public void flipkart( View view){
        Intent flipkart = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.flipkart.com/search?q=karate%20equipments&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off"));
        startActivity(flipkart);
    }
    public void amazon( View view){
        Intent amazon = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.amazon.in/s/ref=nb_sb_ss_c_1_11?url=search-alias%3Daps&field-keywords=karate+equipments&sprefix=karate+equi%2Caps%2C605&crid=EV044DYM0NA8"));
        startActivity(amazon);
    }
    public void blitzsport( View view){
        Intent blitzsport = new Intent(Intent.ACTION_VIEW , Uri.parse("http://www.blitzsport.com/karate"));
        startActivity(blitzsport);
    }
    public void snapdeal( View view){
        Intent snapdeal = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.snapdeal.com/products/sports-martial-arts?sort=plrty"));
        startActivity(snapdeal);
    }
}


package com.example.girish.exerzone;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videos extends AppCompatActivity {
    Button chk , chk1 ,chk2 ,chk3;
    VideoView videov,videov1,videov2,videov3;
    MediaController mediaC,mediaC1,mediaC2,mediaC3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        chk=(Button)findViewById(R.id.button10);
        videov=(VideoView) findViewById(R.id.videoView);
        mediaC= new MediaController(this);

        chk1=(Button)findViewById(R.id.button11);
        videov1=(VideoView) findViewById(R.id.videoView1);
        mediaC1= new MediaController(this);

        chk2=(Button)findViewById(R.id.button13);
        videov2=(VideoView) findViewById(R.id.videoView2);
        mediaC2= new MediaController(this);

        chk3=(Button)findViewById(R.id.button14);
        videov3=(VideoView) findViewById(R.id.videoView3);
        mediaC3= new MediaController(this);
    }







    public void kickboxing(View view) {

        Intent kickboxing = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/results?search_query=kickboxing+fight"));
        startActivity(kickboxing);
    }

    public void karate(View view) {
        Intent karate = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/results?search_query=karate+fight"));
        startActivity(karate);
    }

    public void ufc(View view) {

        Intent ufc = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/results?search_query=ufc+fight"));
        startActivity(ufc);
    }

    public void muaythai(View view) {

        Intent muaythai = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/results?search_query=muay+thai+fight"));
        startActivity(muaythai);
    }


    public void videoplay(View v){
        String videopath = "android.resource://com.example.girish.exerzone/"  ;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();


    }
    public void videoplay1(View v){
        String videopath1 = "android.resource://com.example.girish.exerzone/" ;
        Uri uri = Uri.parse(videopath1);
        videov1.setVideoURI(uri);
        videov1.setMediaController(mediaC1);
        mediaC1.setAnchorView(videov1);
        videov1.start();

    }

    public void videoplay2(View v){
        String videopath2 = "android.resource://com.example.girish.exerzone/" ;
        Uri uri = Uri.parse(videopath2);
        videov2.setVideoURI(uri);
        videov2.setMediaController(mediaC2);
        mediaC2.setAnchorView(videov2);
        videov2.start();


    }
    public void videoplay3(View v){
        String videopath3 = "android.resource://com.example.girish.exerzone/" ;
        Uri uri = Uri.parse(videopath3);
        videov3.setVideoURI(uri);
        videov3.setMediaController(mediaC3);
        mediaC3.setAnchorView(videov3);
        videov3.start();

    }

}
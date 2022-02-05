package com.example.minimusicapp;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;


public class Music1 m1 extends Service{
    MediaPlayer myPlayer;


    public IBinder onBind(Intent intent) { return null;
    }
    @Override
    public void onCreate() {


        myPlayer = MediaPlayer.create(this,R.raw.test1);

    }
    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Service Started and Playing Music", Toast.LENGTH_LONG).show(); myPlayer.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped and Music Stopped", Toast.LENGTH_LONG).show(); myPlayer.stop();
    }}


}

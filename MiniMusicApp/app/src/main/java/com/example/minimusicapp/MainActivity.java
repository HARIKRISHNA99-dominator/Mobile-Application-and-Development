package com.example.minimusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView m1 = findViewById(R.id.m1);
        LottieAnimationView m2 = findViewById(R.id.m2);
        LottieAnimationView m3 = findViewById(R.id.m3);
        LottieAnimationView m4 = findViewById(R.id.m4);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isMyServiceRunning(Music2.class)){

                }
            }
        });





    }
}
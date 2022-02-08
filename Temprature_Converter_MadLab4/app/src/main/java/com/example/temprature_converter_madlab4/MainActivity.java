package com.example.temprature_converter_madlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1,e2;
        LottieAnimationView b1,b2;
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        e1=findViewById(R.id.E1);
        e2=findViewById(R.id.E2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(e1.getText().toString());
                double b=d-32;
                b=b*0.5555;
                e2.setText(String.valueOf(b));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(e1.getText().toString());
                double b=d*1.8;
                b=b+32;
                e2.setText(String.valueOf(b));

            }
        });


    }
}
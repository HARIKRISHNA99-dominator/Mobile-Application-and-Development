package com.example.timepickerlab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView T1,T2,T3;
    TimePicker TP;
    EditText E1,E2,E3;
    Button B1,B2,B3,B4;
    int H,M;
    String S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1=findViewById(R.id.T1);
        T2=findViewById(R.id.T2);
        T3=findViewById(R.id.T3);
        TP=findViewById(R.id.TP);
        E1=findViewById(R.id.E1);
        E2=findViewById(R.id.E2);
        E3=findViewById(R.id.E3);
        B1=findViewById(R.id.B1);
        B2=findViewById(R.id.B2);
        B3=findViewById(R.id.B3);
        B4=findViewById(R.id.B4);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                H=TP.getCurrentHour();
                M=TP.getCurrentMinute();
                S=String.valueOf(H)+":"+String.valueOf(M);
                E1.setText(S);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                H=TP.getCurrentHour();
                M=TP.getCurrentMinute();
                S=String.valueOf(H)+":"+String.valueOf(M);
                E2.setText(S);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                H=TP.getCurrentHour();
                M=TP.getCurrentMinute();
                S=String.valueOf(H)+":"+String.valueOf(M);
                E3.setText(S);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(E1.getText().toString().equals("")||E2.getText().toString().equals("")||E3.getText()
                        .toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please Set All events",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"All Events Was Set",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

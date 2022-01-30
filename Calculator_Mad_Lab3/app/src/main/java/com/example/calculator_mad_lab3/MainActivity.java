package com.example.calculator_mad_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double result;
    char val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = findViewById(R.id.EditText);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button b0 = findViewById(R.id.button0);
        Button bp = findViewById(R.id.bp);
        Button bm = findViewById(R.id.bm);
        Button bd = findViewById(R.id.bd);
        Button bs = findViewById(R.id.bs);
        Button bc = findViewById(R.id.bc);
        Button be = findViewById(R.id.be);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(e1.getText().toString().equals("")));
                e1.setText(String.valueOf(e1.getText().toString()+0));
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = '+';
                result = Double.parseDouble(e1.getText().toString());
                e1.setText(String.valueOf(""));

            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = '-';
                result = Double.parseDouble(e1.getText().toString());
                e1.setText(String.valueOf(""));

            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = '/';
                result = Double.parseDouble(e1.getText().toString());
                e1.setText(String.valueOf(""));

            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = '*';
                result = Double.parseDouble(e1.getText().toString());
                e1.setText(String.valueOf(""));

            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(""));
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val=='+'){
                    double d=Double.parseDouble(e1.getText().toString());
                    e1.setText(String.valueOf(result+d));
                }
                else if(val=='-'){
                    double d=Double.parseDouble(e1.getText().toString());
                    e1.setText(String.valueOf(result-d));
                }
                else if(val=='*'){
                    double d=Double.parseDouble(e1.getText().toString());
                    e1.setText(String.valueOf(result*d));
                }
                else{
                    double d=Double.parseDouble(e1.getText().toString());
                    e1.setText(String.valueOf(result/d));
                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+1));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+2));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+3));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+4));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+5));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+5));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+6));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+7));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+8));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(String.valueOf(e1.getText().toString()+9));
            }
        });

    }
}
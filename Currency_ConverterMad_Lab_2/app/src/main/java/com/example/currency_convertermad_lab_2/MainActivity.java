package com.example.currency_convertermad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1;
Button b1;
TextView tv;
RadioGroup rg;
RadioButton rb;
String op;
double res;
String result;
int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.radiogroup);
        e1 = findViewById(R.id.T1);
        tv = findViewById(R.id.T2);
        b1 = findViewById(R.id.convert);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                int i = rg.getCheckedRadioButtonId();
                rb = findViewById(i);
                op = rb.getText().toString();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op.equals("USD")) {
                    n = Integer.parseInt(e1.getText().toString());
                    res = (double)n * 0.014;
                }
                else if (op.equals("EURO")) {
                    n =Integer.parseInt(e1.getText().toString());
                    res = (double)n * 0.011;
                }
                else if (op.equals("YEN")) {
                    n =Integer.parseInt(e1.getText().toString());
                    res = (double)n * 1.45;
                }
                result = Double.toString(res);
                tv.setText(result);
            }
        });



    }
}
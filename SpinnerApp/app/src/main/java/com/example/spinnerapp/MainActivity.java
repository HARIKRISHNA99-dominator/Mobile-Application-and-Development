package com.example.spinnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t3;
    TextView t4;
    Spinner s1,s2,s3;
    Button b1, b2;
    int n1 = 0, n2 = 0, n3 = 0;
    int total = 0;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double[]n={0,0};
        double[]d={0,0};

        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);

        t1 = findViewById(R.id.T1);
        t2 = findViewById(R.id.T2);
        t3 = findViewById(R.id.T3);
        t4 = findViewById(R.id.T4);

        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);

        ArrayAdapter<CharSequence> a1= ArrayAdapter.createFromResource
                (this,R.array.list, R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> a2= ArrayAdapter.createFromResource
                (this,R.array.dis, R.layout.support_simple_spinner_dropdown_item);

        s1.setAdapter(a1);
        s2.setAdapter(a1);
        s3.setAdapter(a1);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0]
                        + Double.parseDouble(parent.getItemAtPosition(position).toString());


                t1.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString()) * 500));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0]
                        + Double.parseDouble(parent.getItemAtPosition(position).toString());


                t2.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString()) * 200));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0]
                        + Double.parseDouble(parent.getItemAtPosition(position).toString());


                t3.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString()) * 100));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(t1.getText().toString());
                n2 = Integer.parseInt(t2.getText().toString());
                n3 = Integer.parseInt(t3.getText().toString());
                total = (n1 * 500) + (n2 * 200) + (n3 * 100);
                res = Double.toString(total);
                t4.setText(res);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
        }
}

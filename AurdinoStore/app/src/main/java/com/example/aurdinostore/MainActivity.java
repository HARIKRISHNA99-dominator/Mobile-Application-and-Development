package com.example.aurdinostore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1, t2, t3;
    TextView t4;
    Button b1, b2;
    int n1 = 0, n2 = 0, n3 = 0;
    int total = 0;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome To Aurdino Store", Toast.LENGTH_LONG).show();
        t1 = findViewById(R.id.T1);
        t2 = findViewById(R.id.T2);
        t3 = findViewById(R.id.T3);
        t4 = findViewById(R.id.T4);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(t1.getText().toString());
                n2 = Integer.parseInt(t2.getText().toString());
                n3 = Integer.parseInt(t3.getText().toString());
                total = (n1 * 500) + (n2 * 250) + (n3 * 200);
                res = Double.toString(total);
                t4.setText(res);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
    }
}

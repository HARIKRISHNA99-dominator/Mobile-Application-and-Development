package com.example.login_page_madlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to VIT-Login Page", Toast.LENGTH_LONG).show();
        Image i1;
        EditText e1,e2;
        TextView t1;
        e1 = findViewById(R.id.Login);
        e2 = findViewById(R.id.Password);
        Button b1;
        b1=findViewById(R.id.B1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (
                        ("99".equals(e1.getText().toString())&&
                                "".equals(e2.getText().toString()))
                        || ("HARI".equals(e1.getText().toString())&&
                                "HARI1234".equals(e2.getText().toString())
                        )
                )
                {
                    Toast.makeText(getApplicationContext(),"SUCESSFUL LOGIN", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"LOGIN NOT VALID", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
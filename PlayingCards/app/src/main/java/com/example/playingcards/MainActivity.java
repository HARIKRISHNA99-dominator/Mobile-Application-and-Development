package com.example.playingcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome To Cardz", Toast.LENGTH_SHORT).show();
         EditText e1 =findViewById(R.id.E1);
         EditText e2 =findViewById(R.id.E2);
         EditText e3 =findViewById(R.id.E3);
         EditText e4 =findViewById(R.id.E4);
         EditText e5 =findViewById(R.id.E5);
         EditText e6 =findViewById(R.id.E6);
         EditText e7 =findViewById(R.id.E7);
         EditText e8 =findViewById(R.id.E8);
         EditText e9 =findViewById(R.id.E9);
         EditText e10 =findViewById(R.id.E10);
         EditText e11 =findViewById(R.id.E11);

        Button b1=findViewById(R.id.B1);
        Button b2=findViewById(R.id.B2);

        int arr[]=new int[5];


        b1.setOnClickListener(new View.OnClickListener() { public void onClick(View v)
        {
            Random rand = new Random();
            arr[0]=rand.nextInt(10);
            e1.setText(String.valueOf(arr[0]));
            arr[1]=rand.nextInt(10);
            e2.setText(String.valueOf(arr[1]));
            arr[2]=rand.nextInt(10);
            e3.setText(String.valueOf(arr[2]));
            arr[3]=rand.nextInt(10);
            e4.setText(String.valueOf(arr[3]));
            arr[4]=rand.nextInt(10);
            e5.setText(String.valueOf(arr[4]));

        }
        });
        b2.setOnClickListener(new View.OnClickListener() { public void onClick(View v)
        {
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                }


                e6.setText(String.valueOf(arr[0]));
                e7.setText(String.valueOf(arr[1]));
                e8.setText(String.valueOf(arr[2]));
                e9.setText(String.valueOf(arr[3]));
                e10.setText(String.valueOf(arr[4]));

                e11.setText(String.valueOf(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));


        }
        });


    }
}


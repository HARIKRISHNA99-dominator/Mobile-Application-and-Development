package com.example.dateandtimepicker;

import static android.text.InputType.TYPE_NULL;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText date,time,DateandTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.E1);
        time = findViewById(R.id.E2);
        DateandTime = findViewById(R.id.E3);

        date.setInputType(InputType.TYPE_NULL);
        time.setInputType(InputType.TYPE_NULL);
        DateandTime.setInputType(InputType.TYPE_NULL);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog(date);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showtimeDialog(time);
            }
        });

        DateandTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateTimeDialog(DateandTime);
            }
        });
    }

    private void showDateTimeDialog(EditText dateandTime) {
        Calendar calender= Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayofmonth) {

                calender.set(Calendar.YEAR,year);
                calender.set(Calendar.MONTH,month);
                calender.set(Calendar.DAY_OF_MONTH,dayofmonth);
                TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourofday, int minute) {
                        calender.set(Calendar.HOUR_OF_DAY,hourofday);
                        calender.set(Calendar.MINUTE,minute);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm");
                        dateandTime.setText(simpleDateFormat.format(calender.getTime()));
                    }
                };
                new TimePickerDialog(MainActivity.this,timeSetListener,calender.get(Calendar.HOUR_OF_DAY),calender.get(Calendar.MINUTE),false).show();
            }
        };
        new DatePickerDialog(MainActivity.this,dateSetListener,calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();

    }


    public void showtimeDialog(EditText time) {
        Calendar calender= Calendar.getInstance();
        TimePickerDialog.OnTimeSetListener timeSetListener=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourofday, int minute) {
                calender.set(Calendar.HOUR_OF_DAY,hourofday);
                calender.set(Calendar.MINUTE,minute);
                SimpleDateFormat simpleDateFormat=  new SimpleDateFormat("HH:mm");
                time.setText(simpleDateFormat.format(calender.getTime()));
            }
        };
        new TimePickerDialog(MainActivity.this,timeSetListener,calender.get(Calendar.HOUR_OF_DAY),calender.get(Calendar.MINUTE),false).show();
    }

    private void showDateDialog(EditText date) {
        Calendar calender= Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayofmonth) {
                calender.set(Calendar.YEAR,year);
                calender.set(Calendar.MONTH,month);
                calender.set(Calendar.DAY_OF_MONTH,dayofmonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yy-MM-dd");
                date.setText(simpleDateFormat.format(calender.getTime()));
            }
        };
        new DatePickerDialog(MainActivity.this,dateSetListener,calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
}
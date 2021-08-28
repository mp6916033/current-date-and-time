package com.example.datetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.datetime.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Calendar c;
    SimpleDateFormat s;
    String Date;
    TextView Get;
    Button Btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Get=findViewById(R.id.get);
        Btn=findViewById(R.id.btn);
        c=Calendar.getInstance();
        s=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date=s.format(c.getTime());

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Get.setText(Date);
            }
        });







    }
}
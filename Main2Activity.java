package com.example.rafimirelproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String temp = getIntent().getExtras().getString("second");
        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(temp);
    }
}

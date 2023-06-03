package com.example.textcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RezultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezult);

        String rez = getIntent().getStringExtra("rez");
        TextView textView = findViewById(R.id.rezultat);
        textView.setText(rez);

    }
}
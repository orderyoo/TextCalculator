package com.example.textcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButtonSum(View view){
        EditText editText = findViewById(R.id.numberFirst);
        EditText editText1 = findViewById(R.id.numberSecond);
        int num1 = Integer.parseInt(editText.getText().toString());
        int num2 = Integer.parseInt(editText1.getText().toString());
        int rez = num1 + num2;
        String rez1 = num1 + " + " + num2 + " = " + rez;
        Intent intent = new Intent(MainActivity.this, RezultActivity.class);
        intent.putExtra("rez", rez1);
        startActivity(intent);


    }
}
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
        int first = Integer.parseInt(editText.getText().toString());
        int second = Integer.parseInt(editText1.getText().toString());
        int result = first + second;
        String txt;
        //String rez1 = num1 + " + " + num2 + " = " + rez;
        if(result < 0 && second < 0){
            txt = first + " + (" + second + ") = (" + result + ")";
        }else if(second < 0){
            txt = first + " + (" + second + ") = " + result;
        } else if(result < 0){
            txt = first + " + " + second + " = (" + result + ")";
        } else {
            txt = first + " + " + second + " = " + result;}
        Intent intent = new Intent(MainActivity.this, RezultActivity.class);
        intent.putExtra("rez", txt);
        startActivity(intent);


    }
}
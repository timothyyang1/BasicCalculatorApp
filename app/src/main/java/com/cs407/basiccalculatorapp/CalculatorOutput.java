package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorOutput extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_output);
        textView=(TextView) findViewById(R.id.textView3);
        Intent intent=getIntent();
        String result=intent.getStringExtra("message");
        textView.setText("Result: " + result);
    }
}
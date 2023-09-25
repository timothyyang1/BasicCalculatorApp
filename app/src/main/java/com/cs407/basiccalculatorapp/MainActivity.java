package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void goToActivity(String result) {
        Intent intent=new Intent(this, CalculatorOutput.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }

    public void errorMessage() {
        Intent intent=new Intent(this, CalculatorOutput.class);
        intent.putExtra("message", "undefined, input divided by 0");
        startActivity(intent);
    }

    public void addition(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int result = Integer.parseInt(myTextField1.getText().toString()) + Integer.parseInt(myTextField2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void subtraction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int result = Integer.parseInt(myTextField1.getText().toString()) - Integer.parseInt(myTextField2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void multiply(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int result = Integer.parseInt(myTextField1.getText().toString()) * Integer.parseInt(myTextField2.getText().toString());
        goToActivity(String.valueOf(result));
    }

    public void divide(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        if (Integer.parseInt(myTextField2.getText().toString())==0) {
            errorMessage();
        } else {
            double result = (double) Integer.parseInt(myTextField1.getText().toString()) / Integer.parseInt(myTextField2.getText().toString());
            goToActivity(String.valueOf(result));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
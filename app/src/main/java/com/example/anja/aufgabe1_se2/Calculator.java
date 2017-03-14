package com.example.anja.aufgabe1_se2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        this.setTitle("Projekt - SE2");
    }

    public void calculate (View view) {
        EditText mInput1 = (EditText) findViewById(R.id.input1);
        if (mInput1.getText().toString().isEmpty()) {
            mInput1.setError("Darf nicht leer sein");
            return;
        }
        double divident =  Double.parseDouble(mInput1.getText().toString());
        mInput1.setError(null);

        EditText mInput2 = (EditText) findViewById(R.id.input2);
        if (mInput2.getText().toString().isEmpty()) {
            mInput2.setError("Darf nicht leer sein");
            return;
        }
        double divisor =  Double.parseDouble(mInput2.getText().toString());
        mInput2.setError(null);

        double result = divident / divisor; // TODO: secure this

        TextView resultLabel = (TextView) findViewById(R.id.outputField);
        resultLabel.setText(String.valueOf(result)); // TODO: make more pretty
    }
}

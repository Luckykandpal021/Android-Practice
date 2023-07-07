package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editWeight = findViewById(R.id.editWeight);
        EditText editHeightFt = findViewById(R.id.editHeightFt);
        EditText editHeightIn = findViewById(R.id.editHeightIn);
        Button bmiCalculate = findViewById(R.id.bmiCalculate);
        TextView bmiResult = findViewById(R.id.bmiResult);

        bmiCalculate.setOnClickListener(v -> {
            
            int inputWeight = Integer.parseInt(editWeight.getText().toString());
            int inputHeightFt = Integer.parseInt(editHeightFt.getText().toString());
            int inputHeightIn = Integer.parseInt(editHeightIn.getText().toString());
            int totalIn = inputHeightFt * 12 + inputHeightIn;
            double totalCm = totalIn * 2.54;
            double totalM = totalCm / 100;
            double bmi = inputWeight / (totalM * totalM);
            String bmiResultText;
            if (bmi > 25) {
                bmiResultText = "You Are Overweight";
            } else if (bmi < 18.5) {
                bmiResultText = "You Are Underweight";
            } else {
                bmiResultText = "You Are Healthy";
            }

            bmiResult.setText(bmiResultText);
        });
    }
}
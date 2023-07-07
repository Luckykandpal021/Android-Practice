package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;
//import android.util.Log;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button nextScreen = findViewById(R.id.next);
//        Log.d("MyApp", "This is a debug message.");
//        Log.e("MyApp", "An error occurred!");
        nextScreen.setOnClickListener(V-> {
                Intent iNext = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(iNext);

        });
    }
}
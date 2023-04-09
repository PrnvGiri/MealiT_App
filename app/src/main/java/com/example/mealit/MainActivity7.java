package com.example.mealit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void openActivity6(View v) {
        // Toast.makeText(this, "Hii", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}
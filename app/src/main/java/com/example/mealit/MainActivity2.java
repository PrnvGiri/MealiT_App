package com.example.mealit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button2;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void openActivity(View v){
        // Toast.makeText(this, "Hii", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openActivity2(View v){
        // Toast.makeText(this, "Hii", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity4(View v) {
        // Toast.makeText(this, "Hii", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}
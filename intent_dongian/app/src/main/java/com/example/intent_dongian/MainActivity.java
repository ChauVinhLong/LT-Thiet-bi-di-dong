package com.example.intent_dongian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenManHinh(View view) {

        Intent iManHinhKhac = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(iManHinhKhac);
    }
}
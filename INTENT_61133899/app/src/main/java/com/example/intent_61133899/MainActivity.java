package com.example.intent_61133899;

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

    public void btnLogin(View view) {
        Intent ManHinh2 = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(ManHinh2);
    }
}
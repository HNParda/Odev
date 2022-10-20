package com.programlamaodev;

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

    public void onClick1(View v) {
        startActivity(new Intent(this, Odev1.class));
    }

    public void onClick2(View v) {
        startActivity(new Intent(this, Odev2.class));
    }
}
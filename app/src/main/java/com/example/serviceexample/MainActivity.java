package com.example.serviceexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AppCompatButton startService,stopService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService=(AppCompatButton) findViewById(R.id.startservice);
        stopService=(AppCompatButton) findViewById(R.id.stopservice);



        startService.setOnClickListener(v -> {
            startService(new Intent(MainActivity.this,MusicService.class));
        });


        stopService.setOnClickListener(v -> {

            stopService(new Intent(MainActivity.this,MusicService.class));
        });
    }
}
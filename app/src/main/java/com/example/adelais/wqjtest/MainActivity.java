package com.example.adelais.wqjtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "秦孟飞试试", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "郭晓琴试试", Toast.LENGTH_SHORT).show();
    }
}

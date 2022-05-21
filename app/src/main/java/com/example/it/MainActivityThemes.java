package com.example.it;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityThemes extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_themes);
    }

    public void startQA(View v)
    {
        Intent intent = new Intent(this,MainActivityQAInside.class);
        startActivity(intent);
    }
    public void startJava(View v)
    {
        Intent intent = new Intent(this,MainActivityQAInside.class);
        startActivity(intent);
    }
}
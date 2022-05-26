package com.example.it;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.start_image_view);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.start_anim);
        iv.startAnimation(animation);
    }

    public void startApp(View view)
    {

        Intent intent = new Intent(this, MainActivityThemes.class);
        startActivity(intent);
       // finish();
    }

}
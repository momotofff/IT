package com.example.it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityThemes extends AppCompatActivity
{
    HorizontalScrollView iv;
    int[] pushRandom = {R.string.push_random0, R.string.push_random1, R.string.push_random2, R.string.push_random3,
                        R.string.push_random4, R.string.push_random5, R.string.push_random6, R.string.push_random7,
                        R.string.push_random8, R.string.push_random9, R.string.push_random10, R.string.push_random11,
                        R.string.push_random12, R.string.push_random13, R.string.push_random14,R.string.push_random15,
                        R.string.push_random16, R.string.push_random17, R.string.push_random18,R.string.push_random19,
                        R.string.push_random20, R.string.push_random21, R.string.push_random22};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_themes);
        TextView textView = findViewById(R.id.push_random);
        textView.setText(pushRandom[(int) (Math.random() * pushRandom.length)]);
    }

    public void buttonStartInDeveloping(View view)
    {
            Toast toast = Toast.makeText(MainActivityThemes.this, "В разработке", Toast.LENGTH_SHORT);
            toast.show();
    }

    public void startQa(View view)
    {
        ImageView iv = findViewById(R.id.qa_Button);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.up_scale);
        iv.startAnimation(animation);
        Intent intent = new Intent(this, MainActivityQAInside.class);

        startActivity(intent);
    }
}

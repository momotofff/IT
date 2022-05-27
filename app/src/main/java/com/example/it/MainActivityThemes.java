package com.example.it;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityThemes extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_themes);
        TextView textView = findViewById(R.id.push_random);
        String[] tips = getResources().getStringArray(R.array.tips_of_the_day);
        textView.setText(tips[(int) (Math.random() * tips.length)]);
    }

    public void buttonStartInDeveloping(View view)
    {
        Toast toast = Toast.makeText(MainActivityThemes.this, R.string.in_development, Toast.LENGTH_SHORT);
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

package com.example.it;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

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
        ImageView iv = findViewById(R.id.qa_Button);
        ImageButton imageButton = findViewById(R.id.qa_Button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityThemes.this, MainActivityQAInside.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityThemes.this, iv, ViewCompat.getTransitionName(iv));
                startActivity(intent, options.toBundle());
            }
        });
    }

    public void buttonStartInDeveloping(View view)
    {
        Toast toast = Toast.makeText(MainActivityThemes.this, R.string.in_development, Toast.LENGTH_SHORT);
        toast.show();
    }
}

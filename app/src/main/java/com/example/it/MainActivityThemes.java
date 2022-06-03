package com.example.it;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import java.util.Objects;

public class MainActivityThemes extends AppCompatActivity implements View.OnClickListener
{
    ImageView ivQa, ivJava, ivPatterns;
    ImageButton ibQa, ibJava, ibPatterns;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_themes);
        TextView textView = findViewById(R.id.push_random);
        String[] tips = getResources().getStringArray(R.array.tips_of_the_day);
        textView.setText(tips[(int) (Math.random() * tips.length)]);

        ivQa = findViewById(R.id.qa_Button);
        ivJava = findViewById(R.id.java_Button);
        ivPatterns = findViewById(R.id.patterns_button);

        ibQa = findViewById(R.id.qa_Button);                ibQa.setOnClickListener(this);
        ibJava = findViewById(R.id.java_Button);            ibJava.setOnClickListener(this);
        ibPatterns = findViewById(R.id.patterns_button);    ibPatterns.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.qa_Button:Intent intent = new Intent(MainActivityThemes.this, MainActivityQAInside.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityThemes.this, ivQa, Objects.requireNonNull(ViewCompat.getTransitionName(ivQa)));
                startActivity(intent, options.toBundle());
                break;

            case R.id.java_Button:Toast toast = Toast.makeText(MainActivityThemes.this, R.string.in_development, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.patterns_button:toast = Toast.makeText(MainActivityThemes.this, R.string.in_development, Toast.LENGTH_SHORT);
                toast.show();
                break;
        }

    }

}

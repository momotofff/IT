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


public class MainActivityQAInside extends AppCompatActivity implements View.OnClickListener
{
    ImageView ivQaBasic, ivQaButtonQADevelopment, ivQaButtonLevelTesting, ivQaButtonVideTesting, ivQaButtonTypeTesting;
    ImageButton ibQaBasic , ibQaButtonQADevelopment, ibQaButtonLevelTesting, ibQaButtonVideTesting, ibQaButtonTypeTesting;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_qainside);

        ivQaBasic = findViewById(R.id.qa_ButtonBasics);
        ivQaButtonQADevelopment = findViewById(R.id.qa_ButtonQADevelopment);
        ivQaButtonLevelTesting = findViewById(R.id.qa_ButtonLevelTesting);
        ivQaButtonVideTesting = findViewById(R.id.qa_ButtonVideTesting);
        ivQaButtonTypeTesting = findViewById(R.id.qa_ButtonTypeTesting);

        ibQaBasic = findViewById(R.id.qa_ButtonBasics);                            ibQaBasic.setOnClickListener(this);
        ibQaButtonQADevelopment = findViewById(R.id.qa_ButtonQADevelopment);       ibQaButtonQADevelopment.setOnClickListener(this);
        ibQaButtonLevelTesting = findViewById(R.id.qa_ButtonLevelTesting);         ibQaButtonLevelTesting.setOnClickListener(this);
        ibQaButtonVideTesting = findViewById(R.id.qa_ButtonVideTesting);           ibQaButtonVideTesting.setOnClickListener(this);
        ibQaButtonTypeTesting = findViewById(R.id.qa_ButtonTypeTesting);           ibQaButtonTypeTesting.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.qa_ButtonBasics :
                animationForStartActivity(QA1.class, ivQaBasic); break;
            case R.id.qa_ButtonQADevelopment :
                animationForStartActivity(QA2.class, ivQaButtonQADevelopment); break;
            case R.id.qa_ButtonLevelTesting :
                animationForStartActivity(QA3.class, ivQaButtonLevelTesting); break;
            case R.id.qa_ButtonVideTesting :
                animationForStartActivity(QA4.class, ivQaButtonVideTesting); break;
            case R.id.qa_ButtonTypeTesting :
                animationForStartActivity(QA5.class, ivQaButtonTypeTesting); break;
        }
    }

    private void animationForStartActivity(Class qa, ImageView iv)
    {
        Intent intent = new Intent(MainActivityQAInside.this, qa);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, iv, Objects.requireNonNull(ViewCompat.getTransitionName(iv)));
        startActivity(intent, options.toBundle());
    }
}
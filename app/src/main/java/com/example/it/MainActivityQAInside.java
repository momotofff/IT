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
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.qa_ButtonBasics :
            {
                Intent intent = new Intent(MainActivityQAInside.this, QA1.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, ivQaBasic, Objects.requireNonNull(ViewCompat.getTransitionName(ivQaBasic)));
                startActivity(intent, options.toBundle());
                break;
            }
            case R.id.qa_ButtonQADevelopment :
            {
                Intent intent = new Intent(MainActivityQAInside.this, QA2.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, ivQaButtonQADevelopment, Objects.requireNonNull(ViewCompat.getTransitionName(ivQaButtonQADevelopment)));
                startActivity(intent, options.toBundle());
                break;
            }
            case R.id.qa_ButtonLevelTesting :
            {
                Intent intent = new Intent(MainActivityQAInside.this, QA3.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, ivQaButtonLevelTesting, Objects.requireNonNull(ViewCompat.getTransitionName(ivQaButtonLevelTesting)));
                startActivity(intent, options.toBundle());
                break;
            }
            case R.id.qa_ButtonVideTesting :
            {
                Intent intent = new Intent(MainActivityQAInside.this, QA4.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, ivQaButtonVideTesting, Objects.requireNonNull(ViewCompat.getTransitionName(ivQaButtonVideTesting)));
                startActivity(intent, options.toBundle());
                break;
            }
            case R.id.qa_ButtonTypeTesting :
            {
                Intent intent = new Intent(MainActivityQAInside.this, QA5.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, ivQaButtonTypeTesting, Objects.requireNonNull(ViewCompat.getTransitionName(ivQaButtonTypeTesting)));
                startActivity(intent, options.toBundle());
                break;
            }
        }
    }
}
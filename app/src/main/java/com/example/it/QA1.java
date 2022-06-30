package com.example.it;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.it.qa1.QA1_1;
import com.example.it.qa1.QA1_10;
import com.example.it.qa1.QA1_11;
import com.example.it.qa1.QA1_12;
import com.example.it.qa1.QA1_13;
import com.example.it.qa1.QA1_14;
import com.example.it.qa1.QA1_15;
import com.example.it.qa1.QA1_2;
import com.example.it.qa1.QA1_3;
import com.example.it.qa1.QA1_4;
import com.example.it.qa1.QA1_5;
import com.example.it.qa1.QA1_6;
import com.example.it.qa1.QA1_7;
import com.example.it.qa1.QA1_8;
import com.example.it.qa1.QA1_9;

import java.util.Objects;

public class QA1 extends AppCompatActivity implements View.OnClickListener
{
    TextView tv1_1, tv1_2, tv1_3, tv1_4, tv1_5, tv1_6, tv1_7, tv1_8, tv1_9, tv1_10, tv1_11, tv1_12, tv1_13, tv1_14, tv1_15;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa1);

        tv1_1 = findViewById(R.id.verificationAndValidation);   tv1_1.setOnClickListener(this);
        tv1_2 = findViewById(R.id.softwareQuality);             tv1_2.setOnClickListener(this);
        tv1_3 = findViewById(R.id.webTesting);                  tv1_3.setOnClickListener(this);
        tv1_4 = findViewById(R.id.roleOfTesting);               tv1_4.setOnClickListener(this);
        tv1_5 = findViewById(R.id.whyTestingIsNecessary);       tv1_5.setOnClickListener(this);
        tv1_6 = findViewById(R.id.WhatIsSoftwareTesting);       tv1_6.setOnClickListener(this);
        tv1_7 = findViewById(R.id.WhoIsTesting);                tv1_7.setOnClickListener(this);
        tv1_8 = findViewById(R.id.startAndExit);                tv1_8.setOnClickListener(this);
        tv1_9 = findViewById(R.id.testGoals);                   tv1_9.setOnClickListener(this);
        tv1_10 = findViewById(R.id.WhereDoErrorsComeFrom);      tv1_10.setOnClickListener(this);
        tv1_11 = findViewById(R.id.costOfDefects);              tv1_11.setOnClickListener(this);
        tv1_12 = findViewById(R.id.fundamentalProcess);         tv1_12.setOnClickListener(this);
        tv1_13 = findViewById(R.id.TestingPrinciples);          tv1_13.setOnClickListener(this);
        tv1_14 = findViewById(R.id.TestersVocabulary);          tv1_14.setOnClickListener(this);
        tv1_15 = findViewById(R.id.PsychologyOfTesting);        tv1_15.setOnClickListener(this);

    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.verificationAndValidation :
                {animationForStartActivity(QA1_1.class, tv1_1); break;}
            case R.id.softwareQuality :
                {animationForStartActivity(QA1_2.class, tv1_2); break;}
            case R.id.webTesting :
                {animationForStartActivity(QA1_3.class, tv1_3); break;}
            case R.id.roleOfTesting :
                {animationForStartActivity(QA1_4.class, tv1_4); break;}
            case R.id.whyTestingIsNecessary :
                {animationForStartActivity(QA1_5.class, tv1_5); break;}
            case R.id.WhatIsSoftwareTesting :
                {animationForStartActivity(QA1_6.class, tv1_6); break;}
            case R.id.WhoIsTesting :
                {animationForStartActivity(QA1_7.class, tv1_7); break;}
            case R.id.startAndExit :
                {animationForStartActivity(QA1_8.class, tv1_8); break;}
            case R.id.testGoals :
                {animationForStartActivity(QA1_9.class, tv1_9); break;}
            case R.id.WhereDoErrorsComeFrom :
                {animationForStartActivity(QA1_10.class, tv1_10); break;}
            case R.id.costOfDefects :
                {animationForStartActivity(QA1_11.class, tv1_11); break;}
            case R.id.fundamentalProcess :
                {animationForStartActivity(QA1_12.class, tv1_12); break;}
            case R.id.TestingPrinciples :
                {animationForStartActivity(QA1_13.class, tv1_13); break;}
            case R.id.TestersVocabulary :
                {animationForStartActivity(QA1_14.class, tv1_14); break;}
            case R.id.PsychologyOfTesting :
                {animationForStartActivity(QA1_15.class, tv1_15); break;}
        }
    }

    private void animationForStartActivity(Class qa, TextView tv)
    {
        Intent intent = new Intent(QA1.this, qa);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(QA1.this, tv, Objects.requireNonNull(ViewCompat.getTransitionName(tv)));
        startActivity(intent, options.toBundle());
    }
}
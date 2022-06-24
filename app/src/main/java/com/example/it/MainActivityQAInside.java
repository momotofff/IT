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


public class MainActivityQAInside extends AppCompatActivity implements View.OnClickListener {
    ImageView ivQaB;
    ImageButton ibQaB;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_qainside);

        ivQaB = findViewById(R.id.qa_ButtonBasics);
        ibQaB = findViewById(R.id.qa_ButtonBasics);
        ibQaB.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.qa_ButtonBasics) {
            Intent intent = new Intent(MainActivityQAInside.this, QA1.class);
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivityQAInside.this, ivQaB, Objects.requireNonNull(ViewCompat.getTransitionName(ivQaB)));
            startActivity(intent, options.toBundle());
        }
    }
}
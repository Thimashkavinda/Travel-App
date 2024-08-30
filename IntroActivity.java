package com.example.travel.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.travel.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ConstraintLayout introBtn=findViewById(R.id.introBtn);
        introBtn.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));
    }

}

package com.example.mobilepractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OnboardingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        Button btn = findViewById(R.id.signIn);
        btn.setOnClickListener(this);

        TextView tv = findViewById(R.id.signUp);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signIn:
                startActivity(new Intent(OnboardingActivity.this, LoginActivity.class));
                break;
            case R.id.signUp:
                startActivity(new Intent(OnboardingActivity.this, RegActivity.class));
                break;
        }
    }
}
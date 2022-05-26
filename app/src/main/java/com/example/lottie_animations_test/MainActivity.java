package com.example.lottie_animations_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAnimation = findViewById(R.id.btnAnimation);
        Button btnAnimationStart = findViewById(R.id.btnAnimationStart);
        LinearLayout animationLayout = findViewById(R.id.animationLayout);
        LottieAnimationView animationTest = new LottieAnimationView(this);
        animationLayout.addView(animationTest);

        btnAnimation.setOnClickListener(view -> {
            Intent i = new Intent(this,Second_Interface.class);
            startActivity(i);
        });

        btnAnimationStart.setOnClickListener(view -> {
            animationTest.setVisibility(View.VISIBLE);
            animationTest.setAnimation(R.raw.jumpingsquares);
            animationTest.loop(true);
            animationTest.playAnimation();
            btnAnimation.setEnabled(false);

            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                animationTest.setVisibility(View.INVISIBLE);
                btnAnimation.setEnabled(true);
            }, 15000);
        });
    }
    //Link de lottie
    //https://lottiefiles.com/featured?page=5
}
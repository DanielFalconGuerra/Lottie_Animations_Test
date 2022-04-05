package com.example.lottie_animations_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAnimation = findViewById(R.id.btnAnimation);
        LottieAnimationView imageToTest = findViewById(R.id.imageToTest);
        btnAnimation.setOnClickListener(view -> {
            imageToTest.setVisibility(View.INVISIBLE);
        });
    }
    //private void Animation()
}
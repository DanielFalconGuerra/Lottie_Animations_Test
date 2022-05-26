package com.example.lottie_animations_test;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Second_Interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_interface);
        LottieAnimationView imageToTest = findViewById(R.id.imageToTest);
        LinearLayout layoutAnimation = findViewById(R.id.layoutAnimation);
        TextView nameText = new TextView(this);
        TextView ageText = new TextView(this);
        TextView addressText = new TextView(this);
        imageToTest.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                Log.e("Animation:","start");
                imageToTest.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Log.e("Animation:","end");
                imageToTest.setVisibility(View.GONE);
                nameText.setText("Daniel Falcon Guerra");
                ageText.setText("23 years");
                addressText.setText("Villagomez #23 A");
                layoutAnimation.addView(nameText);
                layoutAnimation.addView(ageText);
                layoutAnimation.addView(addressText);
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                Log.e("Animation:","cancel");
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                Log.e("Animation:","repeat");
            }
        });

    }
}
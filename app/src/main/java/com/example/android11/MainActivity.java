package com.example.android11;

import android.animation.ObjectAnimator;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        ObjectAnimator animator = ObjectAnimator.ofFloat(button, "translationX", 0f, 100f);
        animator.setDuration(1000);
        animator.start();


    }
}
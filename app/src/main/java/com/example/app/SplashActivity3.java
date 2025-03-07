package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity3 extends AppCompatActivity {
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash3);

        logo = findViewById(R.id.imageView);

        // Créer une animation de rotation
        RotateAnimation rotate = new RotateAnimation(0, 180,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000); // Durée de l'animation en millisecondes
        rotate.setInterpolator(new LinearInterpolator());

        // Démarrer l'animation
        logo.startAnimation(rotate);

        // Créer un thread pour attendre la fin de l'animation et démarrer MainActivity
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000); // Attendre la fin de l'animation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Démarrer MainActivity
                Intent intent = new Intent(SplashActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}
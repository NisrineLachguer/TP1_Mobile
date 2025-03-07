package com.example.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Récupérer les données envoyées depuis MainActivity
        String nom = getIntent().getStringExtra("NOM");
        String phone = getIntent().getStringExtra("PHONE");
        String genre = getIntent().getStringExtra("GENRE");
        String ville = getIntent().getStringExtra("VILLE");

        // Trouver les TextView dans le layout et afficher les données
        TextView textNom = findViewById(R.id.nom);
        TextView textPhone = findViewById(R.id.phone);
        TextView textVille = findViewById(R.id.textView7);
        TextView textGenre = findViewById(R.id.textView8);

        textNom.setText("Nom : " + nom);
        textPhone.setText("Phone : " + phone);
        textVille.setText("Ville : " + ville);
        textGenre.setText("Genre : " + genre);
    }

}
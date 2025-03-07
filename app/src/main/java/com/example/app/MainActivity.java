package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText nom;
    private EditText phone;
    private Spinner villes;
    private RadioButton f, m;
    private Button bn;

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        bn = findViewById(R.id.bn);
        phone = findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        m = findViewById(R.id.m);
        f = findViewById(R.id.f);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "";
                if (m.isChecked())
                    genre = "Homme";
                else if (f.isChecked()) {
                    genre = "Femme";
                }
                String ville = villes.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), nom.getText().toString() + " " + phone.getText().toString() + " " + genre + " " + ville, Toast.LENGTH_LONG).show();
                Log.d(TAG, nom.getText().toString() + " " + phone.getText().toString() + " " + genre + " " + ville);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        bn = findViewById(R.id.bn);
        phone = findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        m = findViewById(R.id.m);
        f = findViewById(R.id.f);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = m.isChecked() ? "Homme" : (f.isChecked() ? "Femme" : "");
                String ville = villes.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("NOM", nom.getText().toString());
                intent.putExtra("PHONE", phone.getText().toString());
                intent.putExtra("GENRE", genre);
                intent.putExtra("VILLE", ville);
                startActivity(intent);
            }
        });
    }
}
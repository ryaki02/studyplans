package com.example.studyplans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class TelaDeLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent it = new Intent(TelaDeLogin.this, TelaPrincipal.class);
            startActivity(it);
        });
        TextView textview2 = findViewById(R.id.textView2);
        textview2.setOnClickListener(view -> {
            Intent it = new Intent(TelaDeLogin.this, TelaDeCadastro.class);
            startActivity(it);
        });
    }
}
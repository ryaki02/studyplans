package com.example.studyplans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class TelaDeCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            Intent it = new Intent(TelaDeCadastro.this, TelaPrincipal.class);
            startActivity(it);
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
            Intent it = new Intent(TelaDeCadastro.this, TelaDeLogin.class);
            startActivity(it);
        });

    }
}
package com.example.studyplans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            Intent it = new Intent(TelaPrincipal.this, TelaAgenda.class);
            startActivity(it);
        });

    }
}
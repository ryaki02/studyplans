package com.example.studyplans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TelaAgenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_agenda);

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(view -> {
            Intent it = new Intent(TelaAgenda.this, TelaPrincipal.class);
            startActivity(it);
        });

    }
}
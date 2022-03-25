package com.example.calc00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class tela2 extends AppCompatActivity {

    Button botaoVincula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        this.vincularComponentes();
        this.acaoVIncula();
    }

    private void vincularComponentes(){
        botaoVincula = findViewById(R.id.botaoInicial);
    }
    private void acaoVIncula(){
        botaoVincula.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                android.content.Intent aux = new android.content.Intent(tela2.this, MainActivity.class);
                startActivity(aux);
            }
        });
    }


}
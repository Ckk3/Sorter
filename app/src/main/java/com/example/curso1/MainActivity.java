package com.example.curso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView resposta;
    private TextInputEditText pessoa1;
    private TextInputEditText pessoa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa2 = findViewById(R.id.inputPessoa2);
        pessoa1 = findViewById(R.id.inputPessoa1);
        resposta = findViewById(R.id.txtResp);
        
    }

    public void clique(View view)
    {

        //resposta.setText(pessoa1.getText().toString());

        /*int numero = new Random().nextInt(2);
        if(numero == 0){
            resposta.setText("A pessoa selecionada foi a " + pessoa1.getText().toString());
        }
        else{
            resposta.setText("A pessoa selecionada foi a " + pessoa2.getText().toString());
        }*/
    }

    public void teste(View view) {
        int numero = new Random().nextInt(2);
        if(numero == 0){
            resposta.setText("A pessoa selecionada foi a " + pessoa1.getText().toString());
        }
        else{
            resposta.setText("A pessoa selecionada foi a " + pessoa2.getText().toString());
        }

    }

    
}
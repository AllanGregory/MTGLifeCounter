package com.example.mtglifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView contador_txt;
    private Button botao_menos_btn;
    private Button botao_resetar_btn;
    private Button botao_mais_btn;
    private int contador = 20;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.botaoMenos_btn:
                    contadorMenos();
                    break;
                case R.id.botaoMais_btn:
                    contadorMais();
                    break;
                case R.id.botaoResetar_btn:
                    iniciaContador();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador_txt = (TextView) findViewById(R.id.contador_txt);
        botao_menos_btn = (Button) findViewById(R.id.botaoMenos_btn);
        botao_menos_btn.setOnClickListener(clickListener);
        botao_resetar_btn = (Button) findViewById(R.id.botaoResetar_btn);
        botao_resetar_btn.setOnClickListener(clickListener);
        botao_mais_btn = (Button) findViewById(R.id.botaoMais_btn);
        botao_mais_btn.setOnClickListener(clickListener);
    }

    private void iniciaContador() {
        contador = 20;
        contador_txt.setText(contador + "");
    }

    private void contadorMais() {
        contador++;
        contador_txt.setText(contador + "");
    }

    private void contadorMenos() {
        contador--;
        contador_txt.setText(contador + "");
    }
}

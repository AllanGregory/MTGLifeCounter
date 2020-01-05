package com.example.mtglifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView contadorVida_txt;
    private Button botaoMenosVida_btn;
    private Button botaoResetarVida_btn;
    private Button botaoMaisVida_btn;
    private TextView contadorVitoria_txt;
    private Button botaoMenosVitoria_btn;
    private Button botaoResetarVitoria_btn;
    private Button botaoMaisVitoria_btn;
    private int contadorVida = 20;
    private int contadorVitoria = 0;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.botaoMenosVida_btn:
                    contadorMenosVida();
                    break;
                case R.id.botaoMaisVida_btn:
                    contadorMaisVida();
                    break;
                case R.id.botaoResetarVida_btn:
                    iniciaContadorVida();
                    break;
                case R.id.botaoMenosVitoria_btn:
                    contadorMenosVitoria();
                    break;
                case R.id.botaoMaisVitoria_btn:
                    contadorMaisVitoria();
                    break;
                case R.id.botaoResetarVitoria_btn:
                    iniciaContadorVitoria();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contadorVida_txt = (TextView) findViewById(R.id.contadorVida_txt);
        botaoMenosVida_btn = (Button) findViewById(R.id.botaoMenosVida_btn);
        botaoMenosVida_btn.setOnClickListener(clickListener);
        botaoResetarVida_btn = (Button) findViewById(R.id.botaoResetarVida_btn);
        botaoResetarVida_btn.setOnClickListener(clickListener);
        botaoMaisVida_btn = (Button) findViewById(R.id.botaoMaisVida_btn);
        botaoMaisVida_btn.setOnClickListener(clickListener);

        contadorVitoria_txt = (TextView) findViewById(R.id.contadorVitoria_txt);
        botaoMenosVitoria_btn = (Button) findViewById(R.id.botaoMenosVitoria_btn);
        botaoMenosVitoria_btn.setOnClickListener(clickListener);
        botaoResetarVitoria_btn = (Button) findViewById(R.id.botaoResetarVitoria_btn);
        botaoResetarVitoria_btn.setOnClickListener(clickListener);
        botaoMaisVitoria_btn = (Button) findViewById(R.id.botaoMaisVitoria_btn);
        botaoMaisVitoria_btn.setOnClickListener(clickListener);
    }

    private void iniciaContadorVida() {
        contadorVida = 20;
        contadorVida_txt.setText(contadorVida + "");
    }

    private void contadorMaisVida() {
        contadorVida++;
        contadorVida_txt.setText(contadorVida + "");
    }

    private void contadorMenosVida() {
        contadorVida--;
        contadorVida_txt.setText(contadorVida + "");
    }

    private void iniciaContadorVitoria() {
        contadorVitoria = 0;
        contadorVitoria_txt.setText(contadorVitoria + "");
    }

    private void contadorMaisVitoria() {
        contadorVitoria++;
        contadorVitoria_txt.setText(contadorVitoria + "");
    }

    private void contadorMenosVitoria() {
        contadorVitoria--;
        contadorVitoria_txt.setText(contadorVitoria + "");
    }
}

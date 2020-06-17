package br.com.senac.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.senac.R;
import br.com.senac.control.controllers.ResultadoControl;

public class Resultado extends AppCompatActivity {

    private TextView tvCidade;
    private Button btnFavorito;
    private ImageView imgClima;
    private TextView tvClimaDesc;
    private TextView tvTemp;
    private TextView tvUmidade;

    private Resultado resultado;

    ResultadoControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        inicializaComponentes();
        control = new ResultadoControl(this.resultado);
    }

    private void inicializaComponentes() {
        tvCidade = findViewById(R.id.tvCidade);
        btnFavorito = findViewById(R.id.btnFavorito);
        imgClima = findViewById(R.id.imgClima);
        tvClimaDesc = findViewById(R.id.tvClimaDesc);
        tvTemp = findViewById(R.id.tvTemp);
        tvUmidade = findViewById(R.id.tvUmidade);

        resultado = new Resultado();
    }


}
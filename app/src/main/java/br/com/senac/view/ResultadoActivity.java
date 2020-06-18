package br.com.senac.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.senac.R;
import br.com.senac.control.controllers.ResultadoControl;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tvCidade;
    private Button btnFavorito;
    private ImageView imgClima;
    private TextView tvClimaDesc;
    private TextView tvTemp;
    private TextView tvUmidade;


    private ResultadoControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        inicializaComponentes();
        control = new ResultadoControl(this);



    }

    private void inicializaComponentes() {
        tvCidade = findViewById(R.id.tvCidade);
        btnFavorito = findViewById(R.id.btnFavorito);
        imgClima = findViewById(R.id.imgClima);
        tvClimaDesc = findViewById(R.id.tvClimaDesc);
        tvTemp = findViewById(R.id.tvTemp);
        tvUmidade = findViewById(R.id.tvUmidade);
    }


    public TextView getTvCidade() {
        return tvCidade;
    }

    public void setTvCidade(TextView tvCidade) {
        this.tvCidade = tvCidade;
    }

    public Button getBtnFavorito() {
        return btnFavorito;
    }

    public void setBtnFavorito(Button btnFavorito) {
        this.btnFavorito = btnFavorito;
    }

    public ImageView getImgClima() {
        return imgClima;
    }

    public void setImgClima(ImageView imgClima) {
        this.imgClima = imgClima;
    }

    public TextView getTvClimaDesc() {
        return tvClimaDesc;
    }

    public void setTvClimaDesc(TextView tvClimaDesc) {
        this.tvClimaDesc = tvClimaDesc;
    }

    public TextView getTvTemp() {
        return tvTemp;
    }

    public void setTvTemp(TextView tvTemp) {
        this.tvTemp = tvTemp;
    }

    public TextView getTvUmidade() {
        return tvUmidade;
    }

    public void setTvUmidade(TextView tvUmidade) {
        this.tvUmidade = tvUmidade;
    }
}
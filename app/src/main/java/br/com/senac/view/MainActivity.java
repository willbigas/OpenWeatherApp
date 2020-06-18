package br.com.senac.view;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import br.com.senac.R;
import br.com.senac.control.controllers.MainControl;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerCidades;
    private ListView lvCidades;
    private Button btnHistorico;
    private Button btnPesquisar;

    private MainControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aplicandoPoliticaDeSingleRequest();
        initialize();
        control = new MainControl(this);


    }

    private void aplicandoPoliticaDeSingleRequest() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public void initialize() {
        inicializaComponentes();
        initializeClickListeners();
    }

    private void initializeClickListeners() {
        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.chamarTelaHistorico();
            }
        });

        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.pesquisar();
            }
        });
    }


    private void inicializaComponentes() {
        spinnerCidades = findViewById(R.id.spinnerCidades);
        lvCidades = findViewById(R.id.lvCidades);
        btnHistorico = findViewById(R.id.btnHistorico);
        btnPesquisar = findViewById(R.id.btnPesquisar);
    }

    public Spinner getSpinnerCidades() {
        return spinnerCidades;
    }

    public void setSpinnerCidades(Spinner spinnerCidades) {
        this.spinnerCidades = spinnerCidades;
    }

    public ListView getLvCidades() {
        return lvCidades;
    }

    public void setLvCidades(ListView lvCidades) {
        this.lvCidades = lvCidades;
    }

    public Button getBtnHistorico() {
        return btnHistorico;
    }

    public void setBtnHistorico(Button btnHistorico) {
        this.btnHistorico = btnHistorico;
    }
}
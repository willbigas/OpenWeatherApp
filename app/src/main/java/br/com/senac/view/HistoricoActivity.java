package br.com.senac.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import br.com.senac.R;
import br.com.senac.control.controllers.HistoricoControl;

public class HistoricoActivity extends AppCompatActivity {

    private HistoricoControl control;

    private ListView lvHistorico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);
        inicializaComponentes();
        control = new HistoricoControl(this);
    }

    private void inicializaComponentes() {
        lvHistorico = findViewById(R.id.lvHistorico);
    }

    public ListView getLvHistorico() {
        return lvHistorico;
    }

    public void setLvHistorico(ListView lvHistorico) {
        this.lvHistorico = lvHistorico;
    }
}
package br.com.senac.control.controllers;

import android.content.Intent;
import android.widget.ArrayAdapter;

import java.sql.SQLException;

import br.com.senac.control.services.CidadeService;
import br.com.senac.model.vo.Cidade;
import br.com.senac.view.HistoricoActivity;
import br.com.senac.view.MainActivity;

public class MainControl {

    private MainActivity activity;

    private CidadeService cidadeService;

    private ArrayAdapter<Cidade> adapterCidades;


    public MainControl(MainActivity activity) {
        this.activity = activity;
        initializeServices();
        configSpinner();
    }

    private void initializeServices() {
        cidadeService = new CidadeService(this.activity);
    }

    private void configSpinner() {
        try {
            adapterCidades = new ArrayAdapter<>(
                    activity,
                    android.R.layout.simple_spinner_item,
                    cidadeService.buscarTodos()
            );
            activity.getSpinnerCidades().setAdapter(adapterCidades);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void chamarTelaHistorico() {
        Intent intent = new Intent(activity, HistoricoActivity.class);
        activity.startActivity(intent);
    }
}

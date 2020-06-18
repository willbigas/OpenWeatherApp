package br.com.senac.control.controllers;

import android.content.Intent;

import br.com.senac.view.HistoricoActivity;
import br.com.senac.view.MainActivity;

public class MainControl {

    private MainActivity activity;

    public MainControl(MainActivity activity) {
        this.activity = activity;
    }


    public void chamarTelaHistorico() {
        Intent intent = new Intent(activity, HistoricoActivity.class);
        activity.startActivity(intent);
    }
}

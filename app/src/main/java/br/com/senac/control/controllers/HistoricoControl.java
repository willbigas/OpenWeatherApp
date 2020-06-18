package br.com.senac.control.controllers;

import android.widget.ArrayAdapter;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senac.control.services.ConsultaService;
import br.com.senac.model.vo.Consulta;
import br.com.senac.view.HistoricoActivity;

public class HistoricoControl {

    private HistoricoActivity activity;

    private ConsultaService consultaService;

    private ArrayAdapter<Consulta> adapterConsulta;
    private List<Consulta> listConsulta;

    public HistoricoControl(HistoricoActivity activity) {
        this.activity = activity;
        initializeServices();
        configListViewConsulta();
    }

    private void initializeServices() {
        consultaService = new ConsultaService(activity);
    }

    private void configListViewConsulta() {
        try {
            listConsulta = new ArrayList<Consulta>(consultaService.buscarTodos());
            adapterConsulta = new ArrayAdapter<>(
                    activity,
                    android.R.layout.simple_list_item_1,
                    listConsulta
            );
            activity.getLvHistorico().setAdapter(adapterConsulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

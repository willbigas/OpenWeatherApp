package br.com.senac.control.controllers;

import android.content.Intent;
import android.widget.ArrayAdapter;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.senac.control.services.CidadeService;
import br.com.senac.control.services.ConsultaService;
import br.com.senac.control.services.ConversorDeTemperatura;
import br.com.senac.model.api.WeatherDTO;
import br.com.senac.model.dao.WeatherServerAPI;
import br.com.senac.model.vo.Cidade;
import br.com.senac.model.vo.Consulta;
import br.com.senac.view.HistoricoActivity;
import br.com.senac.view.MainActivity;
import br.com.senac.view.ResultadoActivity;

public class MainControl {

    private MainActivity activity;

    private CidadeService cidadeService;
    private ConsultaService consultaService;

    private ArrayAdapter<Cidade> adapterCidades;
    private ArrayAdapter<Cidade> adapterCidadesFavoritas;

    private List<Cidade> listCidadesFavoritas;


    public MainControl(MainActivity activity) {
        this.activity = activity;
        initializeServices();
        criarEstruturaInicial();
        configSpinner();
        configListViewCidadesFavoritas();
    }

    private void initializeServices() {
        cidadeService = new CidadeService(this.activity);
        consultaService = new ConsultaService(this.activity);
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

    private void configListViewCidadesFavoritas() {
        try {
            listCidadesFavoritas = new ArrayList<Cidade>(cidadeService.buscarFavoritos());
            adapterCidadesFavoritas = new ArrayAdapter<>(
                    activity,
                    android.R.layout.simple_list_item_1,
                    listCidadesFavoritas
            );
            activity.getLvCidades().setAdapter(adapterCidadesFavoritas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void pesquisar() {
        Cidade cidadeSelecionada = (Cidade) activity.getSpinnerCidades().getSelectedItem();
        Consulta consulta = new Consulta();
        try {
            WeatherDTO weatherDTO = WeatherServerAPI.get(cidadeSelecionada);
            consulta = consultaService.criarConsulta(weatherDTO.getWeather().get(0).getDescription() , weatherDTO.getWeather().get(0).getId(), weatherDTO.getWeather().get(0).getIcon(), cidadeSelecionada, ConversorDeTemperatura.deKelvinParaCelcius(weatherDTO.getMain().getTemp()) , weatherDTO.getMain().getHumidity());
            chamarTelaResultado(consulta);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCidadesFavoritas() {
            try {
                adapterCidadesFavoritas.clear();
                List<Cidade> items = new ArrayList<>(cidadeService.buscarFavoritos());
                adapterCidadesFavoritas.addAll(items);
                adapterCidadesFavoritas.notifyDataSetChanged();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public void atualizarCidades() {
        try {
            adapterCidades.clear();
            List<Cidade> items = new ArrayList<>(cidadeService.buscarTodos());
            adapterCidades.addAll(items);
            adapterCidades.notifyDataSetChanged();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void chamarTelaResultado(Consulta consulta) {
        Intent intent = new Intent(activity, ResultadoActivity.class);
        intent.putExtra("consulta", consulta);
        activity.startActivity(intent);
    }


    public void chamarTelaHistorico() {
        Intent intent = new Intent(activity, HistoricoActivity.class);
        activity.startActivity(intent);
    }

    public void criarEstruturaInicial() {
        try {
            cidadeService.persistirCidadesIniciais();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

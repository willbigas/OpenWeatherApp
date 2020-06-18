package br.com.senac.control.services;

import android.content.Context;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.senac.model.dao.ConsultaDao;
import br.com.senac.model.vo.Cidade;
import br.com.senac.model.vo.Consulta;

public class ConsultaService {

    private ConsultaDao consultaDao;


    public ConsultaService(Context c) {
        consultaDao = new ConsultaDao(c);
    }

    public Consulta criarConsulta(String descricao , String icone , Cidade cidade, Double temperatura , Integer umidade) throws SQLException {
        Consulta consulta = new Consulta();
        consulta.setData(new Date(System.currentTimeMillis()));
        consulta.setCidade(cidade);
        consulta.setDescricao(descricao);
        consulta.setIcon(icone);
        consulta.setTemperatura(temperatura);
        consulta.setUmidade(umidade);
        consulta = consultaDao.getDao().createIfNotExists(consulta);
        return consulta;
    }

    public List<Consulta> buscarTodos() throws SQLException {
      return consultaDao.getDao().queryForAll();
    }

}

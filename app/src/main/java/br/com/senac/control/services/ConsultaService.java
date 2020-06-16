package br.com.senac.control.services;

import android.content.Context;

import java.sql.SQLException;
import java.util.Date;

import br.com.senac.model.dao.ConsultaDao;
import br.com.senac.model.vo.Cidade;
import br.com.senac.model.vo.Consulta;

public class ConsultaService {

    private ConsultaDao consultaDao;

    public ConsultaService(Context c) {
        consultaDao = new ConsultaDao(c);
    }

    public Consulta criarConsulta(Cidade cidade, Double temperatura) throws SQLException {
        Consulta consulta = new Consulta();
        consulta.setData(new Date(System.currentTimeMillis()));
        consulta.setCidade(cidade);
        consulta.setTemperatura(temperatura);
        consulta = consultaDao.getDao().createIfNotExists(consulta);
        return consulta;
    }

}

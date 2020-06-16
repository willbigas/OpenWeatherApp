package br.com.senac.control.services;

import android.content.Context;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.senac.model.dao.HistoricoDao;
import br.com.senac.model.vo.Consulta;
import br.com.senac.model.vo.Historico;

public class HistoricoService {

    private HistoricoDao historicoDao;

    public HistoricoService(Context c) {
        historicoDao = new HistoricoDao(c);
    }

    public Historico inicializarHistorico() throws SQLException {
        Historico historico = new Historico(0, new ArrayList<Consulta>());
        historico = historicoDao.getDao().createIfNotExists(historico);
        return historico;
    }

    public Historico adicionarConsulta(Consulta consulta) throws SQLException {
        Historico historico = buscarHistorico();
        historico.getConsultas().add(consulta);
        historico.setQuantidade(historico.getQuantidade() + 1);
        historicoDao.getDao().update(historico);
        return historico;
    }

    public Historico removerConsulta(Consulta consulta) throws SQLException {
        Historico historico = buscarHistorico();
        historico.getConsultas().remove(consulta);
        historico.setQuantidade(historico.getQuantidade() - 1);
        historicoDao.getDao().update(historico);
        return historico;
    }

    public Historico buscarHistorico() throws SQLException {
        return historicoDao.getDao().queryForId(1);
    }

}

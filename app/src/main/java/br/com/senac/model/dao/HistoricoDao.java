package br.com.senac.model.dao;

import android.content.Context;

import br.com.senac.model.helpers.DaoHelper;
import br.com.senac.model.vo.Consulta;
import br.com.senac.model.vo.Historico;

public class HistoricoDao extends DaoHelper<Historico> {

    public HistoricoDao(Context c) {
        super(c, Historico.class);
    }
}

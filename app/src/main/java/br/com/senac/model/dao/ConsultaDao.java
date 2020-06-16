package br.com.senac.model.dao;

import android.content.Context;

import br.com.senac.model.helpers.DaoHelper;
import br.com.senac.model.vo.Cidade;
import br.com.senac.model.vo.Consulta;

public class ConsultaDao extends DaoHelper<Consulta> {

    public ConsultaDao(Context c) {
        super(c, Consulta.class);
    }
}

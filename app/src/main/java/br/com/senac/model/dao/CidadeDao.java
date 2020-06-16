package br.com.senac.model.dao;

import android.content.Context;

import br.com.senac.model.helpers.DaoHelper;
import br.com.senac.model.vo.Cidade;

public class CidadeDao extends DaoHelper<Cidade> {

    public CidadeDao(Context c) {
        super(c, Cidade.class);
    }
}

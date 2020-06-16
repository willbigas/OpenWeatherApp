package br.com.senac.control.services;

import android.content.Context;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import br.com.senac.model.dao.CidadeDao;
import br.com.senac.model.vo.Cidade;

public class CidadeService {

    private CidadeDao cidadeDao;

    public CidadeService(Context c) {
        cidadeDao = new CidadeDao(c);
    }


    public void persistirCidadesIniciais() throws SQLException {
        List<Cidade> cidades = criarCidades();
        for (Cidade cidade : cidades) {
            cidadeDao.getDao().createIfNotExists(cidade);
        }
    }

    private List<Cidade> criarCidades() {

        Cidade palhoca = new Cidade(1, "Palhoça", "palhoça,br", "BR", false);
        Cidade biguacu = new Cidade(2, "Biguaçu", "biguacu,br", "BR", false);
        Cidade saojose = new Cidade(3, "Sao José", "sao%20jose,br", "BR", false);
        Cidade florianopolis = new Cidade(4, "Florianópolis", "florianopolis", "BR", false);

        return Arrays.asList(palhoca, biguacu, saojose, florianopolis);
    }


    public List<Cidade> buscarTodos() throws SQLException {
        return cidadeDao.getDao().queryForAll();
    }

    public List<Cidade> buscarFavoritos() throws SQLException {
        return cidadeDao.getDao().queryForEq("favorito" , true);
    }

    public Cidade favoritar(Cidade cidade) throws SQLException {
        cidade.setFavorito(true);
        cidadeDao.getDao().update(cidade);
        return cidade;
    }

    public Cidade desfavoritar(Cidade cidade) throws SQLException {
        cidade.setFavorito(false);
        cidadeDao.getDao().update(cidade);
        return cidade;
    }


}

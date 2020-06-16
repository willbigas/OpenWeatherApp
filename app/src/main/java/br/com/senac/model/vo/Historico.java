package br.com.senac.model.vo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.Collection;
import java.util.List;

public class Historico {

    @DatabaseField(canBeNull = false)
    private Integer quantidade;

    @ForeignCollectionField(eager = true)
    private Collection<Consulta> consultas;


    public Historico() {
    }

    public Historico(Integer quantidade, List<Consulta> consultas) {
        this.quantidade = quantidade;
        this.consultas = consultas;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Collection<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Collection<Consulta> consultas) {
        this.consultas = consultas;
    }
}

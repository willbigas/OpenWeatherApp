package br.com.senac.model.vo;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

public class Consulta {

    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Date data;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    private Cidade cidade;

    @DatabaseField(canBeNull = false)
    private Double temperatura;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
}

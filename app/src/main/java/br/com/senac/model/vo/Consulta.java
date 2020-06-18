package br.com.senac.model.vo;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.util.Date;

import br.com.senac.util.UtilDate;
import br.com.senac.util.UtilNumberFormat;

public class Consulta implements Serializable {

    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Integer id;

    @DatabaseField(canBeNull = false)
    private Date data;

    @DatabaseField(canBeNull = false)
    private String descricao;

    @DatabaseField(canBeNull = false)
    private Integer descricaoID;

    @DatabaseField(canBeNull = false)
    private String icon;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    private Cidade cidade;

    @DatabaseField(canBeNull = false)
    private Double temperatura;

    @DatabaseField(canBeNull = false)
    private Integer umidade;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getUmidade() {
        return umidade;
    }

    public void setUmidade(Integer umidade) {
        this.umidade = umidade;
    }

    public Integer getDescricaoID() {
        return descricaoID;
    }

    public void setDescricaoID(Integer descricaoID) {
        this.descricaoID = descricaoID;
    }

    @Override
    public String toString() {
        return "Data da Consulta: " + UtilDate.data(data) +  "\nCidade: " +cidade + "\nTemperatura: " + UtilNumberFormat.deDecimalParaCelciusFormatado(temperatura);
    }
}

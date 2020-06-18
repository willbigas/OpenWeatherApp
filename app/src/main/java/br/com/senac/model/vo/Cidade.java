package br.com.senac.model.vo;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

public class Cidade implements Serializable {

    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Integer id;

    @DatabaseField(canBeNull = false, unique = true)
    private String nome;

    @DatabaseField(canBeNull = false, unique = true)
    private String chaveAPI;

    @DatabaseField(canBeNull = false)
    private String pais;

    @DatabaseField(canBeNull = false)
    private boolean favorito;

    public Cidade() {
    }

    public Cidade(Integer id, String nome, String chaveAPI, String pais, boolean favorito) {
        this.id = id;
        this.nome = nome;
        this.chaveAPI = chaveAPI;
        this.pais = pais;
        this.favorito = favorito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getChaveAPI() {
        return chaveAPI;
    }

    public void setChaveAPI(String chaveAPI) {
        this.chaveAPI = chaveAPI;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return nome + " - [" + pais + "]";
    }
}

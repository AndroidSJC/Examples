package com.felipefvs.sqlitecrud;

import java.io.Serializable;

/**
 * Created by FELIPESIQUEIRAB20588 on 01/11/2017.
 */

public class Cliente implements Serializable{

    private int id;
    private String nome;
    private String sexo;
    private String uf;
    private boolean vip;

    public Cliente(int id, String nome, String sexo, String uf, boolean vip) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.uf = uf;
        this.vip = vip;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

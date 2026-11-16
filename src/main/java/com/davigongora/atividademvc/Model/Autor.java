package com.davigongora.atividademvc.Model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String obras_publicadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObras_publicadas() {
        return obras_publicadas;
    }

    public void setObras_publicadas(String obras_publicadas) {
        this.obras_publicadas = obras_publicadas;
    }
}

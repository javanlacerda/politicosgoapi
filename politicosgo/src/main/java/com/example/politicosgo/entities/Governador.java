package com.example.politicosgo.entities;

import org.springframework.data.annotation.Id;

public class Governador {

    @Id
    private Long cpf;

    private String nome;

    private String linkImg;

    private String sexo;

    private String partido;

    private String estado;

    private Long avaliacao;

    public Long getCpf() {
        return this.cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkImg() {
        return this.linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPartido() {
        return this.partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setCidade(String estado) {
        this.estado = estado;
    }

    public Long getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(Long avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Governador(Long cpf, String nome, String linkImg, String sexo, String partido, String estado, Long avaliacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.linkImg = linkImg;
        this.sexo = sexo;
        this.partido = partido;
        this.estado = estado;
        this.avaliacao = avaliacao;
    }

  

}
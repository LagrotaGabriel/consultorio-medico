package com.lagrota.medico.application.core.domain;

/**
 * Medico
 * Classe de domínio responsável por conter os atributos do Médico
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 19/11/2024 - 10:59
 */
public class Medico {

    private String id;
    private String nome;
    private String crm;

    public Medico() {
    }

    public Medico(String id, String nome, String crm) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}

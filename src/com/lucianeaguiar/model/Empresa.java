package com.lucianeaguiar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table
public class Empresa {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String nome;
 private String razaoSocial;
 private String endereco;
 private String telefone;
 private String email;
 private int cep;
 private int inscEstadual;
 private int cnpj;

    public Empresa(String nome, String razaoSocial, String endereco, String telefone, String email, int cep, int inscEstadual, int cnpj) {
        this.setNome(nome);
        this.setRazaoSocial(razaoSocial);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setCep(cep);
        this.setInscEstadual(inscEstadual);
        this.setCnpj(cnpj);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(int inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
 
}

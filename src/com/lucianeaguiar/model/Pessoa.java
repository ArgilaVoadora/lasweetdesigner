package com.lucianeaguiar.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int idPessoa;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int cep;
    private String dataNascimento;
    private String sexo;
    private String cpf;

    public Pessoa(String nome, String email, String telefone, String endereco, int cep, String dataNascimento, String sexo, String cpf) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setDataNascimento(dataNascimento);
        this.setSexo(sexo);
        this.setCpf(cpf);
    }

    public int getId() {
        return idPessoa;
    }

    public void setId(int id) {
        this.idPessoa = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + idPessoa + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", endereco=" + endereco + ", cep=" + cep + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", cpf=" + cpf + '}';
    }
    

}

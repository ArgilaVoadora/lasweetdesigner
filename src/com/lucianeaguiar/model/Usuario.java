package com.lucianeaguiar.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author joaovitoraguiar
 */
@Entity
public class Usuario extends Pessoa implements Serializable{
    
    private String senha;
    private double adm;

    public Usuario(String nome, String email, String telefone, String endereco, int cep,  String dataNascimento, String sexo, String cpf, String senha, double adm) {
        super(nome, email, telefone, endereco, cep, dataNascimento, sexo, cpf);
        this.setSenha(senha);
        this.setAdm(adm);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getAdm() {
        return adm;
    }

    public void setAdm(double adm) {
        this.adm = adm;
    }
    
}

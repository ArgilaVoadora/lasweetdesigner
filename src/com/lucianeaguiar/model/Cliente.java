package com.lucianeaguiar.model;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa{
    
    public Cliente(String nome, String email, String telefone, String endereco, int cep, String dataNascimento, String sexo, String cpf) {
        super(nome, email, telefone, endereco, cep, dataNascimento, sexo, cpf);
    }
    
}

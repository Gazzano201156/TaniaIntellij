package com.example.ProjLocadora.Model;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClienteProj")
public class ModelCliente {

    @Id
    @Column
    private int codigo;
    @Column
    private String nome;
    @Column
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public ModelCliente(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }
}

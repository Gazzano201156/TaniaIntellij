package com.example.ProjLocadora.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProdutoProj")
public class ModelProduto {

    @Id
    @Column
    private int codigo;
    @Column
    private String marca;
    @Column
    private String descricao;
    @Column
    private int valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ModelProduto(int codigo, String marca, String descricao, int valor) {
        this.codigo = codigo;
        this.marca = marca;
        this.descricao = descricao;
        this.valor = valor;
    }
}

package com.example.ProjLocadora.Repository;

import com.example.ProjLocadora.Model.ModelCliente;
import com.example.ProjLocadora.Model.ModelProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositoryProduto extends JpaRepository <ModelProduto, Integer> {
    List<ModelProduto> findByDescricao(String descricao);

    List<ModelProduto> findByPreco(Integer preco);
    @Query(value = "select p from Produto p where p.descricao like %?1%")
    List<String> findByDescriEspec(String descricao);
    @Query(value = "select p from Produto p where p.marca like %?1%")
    List<String> findByMarcaEspec(String marca);

    @Query (value = "select p Produto from Produto where p.descricao like %?1% and p.marca like %?2%")
    List<String> findByDescriMarca(String descricao, String marca);


    @Query (value = "select p from Produto p where p.valor > ?1")
    List<ModelCliente> findByPrecoMaior(int valor);

    @Query (value = "select p from Produto p where p.valor < ?1")
    List<ModelCliente> findByPrecoMenor(int valor);
    @Query (value = "select p Produto from Produto where p.descricao like %?1% and p.valor < ?1")
    List<String> findByDescriPrecoMenor(String descricao, Integer valor);
}

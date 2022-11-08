package com.example.ProjLocadora.Repository;

import com.example.ProjLocadora.Controller.ClienteController;
import com.example.ProjLocadora.Model.ModelCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RepositoryCliente extends JpaRepository <ModelCliente,Integer> {


    public List<ModelCliente> findByNome (String nome);


    List<ModelCliente> findByEmail(String email);

    @Query (value = "select c Cliente from Cliente where c.email like %?1% and c.nome like %?2%")
    List<String> findByEmailNome(String email, String nome);
    @Query (value = "select c from Cliente c where c.nome like %?1%")
    List<String> findByNomeEspec(String nome);
    @Query (value = "select c from Cliente c where c.email like %?1%")
    List<ModelCliente> findByEmailEspec(String email);

    @Query (value = "select a from Cliente c where c.codigo > ?1")
    public List<ModelCliente> findByCodigoMaior (int codigo);

}

package com.example.ProjLocadora.Controller;


import com.example.ProjLocadora.Model.ModelCliente;
import com.example.ProjLocadora.Model.ModelProduto;
import com.example.ProjLocadora.Repository.RepositoryCliente;
import com.example.ProjLocadora.Repository.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/apiProduto")
public class ProdutoController {



    @Autowired
    RepositoryProduto repoProd;


    @GetMapping (value="/todos")
    public List<ModelProduto> buscarTodos()
    {
        return  repoProd.findAll();
    }



    @GetMapping("/produtocodigo/{codigo}")
    public Optional<ModelProduto> buscarPorCodigo
            (@PathVariable(value="codigo") int codigo)
    {
        return repoProd.findById(codigo);
    }


    @GetMapping("/produtodescricao/{descricao}")
    public List<ModelProduto> buscarPorDescricao
            (@PathVariable(value="descricao") String descricao)
    {
        return repoProd.findByDescricao(descricao);
    }


    @GetMapping("/produtopreco/{preco}")
    public List<ModelProduto> buscarPorPreco
            (@PathVariable(value="preco") Integer preco)
    {
        return repoProd.findByPreco(preco);
    }



    @GetMapping ("/descricaomarca/{descricao}/{marca}")
    public List<String> listarDescricaoMarca
            (@PathVariable (value="descricao") String descricao,
             @PathVariable (value="marca") String marca)
    {
        return repoProd.findByDescriMarca(descricao, marca);
    }



    @GetMapping ("/marcaEspec/{marca}")
    public List<String> listarPorMarcaEspec
            (@PathVariable(value="marca") String marca)
    {
        return repoProd.findByMarcaEspec(marca);
    }

    @GetMapping ("/precoMaior/{valor}")
    public List<ModelCliente> listarPorPrecoMaior
            (@PathVariable(value="valor") int valor)
    {
        return repoProd.findByPrecoMaior(valor);
    }


    @GetMapping ("/precoMenor/{valor}")
    public List<ModelCliente> listarPorPrecoMenor
            (@PathVariable(value="valor") int valor)
    {
        return repoProd.findByPrecoMenor(valor);
    }

    @GetMapping ("/descricaoEspec/{descricao}")
    public List<String> listarPorDescricaoEspec
            (@PathVariable(value="descricao") String descricao)
    {
        return repoProd.findByDescriEspec(descricao);
    }



    @GetMapping ("/descricaoprecomenor/{descricao}/{valor}")
    public List<String> listarDescricaoprecomenor
            (@PathVariable (value="descricao") String descricao,
             @PathVariable (value="valor") Integer valor)
    {
        return repoProd.findByDescriPrecoMenor(descricao, valor);
    }




}

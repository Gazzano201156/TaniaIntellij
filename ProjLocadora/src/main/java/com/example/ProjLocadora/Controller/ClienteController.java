package com.example.ProjLocadora.Controller;

import com.example.ProjLocadora.Model.ModelCliente;
import com.example.ProjLocadora.Repository.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = "/apiCliente")
public class ClienteController {



    @Autowired
    RepositoryCliente repoCli;



    @GetMapping (value="/todos")
    public List<ModelCliente> buscarTodos()
    {
        return  repoCli.findAll();
    }






    @GetMapping("/clientecod/{codigo}")
    public Optional<ModelCliente> buscarPorCodigo
            (@PathVariable(value="codigo") int codigo)
    {
        return repoCli.findById(codigo);
    }


    @GetMapping("/clientenome/{nome}")
    public List<ModelCliente> buscarPorNome
            (@PathVariable(value="nome") String nome)
    {
        return repoCli.findByNome(nome);
    }


    @GetMapping("/clienteemail/{email}")
    public List<ModelCliente> buscarPorEmail
            (@PathVariable(value="email") String email)
    {
        return repoCli.findByEmail(email);
    }


    @GetMapping ("/EmailNome/{email}/{nome}")
    public List<String> listarEmailNome
            (@PathVariable (value="email") String email,
             @PathVariable (value="nome") String nome)
    {
        return repoCli.findByEmailNome(email, nome);
    }



    @GetMapping ("/nomeEspec/{nome}")
    public List<String> listarPorNomeEspec
            (@PathVariable(value="nome") String nome)
    {
        return repoCli.findByNomeEspec(nome);
    }

    @GetMapping ("/codigoMaior/{ra}")
    public List<ModelCliente> listarPorCodigoMaior
            (@PathVariable(value="codigo") int codigo)
    {
        return repoCli.findByCodigoMaior(codigo);
    }

    @GetMapping ("/emailEspec/{email}")
    public List<ModelCliente> listarPorEmailEspec
            (@PathVariable(value="email") String email)
    {
        return repoCli.findByEmailEspec(email);
    }





}

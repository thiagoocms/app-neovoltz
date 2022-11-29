package com.neovoltz.neovoltz.controllers.routers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neovoltz.neovoltz.view.model.usuario.LoginRequest;
import com.neovoltz.neovoltz.view.model.usuario.LoginResponse;
import com.neovoltz.neovoltz.controllers.models.Usuario;
import com.neovoltz.neovoltz.services.UsuarioService;

@RestController
@RequestMapping("/test/usuario")
public class UsuarioRouter {

    @Autowired
    public UsuarioService usuarioService;
    
    @GetMapping("/")
    public List<Usuario> obterTodos(){
       return usuarioService.obterTodos();
    }
    @PostMapping("/")
    public Usuario adicionar( @RequestBody Usuario usuario){

        return usuarioService.adicionar(usuario);
    }
   
    
}

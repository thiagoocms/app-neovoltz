package com.neovoltz.neovoltz.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.neovoltz.neovoltz.controllers.models.Usuario;
import com.neovoltz.neovoltz.repository.UsuarioRepository;



@Service
public class UsuarioService {
   
   
    
    
    @Autowired
    private UsuarioRepository repositorioUsuario;

    
    

    
   

    public List<Usuario> obterTodos() {
        
        return repositorioUsuario.findAll();
    }

    public Usuario adicionar(Usuario usuario){
        usuario.setId(null);
        
        return repositorioUsuario.save(usuario);
    }
    
    
   
    

}

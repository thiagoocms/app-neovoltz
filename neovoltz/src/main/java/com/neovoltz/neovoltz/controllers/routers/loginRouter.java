package com.neovoltz.neovoltz.controllers.routers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.neovoltz.neovoltz.controllers.models.Usuario;

import com.neovoltz.neovoltz.repository.UsuarioRepository;


@Controller
public class loginRouter {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    
    @PostMapping("/")
    public  String logar(Model model,  Usuario usuario, String lembrar){

        Usuario user = usuarioRepository.login(usuario.getCredencial(), usuario.getSenha());
        if(user != null){
            return "redirect:/home";
        }
        return "redirect:/";
        
    }
@GetMapping("/logoff")
    public String logoff(){
        return "redirect:/";

    }
}
    


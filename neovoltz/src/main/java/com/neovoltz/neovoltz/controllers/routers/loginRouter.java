package com.neovoltz.neovoltz.controllers.routers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;


import com.neovoltz.neovoltz.controllers.models.Empresa;
import com.neovoltz.neovoltz.repository.EmpresaRepository;

@Controller
public class loginRouter {
    @Autowired
    private EmpresaRepository empresaRepository;
    @PostMapping("/login")
    public  String logar(Model model, Empresa empresa, String lembrar){

        Empresa usuario = this.empresaRepository.login(empresa.getCredencial(), empresa.getSenha());
        if(usuario != null){
           
            return "redirect:/home";

        }
        model.addAttribute("erro","Usuario ou senha invalidos");
        return "redirect:/";
       
    }
    
}

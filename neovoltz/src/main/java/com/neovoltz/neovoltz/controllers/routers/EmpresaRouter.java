package com.neovoltz.neovoltz.controllers.routers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neovoltz.neovoltz.controllers.models.Empresa;
import com.neovoltz.neovoltz.services.EmpresaService;

@RestController
@RequestMapping("/test")
public class EmpresaRouter {

    @Autowired
    public EmpresaService empresaService;

    @GetMapping
    public List<Empresa> obterTodos(){
       return empresaService.obterTodos();
    }
    

    @GetMapping("/{id}")
    public Empresa obterPorId(@PathVariable Integer id){
        
        return empresaService.obterPorId(id);
    }

    @PostMapping("/")
    public Empresa adicionar(@RequestBody Empresa empresa){
        return empresaService.adicionar(empresa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        empresaService.deletar(id);
    }

    @PutMapping("/{id}")
    public Empresa atualizar(
        @PathVariable Integer id, 
        @RequestBody Empresa empresa){
            
        return empresaService.atualizar(id, empresa);
    }

    
}

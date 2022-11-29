package com.neovoltz.neovoltz.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neovoltz.neovoltz.controllers.models.Empresa;
import com.neovoltz.neovoltz.repository.EmpresaRepository;

@Service
public class EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;

    
    public List<Empresa> obterTodos() {
        
        return empresaRepository.findAll();
    }

    
    public Empresa obterPorId(Integer idEmpresa) {
        Optional<Empresa> Empresa = empresaRepository.findById(idEmpresa);
       
        if(Empresa.isEmpty()){
            throw new InputMismatchException("Empresa não encontrado com o ID: " + idEmpresa);
        }

        return Empresa.get();
    }

    
    public Empresa adicionar(Empresa empresa) {
     
       empresa.setId(null);
       return empresaRepository.save(empresa);
    }

    
    public void deletar(Integer idEmpresa) {
        Optional<Empresa> Empresa = empresaRepository.findById(idEmpresa);

        if(Empresa.isEmpty()){
            throw new InputMismatchException("Não é possível deletar o Empresa com o ID: " + idEmpresa + " - Empresa não encontrado");
        }

        empresaRepository.deleteById(idEmpresa);
    }

    
    public Empresa atualizar(Integer idEmpresa, Empresa empresa) {
         
        empresa.setId(idEmpresa);
        
        
        return empresaRepository.save(empresa);

       
    }


   
}

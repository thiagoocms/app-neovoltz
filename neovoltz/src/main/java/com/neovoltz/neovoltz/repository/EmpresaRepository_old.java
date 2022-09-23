package com.neovoltz.neovoltz.repository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

import com.neovoltz.neovoltz.controllers.models.Empresa;

@Repository
public class EmpresaRepository_old {
    private List<Empresa> empresas = new ArrayList<Empresa>();
    private Integer lastId = 0;

    public List<Empresa> getEmpresas(){
        return empresas;
    }

    public Optional<Empresa> getEmpresaId(Integer id){

        return empresas.stream().filter(empresa -> empresa.getId() == id).findFirst();

    }
    
    public Empresa insertEmpresa(Empresa empresa){

        lastId++;
        empresa.setId(lastId);
        empresas.add(empresa);

        return empresa;
    }
    
}

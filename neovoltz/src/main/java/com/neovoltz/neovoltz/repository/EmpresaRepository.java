package com.neovoltz.neovoltz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neovoltz.neovoltz.controllers.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    @Query(value="select * from empresa where credencial = :credencial and senha = :senha", nativeQuery = true)
    public Empresa login(String credencial, String senha);
    
}

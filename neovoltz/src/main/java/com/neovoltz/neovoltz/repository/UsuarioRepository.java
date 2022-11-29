package com.neovoltz.neovoltz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neovoltz.neovoltz.controllers.models.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
    
    @Query(value="select * from usuario where credencial = :credencial and senha = :senha", nativeQuery = true)
    public Usuario login(String credencial, String senha);

    Optional<Usuario> findByCredencial(String Email);

    
}



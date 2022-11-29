package com.neovoltz.neovoltz.controllers.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;







@Entity
@SequenceGenerator(name ="generator_usuario", sequenceName = "sequence_usuario", initialValue = 1, allocationSize = 1)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_usuario")
    private Long id;

    @Column(nullable = false)
    private String credencial;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Integer idEmpresa;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    
}

package com.neovoltz.neovoltz.view.model.usuario;

import com.neovoltz.neovoltz.controllers.models.Usuario;

public class LoginResponse {

    private String token;

    public Usuario usuario;

    public LoginResponse() {
    }

    public LoginResponse(String token, Usuario usuario) {
        this.token = token;
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}

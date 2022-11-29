package com.neovoltz.neovoltz.view.model.usuario;

public class LoginRequest {

    private String credencial;

    private String senha;

    public LoginRequest() {
    }

    public LoginRequest(String credencial, String senha) {
        this.credencial = credencial;
        this.senha = senha;
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
    

   
}

package com.example.projecttherion.DTO;

public class LoginRequest {
    String email;
    String contrasenna;

    public LoginRequest() {
    }

    public LoginRequest(String email, String contrasenna) {
        this.email = email;
        this.contrasenna = contrasenna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
}


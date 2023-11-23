package com.example.projecttherion.DTO;

public class DuennoRequest {

    private String dunNombre;
    private String duAppat;
    private String duApmat;
    private String duCorreo;
    private String duContrasenna;

    public DuennoRequest() {
    }

    public DuennoRequest(String nombre, String appat, String apmat, String correo, String contrasenna) {
        this.dunNombre = nombre;
        this.duAppat = appat;
        this.duApmat = apmat;
        this.duCorreo = correo;
        this.duContrasenna = contrasenna;
    }

    //Getters and Setters


    public String getDunNombre() {
        return dunNombre;
    }

    public void setDunNombre(String dunNombre) {
        this.dunNombre = dunNombre;
    }

    public String getDuAppat() {
        return duAppat;
    }

    public void setDuAppat(String duAppat) {
        this.duAppat = duAppat;
    }

    public String getDuApmat() {
        return duApmat;
    }

    public void setDuApmat(String duApmat) {
        this.duApmat = duApmat;
    }

    public String getDuCorreo() {
        return duCorreo;
    }

    public void setDuCorreo(String duCorreo) {
        this.duCorreo = duCorreo;
    }

    public String getDuContrasenna() {
        return duContrasenna;
    }

    public void setDuContrasenna(String duContrasenna) {
        this.duContrasenna = duContrasenna;
    }

}

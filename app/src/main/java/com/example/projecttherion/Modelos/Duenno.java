package com.example.projecttherion.Modelos;

import java.util.List;

public class Duenno {

    private Long idDuenno;

    private String dunNombre;

    private String duAppat;

    private String duApmat;

    private String duCorreo;

    private String duContrasenna;

    private List<Negocio> negocios;


    public Duenno() {
    }

    public Duenno(Long idDuenno, String dunNombre, String duAppat, String duApmat, String duCorreo, String duContrasenna, List<Negocio> negocios) {
        this.idDuenno = idDuenno;
        this.dunNombre = dunNombre;
        this.duAppat = duAppat;
        this.duApmat = duApmat;
        this.duCorreo = duCorreo;
        this.duContrasenna = duContrasenna;
        this.negocios = negocios;
    }

    public Long getIdDuenno() {
        return idDuenno;
    }

    public void setIdDuenno(Long idDuenno) {
        this.idDuenno = idDuenno;
    }

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

    public List<Negocio> getNegocios() {
        return negocios;
    }

    public void setNegocios(List<Negocio> negocios) {
        this.negocios = negocios;
    }
}

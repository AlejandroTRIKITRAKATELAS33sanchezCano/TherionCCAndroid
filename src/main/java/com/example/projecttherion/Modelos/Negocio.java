package com.example.projecttherion.Modelos;

import java.util.List;

public class Negocio {

    private Long idNegocio;
    private String neNombre;
    private boolean neAbierto;
    private boolean neActivo;
    private boolean neBorrado;
    private String neImagen;

    private Duenno duenno;

    private boolean neTarjeta;
    private boolean neDomicilio;

    private List<Menu> menus;

    private List<Horario> horarios;

    public Negocio() {
    }

    public Negocio(Long idNegocio, String neNombre, boolean neAbierto, boolean neActivo, boolean neBorrado, String neImagen, Duenno duenno, boolean neTarjeta, boolean neDomicilio, List<Menu> menus, List<Horario> horarios) {
        this.idNegocio = idNegocio;
        this.neNombre = neNombre;
        this.neAbierto = neAbierto;
        this.neActivo = neActivo;
        this.neBorrado = neBorrado;
        this.neImagen = neImagen;
        this.duenno = duenno;
        this.neTarjeta = neTarjeta;
        this.neDomicilio = neDomicilio;
        this.menus = menus;
        this.horarios = horarios;
    }

    public Negocio(String neNombre, boolean neActivo, String neImagen) {
        this.neNombre = neNombre;
        this.neActivo = neActivo;
        this.neImagen = neImagen;
    }

    public Long getIdNegocio() {
        return idNegocio;
    }

    public void setIdNegocio(Long idNegocio) {
        this.idNegocio = idNegocio;
    }

    public String getNeNombre() {
        return neNombre;
    }

    public void setNeNombre(String neNombre) {
        this.neNombre = neNombre;
    }

    public boolean isNeAbierto() {
        return neAbierto;
    }

    public void setNeAbierto(boolean neAbierto) {
        this.neAbierto = neAbierto;
    }

    public boolean isNeActivo() {
        return neActivo;
    }

    public void setNeActivo(boolean neActivo) {
        this.neActivo = neActivo;
    }

    public boolean isNeBorrado() {
        return neBorrado;
    }

    public void setNeBorrado(boolean neBorrado) {
        this.neBorrado = neBorrado;
    }

    public String getNeImagen() {
        return neImagen;
    }

    public void setNeImagen(String neImagen) {
        this.neImagen = neImagen;
    }

    public Duenno getDuenno() {
        return duenno;
    }

    public void setDuenno(Duenno duenno) {
        this.duenno = duenno;
    }

    public boolean isNeTarjeta() {
        return neTarjeta;
    }

    public void setNeTarjeta(boolean neTarjeta) {
        this.neTarjeta = neTarjeta;
    }

    public boolean isNeDomicilio() {
        return neDomicilio;
    }

    public void setNeDomicilio(boolean neDomicilio) {
        this.neDomicilio = neDomicilio;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
}

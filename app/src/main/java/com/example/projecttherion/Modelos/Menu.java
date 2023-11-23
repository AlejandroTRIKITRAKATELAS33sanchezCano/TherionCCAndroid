package com.example.projecttherion.Modelos;

import java.util.List;

public class Menu {

    private Long idMenu;

    private String meNombre;
    private boolean meDisponible;
    private boolean meActivo;
    private  String meImagen;
    private Negocio negocio;
    private List<Producto> productos;

    public Menu() {
    }

    public Menu(Long idMenu, String meNombre, boolean meDisponible, boolean meActivo, String meImagen, Negocio negocio, List<Producto> productos) {
        this.idMenu = idMenu;
        meNombre = meNombre;
        meDisponible = meDisponible;
        meActivo = meActivo;
        meImagen = meImagen;
        this.negocio = negocio;
        this.productos = productos;
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getMeNombre() {
        return meNombre;
    }

    public void setMeNombre(String meNombre) {
        meNombre = meNombre;
    }

    public boolean isMeDisponible() {
        return meDisponible;
    }

    public void setMeDisponible(boolean meDisponible) {
        meDisponible = meDisponible;
    }

    public boolean isMeActivo() {
        return meActivo;
    }

    public void setMeActivo(boolean meActivo) {
        meActivo = meActivo;
    }

    public String getMeImagen() {
        return meImagen;
    }

    public void setMeImagen(String meImagen) {
        meImagen = meImagen;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

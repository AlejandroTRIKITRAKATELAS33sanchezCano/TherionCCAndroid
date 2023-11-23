package com.example.projecttherion.Modelos;

import java.util.List;

public class Producto {

    private Long idProducto;

    private String prNombre;
    private int prPrecio;
    private String prImagen;
    private String prDescripcion;

    private List<Menu> menus;

    public Producto() {
    }

    public Producto(Long idProducto, String prNombre, int prPrecio, String prImagen, String prDescripcion, List<Menu> menus) {
        this.idProducto = idProducto;
        this.prNombre = prNombre;
        this.prPrecio = prPrecio;
        this.prImagen = prImagen;
        this.prDescripcion = prDescripcion;
        this.menus = menus;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getPrNombre() {
        return prNombre;
    }

    public void setPrNombre(String prNombre) {
        this.prNombre = prNombre;
    }

    public int getPrPrecio() {
        return prPrecio;
    }

    public void setPrPrecio(int prPrecio) {
        this.prPrecio = prPrecio;
    }

    public String getPrImagen() {
        return prImagen;
    }

    public void setPrImagen(String prImagen) {
        this.prImagen = prImagen;
    }

    public String getPrDescripcion() {
        return prDescripcion;
    }

    public void setPrDescripcion(String prDescripcion) {
        this.prDescripcion = prDescripcion;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}

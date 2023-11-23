package com.example.projecttherion.Modelos;

import java.util.List;

public class DiaSemana {

    private int idDiaSemana;
    private String nombre;
    private List<Integer> horarios;

    public DiaSemana() {
    }

    public DiaSemana(int idDiaSemana, String nombre, List<Integer> horarios) {
        this.idDiaSemana = idDiaSemana;
        this.nombre = nombre;
        this.horarios = horarios;
    }

    public int getIdDiaSemana() {
        return idDiaSemana;
    }

    public void setIdDiaSemana(int idDiaSemana) {
        this.idDiaSemana = idDiaSemana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Integer> horarios) {
        this.horarios = horarios;
    }
}

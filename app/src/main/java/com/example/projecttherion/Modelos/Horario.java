package com.example.projecttherion.Modelos;

import java.time.LocalTime;

public class Horario {

    private Long idHorario;

    private Negocio negocio;

    private DiaSemana diaSemana;

    private LocalTime horaApertura;
    private LocalTime horaCierre;

    public Horario() {
    }

    public Horario(Long idHorario, Negocio negocio, DiaSemana diaSemana, LocalTime horaApertura, LocalTime horaCierre) {
        this.idHorario = idHorario;
        this.negocio = negocio;
        this.diaSemana = diaSemana;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }
}

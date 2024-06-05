package com.ema.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="HorariosProfesionales")
public class HorariosProfesionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    private Boolean estado;

    @JoinColumn (name = "fk_profesional", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Profesionales prof;

    @JoinColumn (name = "fk_horario", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Horarios hora;

    @JoinColumn (name = "fk_dia", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Dias dia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Horarios getHora() {
        return hora;
    }

    public void setHora(Horarios hora) {
        this.hora = hora;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public Profesionales getProf() {
        return prof;
    }

    public void setProf(Profesionales prof) {
        this.prof = prof;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

package com.ema.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="DiasHorariosTurnos")
public class DiasHorariosTurnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    private Boolean estado;

    @JoinColumn (name = "fk_horarios", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Horarios hora;

    @JoinColumn (name = "fk_dias", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Dias dia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
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
}

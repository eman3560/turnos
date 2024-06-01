package com.ema.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="HorariosProfesionales")
public class HorariosProfesionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descrip;

    @JoinColumn (name = "fk_horario", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Horarios hora;

    @JoinColumn (name = "fk_dia", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Dias dia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
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

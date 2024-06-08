package com.ema.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="Turnos")
public class Turnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private LocalDate fecha;
    private Boolean estado;

    @JoinColumn (name = "fk_diashorariosturnos", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private DiasHorariosTurnos diaturno;

    @JoinColumn (name = "fk_profesionales", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Profesionales prof;

    @JoinColumn (name = "fk_paciente", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Pacientes pac;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public DiasHorariosTurnos getDiaturno() {
        return diaturno;
    }

    public void setDiaturno(DiasHorariosTurnos diaturno) {
        this.diaturno = diaturno;
    }

    public Profesionales getProf() {
        return prof;
    }

    public void setProf(Profesionales prof) {
        this.prof = prof;
    }

    public Pacientes getPac() {
        return pac;
    }

    public void setPac(Pacientes pac) {
        this.pac = pac;
    }
}

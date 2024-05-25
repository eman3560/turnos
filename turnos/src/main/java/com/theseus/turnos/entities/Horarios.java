package com.theseus.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="horarios")
public class Horarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descrip;
    private String meridiano;


    public String getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(String meridiano) {
        this.meridiano = meridiano;
    }


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

}

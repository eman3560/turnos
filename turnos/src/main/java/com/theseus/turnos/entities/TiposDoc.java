package com.theseus.turnos.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name="tiposdoc")
public class TiposDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descrip;
    private Boolean defecto;

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


    public Boolean getDefecto() {
        return defecto;
    }

    public void setDefecto(Boolean defecto) {
        this.defecto = defecto;
    }
}

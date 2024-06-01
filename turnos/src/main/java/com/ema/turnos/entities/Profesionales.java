package com.ema.turnos.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="profesionales")
public class Profesionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String apellido;

    private String nombre;

    private String matricula;



    private String telefono;

    @JoinColumn(name = "fk_tiposdoc", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private TiposDoc doc;

    private String ndoc;

    @JoinColumn(name = "fk_user", referencedColumnName = "id")
    @OneToOne
    private Roles usuario;

    @JoinColumn(name = "fk_especialidades", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Especialidades espec;

    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TiposDoc getDoc() {
        return doc;
    }

    public void setDoc(TiposDoc doc) {
        this.doc = doc;
    }

    public String getNdoc() {
        return ndoc;
    }

    public void setNdoc(String ndoc) {
        this.ndoc = ndoc;
    }

    public Especialidades getEspec() {
        return espec;
    }

    public void setEspec(Especialidades espec) {
        this.espec = espec;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Roles getUsuario() {
        return usuario;
    }

    public void setUsuario(Roles usuario) {
        this.usuario = usuario;
    }
}

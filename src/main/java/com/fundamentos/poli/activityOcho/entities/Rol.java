package com.fundamentos.poli.activityOcho.entities;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Rol implements Serializable {

    private static final long serialVersionUID = 6362794385792247263L;

    private long id;
    private String descripcion;
    private String  siglaRol;
    private boolean estado;

    public Rol(){}

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="ID_ROL_PK", nullable = false)


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="DESCRIPCION", nullable = false)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name ="SIGLA_ROL")
    public String getSiglaRol() {
        return siglaRol;
    }

    public void setSiglaRol(String siglaRol) {
        this.siglaRol = siglaRol;
    }

    @Column(name="ESTADO", nullable = false)
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol [id=" + id + ", descripcion=" + descripcion + ", siglaRol=" + siglaRol + ", estado=" + estado + "]";
    }
}




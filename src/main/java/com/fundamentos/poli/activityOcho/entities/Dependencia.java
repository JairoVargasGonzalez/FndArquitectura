package com.fundamentos.poli.activityOcho.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "DEPENDENCIA")
public class Dependencia {

    private long id;
    private String codigo;
    private String descripcion;
    private String cargo;
    private boolean estado;

    public Dependencia() {
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
      return String.format("Dependencia [id=%d, codigo=%s, descripcion=%s, cargo=%s, estado=%s]", id, codigo, descripcion, cargo, estado);
    }
}

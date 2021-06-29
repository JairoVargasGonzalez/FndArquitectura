package com.fundamentos.poli.activityOcho.services;

import com.fundamentos.poli.activityOcho.entities.Usuarios;

import java.util.List;

public interface IUsuarioServices {

    public List<Usuarios> findAll();

    public Usuarios create(Usuarios usuarios);
}

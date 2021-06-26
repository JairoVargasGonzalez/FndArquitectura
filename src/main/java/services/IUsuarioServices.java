package services;

import entities.Usuario;

import java.util.List;

public interface IUsuarioServices {

    public List<Usuario> findAll();

    public Usuario create(Usuario usuario);
}

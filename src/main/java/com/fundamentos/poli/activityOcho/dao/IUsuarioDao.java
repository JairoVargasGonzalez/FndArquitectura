package com.fundamentos.poli.activityOcho.dao;

import com.fundamentos.poli.activityOcho.entities.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuarios, Long> {
}

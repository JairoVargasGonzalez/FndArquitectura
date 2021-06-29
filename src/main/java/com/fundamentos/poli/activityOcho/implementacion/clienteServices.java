package com.fundamentos.poli.activityOcho.implementacion;

import com.fundamentos.poli.activityOcho.dao.IUsuarioDao;
import com.fundamentos.poli.activityOcho.entities.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundamentos.poli.activityOcho.services.IUsuarioServices;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class clienteServices implements IUsuarioServices {

    @Autowired
    private IUsuarioDao clientDao;

    @Transactional(readOnly = true)
    public List<Usuarios> findAll() {
        return (List<Usuarios>) clientDao.findAll();
    }

    @Transactional(readOnly = false)
    public Usuarios create(Usuarios usuarios){
        System.out.println(usuarios.getDependencia());
        return clientDao.save(usuarios);
    }
}

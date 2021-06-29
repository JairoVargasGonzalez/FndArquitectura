package com.fundamentos.poli.activityOcho.Controler;

import com.fundamentos.poli.activityOcho.entities.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fundamentos.poli.activityOcho.services.IUsuarioServices;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    IUsuarioServices usuarioServices;

    @GetMapping("/usuario")
    public List<Usuarios> index() {
        System.out.println("HOLA MUNDO");
      return usuarioServices.findAll();
    }

    @PostMapping("/usuario")
    public Usuarios create(@RequestBody Usuarios usuarios){
        return usuarioServices.create(usuarios);
    }

}

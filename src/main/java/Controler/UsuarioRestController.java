package Controler;

import entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.IUsuarioServices;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    IUsuarioServices usuarioServices;

    @GetMapping("/usuario")
    public List<Usuario> index() {
      return usuarioServices.findAll();
    }

    @PostMapping("/usuario")
    public  Usuario create(@RequestBody Usuario usuario){
        return usuarioServices.create(usuario);
    }

}

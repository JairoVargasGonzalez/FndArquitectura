package implementacion;

import dao.IUsuarioDao;
import entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.IUsuarioServices;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class clienteServices implements IUsuarioServices {

    @Autowired
    private IUsuarioDao clientDao;

    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) clientDao.findAll();
    }

    @Transactional(readOnly = false)
    public Usuario create(Usuario usuario){
        System.out.println(usuario.getDependencia());
        return clientDao.save(usuario);
    }
}

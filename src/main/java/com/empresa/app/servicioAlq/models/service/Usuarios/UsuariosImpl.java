package com.empresa.app.servicioAlq.models.service.Usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IUsuarioDao;
import com.empresa.app.servicioAlq.models.entity.Usuarios;

@Service
public class UsuariosImpl implements IUsuariosService {

    @Autowired
    private IUsuarioDao iUsuario;

    @Override
    public List<Usuarios> findAll() {
        return (List<Usuarios>) iUsuario.findAll();
    }

    @Override
    public boolean findByUsuarioAndClave(String usuario, String clave) {
        Usuarios usuario_validado = iUsuario.findByUsuarioAndClave(usuario, clave);
        return usuario_validado != null;

    }

}

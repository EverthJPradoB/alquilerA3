package com.empresa.app.servicioAlq.models.service.Usuarios;



import java.util.List;

import com.empresa.app.servicioAlq.models.entity.Usuarios;

public interface IUsuariosService {

    public List<Usuarios> findAll();  
    public boolean findByUsuarioAndClave(String usuario, String clave);
}

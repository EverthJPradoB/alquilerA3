package com.empresa.app.servicioAlq.models.service.TIpoUsuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.app.servicioAlq.models.dao.ITipoUsuarioDao;
import com.empresa.app.servicioAlq.models.entity.TipoUsuario;

@Service
public class TipoUsuarioImpl implements ITipoUsuarioService {

    @Autowired
    private ITipoUsuarioDao iTipoUsuario;

    @Override
    public List<TipoUsuario> findAll() {
        
        return (List<TipoUsuario>) iTipoUsuario.findAll();
    
    }
       
}

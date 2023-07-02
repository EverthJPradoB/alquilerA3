package com.empresa.app.servicioAlq.models.service.Autos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IAutoDao;
import com.empresa.app.servicioAlq.models.entity.Autos;
import com.empresa.app.servicioAlq.models.entity.Producto;

@Service
public class AutoImplt implements IAutosService {

    @Autowired
    private IAutoDao autosService ;

    @Override
    public List<Autos> findAll() {
 
        return (List<Autos>) autosService.findAll();

    }

    @Override
    public Optional<Autos> findAutosById(String id) {
        // TODO Auto-generated method stub
        return autosService.findById(id);
    }

    @Override
    public void save(Autos autos) {
        autosService.save(autos);
        
    }
    
}

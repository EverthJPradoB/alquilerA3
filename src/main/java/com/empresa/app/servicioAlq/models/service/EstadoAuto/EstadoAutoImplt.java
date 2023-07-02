package com.empresa.app.servicioAlq.models.service.EstadoAuto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IEstadoAutoDao;
import com.empresa.app.servicioAlq.models.entity.EstadoAuto;

@Service
public class EstadoAutoImplt implements IEstadoAutoService {

    @Autowired
    private IEstadoAutoDao autoService;

    @Override
    public List<EstadoAuto> findAll() {
    
        return (List<EstadoAuto>) autoService.findAll();

    }
    
}

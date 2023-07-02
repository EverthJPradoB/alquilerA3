package com.empresa.app.servicioAlq.models.service.EstadoAlquiler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IEstadoAlquilerDao;
import com.empresa.app.servicioAlq.models.entity.EstadoAlquiler;

@Service
public class EstadoAlquilerImplt implements IEstadoAquilerService {

    @Autowired
    private IEstadoAlquilerDao alquiler;

    @Override
    public List<EstadoAlquiler> findAll() {
        return (List<EstadoAlquiler>) alquiler.findAll();
    }
}

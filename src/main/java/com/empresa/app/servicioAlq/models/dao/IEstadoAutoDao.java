package com.empresa.app.servicioAlq.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.app.servicioAlq.models.entity.EstadoAuto;

public interface IEstadoAutoDao extends CrudRepository<EstadoAuto,Integer> {
    
    
}

package com.empresa.app.servicioAlq.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.app.servicioAlq.models.entity.Alquiler;

public interface IAlquilerDao  extends CrudRepository<Alquiler,String>{
    
}

package com.empresa.app.servicioAlq.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.app.servicioAlq.models.entity.EstadoAlquiler;

public interface IEstadoAlquilerDao extends CrudRepository<EstadoAlquiler, Integer> {

}

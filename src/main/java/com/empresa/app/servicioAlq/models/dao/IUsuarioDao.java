package com.empresa.app.servicioAlq.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.app.servicioAlq.models.entity.Usuarios;

public interface IUsuarioDao extends CrudRepository<Usuarios, Integer> {

    public Usuarios findByUsuarioAndClave(String usuario, String clave);

}

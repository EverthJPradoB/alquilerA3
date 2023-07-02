package com.empresa.app.servicioAlq.models.service.Autos;

import java.util.List;
import java.util.Optional;

import com.empresa.app.servicioAlq.models.entity.Autos;


public interface IAutosService {

    public List<Autos> findAll();

    public Optional<Autos> findAutosById(String id);

     public void save(Autos autos);
}

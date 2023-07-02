package com.empresa.app.servicioAlq.models.service.Alquiler;

import java.util.List;

import com.empresa.app.servicioAlq.models.entity.Alquiler;

public interface IAlquilerService {

    public List<Alquiler> findAll();

    public void saved(Alquiler alquiler);

}

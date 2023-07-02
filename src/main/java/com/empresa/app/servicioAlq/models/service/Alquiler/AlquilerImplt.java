package com.empresa.app.servicioAlq.models.service.Alquiler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.app.servicioAlq.models.dao.IAlquilerDao;
import com.empresa.app.servicioAlq.models.entity.Alquiler;

@Service
public class AlquilerImplt implements IAlquilerService {

    @Autowired
    private IAlquilerDao alquilerDao;

    @Override
    public List<Alquiler> findAll() {

        return (List<Alquiler>) alquilerDao.findAll();
    }

    @Override
    public void saved(Alquiler alquiler) {
        alquilerDao.save(alquiler);

    }

}

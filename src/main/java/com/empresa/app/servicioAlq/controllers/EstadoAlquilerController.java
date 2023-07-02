package com.empresa.app.servicioAlq.controllers;


import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.EstadoAlquiler;
import com.empresa.app.servicioAlq.models.service.EstadoAlquiler.IEstadoAquilerService;




@CrossOrigin
@RestController
@RequestMapping("/EstadoAlquiler")
public class EstadoAlquilerController {
    
    
    @Autowired
    private IEstadoAquilerService aquilerService;

    @GetMapping("/listar")
    public List<EstadoAlquiler> getAlquiler() {

        return aquilerService.findAll();
    }

}

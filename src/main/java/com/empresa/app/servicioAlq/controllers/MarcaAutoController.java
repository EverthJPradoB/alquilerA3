package com.empresa.app.servicioAlq.controllers;


import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.MarcaAuto;
import com.empresa.app.servicioAlq.models.service.MarcaAuto.IMarcaAutoService;

@CrossOrigin
@RestController
@RequestMapping("/MarcaAuto")
public class MarcaAutoController {

    @Autowired
    private IMarcaAutoService  autoService;
    
    @GetMapping("/listar")
    public List<MarcaAuto> getAlquiler() {

        return autoService.findAll();
    }

}

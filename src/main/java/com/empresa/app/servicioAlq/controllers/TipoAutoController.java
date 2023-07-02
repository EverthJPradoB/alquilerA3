package com.empresa.app.servicioAlq.controllers;




import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.TipoAuto;
import com.empresa.app.servicioAlq.models.service.TipoAuto.ITipoAutoService;

@CrossOrigin
@RestController
@RequestMapping("/TipoAuto")
public class TipoAutoController {

    @Autowired
    private ITipoAutoService autoService;

    @GetMapping("/listar")
    public List<TipoAuto> getAlquiler() {

        return autoService.findAll();
    }

}

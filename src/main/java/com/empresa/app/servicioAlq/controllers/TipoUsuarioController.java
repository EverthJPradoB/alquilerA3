package com.empresa.app.servicioAlq.controllers;



import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.TipoUsuario;
import com.empresa.app.servicioAlq.models.service.TIpoUsuario.ITipoUsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/TipoUsuario")

public class TipoUsuarioController {
    
    @Autowired
    private ITipoUsuarioService iTipoUsuarioService;

    @GetMapping("/listar")
    public List<TipoUsuario> getAlquiler() {

        return iTipoUsuarioService.findAll();
    }

}

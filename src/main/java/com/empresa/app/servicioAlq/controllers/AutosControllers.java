package com.empresa.app.servicioAlq.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.Autos;
import com.empresa.app.servicioAlq.models.service.Autos.IAutosService;

@CrossOrigin
@RestController
@RequestMapping("/Autos")
public class AutosControllers {

    @Autowired
    private IAutosService autoService;

    @GetMapping("/listar")
    public List<Autos> getAutos() {

        return autoService.findAll();
    }

    @GetMapping("/autos/{id}")
    public ResponseEntity<Autos> getAutoById(@PathVariable("id") String id) {
        Optional<Autos> auto = autoService.findAutosById(id);
        if (auto.isPresent()) {
            return ResponseEntity.ok(auto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

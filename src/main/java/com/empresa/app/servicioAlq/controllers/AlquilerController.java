package com.empresa.app.servicioAlq.controllers;

import java.time.LocalDate;
import java.util.List;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.Alquiler;
import com.empresa.app.servicioAlq.models.entity.Autos;
import com.empresa.app.servicioAlq.models.entity.DtoAlquiler;
import com.empresa.app.servicioAlq.models.entity.EstadoAlquiler;
import com.empresa.app.servicioAlq.models.entity.EstadoAuto;
import com.empresa.app.servicioAlq.models.entity.Usuarios;
import com.empresa.app.servicioAlq.models.service.Alquiler.IAlquilerService;
import com.empresa.app.servicioAlq.models.service.Autos.IAutosService;

@CrossOrigin
@RestController
@RequestMapping("/Alquiler")
public class AlquilerController {
    @Autowired
    private IAlquilerService alquilerService;

    @Autowired
    private IAutosService autoService;

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/listar")
    public List<Alquiler> getAutos() {

        return alquilerService.findAll();
    }

    @PostMapping("/addAlquiler")
    public ResponseEntity<String> recibirDatos(@RequestBody DtoAlquiler datos) {
        // Realiza la lógica de tu servicio en Spring utilizando los datos recibidos

        // USUARIO
        String user_a = datos.getUser_a();

        Usuarios user = new Usuarios();
        user.setIdUsuario(user_a);

        // Autos
        String id_auto = datos.getAuto_id_a();
        Autos auto = new Autos();
        auto.setIdAuto(id_auto);

        EstadoAuto estadoAuto = new EstadoAuto();
        estadoAuto.setIdEstadoAuto(2);
        auto.setIdEstadoAuto(estadoAuto);

        Autos autoUpdateEstado = autoService.findAutosById(id_auto).orElse(null);
        autoUpdateEstado.setIdEstadoAuto(estadoAuto);
        autoService.save(autoUpdateEstado);

        

        // ESTADO ALQUILER
        int estado = datos.getEstado();
        EstadoAlquiler estadoAlquiler = new EstadoAlquiler();
        estadoAlquiler.setIdEstadoAlquiler(estado);

        //

        // fechas
        LocalDate fechaPrestamo = datos.getFechapres();

        LocalDate fechadevo = datos.getFechadevo();
        //

        int numdias = datos.getNumdias();

        Double precio = datos.getPrecio();

        Double monto = datos.getMonto();

        // ENCARGADO
        String encargado_a = datos.getEncargado_a();
        // Usuarios user2_Encargado = new Usuarios();

        // user2_Encargado.setIdUsuario(encargado_a);

        /// GUARDAD EN UN OBJETO ALQUILER

        Alquiler alquiler = new Alquiler(user, auto, estadoAlquiler, fechaPrestamo, fechadevo, numdias,
                precio, monto, encargado_a);

        //
        // System.out.println("id_auto: " + id_auto);
        // System.out.println("id de Usuario: " + user_a);
        // System.out.println("Estado de Alquiler: " + estado);
        // System.out.println("Fecha de Prestamo: " + fechaPrestamo);
        // System.out.println("Fecha de Devolucion: " + fechadevo);
        // System.out.println("Número de Días: " + numdias);
        // System.out.println("Precio: " + precio);
        // System.out.println("Monto: " + monto);
        // System.out.println("Encargado: " + encargado_a);

        alquilerService.saved(alquiler);

        // Ejemplo: Retornar una respuesta
        return ResponseEntity.ok("Datos recibidos correctamente");
    }

}

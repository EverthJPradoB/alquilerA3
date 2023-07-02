package com.empresa.app.servicioAlq.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado_alquiler")
public class EstadoAlquiler {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO_ALQUILER")
    private int IdEstadoAlquiler;

    @Column(name = "ESTADO")
    private String Estado;

    

    public EstadoAlquiler() {
    }


    
    public EstadoAlquiler(int idEstadoAlquiler, String estado) {
        IdEstadoAlquiler = idEstadoAlquiler;
        Estado = estado;
    }



    public int getIdEstadoAlquiler() {
        return IdEstadoAlquiler;
    }

    public void setIdEstadoAlquiler(int idEstadoAlquiler) {
        IdEstadoAlquiler = idEstadoAlquiler;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }


    
}

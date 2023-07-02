package com.empresa.app.servicioAlq.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado_auto")
public class EstadoAuto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO")
    private int IdEstadoAuto;

    @Column(name = "ESTADO")
    private String disponibilidad;


    
    public EstadoAuto() {
    }

    

    
    public EstadoAuto(int idEstadoAuto, String disponibilidad) {
        IdEstadoAuto = idEstadoAuto;
        this.disponibilidad = disponibilidad;
    }





    public int getIdEstadoAuto() {
        return IdEstadoAuto;
    }

    public void setIdEstadoAuto(int idEstadoAuto) {
        IdEstadoAuto = idEstadoAuto;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



    
}

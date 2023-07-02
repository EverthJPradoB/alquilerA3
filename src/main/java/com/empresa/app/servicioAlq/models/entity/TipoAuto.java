package com.empresa.app.servicioAlq.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_auto")
public class TipoAuto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO")
    private Integer IdTipoAuto;
    
    @Column(name = "NOMBRE_TIPO")
    private String NombreTipo;

    public TipoAuto() {
    }

    public TipoAuto(int idTipoAuto, String nombreTipo) {
        IdTipoAuto = idTipoAuto;
        NombreTipo = nombreTipo;
    }
    public int getIdTipoAuto() {
        return IdTipoAuto;
    }

    public void setIdTipoAuto(int idTipoAuto) {
        IdTipoAuto = idTipoAuto;
    }

    public String getNombreTipo() {
        return NombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        NombreTipo = nombreTipo;
    }

    

}

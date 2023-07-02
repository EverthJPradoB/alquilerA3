package com.empresa.app.servicioAlq.models.entity;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "autos")
public class Autos {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTO")
    private String IdAuto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_MARCA")
    private MarcaAuto idMarcaAuto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TIPO")
    private TipoAuto IdTipoAuto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ESTADO")
    private EstadoAuto idEstadoAuto;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "ANIO")
    private int año;

    @Column(name = "CAPACIDAD")
    private int capacidad;

    @Column(name = "PRECIO")
    private double precio;

    @Column(name = "FOTO")
    private String foto;

    @Column(name = "PLACA")
    private String placa;

    public Autos() {
    }

    public String getIdAuto() {
        return IdAuto;
    }


    public void setIdAuto(String idAuto) {
        IdAuto = idAuto;
    }




    public MarcaAuto getIdMarcaAuto() {
        return idMarcaAuto;
    }




    public void setIdMarcaAuto(MarcaAuto idMarcaAuto) {
        this.idMarcaAuto = idMarcaAuto;
    }




    public TipoAuto getIdTipoAuto() {
        return IdTipoAuto;
    }




    public void setIdTipoAuto(TipoAuto idTipoAuto) {
        IdTipoAuto = idTipoAuto;
    }




    public EstadoAuto getIdEstadoAuto() {
        return idEstadoAuto;
    }




    public void setIdEstadoAuto(EstadoAuto idEstadoAuto) {
        this.idEstadoAuto = idEstadoAuto;
    }




    public String getModelo() {
        return modelo;
    }




    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




    public int getAño() {
        return año;
    }




    public void setAño(int año) {
        this.año = año;
    }




    public int getCapacidad() {
        return capacidad;
    }




    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }




    public double getPrecio() {
        return precio;
    }




    public void setPrecio(double precio) {
        this.precio = precio;
    }




    public String getFoto() {
        return foto;
    }




    public void setFoto(String foto) {
        this.foto = foto;
    }




    public String getPlaca() {
        return placa;
    }




    public void setPlaca(String placa) {
        this.placa = placa;
    }


    

}

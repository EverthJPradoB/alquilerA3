package com.empresa.app.servicioAlq.models.entity;

import java.time.LocalDate;

public class DtoAlquiler {

    private String auto_id_a;

    private String user_a;

    private int estado;

    private LocalDate fechapres;

    private LocalDate fechadevo;

    private int numdias;

    private Double precio;

    private Double monto;

    private String encargado_a;

    public DtoAlquiler() {
    }

    public String getAuto_id_a() {
        return auto_id_a;
    }

    public void setAuto_id_a(String auto_id_a) {
        this.auto_id_a = auto_id_a;
    }

    public String getUser_a() {
        return user_a;
    }

    public void setUser_a(String user_a) {
        this.user_a = user_a;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNumdias() {
        return numdias;
    }

    public void setNumdias(int numdias) {
        this.numdias = numdias;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEncargado_a() {
        return encargado_a;
    }

    public void setEncargado_a(String encargado_a) {
        this.encargado_a = encargado_a;
    }

    public LocalDate getFechapres() {
        return fechapres;
    }

    public void setFechapres(LocalDate fechapres) {
        this.fechapres = fechapres;
    }

    public LocalDate getFechadevo() {
        return fechadevo;
    }

    public void setFechadevo(LocalDate fechadevo) {
        this.fechadevo = fechadevo;
    }

}

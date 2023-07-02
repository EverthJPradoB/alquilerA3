package com.empresa.app.servicioAlq.models.entity;

public class DtoUsuario {

    private String usuario;

    private String clave;

    public DtoUsuario() {
    }

    public DtoUsuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}

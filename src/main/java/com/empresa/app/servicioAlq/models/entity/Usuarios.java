package com.empresa.app.servicioAlq.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private String IdUsuario;

    @Column(name = "DNI")
    private String dni;

    @Column(name = "NOMBRES")
    private String nombres;

    @Column(name = "APELLIDO_PAT")
    private String apePaterno;

    @Column(name = "APELLIDO_MAT")
    private String apeMaterno;


    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "DIRECCION")
    private String direcccion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TIPO_USUARIO")

    private TipoUsuario idTipoUsuario;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "CLAVE")
    private String clave;

    public Usuarios() {
    }

    

  

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
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



    public String getIdUsuario() {
        return IdUsuario;
    }



    public void setIdUsuario(String idUsuario) {
        IdUsuario = idUsuario;
    }





    public TipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }





    public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    
}

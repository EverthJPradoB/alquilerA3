package com.empresa.app.servicioAlq.models.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @Column(name = "ID_ALQUILER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdAlquiler;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USUARIO")
    private Usuarios IdUsuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AUTO")
    private Autos Auto;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ESTADO_ALQ")
    private EstadoAlquiler IdEstadoAlquiler;

    @Column(name = "FECHA_PRES")
    private LocalDate fechaPrestamo;

    @Column(name = "FECHA_DEVO")
    private LocalDate fechaDevolucion;

    @Column(name = "NUM_DIAS")
    private int numDias;

    @Column(name = "PRECIO")
    private double precio;
    // numDias * precio
    @Column(name = "MONTO")
    private double monto;

    @Column(name = "ENCARGADO")
    private String encargado;

    
    public Alquiler() {
    }

    
    // public Alquiler(String idAlquiler, Usuarios idUsuario, Autos idAuto,
    // LocalDate fechaPrestamo, LocalDate fechaDevolucion, double precio, String
    // encargado) {
    // //
    // IdAlquiler = idAlquiler;
    // IdUsuario = idUsuario;
    // IdAuto = idAuto;

    // this.fechaPrestamo = fechaPrestamo;
    // this.fechaDevolucion = fechaDevolucion;
    // this.numDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    // this.precio = precio;
    // this.encargado = encargado;
    // this.vigencia = calcularVigencia();
    // //
    // }

    // public Alquiler(String idAlquiler, Usuarios idUsuario, Autos idAuto,
    // EstadoAlquiler idEstadoAlquiler,
    // LocalDate fechaPrestamo, LocalDate fechaDevolucion, double precio, String
    // encargado) {
    // //
    // IdAlquiler = idAlquiler;
    // IdUsuario = idUsuario;
    // IdAuto = idAuto;
    // IdEstadoAlquiler = idEstadoAlquiler;
    // this.fechaPrestamo = fechaPrestamo;
    // this.fechaDevolucion = fechaDevolucion;
    // this.numDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    // this.precio = precio;
    // this.encargado = encargado;
    // this.vigencia = calcularVigencia();
    // //
    // }



    public Alquiler(Usuarios idUsuario, Autos auto, EstadoAlquiler idEstadoAlquiler, LocalDate fechaPrestamo,
            LocalDate fechaDevolucion, int numDias, double precio, double monto, String encargado) {
        IdUsuario = idUsuario;
        Auto = auto;
        IdEstadoAlquiler = idEstadoAlquiler;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.numDias = numDias;
        this.precio = precio;
        this.monto = monto;
        this.encargado = encargado;
    }


    public Usuarios getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        IdUsuario = idUsuario;
    }


    public EstadoAlquiler getIdEstadoAlquiler() {
        return IdEstadoAlquiler;
    }

    public void setIdEstadoAlquiler(EstadoAlquiler idEstadoAlquiler) {
        IdEstadoAlquiler = idEstadoAlquiler;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumDias() {
        return numDias;
    }
    

    // otros metodos

    public String calcularVigencia() {

        int diferenciaEnDias = (int) ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
        if (diferenciaEnDias <= 7) {
            return "Vigencia corta (1 semana)";
        } else if (diferenciaEnDias <= 30) {
            return "Vigencia mediana (1 mes)";
        } else {
            return "Vigencia larga (más de 1 mes)";
        }

    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEncargado() {
        return encargado;
    }

    public int getIdAlquiler() {
        return IdAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        IdAlquiler = idAlquiler;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }


    public Autos getAuto() {
        return Auto;
    }

    public void setAuto(Autos auto) {
        Auto = auto;
    }


}

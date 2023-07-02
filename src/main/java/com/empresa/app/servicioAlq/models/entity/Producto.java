package com.empresa.app.servicioAlq.models.entity;
public class Producto {
    private int id;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(int id, String descripcion, double precio, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + "]";
    }

    
}

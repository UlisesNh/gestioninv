package com.gestion.productos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 6, unique = true) 
    private String sku;

    @Column(nullable = false, length = 15)
    private String articulo;

    @Column(nullable = false, length = 15)
    private String marca;

    @Column(length = 20)
    private String modelo;

    @Column(nullable = false)
    private int departamento;

    @Column(nullable = false)
    private int clase;

    @Column(nullable = false)
    private String familia;

    @Column(nullable = false)
    private Date fechaAlta;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private boolean descontinuado;

    @Column
    private Date fechaBaja;

    public Producto() {
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDescontinuado() {
        return descontinuado;
    }

    public void setDescontinuado(boolean descontinuado) {
        this.descontinuado = descontinuado;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}


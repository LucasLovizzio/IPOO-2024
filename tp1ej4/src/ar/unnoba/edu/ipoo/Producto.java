package ar.unnoba.edu.ipoo;

import java.awt.*;
import java.util.Date;

public abstract class Producto {
    private String nombre;
    private Date fechaDeVencimiento;
    private float valor;
    private float peso;

    // Constructor

    public Producto(String nombre, Date fechaDeVencimiento) {
        this.nombre = nombre;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public abstract float getValor();

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float getPeso();

    public void setPeso(float peso) {
        this.peso = peso;
    }
}

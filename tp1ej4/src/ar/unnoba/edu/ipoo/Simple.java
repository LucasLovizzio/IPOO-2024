package ar.unnoba.edu.ipoo;

import java.util.Date;

public class Simple extends Producto {
    private float valor;
    private float peso;
    // Constructor

    public Simple(String nombre, Date fechaDeVencimiento, float valor, float peso) {
        super(nombre, fechaDeVencimiento);
        this.valor = valor;
        this.peso = peso;
    }

    // Getters y Setters


    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public Date getFechaDeVencimiento() {
        return super.getFechaDeVencimiento();
    }

    @Override
    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        super.setFechaDeVencimiento(fechaDeVencimiento);
    }

    @Override
    public float getValor() {
        return valor;
    }

    @Override
    public void setValor(float valor) {
        super.setValor(valor);
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }
}



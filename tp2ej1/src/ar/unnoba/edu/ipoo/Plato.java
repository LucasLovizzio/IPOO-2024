package ar.unnoba.edu.ipoo;

import java.time.DayOfWeek;

public class Plato {

    private String nombre;
    private double precio;
    private DayOfWeek dia;

    public Plato() {
    }

    public Plato(String nombre, double precio, DayOfWeek dia) {
        this.nombre = nombre;
        this.precio = precio;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }
}

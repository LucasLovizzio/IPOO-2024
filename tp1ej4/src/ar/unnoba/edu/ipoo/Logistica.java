package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class Logistica {
    private String nombre;
    private String direccion;
    private List<Contenedor> contenedores;

    // Costructor


    public Logistica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contenedores = new ArrayList<Contenedor>();
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    // Metodos

    public void anadirContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public float pesoContenedores() {
        float pesoTotal = 0;
        for (Contenedor contenedor : contenedores ) {
            pesoTotal += contenedor.getPesoMaximo();
        }
        return pesoTotal;
    }

    public float pesoContenedor(Contenedor unContenedor) {
        return unContenedor.pesoContenedor();
    }

    public float valorDeTodosLosProductos() {
        float valorTotal = 0;
        for (Contenedor contenedor : contenedores ) {
            valorTotal += contenedor.valorDeLosProductos();
        }
        return valorTotal;
    }

    public float valorDeLosProductos(Contenedor unContenedor) {
        return unContenedor.valorDeLosProductos();
    }

}

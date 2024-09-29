package ar.unnoba.edu.ipoo;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Silla comprarSilla(Mobiliario mobiliario) {
        return mobiliario.crearSilla();
    }

    public Mesa comprarMesa(Mobiliario mobiliario) {
        return mobiliario.crearMesa();
    }

    public Sofa comprarSofa(Mobiliario mobiliario) {
        return mobiliario.crearSofa();
    }
}

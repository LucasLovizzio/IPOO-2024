package ar.unnoba.edu.ipoo;

import java.util.Date;

public class Pasajero implements Frecuencia{

    private String nombre;
    private int edad;
    private String sexo;
    private int millasRecorridas;
    private Date ultimoViaje;

    public Pasajero() {
    }

    public Pasajero(String nombre, int edad, String sexo, int millasRecorridas, Date ultimoViaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.millasRecorridas = millasRecorridas;
        this.ultimoViaje = ultimoViaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(int millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    public Date getUltimoViaje() {
        return ultimoViaje;
    }

    public void setUltimoViaje(Date ultimoViaje) {
        this.ultimoViaje = ultimoViaje;
    }

    @Override
    public int millas() {
        return getMillasRecorridas();
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViaje();
    }
}

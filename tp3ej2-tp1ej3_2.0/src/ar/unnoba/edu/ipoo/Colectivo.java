package ar.unnoba.edu.ipoo;

import java.util.Date;

public class Colectivo implements Frecuencia{

    private int capacidadPasajeros;
    private String patente;
    private String modelo;
    private int kilometraje;
    private Date ultimoViaje;

    public Colectivo() {
    }

    public Colectivo(int capacidadPasajeros, String patente, String modelo) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.patente = patente;
        this.modelo = modelo;
        this.kilometraje = 0;
        this.ultimoViaje = null;
    }

    public Colectivo(int capacidadPasajeros, String patente, String modelo, int kilometraje) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.patente = patente;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.ultimoViaje = null;
    }

    public Colectivo(String patente, String modelo, int kilometraje, int capacidadPasajeros, Date ultimoViaje) {

        this.patente = patente;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.capacidadPasajeros = capacidadPasajeros;
        this.ultimoViaje = ultimoViaje;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void sumarKilometraje(int kilometraje) {
        setKilometraje(getKilometraje() + kilometraje);
    }

    public Date getUltimoViaje() {
        return ultimoViaje;
    }

    public void setUltimoViaje(Date ultimoViaje) {
        this.ultimoViaje = ultimoViaje;
    }

    @Override
    public int kilometros() {
        return getKilometraje();
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViaje();
    }
}

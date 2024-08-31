package ar.unnoba.edu.ipoo;

public class Colectivo {

    private int capacidadPasajeros;
    private String patente;
    private String modelo;
    private float kilometraje;

    public Colectivo(String patente, String modelo, float kilometraje, int capacidadPasajeros) {

        this.patente = patente;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.capacidadPasajeros = capacidadPasajeros;

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

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void sumarKilometraje(float kilometraje) {
        setKilometraje(getKilometraje() + kilometraje);
    }
}

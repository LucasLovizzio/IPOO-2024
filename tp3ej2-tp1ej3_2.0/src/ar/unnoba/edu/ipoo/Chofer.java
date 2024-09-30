package ar.unnoba.edu.ipoo;

import java.util.Date;

public class Chofer implements Frecuencia {

    private Persona persona;
    private Colectivo colectivo;
    private int kilometrosRecorridos;
    private Date ultimoViaje;

    public Chofer() {
    }

    public Chofer(Persona persona, Colectivo colectivo) {
        this.persona = persona;
        this.colectivo = colectivo;
        this.kilometrosRecorridos = 0;
        this.ultimoViaje = null;
    }

    public Chofer(Persona persona, Colectivo colectivo, int kilometrosRecorridos, Date ultimoViaje) {
        this.persona = persona;
        this.colectivo = colectivo;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.ultimoViaje = ultimoViaje;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Date getUltimoViaje() {
        return ultimoViaje;
    }

    public void setUltimoViaje(Date ultimoViaje) {
        this.ultimoViaje = ultimoViaje;
    }

    public void sumarKilometraje(int kilometrosRecorridos) {
        setKilometrosRecorridos(getKilometrosRecorridos()+kilometrosRecorridos);
    }

    public void sumarKilometrosViaje(int kilometrosRecorridos) {
        sumarKilometraje(kilometrosRecorridos);
        getColectivo().sumarKilometraje(kilometrosRecorridos);
    }

    @Override
    public int kilometros() {
        return getKilometrosRecorridos();
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViaje();
    }
}

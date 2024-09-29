package ar.unnoba.edu.ipoo;

import java.util.Date;

public class Vehiculo implements Frecuencia{
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int millasRecorridas;
    private Date ultimoViajeRealizado;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String placa, String color, int millasRecorridas, Date ultimoViajeRealizado) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.millasRecorridas = millasRecorridas;
        this.ultimoViajeRealizado = ultimoViajeRealizado;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(int millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    public Date getUltimoViajeRealizado() {
        return ultimoViajeRealizado;
    }

    public void setUltimoViajeRealizado(Date ultimoViajeRealizado) {
        this.ultimoViajeRealizado = ultimoViajeRealizado;
    }

    @Override
    public int millas() {
        return getMillasRecorridas();
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViajeRealizado();
    }
}

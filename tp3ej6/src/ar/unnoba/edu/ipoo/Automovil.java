package ar.unnoba.edu.ipoo;

public class Automovil implements Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando automovil...");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo automovil...");
    }
}

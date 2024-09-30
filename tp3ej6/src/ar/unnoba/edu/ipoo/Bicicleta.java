package ar.unnoba.edu.ipoo;

public class Bicicleta implements Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta...");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo bicicleta...");
    }
}

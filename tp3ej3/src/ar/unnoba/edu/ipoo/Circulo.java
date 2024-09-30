package ar.unnoba.edu.ipoo;

import java.lang.Math.*;

public class Circulo implements FiguraGeometrica {

    private int radio;
    private int x;
    private int y;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
        this.x = 0;
        this.y = 0;
    }

    public Circulo(int radio, int x, int y) {
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*getRadio()*getRadio();
    }

    @Override
    public void mover(int valor, String direccion) {
        switch (direccion.toLowerCase()) {
            case "north": setY(getY() + valor); break;
            case "south": setY(getY() - valor); break;
            case "east": setX(getX() + valor); break;
            case "west": setX(getX() - valor); break;
            default:
                throw new IllegalStateException("Unexpected value: " + direccion.toLowerCase());
        }
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

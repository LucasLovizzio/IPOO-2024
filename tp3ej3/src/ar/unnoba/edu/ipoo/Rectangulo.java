package ar.unnoba.edu.ipoo;

public class Rectangulo implements FiguraGeometrica {

    private int lado1;
    private int lado2;
    private int x;
    private int y;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.x = 0;
        this.y = 0;
    }

    public Rectangulo(int lado1, int lado2, int x, int y) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.x = x;
        this.y = y;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
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
        return (double)lado1 * lado2;
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
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
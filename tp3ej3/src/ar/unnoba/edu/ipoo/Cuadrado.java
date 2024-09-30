package ar.unnoba.edu.ipoo;

public class Cuadrado implements FiguraGeometrica{

    private int lado;
    private int x;
    private int y;

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
        this.x = 0;
        this.y = 0;
    }

    public Cuadrado(int lado, int x, int y) {
        this.lado = lado;
        this.x = x;
        this.y = y;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
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
        return (double)getLado()*getLado();
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
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

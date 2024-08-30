package ar.unnoba.edu.ipoo;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void sumar(int n){
        this.x += n;
        this.y += n;
    }

    public void sumar(Punto unPunto){
        this.x += unPunto.getX();
        this.y += unPunto.getY();
    }

    public int distancia(Punto unPunto){
        return Math.abs(x - unPunto.getX()) + Math.abs(y - unPunto.getY());
    }
}
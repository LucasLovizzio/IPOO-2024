package ar.unnoba.edu.ipoo;

public class Triangulo implements FiguraGeometrica{

    private int base;
    private int altura;
    private int x;
    private int y;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.x = 0;
        this.y = 0;
    }

    public Triangulo(int base, int altura, int x, int y) {
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
        return (double)base*altura/2;
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
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

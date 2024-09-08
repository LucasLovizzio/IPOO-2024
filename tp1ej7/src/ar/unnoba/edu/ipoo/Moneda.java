package ar.unnoba.edu.ipoo;

public abstract class Moneda {

    private double monto;

    // constructores

    public Moneda() {
    }

    public Moneda(double monto) {
        this.monto = monto;
    }

    // getters y setters


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // metodos

    public abstract double getValor();
}

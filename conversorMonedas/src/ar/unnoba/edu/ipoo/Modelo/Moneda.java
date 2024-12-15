package ar.unnoba.edu.ipoo.Modelo;

public abstract class Moneda {

    private String nombre;
    private double tasa;

    protected Moneda() {
    }

    protected Moneda(String nombre) {
        this.nombre = nombre;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

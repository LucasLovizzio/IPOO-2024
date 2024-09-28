package ar.unnoba.edu.ipoo;

public class Particular extends Cliente {

    public Particular(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public double getDescueto() {
        return 1;
    }
}

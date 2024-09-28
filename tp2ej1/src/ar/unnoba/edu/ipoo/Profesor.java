package ar.unnoba.edu.ipoo;

public class Profesor extends Cliente{

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public double getDescueto() {
        return 0.9;
    }


}

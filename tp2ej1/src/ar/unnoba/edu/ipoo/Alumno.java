package ar.unnoba.edu.ipoo;

public class Alumno extends Cliente {

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public double getDescueto() {
        return 0.8;
    }


}

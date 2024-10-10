package ar.unnoba.edu.ipoo;

public class SinTrabajoEnColaException extends Exception {

    private String nombre;

    public SinTrabajoEnColaException(String message, String nombre) {
        super(message);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "\n Nombre de la cola: " + getNombre();
    }
}

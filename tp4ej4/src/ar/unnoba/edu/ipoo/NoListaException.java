package ar.unnoba.edu.ipoo;

public class NoListaException extends Exception {

    private String nombre;
    private long cantidadTrabajos;


    public NoListaException(String nombre, long cantidadTrabajos) {
        this.nombre = nombre;
        this.cantidadTrabajos = cantidadTrabajos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCantidadTrabajos() {
        return cantidadTrabajos;
    }

    public void setCantidadTrabajos(long cantidadTrabajos) {
        this.cantidadTrabajos = cantidadTrabajos;
    }

    @Override
    public String getMessage() {
        return "La Cola de Trabajo: " + getNombre() + " no está disponible. Cantidad de trabajos a procesar : " + getCantidadTrabajos();
    }
}

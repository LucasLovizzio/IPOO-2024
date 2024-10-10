package ar.unnoba.edu.ipoo;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo {

    private boolean lista;
    private Queue<Trabajo> trabajos;
    private String nombre;

    public ColaDeTrabajo(String nombre) {
        this.nombre = nombre;
        this.lista = false;
        this.trabajos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public void encolar(Trabajo trabajo) {
        trabajos.add(trabajo);
    }

    public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException {

        if (lista == false) {
            throw  new NoListaException(getNombre(), trabajos.size());
        }
        if (trabajos.isEmpty()) {
            throw new SinTrabajoEnColaException("La cola esta vacia" , getNombre());
        }
        return trabajos.poll();
    }

}

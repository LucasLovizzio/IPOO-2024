package ar.unnoba.edu.ipoo;

import java.util.Vector;

public class Cooperativa {

    private Vector<Chofer> choferes;

    public Cooperativa() {
        this.choferes = new Vector<>();
    }

    public Vector<Chofer> getChoferes() {
        return choferes;
    }

    public void setChoferes(Vector<Chofer> choferes) {
        this.choferes = choferes;
    }

    public void agregarChofer(Chofer chofer) {
        this.choferes.add(chofer);
    }

    public Chofer realizarViaje(int cantPasajeros, float cantKmts) {
        for(Chofer chofer : choferes) {
            if(chofer.getColectivo().getCapacidadPasajeros() >= cantPasajeros) {
                chofer.getColectivo().sumarKilometraje(cantKmts);
                return chofer;
            }

        }
        return null;
    }

    public Colectivo mayorKilometraje() {
        Colectivo colectivoMayorKilometraje = choferes.firstElement().getColectivo();
        for (Chofer chofer : choferes) {
            if (chofer.getColectivo().getKilometraje() >= colectivoMayorKilometraje.getKilometraje()) {
                colectivoMayorKilometraje = chofer.getColectivo();
            }
        }
        return colectivoMayorKilometraje;
    }
}

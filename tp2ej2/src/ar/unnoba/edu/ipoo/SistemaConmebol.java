package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class SistemaConmebol implements Partido{

    List<Partido> partidos;

    public SistemaConmebol() {
        this.partidos = new ArrayList<>();
    }

    public SistemaConmebol(List<Partido> partidos) {
        this.partidos = partidos;
    }

    // Getters y Setters


    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public void anadirPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public void anadirPartido(Equipo local,
                              Equipo visita,
                              Estadio estadio,
                              double valorEntrada) {
        this.partidos.add(new Partido(valorEntrada, local, visita, estadio));
    }

    public Estadio estadioMayorCapacidad(){
        Estadio estadioMayorCapacidad = null;
        int capacidadEstadioMayorCapacidad = 0;

        for (Partido partido : partidos) {
            if (partido.capacidadEspectadores() > capacidadEstadioMayorCapacidad) {
                capacidadEstadioMayorCapacidad = partido.capacidadEspectadores();
                estadioMayorCapacidad = partido.getEstadio();
            }
        }
        return estadioMayorCapacidad;
    }

    public int cantidadTotalEspectadores() {
        int totalEspectadores = 0;
        for (Partido partido : partidos) {
            totalEspectadores += cantidadTotalEspectadores();
        }
        return totalEspectadores;
    }

    public double montoRecaudado(Partido partido) {
        return partido.montoRecaudado();
    }

    public double montoTotalRecaudado() {
        double totalRecaudado = 0;
        for (Partido partido : partidos) {
            totalRecaudado += partido.montoRecaudado();
        }
        return totalRecaudado;
    }
}

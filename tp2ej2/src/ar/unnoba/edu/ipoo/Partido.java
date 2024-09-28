package ar.unnoba.edu.ipoo;

public class Partido implements Equipo, Estadio {

    private double valorEntrada;
    private Equipo local;
    private Equipo visitante;
    private Estadio estadio;

    public Partido() {
    }

    public Partido(double valorEntrada, Equipo local, Equipo visitante, Estadio estadio) {
        this.valorEntrada = valorEntrada;
        this.local = local;
        this.visitante = visitante;
        this.estadio = estadio;
    }

    // Getters y Setters


    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    // Metodos

    public double montoRecaudado() {
        return getValorEntrada() * estadio.getCapacidadEspectadores();
    }

    public int capacidadEspectadores() {
        return estadio.getCapacidadEspectadores();
    }
}

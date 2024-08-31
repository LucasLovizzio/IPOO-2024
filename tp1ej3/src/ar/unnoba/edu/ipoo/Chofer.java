package ar.unnoba.edu.ipoo;

public class Chofer {

    private Persona persona;
    private Colectivo colectivo;

    public Chofer(Persona persona, Colectivo colectivo) {
        this.persona = persona;
        this.colectivo = colectivo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }
}

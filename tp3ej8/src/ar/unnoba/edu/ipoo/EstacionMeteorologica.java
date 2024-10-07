package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {

    private String ciudad;
    private Clima clima;
    private List<Clima> historial;

    public EstacionMeteorologica() {
    }

    public EstacionMeteorologica(String ciudad, Clima clima) {
        this.ciudad = ciudad;
        this.clima = clima;
        this.historial = new ArrayList<>();
    }

    public EstacionMeteorologica(String ciudad, Clima clima, List<Clima> historial) {
        this.ciudad = ciudad;
        this.clima = clima;
        this.historial = historial;
    }



}

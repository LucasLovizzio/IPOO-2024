package ar.unnoba.edu.ipoo.Controlador;

import ar.unnoba.edu.ipoo.Modelo.*;
import ar.unnoba.edu.ipoo.Vista.*;

import java.util.HashMap;

public class ConversorDeMonedas {

    private HashMap<String, Double> tasasDeCambio = new HashMap<>();

    public ConversorDeMonedas() {
        tasasDeCambio.put("USD", 1.0);
        tasasDeCambio.put("EUR", 1.05);
        tasasDeCambio.put("JPY", 0.0065);
        tasasDeCambio.put("ARS", 0.00098);
    }

    public void setTasas(Moneda moneda) {
        if (tasasDeCambio.containsKey(moneda.getNombre())) {
            moneda.setTasa(tasasDeCambio.get(moneda.getNombre()));
        }
    }

    public double cantidadBase(double cantidad, Moneda monedaOrigen){
        return cantidad * monedaOrigen.getTasa();
    }

    public double cantidad_objetivo(double cantidad, Moneda monedaDestino){
        return cantidad / monedaDestino.getTasa();
    }

    public double convertir(double cantidadOrigen, Moneda monedaOrigen, Moneda monedaDestino){
        return cantidad_objetivo(cantidadBase(cantidadOrigen, monedaOrigen), monedaDestino);
    }

    public Moneda obtenerMoneda(String nombre){
        switch (nombre) {
            case "USD":
                USD usd = new USD();
                setTasas(usd);
                return usd;
            case "EUR":
                Euro eur = new Euro();
                setTasas(eur);
                return eur;
            case "JPY":
                Yen jpy = new Yen();
                setTasas(jpy);
                return jpy;
            case "ARS":
                Peso ars = new Peso();
                setTasas(ars);
                return ars;
            default:
                return null;
        }
    }

}
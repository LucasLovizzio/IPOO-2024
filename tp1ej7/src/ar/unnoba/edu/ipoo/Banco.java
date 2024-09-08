package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nombre;
    private String ubicacion;
    private List<Cliente> clientes;
    private List<Transaccion> transacciones;
    private Moneda moneda;

    public Banco() {
    }

    public Banco(String nombre, String ubicacion, Moneda moneda) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clientes = new ArrayList<>();
        this.transacciones = new ArrayList<>();
        this.moneda = moneda;
    }

    public Banco(String nombre, String ubicacion, List<Cliente> clientes, List<Transaccion> transacciones, Moneda moneda) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clientes = clientes;
        this.transacciones = transacciones;
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public void anadirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void anadirTransaccion(Transaccion transaccion) {
        this.transacciones.add(transaccion);
    }

    public int cantidadTotalDeTransacciones() {
        return this.transacciones.size();
    }

    public double impuestoACobrarDe(Transaccion transaccion) {
        return transaccion.impuesto();
    }

    public double impuestosACobrar() {
        double impuestosACobrarTotal = 0;

        for (Transaccion transaccion : transacciones) {
            impuestosACobrarTotal += transaccion.impuesto();
        }
        return impuestosACobrarTotal;
    }

    public double montoTotalDeTransacciones() {
        double montoTotalDeTransaccionesTotal = 0;
        for (Transaccion transaccion : transacciones) {
            montoTotalDeTransaccionesTotal += transaccion.getMonto();
        }
        return montoTotalDeTransaccionesTotal;
    }



}

package ar.unnoba.edu.ipoo;

import java.util.Date;
import java.util.Vector;

public class CuentaBancaria {
    private Persona titular;
    protected Date fechaDeApertura;
    private Vector<Transaccion> transacciones;
    private double saldo;

    public CuentaBancaria(Persona titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.fechaDeApertura =  new Date();
        this.transacciones = new Vector<Transaccion>();
    }

    // Getters y Setters

    public Persona getTitular() {
        return titular;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public Vector<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Vector<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodos

    public void  extraer(double monto) throws SuperaLimiteMinimoException {
        setSaldo(getSaldo()-monto);
        transacciones.add(new Transaccion(monto, "Extraccion"));
    }

    public  void depositar(double monto) {
        setSaldo(getSaldo()+monto);
        transacciones.add(new Transaccion(monto, "Deposito"));
    }
}

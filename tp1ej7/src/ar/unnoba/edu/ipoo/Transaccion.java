package ar.unnoba.edu.ipoo;

import java.util.Date;

public abstract class Transaccion {

    private Date fecha;
    private Double monto;
    private Banco bancoDestino;
    private Cliente clienteOrigen;

    public Transaccion() {
    }

    public Transaccion(Double monto, Banco bancoDestino, Cliente clienteOrigen) {
        this.monto = monto;
        this.fecha = new Date();
        this.bancoDestino = bancoDestino;
        this.clienteOrigen = clienteOrigen;
    }

    public Transaccion(Date fecha, Double monto , Banco bancoDestino, Cliente clienteOrigen) {
        this.fecha = fecha;
        this.monto = monto;
        this.bancoDestino = bancoDestino;
        this.clienteOrigen = clienteOrigen;
    }

    // getters y setters


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Banco getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(Banco bancoDestino) {
        this.bancoDestino = bancoDestino;
    }

    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }

    public void setClienteOrigen(Cliente clienteOrigen) {
        this.clienteOrigen = clienteOrigen;
    }

    // metodos

    public abstract double impuesto();

    public abstract double montoEnPesos();


}

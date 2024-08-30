package ar.unnoba.edu.ipoo;

import java.util.Date;

public class Transaccion {
    private Date fechaDeTransaccion;
    private Double monto;
    private String tipoTransaccion;

    public Transaccion(Double monto, String tipoTransaccion) {
        this.fechaDeTransaccion = new Date();
        this.monto = monto;
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFechaDeTransaccion() {
        return fechaDeTransaccion;
    }

    public void setFechaDeTransaccion(Date fechaDeTransaccion) {
        this.fechaDeTransaccion = fechaDeTransaccion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
}

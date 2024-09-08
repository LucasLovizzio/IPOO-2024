package ar.unnoba.edu.ipoo;

import java.util.Date;

public class TransaccionNacional extends Transaccion{

    public TransaccionNacional() {
    }

    public TransaccionNacional(Double monto, Banco bancoDestino, Cliente clienteOrigen) {
        super(monto, bancoDestino, clienteOrigen);
    }

    public TransaccionNacional(Date fecha, Double monto, Banco bancoDestino, Cliente clienteOrigen) {
        super(fecha, monto, bancoDestino, clienteOrigen);
    }

    @Override
    public double impuesto() {
        return montoEnPesos() * 0.03;
    }

    @Override
    public double montoEnPesos() {
        return getMonto() * getBancoDestino().getMoneda().getValor();
    }
}

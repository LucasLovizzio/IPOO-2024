package ar.unnoba.edu.ipoo;

import java.util.Date;

public class TransaccionInternacional extends Transaccion{

    public TransaccionInternacional(Double monto, Banco bancoDestino, Cliente clienteOrigen) {
        super(monto, bancoDestino, clienteOrigen);
    }

    public TransaccionInternacional(Date fecha, Double monto, Banco bancoDestino, Cliente clienteOrigen) {
        super(fecha, monto, bancoDestino, clienteOrigen);
    }

    @Override
    public double impuesto() {
        return montoEnPesos() * 0.07;
    }

    @Override
    public double montoEnPesos() {
        return getMonto() * getBancoDestino().getMoneda().getValor();    // falta el banco para sacar la moneda y asi el valor de esta.
    }


}

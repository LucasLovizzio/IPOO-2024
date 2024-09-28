package ar.unnoba.edu.ipoo;

import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteMinimo;

    public CuentaCorriente(Persona titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.limiteMinimo = saldoInicial;
        this.fechaDeApertura = new Date();
        this.limiteMinimo = -150;
    }

    // Metodos

    public double getLimiteMinimo() {
        return limiteMinimo;
    }

    public void setLimiteMinimo(double limiteMinimo) {
        this.limiteMinimo = limiteMinimo;
    }

    public void extraer(double monto) {
        if (this.getSaldo() - monto >= this.getLimiteMinimo()){
            super.extraer(monto);
        }
    }
}
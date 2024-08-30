package ar.unnoba.edu.ipoo;

import java.util.Date;

public class CajaDeAhorro extends CuentaBancaria
{
    private static final int MAX_EXTRACCIONES = 5;
    private int extraccionesRestantes;
    private double limiteMinimo;

    public CajaDeAhorro(Persona titular, double saldoInicial) {
        super(titular,saldoInicial);
        this.extraccionesRestantes = MAX_EXTRACCIONES;
        this.fechaDeApertura = new Date();
        this.limiteMinimo = 10;
    }

    public int getExtraccionesRestantes() {
        return extraccionesRestantes;
    }

    private void setExtraccionesRestantes(int extraccionesRestantes) {
        this.extraccionesRestantes = extraccionesRestantes;
    }

    public double getLimiteMinimo() {
        return limiteMinimo;
    }

    public void setLimiteMinimo(double limiteMinimo) {
        this.limiteMinimo = limiteMinimo;
    }

    public void extraer(double monto) {
        if ( extraccionesRestantes > 0 && this.getSaldo() - monto >= this.getLimiteMinimo()) {
            super.extraer(monto);
            setExtraccionesRestantes(getExtraccionesRestantes() - 1);
        }
    }

    public void reiniciarExtraccionesRestantes(){
        setExtraccionesRestantes(MAX_EXTRACCIONES);
    }
}

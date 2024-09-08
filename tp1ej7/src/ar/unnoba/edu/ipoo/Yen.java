package ar.unnoba.edu.ipoo;

public class Yen extends Moneda{

    public Yen(double monto) {
        super(monto);
    }

    // metodos

    @Override
    public double getValor () {
        return 6.49;
    }

}

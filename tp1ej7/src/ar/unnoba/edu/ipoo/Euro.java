package ar.unnoba.edu.ipoo;

public class Euro extends Moneda{

    public Euro(double monto) {
        super(monto);
    }

    @Override
    public double getValor() {
        return 1052.22;
    }
}

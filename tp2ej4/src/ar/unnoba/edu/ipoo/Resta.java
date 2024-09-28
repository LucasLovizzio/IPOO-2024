package ar.unnoba.edu.ipoo;

public class Resta extends OperacionBinaria {

    public Resta() {
    }

    public Resta(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int calcular() {
        return super.getIzquierda().calcular() - super.getDerecha().calcular();
    }
}

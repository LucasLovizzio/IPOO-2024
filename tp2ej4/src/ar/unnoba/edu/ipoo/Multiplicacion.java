package ar.unnoba.edu.ipoo;

public class Multiplicacion extends OperacionBinaria {

    public Multiplicacion() {
    }

    public Multiplicacion(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int calcular() {
        return super.getIzquierda().calcular() * super.getDerecha().calcular();
    }
}

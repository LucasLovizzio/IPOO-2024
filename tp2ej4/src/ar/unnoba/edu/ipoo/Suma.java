package ar.unnoba.edu.ipoo;

public class Suma extends OperacionBinaria {

    public Suma() {
    }

    public Suma(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int calcular() {
        return super.getIzquierda().calcular() + super.getDerecha().calcular();
    }
}

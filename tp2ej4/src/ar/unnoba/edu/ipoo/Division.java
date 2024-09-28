package ar.unnoba.edu.ipoo;

public class Division extends OperacionBinaria {

    public Division() {
    }

    public Division(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int calcular() {
        return super.getIzquierda().calcular() / super.getDerecha().calcular();
    }
}

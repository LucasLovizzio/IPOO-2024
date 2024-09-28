package ar.unnoba.edu.ipoo;

public abstract class OperacionBinaria extends Operacion{

    private Operacion izquierda;
    private Operacion derecha;

    public OperacionBinaria() {
    }

    public OperacionBinaria(Operacion izquierda, Operacion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Operacion getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Operacion izquierda) {
        this.izquierda = izquierda;
    }

    public Operacion getDerecha() {
        return derecha;
    }

    public void setDerecha(Operacion derecha) {
        this.derecha = derecha;
    }


    public abstract int calcular();

}

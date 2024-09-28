package ar.unnoba.edu.ipoo;

public class Numero extends Operacion{

    public int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int calcular() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


}

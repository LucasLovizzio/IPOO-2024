package ar.unnoba.edu.ipoo;

import java.util.ArrayList;

public class DataBag <T> {
    private int maxElementos;
    private ArrayList<T> elementos;

    public DataBag(int maxElementos) {
        this.maxElementos = maxElementos;
        this.elementos = new ArrayList<>();
    }

    public DataBag(int maxElementos, ArrayList<T> elementos) {
        this.maxElementos = maxElementos;
        this.elementos = elementos;
    }

    public int getMaxElementos() {
        return maxElementos;
    }

    public void setMaxElementos(int maxElementos) {
        this.maxElementos = maxElementos;
    }

    public void add(T elemento) throws FullDataBagException {
        if (elementos.size() == getMaxElementos()) {
            throw new FullDataBagException("asdasdasdas");
        }
        elementos.add(elemento);
    }

    public  T remove() throws EmptyDataBagException {
        if (elementos.isEmpty()) {
            throw new EmptyDataBagException("asdasdasdas");
        }
        T elemento = elementos.remove(0);
        return elemento;
    }
}

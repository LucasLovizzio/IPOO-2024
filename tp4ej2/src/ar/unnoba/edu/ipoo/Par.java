package ar.unnoba.edu.ipoo;

public class Par <T, P> {
    private T t;
    private P p;
    public Par(T t, P p) {
        this.t = t;
        this.p = p;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}

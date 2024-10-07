package ar.unnoba.edu.ipoo;

public class Calc {


    public Calc() {
    }

    public int dividir(int a, int b) {
        int res = 0;
        try {
            res = a/b;
        } catch (ArithmeticException s) {
            res = 0;
        }
        return res;
    }
}

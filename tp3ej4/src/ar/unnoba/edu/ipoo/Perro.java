package ar.unnoba.edu.ipoo;

public class Perro extends Animal implements Hablador{
    @Override
    public void habla() {
        System.out.println("Perro habla");
    }
}

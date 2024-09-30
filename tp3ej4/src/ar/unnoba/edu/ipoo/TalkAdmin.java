package ar.unnoba.edu.ipoo;

public class TalkAdmin {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Cucu cucu = new Cucu();

        hacerHablar(perro);
        hacerHablar(gato);
        hacerHablar(cucu);
    }

    public static void hacerHablar(Hablador hablador) {
        hablador.habla();
    }
}

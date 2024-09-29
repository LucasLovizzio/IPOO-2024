package ar.unnoba.edu.ipoo;

public class ReproductorMultimedia implements VideoClip {

    @Override
    public void play() {
        System.out.println("Reproduciendo multimedia");
    }

    @Override
    public void stop() {
        System.out.println("Pausando multimedia");
    }

    @Override
    public void bucle() {
        System.out.println("m");
    }

}

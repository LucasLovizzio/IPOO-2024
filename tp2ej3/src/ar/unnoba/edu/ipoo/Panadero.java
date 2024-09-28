package ar.unnoba.edu.ipoo;

public class Panadero {

    private Builder builder;

    public Panadero(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void crearPan(Builder b){

        b.comprobarTemperatura();
        b.prepararLevadura();
        b.anadirAgua();
        b.usarHarina();
        b.amasar();
        b.reposar();
        b.cortarMasa();
        b.horno();
    }

}

package ar.unnoba.edu.ipoo;

public class BuilderPanBlanco extends Builder{

    public BuilderPanBlanco(Pan pan) {
        super(pan);
    }

    @Override
    public void usarHarina() {
        System.out.println("Usando harina con el 75% del  de trigo entero");
    }
}

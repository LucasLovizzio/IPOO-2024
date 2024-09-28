package ar.unnoba.edu.ipoo;

public class BuilderPanIntegral extends Builder {

    public BuilderPanIntegral(Pan pan) {
        super(pan);
    }

    @Override
    public void usarHarina() {
        System.out.println("Usando harina con el 100% del grano de trigo entero.");
    }
}

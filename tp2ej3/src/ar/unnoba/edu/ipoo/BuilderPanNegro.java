package ar.unnoba.edu.ipoo;

public class BuilderPanNegro extends Builder{

    public BuilderPanNegro(Pan pan) {
        super(pan);
    }

    @Override
    public void usarHarina() {
        System.out.println("Usando harina con el 85% del grano de trigo entero");
    }
}

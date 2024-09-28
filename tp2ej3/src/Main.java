import ar.unnoba.edu.ipoo.*;

public class Main {
    public static void main(String[] args) {
        // Creamos diferentes tipos de pan con sus respectivas harinas
        Pan panBlanco = new Pan("Harina de trigo refinada");
        Pan panIntegral = new Pan("Harina de trigo integral");
        Pan panNegro = new Pan("Harina con centeno");

        // Creamos builders para cada tipo de pan
        Builder builderBlanco = new BuilderPanBlanco(panBlanco);
        Builder builderIntegral = new BuilderPanIntegral(panIntegral);
        Builder builderNegro = new BuilderPanNegro(panNegro);

        // Creamos un panadero
        Panadero panadero = new Panadero(builderBlanco);

        // Panadero crea un pan blanco
        System.out.println("Creando pan blanco:");
        panadero.crearPan(builderBlanco);

        // Panadero crea un pan integral
        System.out.println("\nCreando pan integral:");
        panadero.crearPan(builderIntegral);

        // Panadero crea un pan negro
        System.out.println("\nCreando pan negro:");
        panadero.crearPan(builderNegro);
    }
}

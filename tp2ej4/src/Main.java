import ar.unnoba.edu.ipoo.*;

public class Main {
    public static void main(String[] args) {
        Operacion sumaResta = new Suma(new Numero(3), new Resta(new Numero(6),new Numero((2))));
        Operacion multiplicacionSuma = new Multiplicacion(new Numero(6), new Suma(new Numero(6),new Numero(3)));

        System.out.println(sumaResta.calcular());
        System.out.println(multiplicacionSuma.calcular());
    }
}
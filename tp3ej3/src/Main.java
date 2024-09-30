import ar.unnoba.edu.ipoo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GraphEditor editor = new GraphEditor();

        Rectangulo rectangulo = new Rectangulo(3,4,1,2);
        Cuadrado cuadrado = new Cuadrado(4);
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(2,2);

        editor.anadirFigurasGeometricas(rectangulo);
        editor.anadirFigurasGeometricas(cuadrado);
        editor.anadirFigurasGeometricas(circulo);
        editor.anadirFigurasGeometricas(triangulo);

        System.out.println("Área total de todas las figuras: " + editor.sumaAreaDeFiguras());

        System.out.println(rectangulo.toString());
        rectangulo.mover(2,"north");
        System.out.println(rectangulo.toString());
        rectangulo.mover(1,"east");
        System.out.println(rectangulo.toString());

    }
}
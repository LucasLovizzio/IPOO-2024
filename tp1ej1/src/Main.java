import ar.unnoba.edu.ipoo.Punto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(1,3);
        Punto p2 = new Punto(6,7);
        System.out.println("La coordenada del punto es: "+p1.getX()+"@"+p1.getY());
        System.out.println("La coordenada del punto es: "+p2.getX()+"@"+p2.getY());
    }
//TIP    a) El valor 1@3 es una representación común en sistemas distribuidos o concurrencia
//          para denotar un vector clock o logical clock (reloj vectorial o lógico).
//       b) Para hacer la inicializacion del objeto simplemente lo declaramos de la siguiente forma:
//          Clase nombre = new Clase(parametro1,parametro2).

}

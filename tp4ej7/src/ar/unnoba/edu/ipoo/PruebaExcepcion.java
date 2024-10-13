package ar.unnoba.edu.ipoo;

public class PruebaExcepcion {
    public static void main(String st[]){
        PruebaExcepcion t1 = new PruebaExcepcion();
        t1.metodo(5,0);
    }

    public void metodo(int a, int b){
        try {
            int c = a/b;
            System.out.println("Después de la división");
        } catch (ArithmeticException ae) {
            System.out.println("Excepción Aritmética");
        }
        catch (Exception e) {
            System.out.println("Otra Excepción");
        }
        finally {
            System.out.println("Resultado: " + a/b );
        }
        System.out.println("Después del bloque finally");
    }
}

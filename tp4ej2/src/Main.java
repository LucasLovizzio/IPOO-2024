import ar.unnoba.edu.ipoo.Par;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Par<String, Integer> par = new Par<>("hola", 23);
        System.out.println(par.getP());
        System.out.println(par.getT());

    }
}
import ar.unnoba.edu.ipoo.Calc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.dividir(4,2);
        System.out.println(calc.dividir(4,0));
    }
}
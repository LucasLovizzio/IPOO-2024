import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalcularFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(new BigInteger("200")));
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        else return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
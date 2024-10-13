import ar.unnoba.edu.ipoo.DataBag;
import ar.unnoba.edu.ipoo.FullDataBagException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FullDataBagException {
        DataBag<Integer> dataBag = new DataBag<>(4);
        dataBag.add(2);
        dataBag.add(1);
        dataBag.add(5);
    }
}
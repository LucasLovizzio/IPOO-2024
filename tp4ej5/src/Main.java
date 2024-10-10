import ar.unnoba.edu.ipoo.RandomSelector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RandomSelector<Integer> randomSelector = new RandomSelector<>();
        randomSelector.add(1);
        randomSelector.add(2);
        randomSelector.add(3);


        System.out.println(randomSelector.selectNext());
        System.out.println(randomSelector.selectNext());
        System.out.println(randomSelector.selectNext());
        System.out.println(randomSelector.selectNext());

    }
}
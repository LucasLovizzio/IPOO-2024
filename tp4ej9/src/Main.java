import ar.unnoba.edu.ipoo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robot1");
        Robot robot2 = new Robot("Robot2");
        Battle battle = new Battle(robot1, robot2);
        battle.start();

    }
}
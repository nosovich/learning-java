import java.util.Random;

public class Cosmodrome {
    public void launch(IStart starter) {
        boolean systemCheckPassed = starter.prelaunchSystemCheсk();
        if(!systemCheckPassed) {
                System.out.println("Предстартовая проверка провалилась.");
            } else {
            starter.startEngine();
            System.out.println(10);
            System.out.println(9);
            System.out.println(8);
            System.out.println(7);
            System.out.println(6);
            System.out.println(5);
            System.out.println(4);
            System.out.println(3);
            System.out.println(2);
            System.out.println(1);
            starter.start();
        }
    }
}

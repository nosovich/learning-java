import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart {
    @Override
    public boolean prelaunchSystemCheсk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 0 или 1");
        int userNumber = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (userNumber == randomNumber) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Система исправна. Двигатели запущены.");
    }

    @Override
    public void start() {
        System.out.println("Земля, пока-пока!");
    }
}

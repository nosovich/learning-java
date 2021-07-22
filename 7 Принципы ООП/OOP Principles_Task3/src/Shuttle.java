import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchSystemCheсk() {
        Random random = new Random();
        int number = random.nextInt(10);
        if (number < 3) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт шатла!");

    }
}

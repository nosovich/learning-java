import java.util.Random;
import java.util.Scanner;


public class Computer {

    private String processor;
    private int RAM;
    private int hardDrive;
    private int fullCycleResource;
    private int fullCycle = 0;
    private boolean computerBurnedOut;

    public Computer(String processor, int RAM, int hardDrive, int fullCycleResource) {
        this.processor = processor;
        this.RAM = RAM;
        this.hardDrive = hardDrive;
        this.fullCycleResource = fullCycleResource;
    }

    public void displayDescription() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM);
        System.out.println("Hard Drive: " + hardDrive);
        System.out.println("Full Cycle Resource: " + fullCycleResource);
    }

    public void turnOn() {
        if (this.computerBurnedOut || this.fullCycle > this.fullCycleResource) {
            System.out.println("Your computer is burned out!");
            return;
        }
        this.fullCycle++;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(2);
        System.out.println("Enter 0 or 1 to turn on your computer:");
        int yourNumber = scanner.nextInt();
        this.computerBurnedOut = yourNumber != randomNumber;
        if (!computerBurnedOut && this.fullCycle < this.fullCycleResource){
            System.out.println("Your computer is on!");
        } else {
            System.out.println("Your computer is burned out!");
        }
    }

    public void turnOff() {
        if (this.computerBurnedOut || this.fullCycle > this.fullCycleResource) {
            System.out.println("Your computer is burned out!");
            return;
        }
        this.fullCycle++;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(2);
        System.out.println("Enter 0 or 1 to turn off your computer:");
        int yourNumber = scanner.nextInt();
        this.computerBurnedOut = (yourNumber != randomNumber);
        if (!computerBurnedOut && this.fullCycle < this.fullCycleResource){
            System.out.println("Your computer is off!");
        } else {
            System.out.println("Your computer is burned out!");
        }
    }

    public String getFullCycle() {
        return "The number of full cycles worked: " + this.fullCycle;
    }
}

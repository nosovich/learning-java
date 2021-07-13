import java.util.Scanner;

public class Truck extends LandTransport {

    private int carryingCapacity;

    public Truck(String brand, int carryingCapacity, int weight, int maxSpeed, double fuelConsumption, double horsePower, int wheelsNumber) {
        super.setBrand(brand);
        this.carryingCapacity = carryingCapacity;
        super.setWeight(weight);
        super.setMaxSpeed(maxSpeed);
        super.setFuelConsumption(fuelConsumption);
        super.setHorsePower(horsePower);
        super.setWheelsNumber(wheelsNumber);
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Сarrying capacity: " + carryingCapacity);
    }

    public void checkCargoCapasity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight (kg) of the cargo.");
        double cargoWeight = scanner.nextDouble() / 1000;
        if (cargoWeight <= carryingCapacity) {
            System.out.println("Truck loaded.");
        } else {
            System.out.println("You need a bigger truck.");
        }
    }
}

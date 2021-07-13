import java.util.Scanner;

public class Car extends LandTransport {

    private String carBodyType;
    private int passengerNumber;

    public Car(String brand, String carBodyType, int weight, int maxSpeed, double fuelConsumption, double horsePower, int wheelsNumber, int passengerNumber) {
        super.setBrand(brand);
        this.carBodyType = carBodyType;
        super.setWeight(weight);
        super.setMaxSpeed(maxSpeed);
        super.setFuelConsumption(fuelConsumption);
        super.setFuelConsumption(fuelConsumption);
        super.setHorsePower(horsePower);
        super.setWheelsNumber(wheelsNumber);
        this.passengerNumber = passengerNumber;
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Body type: " + carBodyType);
        System.out.println("Number of passengers: " + passengerNumber);
    }

    public double calculateDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time (hours) to calculate distance.");
        double time = scanner.nextDouble();
        double distance = Math.round(getMaxSpeed() * time * 100.00) / 100.00; // 50
        System.out.println("For " + time + " hours car " + getBrand() + ", driving at maximum speed "
                + getMaxSpeed() + "km / h, travel " + distance + " km and use " + calculateFuel(distance) + " liters of fuel.");
        return distance;
    }

    private double calculateFuel(double distance) {
        double fuel = Math.round(distance * getFuelConsumption() / 100 * 100.00) / 100.00;
        return fuel;
    }
}
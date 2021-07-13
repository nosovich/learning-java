import java.util.Scanner;

public class CivilPlane extends AirTransport {

    private int passengerNumber;
    private boolean businessClass;

    public CivilPlane(String brand, int passengerNumber, boolean businessClass, int weight, int maxSpeed, double horsePower, double wingspan, double minRunwayLength) {
        super.setBrand(brand);
        this.passengerNumber = passengerNumber;
        this.businessClass = businessClass;
        super.setWeight(weight);
        super.setMaxSpeed(maxSpeed);
        super.setHorsePower(horsePower);
        super.setWingspan(wingspan);
        super.setMinRunwayLength(minRunwayLength);
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Number of passengers: " + passengerNumber);
        if (businessClass) {
            System.out.println("Business class: yes");
        } else {
            System.out.println("Business class: no");
        }
    }

    public void checkPassengerCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of passengers.");
        double enteredNumberOfPassengers = scanner.nextInt();
        if (enteredNumberOfPassengers <= passengerNumber) {
            System.out.println("You can fly.");
        } else {
            System.out.println("Need a bigger plane.");
        }
    }
}

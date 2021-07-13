public class MilitaryPlane extends AirTransport {

    private boolean catapultSystem;
    private int rocketsNumber;

    public MilitaryPlane(String brand, int rocketsNumber, boolean catapultSystem, int weight, int maxSpeed, double horsePower, double wingspan, double minRunwayLength) {
        super.setBrand(brand);
        this.rocketsNumber = rocketsNumber;
        this.catapultSystem = catapultSystem;
        super.setWeight(weight);
        super.setMaxSpeed(maxSpeed);
        super.setHorsePower(horsePower);
        super.setWingspan(wingspan);
        super.setMinRunwayLength(minRunwayLength);
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Number of rockets: " + rocketsNumber);
        String message = catapultSystem ? "Catapult system: yes." : "Catapult system: no.";
        System.out.println(message);
    }

    public int shootRockets() {
        if (rocketsNumber > 0) {
            System.out.println("Rocket launched.");
            this.rocketsNumber--;
        } else {
            System.out.println("There is no ammunition.");
        }
        return rocketsNumber;
    }

    public void turnOnCatapultSystem() {
        this.catapultSystem = true;
        String message = this.catapultSystem ? "The bailout was successful." : "You don't have such a system.";
        System.out.println(message);
    }
}

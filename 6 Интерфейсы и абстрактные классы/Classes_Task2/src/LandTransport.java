public abstract class LandTransport extends Transport {

    private int wheelsNumber;
    private double fuelConsumption;

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("Number of wheels: " + wheelsNumber);
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

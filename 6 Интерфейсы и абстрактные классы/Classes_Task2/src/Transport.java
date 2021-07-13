public abstract class Transport {

    private double horsePower;
    private int maxSpeed;
    private int weight;
    private String brand;

    public void displayDescription() {
        System.out.println("Brand: " + brand);
        System.out.println("Maximum speed: " + maxSpeed);
        System.out.println("Horse power: " + horsePower);
        System.out.println("Weight: " + weight);
        System.out.println("Power in kilowatts: " + calculateKilowattsPower());
    }

    private double calculateKilowattsPower() {
        return this.horsePower * 0.74;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class Footwear implements IFootwear {

    String brand;

    public Footwear(String brand) {
        this.brand = brand;
    }

    @Override
    public void putOnn() {
        System.out.println("Put onn " + brand + " footwear.");
    }

    @Override
    public void takeOff() {
        System.out.println("Took off " + brand + " footwear.");
    }
}

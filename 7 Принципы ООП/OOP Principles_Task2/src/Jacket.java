public class Jacket implements IJacket {
    private String brand;

    public Jacket(String brand) {
        this.brand = brand;
    }

    @Override
    public void putOnn() {
        System.out.println("Put onn " + brand + " jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("Took off " + brand + " jacket.");
    }
}
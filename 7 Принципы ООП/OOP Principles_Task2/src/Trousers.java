public class Trousers implements ITrousers {
    private String brand;

    public Trousers(String brand) {
        this.brand = brand;
    }

    @Override
    public void putOnn() {
        System.out.println("Put onn " + brand + " trousers.");
    }

    @Override
    public void takeOff() {
        System.out.println("Took off " + brand + " trousers.");
    }
}

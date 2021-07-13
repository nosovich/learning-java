public abstract class AirTransport extends Transport {

    private double wingspan;
    private double minRunwayLength;

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Minimum runway length for take-off: " + minRunwayLength);
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setMinRunwayLength(double minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }
}

public class Program {

    public static void main(String[] args) {

        Car toyota = new Car("Toyota C-HR", "Hatchback", 1495, 195, 6.9, 148, 4, 5);
        toyota.displayDescription();
        System.out.println();
        toyota.calculateDistance();
        System.out.println();

        Truck volvo = new Truck("Volvo FH", 38, 120, 70, 14, 420, 6);
        volvo.displayDescription();
        System.out.println();
        volvo.checkCargoCapasity();
        System.out.println();

        CivilPlane boeing = new CivilPlane("Boeing 737-800", 189, true, 79000, 850, 25000, 34.3, 3200);
        System.out.println();
        boeing.displayDescription();
        System.out.println();
        boeing.checkPassengerCapacity();
        System.out.println();

        MilitaryPlane CY_57 = new MilitaryPlane("CY-57", 100, true, 18500, 2600, 100000, 14, 90);
        CY_57.displayDescription();
        System.out.println();
        CY_57.shootRockets();
        System.out.println();
        CY_57.turnOnCatapultSystem();
    }
}

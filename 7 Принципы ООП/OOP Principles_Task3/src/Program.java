public class Program {

    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();

        cosmodrome.launch(shuttle);
        System.out.println();
        cosmodrome.launch(spaceX);
    }
}

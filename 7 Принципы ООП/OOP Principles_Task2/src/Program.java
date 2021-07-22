public class Program {

    public static void main(String[] args) {
        Jacket zara = new Jacket("Zara");
        Trousers hm = new Trousers("H&M");
        Footwear nike = new Footwear("Nike");

        Man vlad = new Man("Vlad", zara, hm, nike);
        vlad.dress();
        vlad.undress();
    }
}

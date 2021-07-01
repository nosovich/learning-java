public class Program {

//  Составьте программу, вычисляющую A*B, не пользуясь операцией Умножения

    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int total = 0;

        for (int i = 1; i <= b; i++) {
            total = total + a;
        }
        System.out.println(total);
    }
}

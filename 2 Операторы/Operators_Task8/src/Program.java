public class Program {

//    Вычислить: 1+2+4+8+...+256

    public static void main(String[] args) {
        int sumOfNumbers = 0;

        for (int number = 1; number <= 256; number = number * 2) {
            sumOfNumbers = sumOfNumbers + number;
        }

        System.out.println(sumOfNumbers);
    }
}

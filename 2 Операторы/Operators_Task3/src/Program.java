import java.util.Scanner;

public class Program {

//    Дано целое число. Если оно является положительным, то прибавить к нему 1.
//    Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
//    Вывести полученное число.

    public static void main(String[] arts) {
        System.out.println("Введите любое целочисленное число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            number = number + 1;
        } else if (number < 0) {
            number = number - 2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}

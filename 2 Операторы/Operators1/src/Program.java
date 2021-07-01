import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

//        В переменную записываем число. Надо вывести на экран сколько в этом
//        числе цифр и положительное оно или отрицательное. Например, "это
//        однозначное положительное число". Достаточно будет определить, является ли
//        число однозначным, "двухзначным или трехзначным и более.

        System.out.println("Введите число для проверки:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if
        (number >= 0) {
            System.out.println("Вы ввели положительное число.");
        } else
            System.out.println("Вы ввели отрицательное число.");
        int digits = 1;
        while (number >= 10) {
            number = number / 10;
            digits++;
        }
        System.out.println("Количество цифр, содержащихся в введенном числе: " + digits);
    }
}

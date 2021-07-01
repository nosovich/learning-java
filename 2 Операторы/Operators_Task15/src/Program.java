import java.security.Signature;
import java.util.Scanner;

public class Program {
//    Передать на вход программы число От 1 до 7 в качестве аргумента. Если число равно 1, выводим на консоль
//    “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
//    Используем конструкцию if-else-if. Смотрите решение задачи в видео.
//    Переписать задание 3 используя switch.

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7:");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Вы ввели неверное число, попробуйте снова");
            return;
        }

        System.out.println("");

        System.out.println("Введите число от 1 до 7:");
        Scanner scan = new Scanner(System.in);
        int weekDay = scan.nextInt();
        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Вы ввели неверное число, попробуйте снова");
        }
    }
}

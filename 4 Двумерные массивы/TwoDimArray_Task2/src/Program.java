import java.util.Random;
import java.util.Scanner;

public class Program {

//    Создаём квадратную матрицу, размер вводим с клавиатуры.
//    Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//    2) Вывести нечетные элементы находящиеся под главной диагональю(включительно).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число больше чем единица.");
        int size = scanner.nextInt();
        if (size <= 1) {
            System.out.println("Вы ввели неподходящее число. Попробуйте снова.");
        }

        int[][] twoDimArray = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = random.nextInt(50);
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Нечетные значения элементов, находящихся под диагональю включительно:");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (twoDimArray[i][j] % 2 != 0) {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
        }
    }
}



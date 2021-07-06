import java.util.Random;
import java.util.Scanner;

public class Program {

//    Создаём квадратную матрицу, размер вводим с клавиатуры.
//    Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//    1) Поcчитать сумму четных элементов (значений) стоящих на главной диагонали.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите любое целое число больше чем единица.");
        int size = scanner.nextInt();
        if (size <= 1) {
            System.out.println("Вы ввели неподходящее число. Попробуйте снова.");
            return;
        }
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(50);
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int sumOfEvens = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            if (twoDimArray[i][i] % 2 == 0) {
                sumOfEvens += twoDimArray[i][i];
            }
        }
        System.out.print("Сумма четных значений элементов на главной диагонали равняется: " + sumOfEvens);
    }
}


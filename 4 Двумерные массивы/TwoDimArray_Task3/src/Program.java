import java.util.Random;
import java.util.Scanner;

public class Program {
//    Создаём квадратную матрицу, размер вводим с клавиатуры.
//    Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//    3) Проверить произведение элементов какой диагонали больше.

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
        int mainMultiplication= 1;
        int sideMultiplication = 1;
        for (int i = 0; i < twoDimArray.length; i++) {
            mainMultiplication = mainMultiplication * twoDimArray[i][i];
            int j = twoDimArray.length - 1 - i;
            sideMultiplication = sideMultiplication * twoDimArray[i][j];
        }
        System.out.println("Произведение элементов главной диагонали равняется: " + mainMultiplication);
        System.out.println("Произведение элементов побочной диагонали равняется: " + sideMultiplication);

        if (mainMultiplication > sideMultiplication){
            System.out.println("Произведение элементов главной диагонали больше.");
        }
        else if (mainMultiplication < sideMultiplication){
            System.out.println("Произведение элементов побочной диагонали больше.");
        }
        else {
            System.out.println("Произведение элементов диагоналей равны.");
        }
    }
}

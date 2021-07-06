import java.util.Random;
import java.util.Scanner;

public class Program {
//    Создаём квадратную матрицу, размер вводим с клавиатуры.
//    Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//    5) Транспонировать матрицу (1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Транспонирование только квардратных матриц");
        System.out.println("Введите целое число больше чем единица. Это число определит размер квадратной матрицы.");
        int size = scanner.nextInt();
        if (size <= 1) {
            System.out.println("Вы ввели неподходящее число. Попробуйте снова.");
        }
        System.out.println();
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("__________________________________________");
        System.out.println("Траснпонирование прямоугольных матриц");
        System.out.println("Введите целое число для определения количества строк будущей матрицы.");
        int matrixRow = scanner.nextInt();
        System.out.println("Введите целое число для определения количества колонок будущей матрицы (не равно числу строк).");
        int matrixColumn = scanner.nextInt();
        int number = 1;
        int[][] originalMatrix = new int[matrixRow][matrixColumn];
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                originalMatrix[i][j] = number;
                number++;
                System.out.print(originalMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] transposedMatrix = new int[matrixColumn][matrixRow];
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = originalMatrix[j][i];
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}




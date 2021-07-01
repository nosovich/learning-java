import java.util.Random;

public class Program {

//    Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//    массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//    массива должен равняться отношению элемента из первого массива с i-ым
//    индексом к элементу из второго массива с i-ым индексом. Вывести все три
//    массива на экран (каждый на отдельной строке), затем вывести количество
//    целых элементов в третьем массиве.

    public static void main(String[] args) {

        Random random = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(9);
            array2[i] = random.nextInt(9);
        }

        double[] array3 = new double[10];
        int integerNumber = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array2[i] == 0) {
                array3[i] = 0;
            } else {
                array3[i] = Math.round((double) array1[i] / array2[i] * 100.0) / 100.0;
            }
            if (array3[i] % 1 == 0) {
                integerNumber++;
            }
        }

        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (double element : array3) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("Number of integer values in array3 is: " + integerNumber);
    }
}

import java.util.Random;

public class Program {

//    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//    выведите массивы на экран в двух отдельных строках.
//    Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из
//    массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int totalArray1 = 0;
        int totalArray2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
            array2[i] = random.nextInt(15);
        }

        for (int i = 0; i < array1.length; i++) {
            totalArray1 = totalArray1 + array1[i];
            totalArray2 = totalArray2 + array2[i];
        }

        double averageArray1 = totalArray1 / array1.length;
        double averageArray2 = totalArray2 / array2.length;

        for (int element : array1) {
            System.out.print(element + " ");
        }

        System.out.println("");

        for (int element : array2) {
            System.out.print(element + " ");
        }

        System.out.println("");

        String notEqualMessage = "Среднее арифметическое больше у массива: ";
        String equalMessage = "Средние арифметические значения двух массивов равны";
        if (averageArray1 > averageArray2) {
            System.out.println(notEqualMessage + "array1");
        } else if (averageArray2 > averageArray1) {
            System.out.println(notEqualMessage + "array2");
        } else {
            System.out.println(equalMessage);
        }
    }

}

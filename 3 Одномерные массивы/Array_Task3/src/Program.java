import java.util.Random;

public class Program {

//    Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//    массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//    это количество на экран на отдельной строке.

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i <= 14; i++) {
            array[i] = random.nextInt(100);
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        int oddTotal = 0;
        for (int i = 0; i <= 14; i++) {
            if (array[i] % 2 != 0) {
                oddTotal++;
            }
        }
        System.out.print(oddTotal);
    }
}

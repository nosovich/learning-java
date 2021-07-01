import java.util.Random;

public class Program {

//    Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//    какой элемент является в этом массиве максимальным и сообщите индекс его
//    последнего вхождения в массив.

    public static void main(String[] arts) {
        Random random = new Random();
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        int maxIndex = array.length - 1;
        int max = array[maxIndex];

        for (int i = array.length - 1; i >= 0; i--) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("Max array element is " + max);
        System.out.println("Max array element index is " + maxIndex);
    }
}


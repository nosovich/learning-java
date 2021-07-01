import javax.swing.*;
import java.util.Random;

public class Program {

//    Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//    на экран в строку. Определить и вывести на экран сообщение о том, является ли
//    массив строго возрастающей последовательностью.

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        boolean increasingNumbers = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Массив не является строго возрастающей последовательностью");
                increasingNumbers = false;
                break;
            }
        }
        if (increasingNumbers) {
            System.out.println("Массив красавчик!");
        }
    }
}


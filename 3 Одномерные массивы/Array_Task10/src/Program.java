import java.util.Random;
import java.util.Scanner;

public class Program {

//    Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//    переменную n. Если пользователь ввёл не подходящее число, то программа
//    должна выдать соответствующее сообщение. Создать массив из n случайных
//    целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//    только из чётных элементов первого массива, если они там есть, и вывести его
//    на экран.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число больше чем три.");
        int number = scanner.nextInt();
        if (number <= 3) {
            System.out.println("Вы ввели неподходящее число. Пожалуйста, попытайтесь снова.");
            return;
        }
        int[] array1 = new int[number];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(number);
        }
        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("Вариант 1 наполнения второго массива: ");
        int[] array2 = new int[array1.length];
        int currentIndex = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0 && array1[i] != 0) {
                array2[currentIndex] = array1[i];
                currentIndex++;
            }
        }
        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("Вариант 2 наполнения второго массива: ");
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array3[i] = array1[i];
            }
        }
        for (int element : array3) {
            System.out.print(element + " ");
        }
    }
}


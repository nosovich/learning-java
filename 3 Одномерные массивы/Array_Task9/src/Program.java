import java.util.Random;
import java.util.Scanner;

public class Program {

//    Пользователь должен указать с клавиатуры положительное число, а
//    программа должна создать массив указанного размера из случайных целых
//    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//    определить и сообщить пользователю о том, сумма какой половины массива
//    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//    пользователь введёт неподходящее число, то выдать соответствующее
//    сообщение

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число больше единицы.");
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("Вы ввели неподходящее число. Пожалуйста, попытайтесь снова.");
            return;
        }
        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        int leftPart = 0;
        int rightPart = 0;
        int lastLeftPartId = array.length / 2 - 1;
        int firstRightPartId = lastLeftPartId + 1;
        if (array.length % 2 != 0){
            firstRightPartId++;
        }
        for (int i = 0; i <= lastLeftPartId; i++){
            leftPart += array[i];
        }
        for (int i = firstRightPartId; i < array.length; i++){

            rightPart += array[i];
        }
        System.out.println("Сумма левой половины массива: " + leftPart);
        System.out.println("Сумма правой половины массива: " + rightPart);
        if(leftPart > rightPart){
            System.out.println("Сумма левой половины массива больше.");
        }
        else if (rightPart > leftPart){
            System.out.println("Сумма правой половины массива больше.");
        }
        else {
            System.out.println("Суммы двух половин массива равны.");
        }
    }
}

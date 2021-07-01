import java.util.Random;

public class Program {

//    Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//    массив на экран в строку. Замените каждый элемент с нечётным индексом на
//    ноль. Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

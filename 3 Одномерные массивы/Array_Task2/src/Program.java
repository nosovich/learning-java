public class Program {

//    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//    строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//    порядке (99 97 95 93 … 7 5 3 1).

    public static void main(String[] args) {
        int[] array = new int[50];
        int j = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            array[j] = i;
            j++;
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}

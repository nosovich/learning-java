public class Program {

//    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на
//    экран сначала в строку, отделяя один элемент от другого пробелом, а
//    затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//    созданием массива подумайте, какого он будет размера

    public static void main(String[] args) {

        int[] array = new int[10];
        int i = 0;
        for(int number = 2; number <= 20; number = number + 2){
            array[i] = number;
            i++;
        }
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int element: array){
            System.out.println(element);
        }
    }
}

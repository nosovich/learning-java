public class Pogram {

//    Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

    public static void main(String[] args) {
        int x = 0;
        int total = 0;
        while (x <= 99) {
            x++;
            if (x % 2 != 0) {
                total = total + x;
            } else {
                continue;
            }
        }
        System.out.println(total);
    }
}


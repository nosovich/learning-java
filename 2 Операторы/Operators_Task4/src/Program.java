public class Program {
//    Даны 3 целых числа.
//    Найти количество положительных и отрицательных чисел в исходном наборе.

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = -1;
        int num3 = 0;

        int positive = 0;
        int negative = 0;
        int zeroValues = 0;

        if (num1 == 0) {
            zeroValues++;
        } else if (num1 > 0) {
            positive++;
        } else {
            negative++;
        }
        if (num2 == 0) {
            zeroValues++;
        } else if (num2 > 0) {
            positive++;
        } else {
            negative++;
        }
        if (num3 == 0) {
            zeroValues++;
        } else if (num3 > 0) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Количество положительных чисел: " + positive);
        System.out.println("Количество отрицательных чисел: " + negative);
        System.out.println("Количество нулевых значений: " + zeroValues);
    }
}

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Введите сумму в белорусских рублях: ");
        Scanner scanner = new Scanner(System.in);
        double BYN = scanner.nextDouble();
        double exchangeRate = 2.51;
        double USD = BYN / exchangeRate;
        double change = USD % Math.floor(USD) * exchangeRate;
        USD = Math.floor(USD);
        change = Math.round(change * 100.0) / 100.0;

        System.out.println("Сумма в долларах составляет: " + USD);
        System.out.println("Сдача в белорусских рублях составляет: " + change);
    }
}

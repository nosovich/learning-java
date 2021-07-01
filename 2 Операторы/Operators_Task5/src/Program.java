public class Program {

//    В переменную записываете количество программистов.
//    В зависимости от количества программистов необходимо вывести правильно окончание.
//    Например:
//  • 2 программиста
//  • 1 программист
//  • 10 программистов
//  • и т.д.

    public static void main(String[] args) {

        String option1 = "программист";
        String option2 = "программиста";
        String option3 = "программистов";

        int number = 15;
        int preLastDigit = number % 100 / 10;
        if (preLastDigit == 1) {
            System.out.println(number + " " + option3);
            return;
        }
        int lastDigit = number % 10;
        switch (lastDigit) {
            case 1:
                System.out.println(number + " " + option1);
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(number + " " + option2);
                break;
            default:
                System.out.println(number + " " + option3);

        }
    }
}

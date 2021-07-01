public class Program {

//    Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//    Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

    public static void main(String[] args) {

        int amoebaCount = 1;

        for (int hour = 3; hour <= 24; hour = hour + 3) {
            amoebaCount = amoebaCount * 2;
            int preLastDigit = hour % 100 / 10;
            int lastDigit = hour % 10;
            String wordHour;
            if (preLastDigit == 1) {
                wordHour = "часов";
            } else {
                switch (lastDigit) {
                    case 1:
                        wordHour = "час";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        wordHour = "часa";
                        break;
                    default:
                        wordHour = "часов";
                }
            }
            System.out.println("Через " + hour + " " + wordHour + " будет " + amoebaCount + " амебы.");
        }
    }
}
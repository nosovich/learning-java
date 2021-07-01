public class Program {

//    Напишите программу печати таблицы перевода расстояний из дюймов в
//    сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

    public static void main(String[] agrs) {
        for (int inch = 1; inch <= 20; inch++) {
            double сm = inch * 2.54;
            System.out.println(inch + " inch = " + сm + " сm");
        }
    }
}

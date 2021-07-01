public class Program {

//    Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//    день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//    суммарный путь пробежит спортсмен за 7 дней?

    public static void main(String[] args) {
        double distancePerDay = 10;
        double finalDistance = 0;

        for (int day = 1; day <= 7; day++) {
            finalDistance = finalDistance + distancePerDay;
            distancePerDay = distancePerDay * 1.1;
        }
        System.out.println(Math.round(finalDistance * 100.00) / 100.00);
    }
}
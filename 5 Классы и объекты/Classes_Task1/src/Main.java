public class Main {

//    Создать класс компьютер.
//    Поля:
//    - процессор
//    - оперативка
//    - жесткий диск
//    - ресурс полных циклов работы (включений/выключений)
//    Методы:
//    - метод описание(вывод всех полей)
//    - метод включить, при включении может произойти сбой. При вызове метода
//    рандом загадывает число (0 либо 1), вы вводите число с клавиатуры. Если
//    угадали, комп включается, если нет, сгорает.Если комп сгорел, при попытке
//    включить нужно выдать сообщение, что ему конец.
//    - выключить (аналогично включению).
//    - при превышении лимита ресурса комп сгорает.

    public static void main(String[] args) {

        Computer myComputer = new Computer("Intel(R) Core(TM) i7-6700HQ CPU", 8, 120, 1000000);
        myComputer.displayDescription();
        System.out.println();
        myComputer.turnOn();
        System.out.println();
        myComputer.turnOff();
        System.out.println();
        String result = myComputer.getFullCycle();
        System.out.println(result);
    }
}

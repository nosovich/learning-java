package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

/*
Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.
*/

public class Run {
    public static void main(String[] args) {
        IHead sonyHead = new SonyHead(6000);
        IHead toshibaHead = new ToshibaHead(5000);
        IHead samsungHead = new SamsungHead(7300);
        IHand sonyHand = new SonyHand(2500);
        IHand toshibaHand = new ToshibaHand(3000);
        IHand samsungHand = new SamsungHand(3500);
        ILeg sonyLeg = new SonyLeg(4000);
        ILeg toshibaLeg = new ToshibaLeg(4000);
        ILeg samsungLeg = new SamsungLeg(4000);

        Robot wall_e = new Robot("Wall-e", toshibaHead, samsungHand, sonyLeg);
        Robot baymax = new Robot("Baymax", samsungHead, sonyHand, toshibaLeg);
        Robot rodney = new Robot("Rodney", sonyHead, toshibaHand, samsungLeg);

        wall_e.action();
        System.out.println("Цена Wall-e: " + wall_e.getPrice());
        System.out.println();
        baymax.action();
        System.out.println("Цена Baymax: " + baymax.getPrice());
        System.out.println();
        rodney.action();
        System.out.println("Цена Rodney: " + rodney.getPrice());
        System.out.println();

        if (wall_e.getPrice() > baymax.getPrice() && wall_e.getPrice() > rodney.getPrice()) {
            System.out.println("Самый дорогой робот - Wall-e.");
        } else if (baymax.getPrice() > wall_e.getPrice() && baymax.getPrice() > rodney.getPrice()) {
            System.out.println("Самый дорогой робот - Baymax.");
        } else if (rodney.getPrice() > wall_e.getPrice() && rodney.getPrice() > baymax.getPrice()) {
            System.out.println("Самый дорогой робот - Rodney.");
        } else {
            System.out.println("Цена трех роботов равны.");
        }
    }
}

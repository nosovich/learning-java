package by.teachmeskills.robot.hands;

public abstract class BaseHand implements IHand {
    protected String name;
    private int price;

    public BaseHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Поднимает вверх " + name);

    }

    @Override
    public int getPrice() {
        return price;
    }
}

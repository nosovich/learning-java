package by.teachmeskills.robot.heads;

public abstract class BaseHead implements IHead {
    protected String name;
    private int price;

    public BaseHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит " + name);
    }

    @Override
    public int getPrice() {
        return price;
    }
}

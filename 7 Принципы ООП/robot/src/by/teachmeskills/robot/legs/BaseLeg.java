package by.teachmeskills.robot.legs;

public abstract class BaseLeg implements ILeg {
    protected String name;
    private int price;

    public BaseLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг с помощью " + name);
    }

    @Override
    public int getPrice() {
        return price;
    }
}

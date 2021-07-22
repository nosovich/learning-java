public class Man implements IClothes {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IFootwear footwear;


    public Man(String name, IJacket jacket, ITrousers trousers, IFootwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void dress() {
        System.out.println(name);
        jacket.putOnn();
        trousers.putOnn();
        footwear.putOnn();
    }

    @Override
    public void undress() {
        System.out.println(name);
        jacket.takeOff();
        trousers.takeOff();
        footwear.takeOff();
    }
}

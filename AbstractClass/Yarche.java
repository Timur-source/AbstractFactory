package AbstractClass;

public class Yarche implements ShopFactory{
    @Override
    public homeMade createHomemade() {
        return new YarcheHome();
    }

    @Override
    public factoryLevel createFactoryLevel() {
        return new YarcheFactory();
    }
}

package AbstractClass;

public class Abrikos implements ShopFactory {

    @Override
    public homeMade createHomemade() {
        return new AbrikosHomemade();
    }

    @Override
    public factoryLevel createFactoryLevel() {
        return new AbrikosFactoryLevel();
    }
}

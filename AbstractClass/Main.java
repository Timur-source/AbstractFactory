package AbstractClass;

public class Main {
    public static void main(String[] args) {
        ShopFactory shopFactory;
        shopFactory = new Yarche();
        shopFactory.createHomemade();

        ShopFactory shopFactory1;
        shopFactory1 = new Abrikos();
        shopFactory1.createFactoryLevel();


        }
    }

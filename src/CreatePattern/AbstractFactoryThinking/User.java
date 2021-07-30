package CreatePattern.AbstractFactoryThinking;

import CreatePattern.pojo.Fruit;

public class User {
    public static void main(String[] args) {
        IFactory iFactory1 = new AppleFactory();
        Fruit fruit1 = iFactory1.create();
        fruit1.eat();
        IFactory iFactory2 = new PearFactory();
        Fruit fruit2 = iFactory2.create();
        fruit2.eat();
    }
}

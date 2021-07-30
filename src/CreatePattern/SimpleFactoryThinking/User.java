package CreatePattern.SimpleFactoryThinking;

import CreatePattern.pojo.Fruit;

public class User {
    public static void main(String[] args) {
        simpleFactory simpleFactory = new simpleFactory();
        Fruit apple = simpleFactory.getFruit("apple");
        apple.eat();
        Fruit pear = simpleFactory.getFruit("pear");
        pear.eat();
    }
}

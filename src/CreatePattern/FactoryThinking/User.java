package CreatePattern.FactoryThinking;
import CreatePattern.pojo.Apple;
import CreatePattern.pojo.Pear;

public class User {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Apple apple = appleFactory.getApple();
        PearFactory pearFactory = new PearFactory();
        Pear pear = pearFactory.GetPear();
        apple.eat();
        pear.eat();
    }
}

package CreatePattern.AbstractFactoryThinking;

import CreatePattern.pojo.Apple;
import CreatePattern.pojo.Fruit;

public class AppleFactory implements IFactory{
    public Fruit create(){
     return new Apple();
    }
}

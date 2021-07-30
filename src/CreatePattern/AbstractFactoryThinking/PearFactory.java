package CreatePattern.AbstractFactoryThinking;

import CreatePattern.pojo.Fruit;
import CreatePattern.pojo.Pear;

public class PearFactory implements IFactory{
    @Override
    public Fruit create() {
        return new Pear();
    }
}

package CreatePattern.SimpleFactoryThinking;

import CreatePattern.pojo.Apple;
import CreatePattern.pojo.Fruit;
import CreatePattern.pojo.Pear;

public class simpleFactory {
    public Fruit getFruit(String name) {
        switch (name) {
            case "apple":
                return new Apple();
            case "pear" :
                return new Pear();
        }
        return new Fruit();
    }
}

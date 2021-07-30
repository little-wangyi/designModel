package CreatePattern.FactoryThinking;
import CreatePattern.pojo.Apple;
public class AppleFactory{
    public Apple getApple() {
        return new Apple();
    }
}

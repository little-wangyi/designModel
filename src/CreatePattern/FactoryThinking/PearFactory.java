package CreatePattern.FactoryThinking;
import CreatePattern.pojo.Pear;

public class PearFactory {
    public Pear GetPear() {
        return new Pear();
    }
}
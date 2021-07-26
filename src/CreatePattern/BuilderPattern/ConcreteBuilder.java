package CreatePattern.BuilderPattern;

public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("建造产品A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造产品B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造产品C");
    }
}

package CreatePattern.AbsFactory;

public class HuaweiFactory implements AbstractFactory {
    @Override
    public Phone getHuawei() {
        return new Huawei();
    }

    @Override
    public Phone getIphone() {
        return null;
    }
}

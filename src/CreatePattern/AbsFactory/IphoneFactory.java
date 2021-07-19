package CreatePattern.AbsFactory;

public class IphoneFactory implements AbstractFactory{
    @Override
    public Phone getIphone() {
        return new Iphone();
    }

    @Override
    public Phone getHuawei() {
        return null;
    }
}

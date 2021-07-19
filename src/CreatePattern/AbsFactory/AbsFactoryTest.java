package CreatePattern.AbsFactory;

public class AbsFactoryTest {
    public static void main(String[] args) {
        AbstractFactory absfactory1 = new HuaweiFactory();
        Phone huawei = absfactory1.getHuawei();
        huawei.use();
        AbstractFactory abstractfactory2 = new IphoneFactory();
        Phone iphone = abstractfactory2.getIphone();
        iphone.use();
    }
}

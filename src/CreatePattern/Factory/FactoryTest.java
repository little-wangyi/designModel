package CreatePattern.Factory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new PhoneFactory();
        Phone huawei = factory.getPhone("huawei");
        huawei.use();
        Phone iphone = factory.getPhone("iphone");
        iphone.use();
    }
}

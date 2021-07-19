package CreatePattern.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Phone phone1 = factory.GetPhone("huawei");
        phone1.use();
        Phone phone2 = factory.GetPhone("iphone");
        phone2.use();
    }
}

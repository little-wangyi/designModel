package CreatePattern.Factory;

public class PhoneFactory implements Factory {
    @Override
    public Phone getPhone(String name) {
        switch (name) {
            case ("huawei"):
                return new Huawei();
            case ("iphone"):
                return new Iphone();
        }
        return null;
    }
}

package CreatePattern.SingletonPattern;

public class SingletonLazy {
    public static void main(String[] args) {
        President pz1 = President.getInstance();
        pz1.getName();
        President pz2 = President.getInstance();
        pz1.getName();
        if (pz1 == pz2) {
            System.out.println("他们是同一个人");
        }
    }
}

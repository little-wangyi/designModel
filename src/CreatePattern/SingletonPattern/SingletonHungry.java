package CreatePattern.SingletonPattern;

public class SingletonHungry {
    public static void main(String[] args) {
        Bajie bajie = Bajie.getInstance();
        bajie.saySomething();
    }
}

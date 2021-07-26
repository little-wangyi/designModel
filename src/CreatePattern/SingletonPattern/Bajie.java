package CreatePattern.SingletonPattern;

public class Bajie {
    private static final Bajie instance = new Bajie();

    private Bajie(){

    }

    public static Bajie getInstance() {
        return instance;
    }
    public void saySomething(){
        System.out.println("this is bajie");
    }
}

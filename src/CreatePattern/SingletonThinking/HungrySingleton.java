package CreatePattern.SingletonThinking;

public class HungrySingleton {
    private HungrySingleton() {

    }

    private static HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton GetInstance() {
        return singleton;
    }
}

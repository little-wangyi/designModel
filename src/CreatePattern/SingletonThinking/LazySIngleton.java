package CreatePattern.SingletonThinking;
//not thread safe
public class LazySIngleton {
    private LazySIngleton() {

    }

    private static LazySIngleton singleton = null;

    public LazySIngleton GetInstance() {
        if (singleton == null) {
            singleton = new LazySIngleton();
        }
        return singleton;
    }
}

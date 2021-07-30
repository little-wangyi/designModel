package CreatePattern.SingletonThinking;
//双检锁实现懒加载
public class LazySingtonSafe1 {
    private LazySingtonSafe1() {

    }

    private static LazySingtonSafe1 instance = null;

    public LazySingtonSafe1 getInstance() {
        if (instance == null){
            synchronized (LazySingtonSafe1.class){
                if (instance == null){
                    instance = new LazySingtonSafe1();
                }
            }
        }
        return instance;
    }
}

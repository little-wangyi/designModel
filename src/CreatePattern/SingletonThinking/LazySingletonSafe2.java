package CreatePattern.SingletonThinking;
//静态内部类实现懒加载
public class LazySingletonSafe2 {
    private static class SingletonHolder{
        private static LazySingletonSafe2 instance = new LazySingletonSafe2();
    }

    private LazySingletonSafe2(){

    }

    public LazySingletonSafe2 GetInstance() {
        return SingletonHolder.instance;
    }
}

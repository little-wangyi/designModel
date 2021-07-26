package CreatePattern.SingletonPattern;

public class President {
    private static volatile President instance = null; //用于确保在线程中同步

    private President() {
        //避免在外部被实例化
        System.out.println("美国产生了一个总统，”特朗普");
    }

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("美国已经有一个总统了,特朗普");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统，特朗普");
    }
}

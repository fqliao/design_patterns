package singleton;

/**
 * @decription:懒汉模式的优化版
 * @version:1.0
 * @date: 2017年2月16日下午8:39:39
 * @author: lfq
 */
public class BetterMode {

    private BetterMode() {};

    private static volatile BetterMode instance;

    public static BetterMode getInstance() {
        if (instance == null) {
            synchronized (BetterMode.class) {
                if (instance == null) {
                    instance = new BetterMode();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(BetterMode.getInstance() == BetterMode.getInstance());
    }
}

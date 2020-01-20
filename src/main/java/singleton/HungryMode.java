package singleton;

/**
 * @decription:饿汉模式
 * @version:1.0
 * @date: 2017年2月16日下午8:35:13
 * @author: lfq
 */
public class HungryMode {

    private HungryMode() {};

    private static final HungryMode instance = new HungryMode();

    public static HungryMode getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(HungryMode.getInstance() == HungryMode.getInstance());
    }
}

package decorator;

/**
 * @decription:大T恤装饰
 * @version:1.1
 * @date: 2016年10月20日下午8:24:11
 * @author: lfq
 */
public class TShirts extends DecorateShow {

    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}

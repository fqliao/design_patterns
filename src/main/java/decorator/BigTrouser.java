package decorator;

/**
 * @decription:垮裤装饰
 * @version:1.1
 * @date: 2016年10月20日下午8:23:43
 * @author: lfq
 */
public class BigTrouser extends DecorateShow {

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}

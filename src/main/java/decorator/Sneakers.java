package decorator;

/**
 * @decription:破鞋装饰
 * @version:1.1
 * @date: 2016年10月20日下午8:22:51
 * @author: lfq
 */
public class Sneakers extends DecorateShow {

    @Override
    public void show() {
        super.show();
        System.out.println("破球鞋");
    }
}

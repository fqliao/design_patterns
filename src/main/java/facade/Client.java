package facade;

/**
 * @decription:外观模式测试类
 * @version:1.0
 * @date: 2016年11月3日上午10:59:35
 * @author: lfq
 */
public class Client {

    public static void main(String[] args) {

        // 只要买基金就行，即只知道Facade
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}

package decorator;

/**
 * 测试 扩展测试：增加装饰类型 eg:帽子
 *
 * @author lfq
 */
public class Client {

    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("第一种个性装扮");
        // 选择个性服装
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        // 装饰
        sneakers.decorate(xc);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        System.out.println("第二种套装装扮");
        // 选择套装
        Set set = new Set();

        // 装饰
        set.decorate(xc);
        set.show();
    }
}

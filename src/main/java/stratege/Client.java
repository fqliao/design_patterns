package stratege;

/**
 * @decription:策略模式 1 测试功能 2 扩展测试 增加打6折活动，考察扩展难以程度：修改代码量有多少，多复杂？
 * @version:1.1
 * @date: 2016年10月20日下午9:08:50
 * @author: lfq
 */
public class Client {

    public static void main(String[] args) {
        int type = 2; // 优惠类型，0：不优惠 ，1：打折扣（8折），2：返利：满300减100 3:打5折
        Cash cash = null;
        // 这个判断创建实例的业务就是简单工厂模式干的，可以加入到CashContext，这样就是策略模式+简单工厂模式
        // Context与策略类的关系就会从聚合关系变为关联关系，因为Context中由传入策略变为要创建策略，客户端可以不用创建了
        switch (type) {
            case 0: // 原价
                cash = new CashNormal();
                break;
            case 1: // 打8折
                cash = new CashDiscount(0.8);
                break;
            case 2: // 满300减100
                cash = new CashRebate(300, 100);
                break;
            case 3: // 打6折
                cash = new CashDiscount(0.6);
                break;
        }
        CashContext context = new CashContext(cash);
        System.out.println("合计：" + context.total(300));
    }
}

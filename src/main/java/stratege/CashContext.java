package stratege;
/**
 * 策略模式+简单工厂模式： 策略模式：Context 传入父类，调用父类方法（各子类的实现），返回结果 简单工厂模式：Factory 创建父类对象，返回父类对象
 * 策略模式+简单工厂模式：创建父类对象并不返回，调用父类方法，返回结果 策略模式+简单工厂模式：增加算法，修改Context中的判断分支（与简单工厂模式类似）-这点要改进需利用反射，抽象工厂模式
 * 相对于简单工厂模式的优点：客户端使用的类变少，耦合度降低
 *
 * @author lfq
 */
public class CashContext {

    private Cash cash; // 收银父类,该类与CashContext类是组合关系

    public CashContext(Cash cash) { // 根据优惠类型选择
        this.cash = cash;
        // 将简单工厂模式的功能整合在策略模式里：策略模式+简单工厂模式
        //		switch(type){
        //			case 0://原价
        //				cash = new CashNormal();
        //				break;
        //			case 1://打8折
        //				cash = new CashDiscount(0.8);
        //				break;
        //			case 2://满300减100
        //				cash = new CashRebate(300,100);
        //				break;
        //			case 3://打6折
        //				cash = new CashDiscount(0.6);
        //				break;
        //		}
    }

    /**
     * 策略类调用父类的方法，得到计算结果 工厂类只是简单返回父类 因此客户端不必知道父类Cash
     *
     * @param money
     * @return
     */
    public double total(double money) {
        return cash.cashier(money);
    }
}

package stratege;
/**
 * 返利
 *
 * @author lfq
 */
public class CashRebate extends Cash {

    private double money = 0; // 起始金额
    private double rebate = 0; // 返利金额

    public CashRebate(double money, double rebate) { // 初始化时输入起始金额和返利金额
        this.money = money;
        this.rebate = rebate;
    }

    @Override
    public double cashier(double money) {
        if (money < this.money) {
            return money;
        } else {
            return money - (rebate / this.money) * money;
        }
    }
}

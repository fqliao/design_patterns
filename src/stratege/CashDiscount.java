package stratege;
/**
 * 打折收银
 * @author lfq
 *
 */
public class CashDiscount extends Cash {
	
	private double discount = 0;//折扣
	public CashDiscount(double discount){//初始化时必须输入折扣
		this.discount = discount;
	}
	@Override
	public double cashier(double money) {
		return money*discount;
	}

}

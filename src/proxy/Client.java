package proxy;

/**
 * @decription:代理模式测试
 * 代理类可以选择调用实际类的行为，可以另外添加行为，但是不能篡改实际类的行为
 * 代理类起到代理纽带和控制的作用
 * @version:1.0
 * @date: 2016年10月15日上午10:31:14
 * @author: lfq
 * 
 */
public class Client {
	public static void main(String[] args) {
		//创建实际类操作的对象mm,代理类对象
		MM mm = new MM("娇娇");
		Proxy dali = new Proxy(mm);
		
		//代理类发出行为，实际是调用实际类发出的行为
		dali.giveDolls();
		dali.giveFlowers();
		dali.giveChocolate();
	}
}

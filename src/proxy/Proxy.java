package proxy;

/**
 * @decription:代理类，代理实际类的行为
 * 代理类是中间人的角色，类之间的纽带，认识的类最多
 * @version:1.0
 * @date: 2016年10月15日上午10:21:30
 * @author: lfq
 * 
 */
public class Proxy implements GiveGift {
	
	//将实际类关联到代理类，让代理类来代理
	private Pursuit pursuit;
	
	//在代理类的构造方法中创建实际类，传入实体类操作的对象mm
	public Proxy(MM mm)
	{
		pursuit = new Pursuit(mm);
	}
	
	//下面是具体代理的行为,代理类直接调用实际类相应的方法就可以了
	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}

}

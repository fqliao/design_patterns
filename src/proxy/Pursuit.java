package proxy;


/**
 * @decription:代理模式的实际类
 * @version:1.0
 * @date: 2016年10月15日上午9:57:10
 * @author: lfq
 * 
 */
public class Pursuit implements GiveGift {
	
	//将mm关联进来，并在构造方法中传入进来
	private MM mm;
	
	public Pursuit(MM mm)
	{
		this.mm = mm;
	}
	
	@Override
	public void giveDolls() {
		System.out.println("送\""+mm.getName()+"\"-洋娃娃");

	}

	@Override
	public void giveFlowers() {
		System.out.println("送\""+mm.getName()+"\"-鲜花花");

	}

	@Override
	public void giveChocolate() {
		System.out.println("送\""+mm.getName()+"\"-巧克力");

	}

}

package decorator;

/**
 * 具体服装类，具体装饰类
 * 继承装饰类
 * 覆盖父装饰类的方法，先调用父类的装饰方法，再增加自己的逻辑
 * @author lfq
 *
 */
public class BigTrouser extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.println("垮裤");
	}
	
}

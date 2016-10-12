package decorator;

/**
 * 服装类
 * 装饰父类，继承要装饰的类，且关联要装饰的类，覆盖要装饰的接口，并调用继承的类的接口
 * 具体装饰由子类继承该类，负责具体装饰
 * @author lfq
 *
 */
public class Finery extends Person {
	
	protected Person componet;
	
	//装扮
	public void decorate(Person component)
	{
		this.componet = component;
	}
	
	public void show()
	{
		if(componet != null)
		{
			componet.show();
		}
	}
	
}

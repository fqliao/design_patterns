package decorator;

/**
 * 要装饰的类Person
 * 增加装饰只需要该类提供一个接口（show）,面向接口装饰
 * 增加装饰不会给要装饰的类修改或增加代码
 * @author lfq
 *
 */
public class Person {
	
	private String name;
	
	public Person()
	{
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show()
	{
		System.out.println(this.name+"的装扮：");
	}
}

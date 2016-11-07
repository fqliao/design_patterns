package builder;

/**
 * @decription:建造者抽象类，定义对象创建流程，其他具体建造类都及基础该类
 * @version:1.0
 * @date: 2016年11月7日上午10:04:28
 * @author: lfq
 * 
 */
public abstract class PersonBuilder {
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildArmLeft();
	public abstract void buildArmRight();
	public abstract void buildLegLeft();
	public abstract void buildLegRight();
	
	public abstract Person getPerson();
}

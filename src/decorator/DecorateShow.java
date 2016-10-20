package decorator;

/**
 * @decription:装饰类
 * @version 1.1
 * @date: 2016年10月20日下午8:14:50
 * @author: lfq
 * 
 */
public class DecorateShow implements PersonShow {
	
	protected PersonShow personShow;
	
	//装扮
	public void decorate(PersonShow personShow)
	{
		this.personShow = personShow;
	}

	@Override
	public void show() {
		personShow.show();
	}
	
}

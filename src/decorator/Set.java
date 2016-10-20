package decorator;

/**
 * @decription:套装装饰
 * @version:1.1
 * @date: 2016年10月20日下午8:22:33
 * @author: lfq
 * 
 */
public class Set extends DecorateShow {

	@Override
	public void show() {
		super.show();
		System.out.println("西装");
		System.out.println("领带");
		System.out.println("皮鞋");
	}
	
}

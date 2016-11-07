package builder;

/**
 * @decription:建造者模式测试
 * @version:1.0
 * @date: 2016年11月7日上午10:33:01
 * @author: lfq
 * 
 */
public class Client {

	public static void main(String[] args) {
		ThinPerson thinPersonBuilder = new ThinPerson();
		DirectPerson.build(thinPersonBuilder);
		Person thinPerson = thinPersonBuilder.getPerson();
		thinPerson.show();
		
		FatPerson fatPersonBuilder = new FatPerson();
		DirectPerson.build(fatPersonBuilder);
		Person fatPerson = fatPersonBuilder.getPerson();
		fatPerson.show();
	}

}

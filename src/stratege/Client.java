package stratege;
/**
 * 测试：策略模式+简单工厂模式
 * 1 测试功能
 * 2 扩展测试 增加打6折活动，考察扩展难以程度：修改代码量有多少，多复杂？
 * @author lfq
 *
 */
public class Client {

	public static void main(String[] args) {
		int type = 3;//优惠类型，0：不优惠 ，1：打折扣（8折），2：返利：满300减100
		CashContext context = new CashContext(type);
		System.out.println("合计："+context.total(300));
	}

}

package factory;

/**
 * @decription:测试工厂模式，扩展测试:增加乘法功能
 * @version:1.0
 * @date: 2016年10月20日上午11:19:56
 * @author: lfq
 * 
 */
public class Client {

	public static void main(String[] args) {
		
		//测试加法
		OperationFactory addFactory = new AddFactory();
		Operation add = addFactory.createOperation();
		System.out.println(add.result(2, 3));
		
		//测试减法
		OperationFactory subFactory = new SubFactory();
		Operation sub = subFactory.createOperation();
		System.out.println(sub.result(2, 3));
		
		//扩展测试乘法，新增MulOperation类(继承Operation类)和MulFactory类(实现OperationFactory接口)
		OperationFactory mulFactory = new MulFactory();
		Operation mul = mulFactory.createOperation();
		System.out.println(mul.result(2, 3));
	}

}

package simpleFactory;
/**
 * 工厂模式
 * 增加新类，创建新类（继承父类，重新方法）
 * 只用修改工厂类（增加判断）
 * 不用查看其他类的实现，更不会修改其他类
 * 客户端代码不用改变
 * @author lfq
 *
 */
public class OperationFactory {
	/**
	 * 工厂方法，根据参数实例化合适的对象，使用了多态
	 * @param operate
	 * @return
	 * @throws Exception
	 */
	public static Operation createOperation(String operate) throws Exception{
		Operation operation = null;
		switch(operate){
		case("+"): 
			operation = new OperationAdd();
			break;
		case("-"):
			operation = new OperationSub();
			break;
		case("*"):
			operation = new OperationMul();
			break;
		case("/"): 
			operation = new OperationDiv();
		    break;
		case("m"): 
			operation = new OperationMix();//新增的类，工厂类在这新增判断
			break;
		default:throw new Exception("输入不是+，-，*，/符号");
		}
		return operation;
	}
}

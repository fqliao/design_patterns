package factory;
/**
 * 运算减法
 * @author lfq
 *
 */
public class OperationSub extends Operation{

	@Override
	public double getResult() {
		return getNumberA()-getNumberB();
	}
	
}

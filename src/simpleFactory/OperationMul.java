package simpleFactory;
/**
 * 运算乘法
 * @author lfq
 *
 */
public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return getNumberA()*getNumberB();
	}

}

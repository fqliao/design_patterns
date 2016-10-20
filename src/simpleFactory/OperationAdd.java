package simpleFactory;
/**
 * 运算加法
 * @author lfq
 *
 */
public class OperationAdd extends Operation {


	public double getResult() {
		return getNumberA()+getNumberB();
	}

}

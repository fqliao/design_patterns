package simpleFactory;
/**
 * 运算除法
 * @author lfq
 *
 */
public class OperationDiv extends Operation {

	@Override
	public double getResult() throws Exception {
		if(getNumberB() == 0){
			throw new Exception("除数不能为0");
		}
		return getNumberA()/getNumberB();
	}

}

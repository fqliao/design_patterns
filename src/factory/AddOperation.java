package factory;

/**
 * @decription:加法类，具体运算类
 * @version:1.0
 * @date: 2016年10月20日上午11:08:07
 * @author: lfq
 * 
 */
public class AddOperation extends Operation {
	
	@Override
	public double result(double a, double b) {
		return a+b;
	}

}

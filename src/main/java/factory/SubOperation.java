package factory;

/**
 * @decription:减法类，具体运算类
 * @version:1.0
 * @date: 2016年10月20日上午11:08:39
 * @author: lfq
 */
public class SubOperation extends Operation {

    @Override
    public double result(double a, double b) {
        return a - b;
    }
}

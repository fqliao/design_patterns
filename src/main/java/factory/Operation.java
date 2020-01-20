package factory;

/**
 * @decription:运算操作类，抽象计算类
 * @version:1.0
 * @date: 2016年10月20日上午11:02:13
 * @author: lfq
 */
public abstract class Operation {

    // 两个操作数
    private double a;
    private double b;

    // 抽象方法，计算运算结果
    public abstract double result(double a, double b);

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

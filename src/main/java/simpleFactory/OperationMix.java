package simpleFactory;
/**
 * 运算混合
 *
 * @author lfq
 */
public class OperationMix extends Operation {

    @Override
    public double getResult() throws Exception {

        return (getNumberA() - getNumberB()) * 10;
    }
}

package simpleFactory;

import java.util.Scanner;

/**
 * 测试工厂模式 客户端是界面，只负责输入数据，得到数据，怎么显示，不管业务逻辑 测试：简单工厂模式 1 测试功能 2 扩展测试：增加混合运算，考察扩展难以程度：修改代码量有多少，多复杂？
 *
 * @author lfq
 */
public class Client {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); // 输入流对象

        System.out.println("请输入第1个数：");
        double numberA = input.nextDouble();

        System.out.println("请输入操作符：");
        String operate = input.next();

        Operation operation = OperationFactory.createOperation(operate); // 通过工厂类获得操作运算对象

        System.out.println("请输入第2个数：");
        double numberB = input.nextDouble();

        operation.setNumberA(numberA);
        operation.setNumberB(numberB);

        double result = operation.getResult(); // 调用计算方法，获得结果

        System.out.println("结果是：" + result);
    }
}

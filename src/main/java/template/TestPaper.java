package template;

/**
 * @decription:试卷父类，不变的子父类，边的提供抽象方法，组合成考试试卷
 * @version:1.0
 * @date: 2016年11月1日上午9:36:05
 * @author: lfq
 */
public abstract class TestPaper {

    public abstract void name();

    // 三道试题，答案抽象，让考试者填写，即让子类具体实现
    public void problem1() {
        System.out.println("测试题1");
        System.out.println("答案1：" + answer1());
    }

    public abstract String answer1();

    public void problem2() {
        System.out.println("测试题2");
        System.out.println("答案2：" + answer2());
    }

    public abstract String answer2();

    public void problem3() {
        System.out.println("测试题3");
        System.out.println("答案3：" + answer3());
    }

    public abstract String answer3();
}

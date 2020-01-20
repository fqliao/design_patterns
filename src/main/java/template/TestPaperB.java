package template;

/**
 * @decription:Alice完成的试卷
 * @version:1.0
 * @date: 2016年11月1日上午9:50:59
 * @author: lfq
 */
public class TestPaperB extends TestPaper {

    @Override
    public void name() {
        System.out.println("Alice");
    }

    @Override
    public String answer1() {
        return "A";
    }

    @Override
    public String answer2() {
        return "C";
    }

    @Override
    public String answer3() {
        return "B";
    }
}

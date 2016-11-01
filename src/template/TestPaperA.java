package template;

/**
 * @decription:Tom完成的试卷
 * @version:1.0
 * @date: 2016年11月1日上午9:50:12
 * @author: lfq
 * 
 */
public class TestPaperA extends TestPaper {

	@Override
	public void name() {
		System.out.println("Tom");

	}

	@Override
	public String answer1() {
		return "A";
	}

	@Override
	public String answer2() {
		return "B";
	}

	@Override
	public String answer3() {
		return "C";
	}

}

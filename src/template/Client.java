package template;

/**
 * @decription:测试模板模式，增加试卷只要继承父类即可
 * @version:1.0
 * @date: 2016年11月1日上午9:49:19
 * @author: lfq
 * 
 */
public class Client {

	public static void main(String[] args) {
		
		TestPaper a = new TestPaperA();
		a.name();
		a.problem1();
		a.problem2();
		a.problem3();
		
		TestPaper b = new TestPaperB();
		b.name();
		b.problem1();
		b.problem2();
		b.problem3();
	}

}

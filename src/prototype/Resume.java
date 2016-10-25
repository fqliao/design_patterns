package prototype;

/**
 * @decription:简历类
 * @version:1.0
 * @date: 2016年10月25日上午10:05:16
 * @author: lfq
 * 
 */
public class Resume {
	
	private String name;
	private int age;
	private Experience exp;
	
	public Resume(){
		
	}
	public Resume(String name, int age, Experience exp) {
		super();
		this.name = name;
		this.age = age;
		this.exp = exp;
	}
	
	//克隆方法，创建新对象，并将原数据设置进去
	@Override
	public Object clone() throws CloneNotSupportedException {
		 Resume resume = new Resume();
		 //浅克隆
//		 resume.exp = this.exp; //赋值引用而已
		 
		//深克隆 克隆exp,即向新的Resume对象设置exp
		 resume.exp = getExp();//获得clone的exp对象，复制的新的exp对象
		
		 resume.name = this.name;
		 resume.age = this.age;
		 
		 return resume;
	}
	
	//注意这里对引用数据的设置,提供修改接口，而且不用让别人new参数里面的引用对象
	public void setExp(String timeArea,Company company) {
		this.exp.setTimeArea(timeArea);
		this.exp.setCompany(company.getName(), company.getAddress());
	}
	
	public void setExp(Experience exp){
		this.exp = exp;
	}
	
	public String getName() {
		return name;
	}
	//引用类型返回，不要直接返回，因为返回之后，可以更改，破坏数据安全。所以返回复制对象，即clone
	public Experience getExp() throws CloneNotSupportedException {
		return (Experience) exp.clone();
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}

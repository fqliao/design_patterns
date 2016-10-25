package prototype;

/**
 * @decription:工作经历类
 * @version:1.0
 * @date: 2016年10月25日上午10:03:52
 * @author: lfq
 * 
 */
public class Experience {
	
	private String timeArea;
	private Company company;
	
	public Experience(){
		
	}
	public Experience(String timeArea, Company company) {
		super();
		this.timeArea = timeArea;
		this.company = company;
	}
	
	//重写克隆方法,复制对象
	@Override
	public Object clone() throws CloneNotSupportedException {
		Experience exp = new Experience();
		
		exp.company = getCompany();//获得clone的company对象，复制的新的company对象
		exp.timeArea = this.timeArea;
		
		return exp;
	}
	
	////注意这里对引用数据的设置,提供修改接口，而且不用让别人new参数里面的引用对象
	public void setCompany(String name,String address) {
		this.company.setName(name);
		this.company.setAddress(address);
	}
	
	public void setCompany(Company company){
		this.company = company;
	}
	
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	//引用类型返回，不要直接返回，因为返回之后，可以更改，破坏数据安全。所以返回复制对象，即clone
	public Company getCompany() throws CloneNotSupportedException {
		return (Company) company.clone();
	}

	@Override
	public String toString() {
		return "Experience [timeArea=" + timeArea + ", company=" + company
				+ "]";
	}
	
}

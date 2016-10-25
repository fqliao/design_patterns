package prototype;

/**
 * @decription:公司类
 * @version:1.0
 * @date: 2016年10月25日上午11:20:16
 * @author: lfq
 * 
 */
public class Company {
	
	private String name;
	private String address;
	public Company(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	//要克隆，就要重写克隆方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new Company(name, address);//创建新的Company对象，将数据设置进去返回新的对象，即复制的对象
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", address=" + address + "]";
	}
	
	
}

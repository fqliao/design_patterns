package singleton;

/**
 * @decription:懒汉模式
 * @version:1.0
 * @date: 2017年2月16日下午8:38:55
 * @author: lfq
 * 
 */
public class LazyMode {
	
	private LazyMode(){};
	private static LazyMode instance;
	public static synchronized LazyMode getInstance(){
		if(instance == null){
			instance = new LazyMode();
		}
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(LazyMode.getInstance() == LazyMode.getInstance());
	}

}

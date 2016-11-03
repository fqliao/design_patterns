package facade;

/**
 * @decription:Facade类，关联子系统的相关类，处理相关业务
 * @version:1.0
 * @date: 2016年11月3日上午11:00:22
 * @author: lfq
 * 
 */
public class Fund {
	
	private StockOne stockOne;
	private StockTwo stockTwo;
	private NationalDebt nationalDebt;
	
	public Fund() {//关联子系统类
		super();
		this.stockOne = new StockOne();
		this.stockTwo = new StockTwo();
		this.nationalDebt = new NationalDebt();
	}
	
	//买股票或国债由基金负责
	public void buy()
	{	
		//基金没有买该票2
		stockOne.buy();
		nationalDebt.buy();
	}
	
	//卖股票或国债由基金负责
	public void sell()
	{
		stockOne.sell();
		nationalDebt.sell();
	}
	
}

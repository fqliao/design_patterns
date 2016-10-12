package decorator;

public class Finery extends Person {
	
	protected Person componet;
	
	//装扮
	public void decorate(Person component)
	{
		this.componet = component;
	}
	
	public void show()
	{
		if(componet != null)
		{
			componet.show();
		}
	}
	
}

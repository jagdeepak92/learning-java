package java_2022;

public class axis extends Bank
{
	axis()
	{
		super();		
		
		System.out.println("Child Constructor");
	}
	
	  
	
	
	
	
	public void run()
	{
		System.out.println(super.s+" "+super.num);
		System.out.println("Intrest rate of Axis bank is 20%");
		super.run();
		System.out.println(super.color);
	}

}

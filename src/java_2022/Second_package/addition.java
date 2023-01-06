package Second_package;

public class addition 
{
	int a =10;

	int b=0;
	 int add() throws InterruptedException
	{
		try
		{
			int arr[]= new int [5];
			arr [5]= 50;
			int c=a/b;
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Close the browser");
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	*/
		
		System.out.println("rest of the code");
		Thread.sleep(2000);
		System.out.println("rest of the code");
		return a;
		
		
	}
	 	

}

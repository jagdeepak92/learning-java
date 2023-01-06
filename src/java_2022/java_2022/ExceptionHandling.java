package java_2022;

public class ExceptionHandling {

	

	int divide() throws InterruptedException
	{
		try 
		{
			{
				String s="jaycee";
				int i=Integer.parseInt(s);
			}

			{

				int arr[]=null;
				System.out.println(arr.length);
			}

			{
				int a=20;
				return a/0;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Final block Executed");
		}
		
		
		Thread.sleep(3000);
		System.out.println("woke up");
		return 0;
		
		
		
	}
}
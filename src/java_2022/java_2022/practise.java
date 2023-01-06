package java_2022;

import java.util.Date;



public class practise{





	public static void main(String[] args)

	{	



		int arr[]= {1,3,4,6,7,8,3,4,5,6};
		int count=0;
		System.out.println("Dupliacte element in this array");
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					
					System.out.println(arr[j]);
			}

		}
		
		
		String s="Jagdeepak ";
		char a[]=s.toCharArray();
		for (int i=0;i<a.length;i++)
		{
			
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
				
		
		/*	
		char a[]= {'a','b',4,};

		//System.out.println(j);


		String s="Welcome to selenium java training";
		// how many words are present in a string
		System.out.println(s.split(" ").length-1);
		System.out.println(s.toUpperCase());	
		System.out.println(s.toLowerCase());

		if (s.contains("selenium"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}



		String ar[]=s.split(" ");
		System.out.println(ar.length);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.print(" 	"+ar[i]);
		}




		/*Date date= new Date();
		System.out.println(date.toGMTString());
		 */	
		/*
		{
			int a =10;
			System.out.println(a);
			String s= String.valueOf(a);
			System.out.println(s+30);


		}*/



		/*char c[]= {'s','i','n','g','h'};
		String s2= new String(c);
		String s3= new String ("verka");
		System.out.println(s1);







			System.out.println(c);
			String s="HelLo WoRld";

			String s_up=s.toUpperCase();
			String s_low=s.toLowerCase();
			System.out.println(s);
			System.out.println(s_low);

			System.out.println(s_up);


		}
/*
			String s="Hello World Jaycee is back";
			String ar[]=s.split(" ");
			if (ar.length<=5)
			{
				System.out.println("true");
			}

			else {
				System.out.println("false");
			}

			for (int i=0;i<=ar.length;i++) 
			{ 
				System.out.println(ar[i]);
			}
		}

		 */


		/*
			String s1="Welcome back";
			String s2="WELCOME BACK";
			String s3="Welcome back";
			//System.out.println(s1.equals(s2)+ " " + s1.length());
			//System.out.println(s2.equalsIgnoreCase (s3));
			//System.out.println(s1.equals(s3));
			System.out.println(s1);
			System.out.println(s1.replace('e','d'));
		 */
		/*
			String s="Hello my name is jagdeepak";
			s=s+" "+"karanbir";
			System.out.println(s);
		 */
		/*
			if (s.contains("Hello")&& s.contains("my name is ")&& s.contains("jagdeepak"))
			{
				System.out.println("true");
			}
			else
			System.out.println("false");
			}*/
		/*

		//String concat()
		//String s1="jagdeepak";
		//s1=s1.concat(" karanbir ");
	//	System.out.println(s1);	



		//Stirng CharAt()

		String s1="jagdeepak";

		if (s1.charAt(2)=='g') 
		{
			System.out.println("True");

		}
		else
			System.out.println("false");

		System.out.println(s1.charAt(3));






		/*char c[]= {'s','i','n','g','h'};
	String s2= new String(c);
	String s3= new String ("verka");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
		 */




	}
}
/*	
Object a[]=new Object[4];
 a[0]= "jaycee";
 a[1]=10;
 a[2]=20.65;
 a[3]=true;

 for (int i=0;i<=3;i++)
 {
	 System.out.println(a[i]);
 }



	}
}

















/*	public static void main(String[] args) {
		for (int i=1;i<=20;i++)
		{
			if (i%2==0)
			{
				System.out.print(i+" ");
			}	


		}
		System.out.println("  ");
		for (int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}

		int add=0;
		for (int i=1;i<=10;i++)
		{
			add=i+add;
			System.out.println(add);
		}


	}
 */


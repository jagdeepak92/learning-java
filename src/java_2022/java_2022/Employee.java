package java_2022;

public class Employee 
{
	int EmpId;
	float Salary;
	String Ename;

	/*Employee(int id, float s,String E)
	{
		EmpId=id;
		Salary=s;
		Ename=E;

	}
*/
	
	void getEmpData(int id,float s,String E)
	{
		EmpId=id;
		Salary=s;
		Ename=E;
		
	}
	
	
	
	void displayEmpData()
	{
		System.out.println("This is the Employee ID:"+"  " +EmpId);
		System.out.println("This is the Employee salary :"+"  " +Salary);
		System.out.println("This is the Employee name:"+"  " +Ename);
		System.out.println("-----------------------------------------");
		

	}
	
	void id()
	{
		System.out.println(EmpId);
	}

}

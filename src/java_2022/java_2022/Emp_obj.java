package java_2022;

public class Emp_obj {

	public static void main(String[] args)
	{
		/* Employee E1= new Employee(1,67050,"jaycee");	
	 Employee E2= new Employee(3,67060,"karan");
	 Employee E3= new Employee(2,67500,"rahul");
	 Employee E4= new Employee(4,67600,"manish");
	 Employee E5= new Employee(5,67450,"sham");
		 */
		Employee E1= new Employee();
		Employee E2= new Employee();
		E1.getEmpData(2, 20900,"jaycee");
		E2.getEmpData(23,8699, "karan");
		E1.displayEmpData();
		E2.displayEmpData();
		// E3.displayEmpData();
		// E4.displayEmpData();
		// E5.displayEmpData();

		// E5.id();
	}




}

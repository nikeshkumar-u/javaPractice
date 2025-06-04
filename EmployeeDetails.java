import java.util.*;
class EmployeeDetails 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Enter Your ID:");
		    int id = sc.nextInt();
			sc.nextLine();
		System.out.println("Enter Your Name:");
			String name = sc.nextLine();
		
	    Thread.sleep(2000);
		System.out.println("Enter Your Contact:");
		    long nm = sc.nextLong();
        System.out.println("Enter Your Salary:");
		    double sl = sc.nextDouble();

        System.out.println("Employee Name"+name);
	   System.out.println("Emplyee ID"+ id);
	  
	   System.out.println("Employee Contact"+nm);
	   System.out.println("Employee Salary"+sl);
	}
}

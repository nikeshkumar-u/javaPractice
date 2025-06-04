import java.util.Scanner;
class CheckAge 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter you name");
		String name = sc.nextLine();
		System.out.println("Enter you age");
		int age = sc.nextInt();
		
		if(age<=15)
			System.out.println(name+" is Child");
		else if(age>15 && age<=20)
			System.out.println(name+ " is Teen");
		else if(age>20 && age<=33)
			System.out.println(name+" isAdult");
		else if(age>33 && age<=50)
			System.out.println(name+" is jaUncle");
		else
			System.out.println("tata Bye Bye See You");
	}
}

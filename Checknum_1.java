import java.util.Scanner;
class Checknum1 
{
	static Scanner sc= new  Scanner(System.in);
	public static void main(String[] args) 
	{
		double num = sc.nextDouble();
		if(num % 2 == 0)
		{
			System.out.println("Your number is Even");
			
		}
		else{
			System.out.println("Your number is odd");
		}
	}
}
//Write a java program odd or even
import java.util.Scanner;
class Checknum 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number:");
		double num = sc.nextDouble();
		
		if(num>0)
			{
			System.out.println("Your number is positive");
			}
			else{
				System.out.println("Your number is negative");

			}
	}
}

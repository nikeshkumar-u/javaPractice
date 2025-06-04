import java.util.Scanner;
class Prime1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter your number");
		int num = sc.nextInt();
		if (num==1 || num==0)
		{
			System.out.println("Somthig");
		}
		else if (num%2==0 && num%3==0)
		{
			System.out.println("Prime");

		}
		else{
			System.out.println("Not prime");
		}
			
		
	}
}

import java.util.Scanner;
class PrintFactor 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter your number");
		int n = sc.nextInt();
		for (int i=1;i<=n/2 ;i++ )

		{
			if (n%i==0)
			{
			
			System.out.println(i);

			}
		}
	}
}
//WAP to print the factors(The sum factors is perfect number)
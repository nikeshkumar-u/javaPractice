import java.util.Scanner;
class PerfectNumber 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter your number");
		int n = sc.nextInt();
		int sum =0;
		for (int i=1;i<=n/2 ;i++ )

		{
			if (n%i==0)
			{
			
			sum += i;

			}
		}
		if (sum == n)
		{
			System.out.println("Perferct");
		}
		else {
			System.out.println("Not a Perferct");
		}
	}
}
//WAP to print the factors(The sum factors is perfect number)
//WAP to check perfect number or not
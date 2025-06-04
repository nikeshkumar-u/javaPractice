import java.util.Scanner;
class forL1  
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1;i<=num ;i++ )
		{
			sum += i;
			
		}
		System.out.println(sum);
	}
}
/*WAP sum of n natural numbers were n is defined by the user*/
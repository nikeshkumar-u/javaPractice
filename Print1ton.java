import java.util.Scanner;
class Print1ton 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		int num = sc.nextInt();
		for (int i = 1;i<=num ;i++ )
		{
			System.out.println(i);
		}
	}
}

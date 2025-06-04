import java.util.Scanner;
class MethodA 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		factorial(5);
		
	}
	public static void factorial(int num)
	{
		int ans=1;
		for (int i=2;i<=num ;i++ )
		{
			ans*=i;
		}
			System.out.println(ans);
	}
}

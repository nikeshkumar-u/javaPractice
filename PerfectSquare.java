import java.util.Scanner;
class PerfectSquare 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i=1;i*i<=num ;i++ )
		{
			if (i*i==num)
			{
				flag  = true;
			}
		}
		System.out.println(flag?"Perfect Square":"Imperfect Square");
	}
}

import java.util.*;
class Xylem 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int last = num%10,sum=0;
		num/=10;
		while (num>9)
		{
			sum+=num%10;
			num/=10;
		}
		System.out.println((last+num)==(sum)?"Xylem":"Floem");
	}
}

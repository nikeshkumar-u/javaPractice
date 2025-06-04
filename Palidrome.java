import java.util.Scanner;
class Palidrome 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num,rev=0;
		while (num>0)
		{
			rev = rev*10+num%10;
			number/=10;
		}
		if (num==tem)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
			
		}
	}
}
/* m%n m<n = m
   num%10   return last digite
   num/10   remove last digite*/
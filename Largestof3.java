import java.util.Scanner;
class Largestof3 
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();

		if(a>b && a>c)
			System.out.println(a+" is greater");
		else if(b>c)
			System.out.println(b+" is greater");
		else
			System.out.println(cj+" is greater");
		
		
	}
}

import java.util.Scanner;
class FizzBuzz 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		int num = sc.nextInt();
		if(num%3 == 0)
			System.out.println("Fizz");
		else if(num%5 == 0)
			System.out.println("Buzz");
		else
			System.out.println("FizzBuzz");
	}
}

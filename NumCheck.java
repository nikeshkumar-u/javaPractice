import java.util.*;
class NumCheck 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		double num = sc.nextDouble();

		String res = (num % 2 == 0)? "Even":"Odd";
		System.out.println("Your number is "+res+" & Entered number is "+num);
	}
}
//write a Java to check Weather the given number is Odd or Even

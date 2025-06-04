import java.util.*;
class Number1 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number:");
		double num = sc.nextDouble();
		
		String res= (num > 0) ?"Positive":"Negative";
		System.out.println("Your number is"+res+"And Number is"+num);
	}
}

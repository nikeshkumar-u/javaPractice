import java.util.*;
class String1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println(name);
		System.out.println(name.length());//Non Static Variable
	}
}
/*WAP to read string data from user and print the length */
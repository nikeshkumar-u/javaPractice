import java.util.Scanner;
class Find2Largest 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter num3");
		int num3 = sc.nextInt();

		if(num1>num2 && num1<num3 || num1<num2 && num1>num3)
			System.out.println("Second Largest"+num1);
		else if(num2>num1 && num2<num3 || num2<num1 && num2>num3)
			System.out.println("Second Largest"+num2);
		else
			System.out.println("Second Largest"+num3);


	}
}
//WAP for find second largest number among three
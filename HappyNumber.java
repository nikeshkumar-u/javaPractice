import java.util.Scanner;
class HappyNumber 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your number : ");
		int number = sc.nextInt();
		while (number!=1 && number!=4)
		{
			int sum = 0;
			while (number > 0)
			{
				sum += (number%10)*(number%10);
				number/=10;
			}
				number=sum;
		}
		if (number==1)
		{
			System.out.println("Happy number");
		}
		else {
			System.out.println("Not happy number");
		}
	}
}
//WAP to check happy number or not(End with 1==happy or 4==not happy)
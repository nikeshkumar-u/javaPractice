import java.util.Scanner;
class  CountingDigits
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number;
			int count = 0;
			System.out.println("Enter the number");
			number = sc.nextInt();
			if (number == 0)
			{
				System.out.println("Result : it's 1 digite");
			}
			else {
				while (number > 0)
				{
					number/=10;
					count++;
				}
					System.out.println("Result: "+count+" digits");
			}
	}

		
	
}
/* input   output
    412       3
	4123      4
	0         1*/
import java.util.Scanner;
class Remote 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Slect your option");
		System.out.println("1.Power on\n2.Powe Off\n3.Volume Increase\n4.Volume Decrease");
		int num = sc.nextInt();
		Thread.sleep(2000);
		System.out.println("\t\t\t\tProcessing.....");

		if (num == 1)
		{
			System.out.println("Power on");
			}
			else if (num == 2)
				System.out.println("Power off");
			else if(num == 3)
				System.out.println("Volume Increase");
			else if(num == 4)
				System.out.println("Volume Decrease");

			else 
				System.out.println("Invalid");

	}
}

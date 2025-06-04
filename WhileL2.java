import java.util.Scanner;
class WhileL2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag = true;
		do
		{
			System.out.println("Select your input");
			System.out.println("1.JAVA\n2.SQL\n3.Exit");
			System.out.println("\t\t\tEnter your Choice");
			int num = sc.nextInt();
			switch ()
			{
			case 1 :System.out.println("Tabrez");
			break;
			case 2 :System.out.println("Nagraj");
			break;
			case 3 :flag = false;
			break;

			
			}
		}
		while (flag);
		System.out.println("ThankYou");

		
	}
}
/*WAP to display the output as given below
  input   output
  Java     Tabrez
  SQL      Nagraj
  exit     thankyou*/
import java.util.*;
class WorkShop2//29.03.2025 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Select input");
		System.out.println("1.PowerOperator\n2.HappyNumber\n3.StrongNumber\n4.PrimeNumber\n5.Xylem\n6.Amstrong\n7.Exit");
		int input = sc.nextInt();
		switch (input)
		{
		case 1:PowerOperation.main(args);
		break;
		case 2:HappyNumber.main(args);
		break;
		case 3:StrongNumber.main(args);
		break;
		case 4:PrimeorNot.main(args);
		break;
		case 5:Xylem.main(args);
		break;
		case 6:Amstrong.main(args);
		break;
		case 7:boolean flag = false;
		break;
		default:
			System.out.println("You entered invalid data");
		   break;
		
		}
		
	}
}

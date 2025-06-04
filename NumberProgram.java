import java.util.*;
class NumberProgram 
{
	static Scanner sc = new Scanner(System.in);
	static boolean Num_pro;
	public static void main(String[] args) 
	{ 
		do
		{
		System.out.println("\t\tWelcome to NumberProgram");
		System.out.println("Select your option");
		System.out.println("\t\t1.Factorial of Number\t\t\n2.Prime Number\t\t\n3.Largest of TwoNumber\t\t\n4.Palindrom\t\t\n5.Armstrong\t\t\n6.HappyNumber\t\t\n7.StrongNumber\t\t8.Exit");
		int user_input = sc.nextInt();
		switch (user_input)
		{
		case 1:{System.out.println("Enter your nummber");
		    int num = sc.nextInt();
			long res=factorial(num);
			System.out.println("Factorial of"+num+"is : "+res );
			break;}
		case 2:{break;}
		case 3:{break;}
		case 4:{break;}
		case 5:{break;}
		case 6:{break;}
		case 7:{break;}
		case 8:{Num_pro=true;
		    LogicMaster.home_page();
			break;}
		
		}}
		while(Num_pro=false);
	}
	public static long factorial(int a){
		int sum=1;
		for (int i=2;i<=a ;i++ )
		{
			sum*=i;
		}
		return sum;
	}
}

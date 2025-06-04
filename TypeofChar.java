import java.util.Scanner;
class TypeofChar 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your data");
		char data = sc.next().charAt(0);

		if (data>= '0' && data<='9')
		
			System.out.println(data+" is number");
		else if(data>='A' && data<='B' || data>='a' && data<='b')
			System.out.println(data+" is Letter");
		else
			System.out.println(data+" is SpecialCharacter");
	}
}
//Wra find the type of character
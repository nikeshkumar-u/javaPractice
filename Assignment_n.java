import java.util.Scanner;
class Assignment_n 
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter number1");
		double num1 = sc.nextDouble();
		System.out.println("Enter number2");
		double num2 = sc.nextDouble();

		if(num1 > num2){
			System.out.println(num1+"is greater");
		}
		else{
			System.out.println(num2+"is greater");
		}
	}
}

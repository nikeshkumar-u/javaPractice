import java.util.Scanner;
class CheckNum1  
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
        System.out.println("Enter your number1");
        double num1 = sc.nextDouble();
        System.out.println("Enter your number2");
        double num2 = sc.nextDouble();
        System.out.println("Enter your number3");
        double num3 = sc.nextDouble();

        // Find the largest number using Math.max
        double largest = Math.max(num1, Math.max(num2, num3));

        // Print the result
        System.out.println("The largest number is: " + largest);
    }
}
//Write a java program to find largest of three numbers
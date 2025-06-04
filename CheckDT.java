import java.util.Scanner;
class CheckDT 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		double num = sc.nextDouble();
		if(num == 0){
			System.out.println("Zero");
		}
		else{
			if(num >0){
				System.out.println("Positive");
			}
			else{
				System.out.println("Negative");
			}
		}
	}
}
/* input   output
    0        Zero
	3         positive
	-5        negative */

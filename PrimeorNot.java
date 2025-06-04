import java.util.Scanner;
class PrimeorNot 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Eneter your number");
		int number = sc.nextInt();
		if(number==0 || number==1){
			System.out.println("Neither prime nor Composite");
		}
		else {
			boolean prime=true;
			{
			for (int i=2;i<=number/2 ;i++ )
			{
				if(number%i==0){
				prime=false;
				break;
				}
			
			}
		if(prime){
			System.out.println("Prime");
		}
		else
			System.out.println("Composite");
			}
	}
}
}
  //WAP to check prime number or not(0&1 neither prime nor composite)
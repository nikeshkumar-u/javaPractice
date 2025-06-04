import java.util.Scanner;
class Amstrong
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("enter the number:");
		int number = sc.nextInt();
		int count = 0;
		int temp = number,sum=0,x=1;
		System.out.println("original number "+temp);
		
		while (number>0)
		{
	        number=number/10;
			count++;
		}//count
		System.out.println(count);
		while (temp > 0){
		x=temp%10;
		int ans =1;
		for (int i=1;i<=count;i++)
		{
			ans*=x;

			}
		sum+=ans;
		temp /=10;
		}
		
		
		System.out.println(sum);


	}
}
//number % 10 lastdigite
//number / 10 lastdigite removed
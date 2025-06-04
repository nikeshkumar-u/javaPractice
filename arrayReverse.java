import java.util.*;
class arrayReverse 
{
	static Scanner sc = new Scanner(System.in);
	public static void arr(int []a,int n)
	{
		//n=n%a.length;
		
		for (int i=01;i<n ;i++)
		{
			int first = a[a.length-1];
			for (int j=a.length-1;j>0;j-- )
			{
			
			a[j]=a[j-1];
			}
			a[0]=first;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter n value");
		int n =sc.nextInt();
		int[]a={10,20,30,40,50,60,70};
		arr(a,n);
	}
}

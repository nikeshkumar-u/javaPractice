import java.util.*;
class Array1 
{
	static Scanner sc = new Scanner(System.in);
	public static int[] arr(int []x){
		System.out.println("Enter value:");
		for (int i=0;i<x.length ;i++ )
		{
			
			int value= sc.nextInt();
			
			System.out.println("["+i+"]="+value);
			x[i]=value;
		}
		return x;

		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int []a= new int[size];
		int []res=arr(a);
		System.out.println(Arrays.toString(res));
	}
}

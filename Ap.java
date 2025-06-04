import java.util.*;
class Ap 
{
	public static void main(String[] args) 
	{
		int []a = {10,5,4,8,87,9,6,2};
		arr1(a);
	}
	public static void arr(int[] a){
		int largest=0,slargest=Integer.MIN_VALUE;
		for (int ref:a )
		{
			if (largest<ref)
			{
				slargest=largest;
				largest=ref;
			}
			else if (slargest<ref && ref!=largest)
			{
				slargest=ref;
			}
			
		}
		System.out.println(largest);
		System.out.println(slargest);
	}
	public static void arr1(int[] a){
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

	}
	

}

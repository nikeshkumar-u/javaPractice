import java.util.*;
class Sorting_Algorithm 
{
	public static void bubble(int []a){
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=0;j<a.length-1 ;j++ )
			{
			
			if (a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static void selection(int []a){
			for (int i=0;i<a.length-1 ;i++ )
			{
				int s = i;
				for (int j=i+1;j<a.length ;j++ )
				{
					if (a[j]<a[s])
					{
						j=s;
					}

				}
				if (s != i)
				{
				
				int temp = a[i];
				a[s]=a[i];
				a[i]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) 
	{
		int []a={10,5,2,4,8,9,4,7};
		selection(a);
	}
}

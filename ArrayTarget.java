import java.util.*;
class ArrayTarget
{
	static Scanner sc = new Scanner(System.in);
	public static void arr(int []a,int target){
		int i=0,r=a.length-1,j=i+1;
		for ( i=0;i<a.length-1 ;i++ )
		{
			while(j<r)
			{
			for(j=i+1;j<a.length;j++){
			if (a[i]+a[j]+a[r]==target)
			{
				System.out.println(a[i]+","+a[j]+","+a[r]);
				r--;
				}
				if (a[j]+a[r]>target)
				{
					r--;
				}
			}
			}
		}
		
		
	}
	public static void main(String[] args) 
	{
		int []a={1,5,4,3,8,7,6,2,4};
		arr(a,10);
	}
}

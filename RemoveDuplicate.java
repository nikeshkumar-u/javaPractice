import java.util.*;
class RemoveDuplicate  
{
	public static int[] RemoveDup(int []a){
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==Integer.MIN_VALUE)
			{
				continue;
			}
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]==a[j])
				{
					a[j]=Integer.MIN_VALUE;
					count++;
				}
			}
		}
		int[] res = new int[a.length-count];
		for (int i=0,m=0;i<a.length ;i++ )
		{
			if (a[i]!=Integer.MIN_VALUE)
			{
				res[m++]=a[i];
			}
		}
		return res;
		
	}
	public static void main(String[] args) 
	{
		int[][]a={{1,5,4,7,4,5},{4,5,7,8,9,7},{8,86,89,4,31,2,5,5}};
		
        for (int i=0;i<a.length ;i++ )
        {
			a[i]=RemoveDup(a[i]);
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
        }
	}
}

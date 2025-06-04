import java.util.*;
class Sant 
{
	public static void main(String[] args) 
	{
		int a[]={3,5,7,9,10};
		int first=0,last=a.length-1;
		/*for (int i=0;i<a.length-1 ;i++ )
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=first;
		System.out.println(Arrays.toString(a));*/
        while (first<=last)
        {
			int temp=a[first];
			a[first]=a[last];
			a[last]=temp;
			first++;
			last--;

        }
		System.out.println(Arrays.toString(a));
	}

}

class n1 
{
	public static void solve(int a[]){
		int largest =a[0],secondL=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>largest && largest != secondL)
			{
				largest = a[i];
			}
			else 
			{
				secondL=a[i];
			}
			
		}
		System.out.println("Largest:"+largest);
		System.out.println("secondL:"+secondL);
		
	}
	public static void main(String[] args) 
	{
		int[] a = {5,4,7,8,1,6,9};
		solve(a);
	}
}

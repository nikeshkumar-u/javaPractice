class Decimaltobinary 
{
	public static void main(String[] args) 
	{
		int number = 13;
		String ans = " ";
		while (number>0)
		{
			ans=number%2+ans;
				number/=2;
		}
		System.out.println(ans);
	}
}
//DecimaltoBinary
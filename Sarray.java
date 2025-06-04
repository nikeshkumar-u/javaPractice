class Sarray  
{
	public static void main(String[] args) 
	{
		String[] a= {"Matesh","Sheela","Mala"};
		int length = a.length;
		int len = a[1].length();
		String s1 = "Nikesh";
		String s2 = "nikesh";
		char ch1 = s2.charAt(3);

		if(s1.equals(s2))
		{
			System.out.println("is Equal");
		}

		System.out.println(len);
		System.out.println(len == ch1);
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
/*WAP to print the length of the string array and print the characters from string and comparing two string*/
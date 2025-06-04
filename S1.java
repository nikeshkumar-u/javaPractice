class  S1
{
	public static void main(String[] args) throws Exception
	{
		String s1= "Hello World!";
		/*for (char ch:s1.toCharArray())
		{
			System.out.println(ch);
			Thread.sleep(200);
		}*/
		char[] ch = s1.toCharArray();
		for (int i=ch.length-1;i>=0;i-- )
		//for(char res : ch)
		{
			//System.out.println(res);
            System.out.print(ch[i]);
		}
	}
}
/*WAP to print the characters from string by using for loop
convert string into character array */
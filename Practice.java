import java.util.*;
class Practice 
{
	
	public static void main(String[] args)
	{
		String input="I Can Achive this Easily";
		String[] a= input.split("");
		a[0]=a[0].toLowerCase();
		a[6]=a[6].toLowerCase();
		a[13]=a[13].toUpperCase();
		a[18]=a[18].toLowerCase();
		//System.out.print(Arrays.toString(a));
		String result=String.join("",a);
		System.out.print(result);
		
	}
}


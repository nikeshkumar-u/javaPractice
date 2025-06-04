import java.util.Scanner;
class Printatoz
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		for (char i='A';i<='Z' ;i++ )
		{
			System.out.println(i+" - "+ (int)i);
		}
	}

}
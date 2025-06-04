import java.util.*;
class LogicMaster 
{
	static Scanner sc = new Scanner(System.in);
	static int db_uid;
	static long db_contact;
	static int db_pwd;
	static char db_gender;
	static boolean user_deatils;
	static boolean home;
	public static void main(String []args) throws Exception{
	do {
	System.out.println("\t\t\tWlcome to LogicMaster");
	System.out.println("please select the input");
	System.out.println("\t\t1.SignUp\n\t\t2.Login\n\t\t3.Forgot Password\n\t\t4.Exit");
	int user_option = sc.nextInt();
	switch (user_option)
	{
	case 1:{ sign_up();
		break;}
	case 2:{ sign_up();
		break;}
	case 3:{ forgot_pwd();
		break;}
	case 4:{ System.out.println("Thankyou");
	        user_deatils=true;
	        break;}
	
	} 
	 }while(user_deatils==false);
	}
	public static void sign_up(){
		if (user_deatils == false){
			System.out.println("User dosen't exist,Please create account");
			System.out.println("\t\tSignUp");
			System.out.println("processing....");
			//Thread.sleep(3000);
			System.out.println("Enter user ID: ");
			db_uid=sc.nextInt();
			System.out.println("Enter your contact: ");
			db_contact=sc.nextLong();
			System.out.println("Enter your password: ");
			db_pwd=sc.nextInt();
			System.out.println("Enter your Gender: ");
			db_gender=sc.next().charAt(0);
			System.out.println("Account created Succesfully");
			System.out.println("----------------------------");
			user_deatils=true;
			sign_in();
		}
		else{
			System.out.println("\t\tSignIn");
			System.out.println("Enter your user contact: ");
			long user_contact=sc.nextLong();
			System.out.println("Enter your password: ");
			int user_pwd=sc.nextInt();
			if (user_contact==db_contact && user_pwd==db_pwd){
				System.out.println("login Succesfully");
				System.out.println("-----------------");
				home_page();
			
			}
			else{
				System.out.println("You have entered invaild contact or password");
			}
		}
	}
	public static void forgot_pwd(){
		if (user_deatils == true)
		{
		System.out.println("Enter your contact:");
		int user_cont = sc.nextInt();
		System.out.println("Enter your otp:");
		int otp = (int)(Math.random()*9999+9999);
		int user_otp = sc.nextInt();
		if (user_cont==db_contact && user_otp==otp)
		{
		System.out.println("Enetr your new password");
		int new_psw=sc.nextInt();
		db_pwd=new_psw;
		System.out.println("Your password updated successfully");
		}
		else{
			System.out.println("You have entered invalid contact or otp check and try again");
			forgot_pwd();
		}
		}else{
			//System.out.println("User dosen't exist,Please create account");
			sign_up();
		}
	}
	public static void sign_in(){
		System.out.println("\t\tSignIn");
	System.out.println("Enter your user contact: ");
			long user_contact=sc.nextLong();
			System.out.println("Enter your password: ");
			int user_pwd=sc.nextInt();
			if (user_contact==db_contact && user_pwd==db_pwd){
				System.out.println("login Succesfully");
				System.out.println("------------------");
				home_page();
	}
}
public static void home_page(){
	do{
	System.out.println("\t\tHomepage");
	System.out.println("\t\t****Welcome****");
	System.out.println("Select the your option");
	System.out.println("\t\t1.NuumberProgram\n\t\t2.PatternProgram\n\t\t3.Swiggy\n\t\t4.Exit");
	int userinput = sc.nextInt();
	switch (userinput)
	{
	case 1:{break;}
	case 2:{break;}
	case 3:{break;}
	case 4:{home=true;
	    System.out.println("ThakYou Vist again");
		break;}
	
	}}
	while(home=false);
}
}

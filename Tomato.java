import java.util.*;
class Tomato 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		long user_PHno = 9876543210L;
        System.out.println("Enter your Phone Number");
		long ph = sc.nextLong();
		if (user_PHno == ph)
		{
			System.out.println("Enter your OTP");
			int otp = (int) (Math.random()*4444+4444);
			Thread.sleep(3000);
			System.out.println(otp);
			int OTP = sc.nextInt();
			if (otp == OTP)
			{
				System.out.println("Login Successful :)");
				System.out.println("Select your hotel");
				System.out.println("--------------------");
				System.out.println("1.Muniyandi vilays\n2.Thalapakatti\n3.Pandiyas");
                System.out.println("--------------------");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:{
						System.out.println("Welcome to Muniyandi Vilays");
						System.out.println("-----------------------------");
						System.out.println("Select your Favourite Food");
						System.out.println("-----------------------------");
						System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Prawn Briyani");
						System.out.println("-----------------------------");
						int food =sc.nextInt();
						if (food == 1)
						{
							int price = 400;
							System.out.println("You Selected MuttonBriyani");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing.....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}
						else if (food == 2)
						{
							int price = 300;
							System.out.println("You Selected Chicken Briyani");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("----Thak You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}
						else if (food == 3)
						{
							int price = 450;
							System.out.println("You Selected Prawn Briyani");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thak You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing.....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("------Thak You-------");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}


						else{System.out.println("You entered invalid data");}
					break;}//Muniyandi vilays
					
				
				case 2:{System.out.println("Welcome to Thalapakatti");
						System.out.println("-----------------------------");
						System.out.println("Select your Favourite Food");
						System.out.println("-----------------------------");
						System.out.println("1.Boneless Mutton Briyani\n2.Thlapakatti Chicken Briyani\n3.Egg Briyani");
						System.out.println("-----------------------------");
						int food =sc.nextInt();
						if (food == 1)
						{
							int price = 500;
							System.out.println("You Selected Boneless MuttonBriyani");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing.....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}
						else if (food == 2)
						{
							int price = 450;
							System.out.println("You Selected Thalapakatti Chicken Briyani");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("----Thak You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}
						else if (food == 3)
						{
							int price = 350;
							System.out.println("You Selected Egg Briyani");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thak You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing.....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("------Thak You-------");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}


						else{System.out.println("You entered invalid data");}
					break;}//Thalapakatti
					case 3:{System.out.println("Welcome to Pandiyas");
						System.out.println("-----------------------------");
						System.out.println("Select your Favourite Food");
						System.out.println("-----------------------------");
						System.out.println("1.Boneless Mutton Brain Roast\n2.Mutton Liver Roast\n3.Mutton Botti");
						System.out.println("-----------------------------");
						int food =sc.nextInt();
						if (food == 1)
						{
							int price = 250;
							System.out.println("You Selected Boneless Mutton Brain Roast");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing.....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}
						else if (food == 2)
						{
							int price = 150;
							System.out.println("You Selected Mutton Liver Roast");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("----Thak You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("----Thank You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}
						else if (food == 3)
						{
							int price = 350;
							System.out.println("You Selected Mutton Botti");
							System.out.println("Enter you QYT");
							int Qyt = sc.nextInt();
							System.out.println("Wait a moment....");
							double bill = price*Qyt;
							System.out.println("Bill Amount"+bill);
							System.out.println("Processing Payment details");
							System.out.println("Select your payment method");
							System.out.println("1.Gpay\n2.Phonepay");
							int payment = sc.nextInt();
							System.out.println("Enter your amount");
							double BILL = sc.nextDouble();
							switch (payment)
							{
							case 1:{System.out.println("Gpay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("-----Thak You-----");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							case 2:{System.out.println("Phone Pay");
							if (bill == BILL)
							{
								int MPIN = 1234;
							System.out.println("Enter you MPIN");
							int mpin = sc.nextInt();
							if (mpin == MPIN){
								System.out.println("Your order placed");
								System.out.println("Processing.....");
								Thread.sleep(5000);
								System.out.println("Your food is deliverd with in 30 minutes");
								System.out.println("------Thak You-------");
							}
							else{
								System.out.println("You entered wrong MPIN");
							}
							}
							else {
								System.out.println("You Entered wrong amount");
							}break;}
							}
						}


						else{System.out.println("You entered invalid data");}
					break;
						
					}//Pandiyas
				}              
			}
		}
	}
}
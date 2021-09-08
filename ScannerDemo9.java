import java.util.Scanner;
class ScannerDemo9
{
	public static void main(String[] args)
	{
	 Scanner sc1=new Scanner(System.in);

	 System.out.println("ENTER FIRST NUMBER");
	 double number1=sc1.nextDouble();

	 System.out.println("ENTER SECOND NUMBER");
	 double number2=sc1.nextDouble();

	 if (number1>number2)
	 {
	  System.out.println("Number1 is Greatest");
	 }
	 else if(number2>number1)
	 {
	 System.out.println("Number2 is Greatest");
	 }
	}
}
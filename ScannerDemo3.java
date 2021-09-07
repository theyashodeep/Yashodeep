import java.util.Scanner;
class ScannerDemo3
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner (System.in);

	System.out.println("Enter No Of quantity");
	int qty=sc1.nextInt();//take input from user

	System.out.println("Enter price");
	double price=sc1.nextDouble();//take input from user

	double output=bill(qty,price);//call method
	System.out.println("Calculated bill is "+ output);
	}
	static double bill(int qty, double price)
	{
	double result=(qty*price);
	return result;
	}
}
import java.util.Scanner;
class ScannerDemo6
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Product Name");
	String name=sc1.next();

	System.out.println("Enter Product Price");
	double price=sc1.nextDouble();

	System.out.println("Enter Discount Percentage");
	int percent=sc1.nextInt();
	
	double amt=calculateAmt(price,percent);

	System.out.println("PRODUCT NAME IS "+name);
	System.out.println("PRODUCT PRICE IS "+price);
	System.out.println("PRODUCT DISCOUT PERCENTAGE IS "+percent);
	System.out.println("________________________________________");
	System.out.println("AMOUNT OF PRODUCT IS "+ amt);
	}
	static double calculateAmt(double price,int percent)
	{
	double amt=(price-(price*percent)/100);
	return amt;
	}
}
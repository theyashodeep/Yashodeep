import java.util.Scanner;
class ScannerDemo10
{
	public static void main(String[] args)
	{
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("Enter Radius Of Circle");
	 double rad=sc1.nextDouble();
	 //area(rad);
	 //circum(rad);
	 System.out.println("Enter Your Choice");
	 System.out.println("Select Mode Of Operation");
	 System.out.println(" 1.Area of Circle");
	 System.out.println("2.Circumference of Circle");
	 double choice=sc1.nextDouble();
	 if (choice==1)
	 {
	  area(rad);
	 }
     else if (choice==2)
     {
     circum(rad);
     }
     else
     {
     	System.out.println("Please Enter Valid Choice");
     }

	static double area(double rad)
	{
	double result=(3.14*rad*rad);
	System.out.println("Area of Circle is "+result);
	return result;
	}
	static double circum(double rad)
	{
	
	double result=(2*3.14*rad);
	System.out.println("Circumference Of Circle" + result);
	return result;
	}
}	
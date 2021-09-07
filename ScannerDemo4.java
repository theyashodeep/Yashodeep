import java.util.Scanner;
class ScannerDemo4
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Radius Of Circle");
	double rad=sc1.nextDouble();

	double result1=areaOfCircle(rad);
	double result2=areaOfCircle(rad);

	System.out.println("Area Of Circle Is "+result1);
	System.out.println("Area Of Circle Is "+result2);
	}
	static double areaOfCircle(double rad)
	{
	double area=(3.14*rad*rad);
	return area;
	}
	static double circumOfCircle(double rad1)
	{
	double cOfC=(2*3.14*rad1);
	return cOfC;
	}
}
import java.util.Scanner;
class Circle
{
	static double pi=3.14;
	void area (double r)
	{
	double result=pi*r*r;                        
	return result();
	}

    void circumference(double r)
    {
	double circum=2*pi*r*r;

	return circum();
    }
}
class MainApp3
{
	public static void main (String [] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("ENTER RADIUS");
	double rad=sc1.nextDouble();
     
    System.out.println("1:AREA OF CIRCLE");
    System.out.println("2:CIRCUMFERENCE OF CIRCLE");

    int choice=sc1.nextInt();

    if(choice==1)
    {
    new Circle().area(rad);
    }
    else if(choice==2)
    {
     new Circle().circumference(rad);
    }
	}

}
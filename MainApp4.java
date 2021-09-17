import java.util.Scanner;
class Electricity
{
	static double residential = 4.40;
	static double commercial = 5.40;

     void residential(int currentunit,int previousunit)
     {

	double result=(currentunit-previousunit);
	double total=result*residential;
	System.out.println("RESIDENTIAL BILL "+total);
	}
	void commercial ( int currentunit,int previousunit )
	{
	double result=(currentunit-previousunit);
	double total=result*commercial;
	System.out.println("COMMERCIAL BILL "+total);
	}
	
}
class MainApp4
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("ENTER CURRENT UNIT");
	int CU=sc1.nextInt();

	System.out.println("ENTER PREVIOUS UNIT");
	int PU=sc1.nextInt();

	System.out.println("1:RESIDENTIAL BILL");
	System.out.println("2:COMMERCIAL BILL");

	int choice=sc1.nextInt();

	if(choice==1)
	{
	new Electricity().residential (CU,PU);
	}
	else if (choice==2)
	{
	new Electricity().commercial (CU,PU);
	}
	}
}
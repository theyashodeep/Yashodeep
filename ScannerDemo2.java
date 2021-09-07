import java.util.Scanner;
class ScannerDemo2
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner (System.in);

	System.out.println("Enter first number");
	double number1=sc1.nextDouble();

    System.out.println("Enter Second number");
    double number2=sc1.nextDouble();

    System.out.println("Enter third number");
    double number3=sc1.nextDouble();

    double add= number1+number2+number3;
    double mult= number1*number2*number3;

    System.out.println("Addition is "+add);
    System.out.println("Multipication is "+mult);
	}
}
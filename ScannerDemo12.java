import java.util.Scanner;
class ScannerDemo12
{
	public static void main(String[] args)
	{
	Scanner sc1= new Scanner(System.in);
	System.out.println("ENTER NUMBER");
	int no=sc1.nextInt();

	if(no%5==0)
	{
	 if(no%3==0)
	 {
	 System.out.println("DIVISIBLE BY 5 AND 3");
	 }
	 else 
	 {
	 System.out.println("DIVISIBLE BY 5");
	 }
	}
	 else
	 {
	 System.out.println("NOT DIVISIBLE BY 5");
	 }
	}
}
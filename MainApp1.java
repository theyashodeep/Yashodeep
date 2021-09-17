//business logic or function class

class Master1
{
	static int K=20;
	static void test()
	{
	System.out.println("TEST METHOD");
	}
}

//executable class
class MainApp1
{
	public static void main (String[] args)
	{
		System.out.println("K VALUE IS "+ Master1.K);
		Master1.test();
	}
}
class Master
{
	int K=10;
	void test()
	{
	System.out.println("TEST METHOD");
	}
}
class MainApp5
{
	public static void main(String[] args)
	{
	Master m1=new Master();
	System.out.println("K VALUE IS "+m1.K);
	m1.test();

	Master m2=new Master();
	System.out.println("K VALUE IS "+m2.K);
	m2.test();

	System.out.println(m1);
	System.out.println(m2);
	}
}
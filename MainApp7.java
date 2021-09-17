class Demo1
{
	static int k=25;
	int p=50;
}
class mainApp7
{
	public static void main(String[] args)
	{
	Demo1 d1=new Demo1();
	System.out.println("K VALUE IS "+d1.k);
	System.out.println("P VALUE IS "+d1.p);

	d1.k=100;
	d1.p=200;
	System.out.println("K VALUE IS "+d1.k);
	System.out.println("P VALUE IS "+d1.p);

	Demo1 d2=new Demo1();
	System.out.println("K VALUE IS "+d2.k);
	System.out.println("P VALUE IS "+d2.p);
	}
}
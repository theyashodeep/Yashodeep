class OperatorDemo3
{
	public static void main(String[] args)
	{
	int a=3;
	int b;

	b = a++ + a + ++a;

	System.out.println(a);   //5
	System.out.println(b);   //12
	}
}
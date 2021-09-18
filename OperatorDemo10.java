class OperatorDemo10
{
	public static void main(String[] args)
	{
	int a=2;
	int b=3;
	if(++a>2 && --b<3)
	{
	a++;
	b--;
	}
	System.out.println(a);        //4
	System.out.println(b);        //1
	}
}
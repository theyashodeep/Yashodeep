class VariableDemo4
{
	public static void main(String[] args)
	{
	 int x=30;
	 int y=60;

	 /* using third variable*/
	 int data;
	 data=x;
	 x=y;
	 y=data;
	 System.out.println(x + "\t" + y);

	 /* using arithmatic operators*/
	 x=x+y;
	 y=x-y;
	 x=x-y;
	 System.out.println(x+ "\t"+ y);
	}
}
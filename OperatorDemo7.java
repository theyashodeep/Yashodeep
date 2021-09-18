class OperatorDemo7
{
	public static void main(String[] args)
	{
	int a=3;
	int b=2;
	int c=4;

	c= b++ +a-- +b--;

	if(b++>2)
	{
	c++;
	a++;
	}
	else
	{
	a--;
	}
	System.out.println(a);       //1
	System.out.println(b);      //3
   	System.out.println(c);      //8
	}
}
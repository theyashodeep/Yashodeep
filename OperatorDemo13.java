class OperatorDemo13
{
	public static void main(String[] args)
	{
	int p=3;
	int q=3;

	q=p++ + --q;

	if((++p>4 && --q<5)|| (++q >10 && --p <10))
	{
	p++;
	q--;
	}
	else
	{
	q++;
	p--;
	}
	System.out.println(p);     //6
	System.out.println(q);    //3
	}
}
class OperatorDemo11
{
	public static void main(String[] args)
	{
	int x=5;
	int y=7;
	int z=9;
	 if((++x>5 || --y<7)&&(++z>8 || --y>7))
	 {
	 z++;
	 y--;
	 x++;
	 }
	 System.out.println(z);    //11
	 System.out.println(y);    //6
	 System.out.println(x);   //7
	}
}
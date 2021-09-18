class OperatorDemo6
{
	public static void main(String[] args)
	{
	int x=2;
	int y=3;
	 y= ++x+x++ + --x;

	 if(--x<5)
	 {
	 y++;         
	 x++;       
	 }
	 System.out.println(y);          //10
	 System.out.println(x);          //3
	}
}
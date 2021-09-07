class MethodDemo4
{
	public static void main(String[] args)
	{
	MinuteToSecond( 30);
	SecondToMinute(300);
	}

	static void MinuteToSecond(double Min)
	{
	 double A;
	 A= (Min*60);
	 System.out.println(A);
	}

	static void SecondToMinute(double Sec)
	{
	 double B;
	 B= (Sec/60);
	 System.out.println(B);
	}
}
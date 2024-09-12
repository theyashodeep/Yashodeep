class VariableDemo3
{
	public static void main(String[] agrs)
	{
	 char ch1='J', ch2='A', ch3='V', ch4='A';
	 System.out.println(ch1+ "\t" + ch2+ "\t"+ ch3 + "\t" + ch4);

	 /*Reinitilization */
	 
	 ch4=ch3;
	 ch2=ch1;
	 ch3=ch2;
	 System.out.println(ch1 + "\t"+ ch2+ "\t"+ ch3 + "\t"+ ch4);
	}
}
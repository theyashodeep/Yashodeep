class Product2
{
	public static void main(String [] args)
	{
	 int qty=5;
	 int price=500;
	 int dis=0;
	 int sum=0;
	 int finalprice=0;
	 sum=qty* price;
	 dis=(5/100)*sum;
	 finalprice=sum-dis;
	 System.out.println("Total price is "+ finalprice);
	}
}
class MethodDemo8
{
	public static void main(String[] args)
	{
	 double total= gstBill();
	 System.out.println("GST Bill Is "+ total);
	}
	static double productBill(int qty, double price)
	{
	 double result;
	 result= qty*price;
	 return result;
	}
	static double gstBill()
	{
	 double total;
	 total = productBill(10,200);
	 double gstBill;
	 gstBill=(0.06* total)+total;
	 return gstBill;
	}
}
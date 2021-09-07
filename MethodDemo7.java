class MethodDemo7
{
	public static void main(String[] args)
	{
	areaOfCircle();
	}
	static void areaOfCircle()
	{
	double rad=addition(5,2);
	double area;
	area= 3.14*rad*rad;
	System.out.println("Area Of Circle Is "+area);
	}
	static double addition(double a, double b)
	{
		double result= a+b;
		return result;
	}
}
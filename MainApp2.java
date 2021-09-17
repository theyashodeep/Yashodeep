class Demo1
{
	int P=10;
	void display()   //non static class
	{
	System.out.println("DISPLAY METHOD");
	}
}

class MainApp2
{
	public static void main(String[] args)
	{
	System.out.println("P VALUE IS "+ new Demo1().P);
	new Demo1().display();
	}
}
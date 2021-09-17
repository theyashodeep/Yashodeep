class Mobile
{
	//state
	String company="SAMSUNG";
	double price=25000.25;
	String color="SILVER";
	int cameraPixels=48;

	//behaviour
	void display()
	{
	System.out.println("DISPLAY PICTURE");
	}
	void capturePhoto()
	{
	System.out.println("CAPTURE PHOTO");
	}
}
class MainApp8
{
	public static void main( String[] args)
	{
	Mobile m1=new Mobile();
	System.out.println("COMPANY NAME IS "+m1.company);
	System.out.println("PRICE IS "+m1.price);
	System.out.println("COLOR IS "+m1.color);
	System.out.println("CAMERA PIXEL "+m1.cameraPixels);

	m1.display();
	m1.capturePhoto();
	}
}
class Product
{
	int productId;
	String productName;
	
	void acceptDetails(int id, String name)
	{
	productId=id;
	productName=name;
	}
	void displayDetails()
	{
	System.out.println("PRODUCT ID IS "+ productId);
	System.out.println("PRODUCT NAME IS "+productName);
	}
}
class MainApp6
{
	public static void main(String[] args)
	{
	product.p1= new product();
	p1 acceptDetails (201,"MOBILE");
	p1 acceptDetails (201,"AC");
	p1 displayDetails();

	product.p2 = new product();
	p2 acceptDetails (202,"LAPTOP");
	p2 displayDetails();
	}
}

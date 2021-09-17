import java.util.Scanner;

class Ticket
{
	static int availableTickets=60;
	void bookTicket(int bookingCount)
	{
	 if (bookingCount<=availableTickets)
	 {
	 availableTickets=availableTickets-bookingCount;
	 System.out.println(bookingCount+" TICKETS HAVE BEEN BOOKED");
	 }
	 else
	 {
	 System.out.println("SORRY TICKETS ARE NOT AVAILABLE");
	 }
	}
	void cancleTicket(int cancleCount)
	{
	availableTickets=availableTickets+cancleCount;
	System.out.println(cancleCount+" TICKETS HAS BEEN CANCELLED");
	}
	void showAvailableTickets()
	{
	System.out.println("AVAILABLE TICKETS ARE "+availableTickets);
	}
}
class MainApp9
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	Ticket t1=new Ticket();

	System.out.println("SELECT MODE OF OPERATION");
	System.out.println("1:BOOK TICKET");
	System.out.println("2:CANCLE TICKET");
	System.out.println("3:VIEW TICKETS");	
	int choice= sc1.nextInt();

	if (choice==1)
	{
	System.out.println("ENTER NO OF TICKETS TO BE BOOKED");
	int count1=sc1.nextInt();
	t1.bookTicket(count1);
	}
	else if (choice==2)
	{
	System.out.println("ENTER NO OF TICKETS TO BE CANCELLED");
	int count2=sc1.nextInt();
	t1.cancleTicket(count2);
	}
	else if(choice==3)
	{
	t1.showAvailableTickets();
	}
	}
}
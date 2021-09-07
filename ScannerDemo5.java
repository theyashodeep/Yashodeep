import java.util.Scanner;
class ScannerDemo5
{
	public static void main(String[] args)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Total No Of Wins");
	double win=sc1.nextDouble();

	System.out.println("Enter Total No Of Lose");
	double lose=sc1.nextDouble();

	System.out.println("Enter Total No Of Draw");
	double draw=sc1.nextDouble();

	double reward=calculateRewards(win,lose,draw);
	System.out.println("Your Reward is "+ reward);
	}
	static double calculateRewards(double win, double lose, double draw)
	{
	double reward1= (win*25);
	double reward2= (lose*-10);
	double reward3= (draw*10);
	double total= (reward1+reward2+reward3);
	return total;
	}
}
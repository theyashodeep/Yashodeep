class OperatorDemo12
{
	public static void main(String[] args)
    {
     int a=4;
     int b=5;
     if(!(a-->2 && b++ <5) || (a++ <5 && b-- >5))
     {
     a++;
     b--;
     }
     else
     {
     b++;
     a--;
     }
     System.out.println(a);         //4
     System.out.println(b);         //5
    }
}
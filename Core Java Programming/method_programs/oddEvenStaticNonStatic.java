import java.util.Scanner;
class oddEvenStaticNonStatic 
{
	public static void move() 
	{
		System.out.println("Move from One Place to Another Place");
	}
	public void carry() 
	{
		System.out.println("Carry Passengers");
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer Number");
		int k = scan.nextInt();
		if (k<=0)
		{
            System.out.println("No Method are Called");
		}
		else if (k%2==1)
		{
            move();
		}
		else
		{
            oddEvenStaticNonStatic o1 = new oddEvenStaticNonStatic();
		    o1.carry();
		}
	}
}

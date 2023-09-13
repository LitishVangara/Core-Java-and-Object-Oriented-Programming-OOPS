import java.util.Scanner;
class proveFormulaProportional
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value = ");
		int x = scan.nextInt();
		System.out.println("Enter y value = ");
		int y = scan.nextInt();
		int a=x;
		int b=y;
		compare(a,b);
	}
	public static void compare(int a, int b)
	{
        int leftHandSideTotal = lhs(a,b);
        int rightHandSideTotal = rhs(a,b);
		if (leftHandSideTotal==rightHandSideTotal)
		{
			System.out.println("The total of LHS is = "+leftHandSideTotal);
			System.out.println("The total of RHS is = "+rightHandSideTotal);
		    System.out.println("Therefore LHS and RHS are equal.  "+leftHandSideTotal+" = "+rightHandSideTotal);
			System.out.println("Therefore (a*a) + (b*b) = ((a+b)*(a+b)) - 2*a*b");
		}
		else
		{
			System.out.println("The total of LHS is = "+leftHandSideTotal);
			System.out.println("The total of RHS is = "+rightHandSideTotal);
		    System.out.println("Therefore LHS and RHS are not equal.  "+leftHandSideTotal+" != "+rightHandSideTotal);
			System.out.println("Therefore (a*a) + (b*b) != ((a+b)*(a+b)) - 2*a*b");
		}
	}
	public static int lhs(int a, int b)
	{
        int leftHandSideTotal = (a*a) + (b*b);
		return leftHandSideTotal;
	}
	public static int rhs(int a, int b)
	{
        int rightHandSideTotal = ((a+b)*(a+b)) - 2*a*b;
		return rightHandSideTotal;
	}
}

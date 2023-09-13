class sameArgumentsDifferentArgumentName     /* Error*/
{
	public static void main(String[] args) 
	{
		sameArgument(50,20);
		sameArgument(9,8);
	}
	public static void sameArgument(int a, int b)
	{
		int x = a*b;
		System.out.println(x);
	}
	public static void sameArgument(int c, int d)
	{
	    int y = c+d;
		System.out.println(y);
	}
}

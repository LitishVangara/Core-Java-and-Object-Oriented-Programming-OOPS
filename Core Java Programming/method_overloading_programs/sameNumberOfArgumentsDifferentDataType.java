class sameNumberOfArgumentsDifferentDataType 
{
	public static void main(String[] args) 
	{
		sameNumber(50,20);
		sameNumber(9.9,8.5);
	}
	public static void sameNumber(int a, int b)
	{
		int x = a*b;
		System.out.println(x);
	}
	public static void sameNumber(double c, double d)
	{
		double y = c+d;
		System.out.println(y);
	}
}

class differentNumberOfArgumentsSameDataType 
{
	public static void main(String[] args) 
	{
		differentNumber(50,5);
		differentNumber(15,60,35);
	}
	public static void differentNumber(int a, int b)
	{
		int f = a*b;
		System.out.println(f);
	}
	public static void differentNumber(int c, int d, int e)
	{
		int g = c+d+e;
		System.out.println(g);
	}
}

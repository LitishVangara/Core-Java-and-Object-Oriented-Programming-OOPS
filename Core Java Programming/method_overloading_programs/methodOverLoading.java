class methodOverLoading
{
	public static void overloading(int a) 
	{
		System.out.println("a = "+a);
	}
	public static void overloading(int a, int b) 
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void overloading(boolean a) 
	{
		System.out.println("a = "+a);
	}
	public static void overloading(double a, int b) 
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void overloading(char a, String b) 
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void main(String[] args) 
	{
		overloading(99);
		overloading(98,100);
		overloading(true);
		overloading(98.8,98);
		overloading('V',"Litish");
	}
}

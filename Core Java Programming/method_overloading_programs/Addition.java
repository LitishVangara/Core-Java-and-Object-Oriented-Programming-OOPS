class Addition
{
	public static void add(int a, int b) 
	{
		int z = a+b;
		System.out.println("Sum of "+a+" and "+b+" is = "+z);
	}
	public static void add(double a, double b) 
	{
		double z = a+b;
		System.out.println("Sum of "+a+" and "+b+" is = "+z);
	}
	public static void add(int a, int b, double c) 
	{
		double z = a+b+c;
		System.out.println("Sum of "+a+", "+b+" and "+c+" is = "+z);
	}
	public static void main(String[] args) 
	{
		add(6,4);
		add(4.5,5.5);
		add(5,2,3.9);
	}
}

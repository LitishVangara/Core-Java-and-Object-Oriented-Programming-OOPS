class Division
{
	public static void div(double a, double b) 
	{
		double z = a/b;
		System.out.println("Division of "+a+" to "+b+" is = "+z+" Quotient");
	}
	public static void div(int a, int b) 
	{
		int z = a%b;
		System.out.println("Division of "+a+" to "+b+" is = "+z+" Remainder");
	}
	public static void main(String[] args) 
	{
		div(10.0,4.0);
		div(10,4);
	}
}
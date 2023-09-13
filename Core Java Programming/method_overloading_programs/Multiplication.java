class Multiplication
{
	public static void mul(int a, int b) 
	{
		double z = a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is = "+z);
	}
	public void mul(int c, int d, int e) 
	{
		int z = c*d*e;
		System.out.println("Multiplication of "+c+", "+d+" and "+e+" is = "+z);
	}
	public static void main(String[] args) 
	{
		mul(4,6);
		Multiplication o1 = new Multiplication();
		o1.mul(9,7,10);
	}
}
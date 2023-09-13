class multiplication 
{
	public static int a = 10; 
	public static void mul()
	{
		int c = 5 * 6;
		System.out.println(c);
	}
}
class division
{
	public int b = 11;
	public void div()
	{
		int b = 10/5;
		System.out.println(b);
	}
}
class multiDiv 
{
	public static void main(String[] args) 
	{
		System.out.println(multiplication.a);
		multiplication.mul();
		division o1 = new division();
		System.out.println(o1.b);
		o1.div();
	}
}
class oneClass 
{
	public static int a = 10;
	public double b = 9.89;
}
class mainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println(oneClass.a);
		oneClass o1 = new oneClass();
		System.out.println(o1.b);
		System.out.println("Main Ends");
	}
}

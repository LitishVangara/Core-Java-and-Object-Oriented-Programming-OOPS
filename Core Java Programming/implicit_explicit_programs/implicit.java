class A
{
	public A()
	{
		System.out.println("Super Class Constructor.");
	}
}
class B extends A
{
	public B()
	{
		/* super(); */
		System.out.println("Sub Class Constructor.");
	}
}
class implicit 
{
	public static void main(String[] args) 
	{
		B o1 = new B();
	}
}

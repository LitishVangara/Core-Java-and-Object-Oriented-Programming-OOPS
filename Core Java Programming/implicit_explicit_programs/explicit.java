class A
{
	public A(int a)
	{
		System.out.println("Super Class Constructor."+a);
	}
}
class B extends A
{
	public B()
	{
		super(55);
		System.out.println("Sub Class Constructor.");
	}
}
class explicit
{
	public static void main(String[] args) 
	{
		B o1 = new B();
	}
}

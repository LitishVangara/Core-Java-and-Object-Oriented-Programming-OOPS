class A
{
	public int i = 10;
}
class B extends A
{
	public int j = 20;
	public void display()
	{
		System.out.println("Super Class Variable i = "+i);
		System.out.println("Sub Class Variable j = "+j);
	}
}
class singleLevel 
{
	public static void main(String[] args) 
	{
		B o1 = new B();
		o1.display();
	}
}

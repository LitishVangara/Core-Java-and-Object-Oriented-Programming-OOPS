class Sample
{
	public void view()
	{
		System.out.println("View Results.");
	}
}
interface Sample1
{
	void view();
}
class Demo extends Sample implements Sample1
{
}
class InterfaceClassCompleteMethod
{
	public static void main(String[] args) 
	{
		Demo o1 = new Demo();
		o1.view();
	}
}

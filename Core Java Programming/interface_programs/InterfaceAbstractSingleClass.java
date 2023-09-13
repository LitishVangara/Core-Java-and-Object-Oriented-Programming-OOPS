abstract class Sample
{
	abstract public void test1();
}
interface Sample1
{
	void test2();
}
class Demo extends Sample implements Sample1
{
	public void test1()
	{
		System.out.println("Test 1 is Completed.");
	}
	public void test2()
	{
		System.out.println("Test 2 is Completed.");
	}
}
class InterfaceAbstractSingleClass 
{
	public static void main(String[] args) 
	{
		Demo o1 = new Demo();
		o1.test1();
		o1.test2();
	}
}

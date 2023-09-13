interface Sample
{
	void test1();
}
interface Sample1 extends Sample
{
	void test2();
}
class Demo implements Sample1
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
class InterfaceSingleLevel1 
{
	public static void main(String[] args) 
	{
		Sample1 o1 = new Demo();
		o1.test1();
		o1.test2();
	}
}

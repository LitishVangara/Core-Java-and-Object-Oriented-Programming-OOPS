interface Sample
{
	void test1();
}
interface Sample1 extends Sample
{
	void test2();
}
interface Sample2 extends Sample
{
	void test3();
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
class Demo1 implements Sample2
{
	public void test1()
	{
		System.out.println("Test 1 is Completed.");
	}
	public void test3()
	{
		System.out.println("Test 3 is Completed.");
	}
}
class InterfaceHierarchical 
{
	public static void main(String[] args) 
	{
		Sample1 o1 = new Demo();
		o1.test1();
		o1.test2();
		Sample2 o2 = new Demo1();
		o2.test1();
		o2.test3();
	}
}

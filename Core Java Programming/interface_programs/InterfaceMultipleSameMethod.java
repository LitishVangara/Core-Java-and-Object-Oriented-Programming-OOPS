interface Sample
{
	void test1();
}
interface Sample1
{
	void test1();
}
interface Sample2
{
	void test1();
}
class Demo implements Sample, Sample1, Sample2
{
	public void test1()
	{
		System.out.println("Test 1 is Completed.");
	}
}
class InterfaceMultipleSameMethod
{
	public static void main(String[] args) 
	{
		Demo o1 = new Demo();
		o1.test1();
	}
}


        /*    OR    */


/*interface Sample
{
	void test1();
}
interface Sample1
{
	void test1();
}
interface Sample2 extends Sample, Sample1
{
	void test1();
}
class Demo implements Sample2
{
	public void test1()
	{
		System.out.println("Test 1 is Completed.");
	}
}
class InterfaceMultipleSameMethod
{
	public static void main(String[] args) 
	{
		Demo o1 = new Demo();
		o1.test1();
	}
}*/
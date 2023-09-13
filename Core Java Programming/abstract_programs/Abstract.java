abstract class Demo
{
	abstract public void test();
}
class Sample extends Demo
{
	public void test() 
	{
		System.out.println("Test is Completed.");
	}
}
class Abstract 
{
	public static void main(String[] args) 
	{
		Sample sample = new Sample();
		sample.test();
	}
}

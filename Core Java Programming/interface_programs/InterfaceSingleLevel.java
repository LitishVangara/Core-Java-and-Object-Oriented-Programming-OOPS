interface Sample
{
	void move();
}
interface Sample1 extends Sample
{
	void move1();
}
class Demo implements Sample1
{
	public void move()
	{
		System.out.println("Moving Method is Completed.");
	}
	public void move1()
	{
		System.out.println("Moving Method1 is Completed.");
	}
}
class InterfaceSingleLevel 
{
	public static void main(String[] args) 
	{
		Sample1 o1 = new Demo();
		o1.move();
		o1.move1();
	}
}

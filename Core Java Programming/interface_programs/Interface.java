interface Sample
{
	void move();
}
class Demo implements Sample
{
	public void move()
	{
		System.out.println("Moving Method is Completed.");
	}
}
class Interface 
{
	public static void main(String[] args) 
	{
		Demo o1 = new Demo();
		o1.move();
	}
}
